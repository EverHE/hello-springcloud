package com.he.helloupms.controller;

import com.he.helloupms.common.BaseController;
import com.he.helloupms.common.Result;
import com.he.helloupms.entity.SysMenu;
import com.he.helloupms.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("permission")
public class PermissionController extends BaseController {
    @Autowired
    private IPermissionService permissionService;

    @GetMapping("getRolePermission/{roleId}")
    public Result getRolePermission(@PathVariable("roleId") Integer roleId){
        List<SysMenu> menuList = permissionService.getPermissionsByRoleId(roleId);
        return Result.success(menuList);
    }

}
