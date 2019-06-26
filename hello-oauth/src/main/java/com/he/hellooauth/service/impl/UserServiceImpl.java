package com.he.hellooauth.service.impl;

import com.he.hellocommon.common.Result;
import com.he.hellooauth.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {
    @Override
    public Result findByUsername(String username) {
        return Result.fail();
    }
}
