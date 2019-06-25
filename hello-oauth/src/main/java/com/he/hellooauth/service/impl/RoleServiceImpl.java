package com.he.hellooauth.service.impl;

import com.he.hellooauth.service.IRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Override
    public Result<List<RoleVo>> getRoleByUserId(Integer userId) {
        return Result.failure(100,"调用getRoleByUserId失败");
    }
}
