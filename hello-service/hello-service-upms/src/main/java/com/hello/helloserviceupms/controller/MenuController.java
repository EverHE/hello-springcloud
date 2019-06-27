package com.hello.helloserviceupms.controller;

import com.he.hellobaseweb.controller.BaseController;
import com.hello.helloapiuser.entity.SysMenu;
import com.hello.helloserviceupms.service.IMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("menu")
public class MenuController extends BaseController<SysMenu, IMenuService> {
}
