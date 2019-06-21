package com.he.helloupms.controller;

import com.he.helloupms.common.BaseController;
import com.he.helloupms.common.Result;
import com.he.helloupms.entity.SysRole;
import com.he.helloupms.service.IRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("role")
public class RoleController extends BaseController<SysRole,IRoleService> {

    @GetMapping("getRoleByUserId/{userId}")
    public Result getRoleByUserId(@PathVariable("userId") Integer userId){
        List<SysRole> roleList = service.getRoleByUserId(userId);
        return Result.success(roleList);
    }

}
