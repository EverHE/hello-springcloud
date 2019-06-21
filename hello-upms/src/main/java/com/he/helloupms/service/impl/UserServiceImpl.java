package com.he.helloupms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.he.helloupms.common.BaseService;
import com.he.helloupms.entity.SysUser;
import com.he.helloupms.mapper.ISysUserMapper;
import com.he.helloupms.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseService<ISysUserMapper, SysUser> implements IUserService {

    @Override
    public SysUser findByUsername(String username) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userName", "lqf");
        return baseMapper.selectOne(queryWrapper);
    }
}
