package com.he.helloupms.service;


import com.he.helloupms.common.IBaseService;
import com.he.helloupms.entity.SysUser;

public interface IUserService extends IBaseService<SysUser> {
    SysUser findByUsername(String username);
}
