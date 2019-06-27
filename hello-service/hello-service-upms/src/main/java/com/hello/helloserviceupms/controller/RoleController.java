package com.hello.helloserviceupms.controller;

import com.he.hellobaseweb.controller.BaseController;
import com.he.hellocommon.common.Result;
import com.hello.helloapiuser.entity.SysRole;
import com.hello.helloserviceupms.service.IRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("role")
public class RoleController extends BaseController<SysRole, IRoleService> {

    @GetMapping("getRoleByUserId/{userId}")
    public Result getRoleByUserId(@PathVariable("userId") Integer userId) {
        List<SysRole> roleList = service.getRoleByUserId(userId);
        return Result.success(roleList);
    }

}
