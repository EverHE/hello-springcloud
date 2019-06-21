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


    @PostMapping("page")
    @ResponseBody
    public Result test2(@RequestBody Page<T> page) {
        service.page(page);
        return Result.success(page);
    }

    @PostMapping("insert")
    @ResponseBody
    public Result insert(@RequestBody T entity) {
        boolean b = service.save(entity);
        if(b){
            return Result.success();
        }
        return Result.fail();
    }

    @PostMapping("update")
    @ResponseBody
    public Result update(@RequestBody T entity) {
        boolean b = service.updateById(entity);
        if(b){
            return Result.success();
        }
        return Result.fail();
    }

    @GetMapping("delete/{id}")
    @ResponseBody
    public Result delete(@PathVariable("id") Long id) {
        boolean b = service.removeById(id);
        if(b){
            return Result.success();
        }
        return Result.fail();
    }

    @PostMapping("deletes")
    @ResponseBody
    public Result deletes(@RequestBody List<Long> ids) {
        boolean b = service.removeByIds(ids);
        if(b){
            return Result.success();
        }
        return Result.fail();
    }

    @GetMapping("getById/{id}")
    @ResponseBody
    public Result getById(@PathVariable("id") Long id) {
        return Result.success(service.getById(id));
    }

    @PostMapping("count")
    @ResponseBody
    public Result count(@RequestBody T entity) {
        QueryWrapper wrapper = new QueryWrapper(entity);
        return Result.success(service.count(wrapper));
    }
}
