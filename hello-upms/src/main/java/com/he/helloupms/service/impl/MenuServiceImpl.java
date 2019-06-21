package com.he.helloupms.service.impl;

import com.he.helloupms.common.BaseService;
import com.he.helloupms.entity.SysMenu;
import com.he.helloupms.mapper.ISysMenuMapper;
import com.he.helloupms.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MenuServiceImpl extends BaseService<ISysMenuMapper,SysMenu> implements IMenuService {
    @Autowired
    private ISysMenuMapper sysMenuMapper;
}
