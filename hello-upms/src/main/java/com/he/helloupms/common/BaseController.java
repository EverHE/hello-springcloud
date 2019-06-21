package com.he.helloupms.common;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public abstract class BaseController<T extends BaseEntity,S extends IBaseService<T>> {
    @Autowired
    protected S service;

    public HttpServletRequest getHttpRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }


    @RequestMapping("page")
    @ResponseBody
    public Result test2(@RequestBody Page<T> page) {
        service.page(page);
        return Result.success(page);
    }

    @RequestMapping("insert")
    @ResponseBody
    public Result insert(@RequestBody T entity) {
        boolean b = service.save(entity);
        if(b){
            return Result.success();
        }
        return Result.fail();
    }

    @RequestMapping("update")
    @ResponseBody
    public Result update(@RequestBody T entity) {
        UpdateWrapper wrapper = new UpdateWrapper(entity);
        boolean b = service.update(wrapper);
        if(b){
            return Result.success();
        }
        return Result.fail();
    }

    @RequestMapping("delete")
    @ResponseBody
    public Result delete(@RequestBody Long id) {
        boolean b = service.removeById(id);
        if(b){
            return Result.success();
        }
        return Result.fail();
    }

    @RequestMapping("deletes")
    @ResponseBody
    public Result deletes(@RequestBody List<Long> ids) {
        boolean b = service.removeByIds(ids);
        if(b){
            return Result.success();
        }
        return Result.fail();
    }

    @RequestMapping("getById")
    @ResponseBody
    public Result getById(@RequestBody Long id) {
        return Result.success(service.getById(id));
    }

    @RequestMapping("count")
    @ResponseBody
    public Result count(@RequestBody T entity) {
        QueryWrapper wrapper = new QueryWrapper(entity);
        return Result.success(service.count(wrapper));
    }
}
