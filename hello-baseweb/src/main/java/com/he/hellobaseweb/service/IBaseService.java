package com.he.hellobaseweb.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.he.hellobaseweb.entity.BaseEntity;

public interface IBaseService<T extends BaseEntity> extends IService<T> {
    boolean deleteAll();
}
