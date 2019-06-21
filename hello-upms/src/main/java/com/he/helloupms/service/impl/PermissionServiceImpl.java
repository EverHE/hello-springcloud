package com.he.helloupms.service.impl;

import com.he.helloupms.entity.SysMenu;
import com.he.helloupms.mapper.ISysMenuMapper;
import com.he.helloupms.service.IPermissionService;
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
