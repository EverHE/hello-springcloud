package com.hello.helloserviceupms.service.impl;

import com.he.hellobaseweb.service.impl.BaseService;
import com.hello.helloapiuser.entity.SysRole;
import com.hello.helloserviceupms.mapper.ISysRoleMapper;
import com.hello.helloserviceupms.service.IRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends BaseService<ISysRoleMapper, SysRole> implements IRoleService {

    @Override
    public List<SysRole> getRoleByUserId(Integer userId) {
        return baseMapper.getRoleByUserId(userId);
    }
}
