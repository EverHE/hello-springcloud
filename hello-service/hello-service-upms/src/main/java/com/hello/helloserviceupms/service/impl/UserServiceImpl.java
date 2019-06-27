package com.hello.helloserviceupms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.he.hellobaseweb.service.impl.BaseService;
import com.hello.helloapiuser.entity.SysUser;
import com.hello.helloserviceupms.mapper.ISysUserMapper;
import com.hello.helloserviceupms.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseService<ISysUserMapper, SysUser> implements IUserService {

    @Override
    public SysUser findByUsername(String username) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userName", username);
        return baseMapper.selectOne(queryWrapper);
    }
}
