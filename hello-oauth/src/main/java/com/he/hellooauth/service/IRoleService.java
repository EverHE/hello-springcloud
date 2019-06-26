package com.he.hellooauth.service;

import com.he.hellocommon.common.Result;
import com.he.hellooauth.service.impl.RoleServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "mss-upms",fallback = RoleServiceImpl.class)
public interface IRoleService {
    @GetMapping("role/getRoleByUserId/{userId}")
    Result getRoleByUserId(@PathVariable("userId") Integer userId);
}
