package com.he.helloupms.service.impl;

import com.he.helloupms.common.BaseService;
import com.he.helloupms.entity.SysRole;
import com.he.helloupms.mapper.ISysRoleMapper;
import com.he.helloupms.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoleServiceImpl extends BaseService<ISysRoleMapper,SysRole> implements IRoleService {

    @Override
    public List<SysRole> getRoleByUserId(Integer userId) {
        return baseMapper.getRoleByUserId(userId);
    }
}
