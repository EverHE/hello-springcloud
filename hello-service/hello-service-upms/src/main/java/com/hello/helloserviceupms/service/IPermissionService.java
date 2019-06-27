package com.hello.helloserviceupms.service;

import com.hello.helloapiuser.entity.SysMenu;

import java.util.List;

public interface IPermissionService {
    List<SysMenu> getPermissionsByRoleId(Integer roleId);
}
