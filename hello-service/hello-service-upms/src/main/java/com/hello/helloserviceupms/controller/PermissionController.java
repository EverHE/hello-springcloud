package com.hello.helloserviceupms.controller;

import com.he.hellocommon.common.Result;
import com.hello.helloapiuser.entity.SysMenu;
import com.hello.helloserviceupms.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("permission")
public class PermissionController {
    @Autowired
    private IPermissionService permissionService;

    @GetMapping("getRolePermission/{roleId}")
    public Result getRolePermission(@PathVariable("roleId") Integer roleId) {
        List<SysMenu> menuList = permissionService.getPermissionsByRoleId(roleId);
        return Result.success(menuList);
    }

}
