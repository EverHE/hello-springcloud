package com.hello.helloserviceupms.service;

import com.he.hellobaseweb.service.IBaseService;
import com.hello.helloapiuser.entity.SysRole;

import java.util.List;

public interface IRoleService extends IBaseService<SysRole> {
    List<SysRole> getRoleByUserId(Integer userId);
}
