package com.he.helloupms.service;


import com.he.helloupms.entity.SysMenu;

import java.util.List;

public interface IPermissionService {
    List<SysMenu> getPermissionsByRoleId(Integer roleId);
}
