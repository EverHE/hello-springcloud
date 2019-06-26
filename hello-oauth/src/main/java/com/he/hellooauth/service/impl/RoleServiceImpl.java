package com.he.hellooauth.service.impl;

import com.he.hellocommon.common.Result;
import com.he.hellooauth.service.IRoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements IRoleService {
    @Override
    public Result getRoleByUserId(Integer userId) {
        return Result.fail();
    }
}
