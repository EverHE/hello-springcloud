package com.he.helloupms.controller;

import com.he.helloupms.common.BaseController;
import com.he.helloupms.common.Result;
import com.he.helloupms.entity.SysUser;
import com.he.helloupms.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController extends BaseController<SysUser,IUserService> {

    @GetMapping("findByUsername/{username}")
    public Result findByUsername(@PathVariable("username") String username){
        SysUser user = service.findByUsername(username);
        return Result.success(user);
    }
}
