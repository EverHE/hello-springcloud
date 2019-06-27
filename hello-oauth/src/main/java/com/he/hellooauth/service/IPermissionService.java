package com.he.hellooauth.service;


import com.he.hellocommon.common.Result;
import com.he.hellooauth.service.impl.PermissionServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "mss-upms", fallback = PermissionServiceImpl.class)
public interface IPermissionService {
    @GetMapping("permission/getRolePermission/{roleId}")
    Result getRolePermission(@PathVariable("roleId") Integer roleId);
}
