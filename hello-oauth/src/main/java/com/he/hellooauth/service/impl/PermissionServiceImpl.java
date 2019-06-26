package com.he.hellooauth.service.impl;

import com.he.hellocommon.common.Result;
import com.he.hellooauth.service.IPermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements IPermissionService {
    @Override
    public Result getRolePermission(Integer roleId) {
        return Result.fail();
    }
}
