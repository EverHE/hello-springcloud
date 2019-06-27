package com.he.hellooauth.service.impl;

import com.he.hellocommon.common.Result;
import com.he.hellocommon.dto.RoleDto;
import com.he.hellooauth.service.IRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Override
    public Result<List<RoleDto>> getRoleByUserId(Integer userId) {
        return Result.fail();
    }
}
