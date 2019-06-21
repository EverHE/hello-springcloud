package com.he.helloupms.service;

import com.he.helloupms.common.IBaseService;
import com.he.helloupms.entity.SysRole;

import java.util.List;

public interface IRoleService extends IBaseService<SysRole> {
    List<SysRole> getRoleByUserId(Integer userId);
}
