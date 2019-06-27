package com.he.hellooauth.service;

import com.he.hellocommon.common.Result;
import com.he.hellocommon.dto.UserDto;
import com.he.hellooauth.service.impl.UserServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "mss-upms", fallback = UserServiceImpl.class)
public interface IUserService {
    @GetMapping("user/findByUsername/{username}")
    Result<UserDto> findByUsername(@PathVariable("username") String username);
}
