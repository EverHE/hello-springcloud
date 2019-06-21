package com.he.helloupms.common;

import cn.hutool.core.date.DatePattern;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    private static ThreadLocal<DateFormat> threadLocal = new ThreadLocal();
    /**
     * 解决前台日期字符串和后台controller接收JavaBean的Date类型不一致的问题
     *
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat dateFormat = threadLocal.get();
        if(dateFormat ==null){
            dateFormat= new SimpleDateFormat(DatePattern.NORM_DATETIME_PATTERN);
            //严格解析
            dateFormat.setLenient(false);
        }

        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @ExceptionHandler(value=Exception.class)
    public ModelAndView allExceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        String errorMessage = null;

        //自定义的已知错误直接返回错误信息
        if (e instanceof BaseException) {
            errorMessage = e.getMessage();
        } else if (e instanceof MethodArgumentTypeMismatchException) {
            errorMessage = "参数转换失败";
        } else if (e instanceof BaseRuntimeException) {
            errorMessage = e.getMessage();
        } else {
            //其他错误打印error日志
            errorMessage = "未知错误,请联系管理员!";
            log.error(e.getMessage(), e);
        }
        e.printStackTrace();

        Map<String, Object> result = new HashMap();
        result.put("error", true);
        result.put("message", errorMessage);

        return new ModelAndView(new FastJsonJsonView(), result);
        //return new ModelAndView("error/500", result);
    }
}
