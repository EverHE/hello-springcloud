package com.hello.helloserviceupms.service.impl;

import com.he.hellobaseweb.service.impl.BaseService;
import com.hello.helloapiuser.entity.SysMenu;
import com.hello.helloserviceupms.mapper.ISysMenuMapper;
import com.hello.helloserviceupms.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MenuServiceImpl extends BaseService<ISysMenuMapper, SysMenu> implements IMenuService {
    @Autowired
    private ISysMenuMapper sysMenuMapper;
}
