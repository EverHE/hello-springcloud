package com.hello.helloserviceupms.service;


import com.he.hellobaseweb.service.IBaseService;
import com.hello.helloapiuser.entity.SysUser;

public interface IUserService extends IBaseService<SysUser> {
    SysUser findByUsername(String username);
}
