package com.hello.helloserviceupms.service.impl;

import com.hello.helloapiuser.entity.SysMenu;
import com.hello.helloserviceupms.mapper.ISysMenuMapper;
import com.hello.helloserviceupms.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements IPermissionService {
    @Autowired
    private ISysMenuMapper menuMapper;

    @Override
    public List<SysMenu> getPermissionsByRoleId(Integer roleId) {
        return menuMapper.getPermissionsByRoleId(roleId);
    }
}
