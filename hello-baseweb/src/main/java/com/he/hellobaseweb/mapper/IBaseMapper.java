package com.he.hellobaseweb.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.he.hellobaseweb.entity.BaseEntity;

/**
 * mapper父类，注意这个类不要让mp扫描到！！
 */
public interface IBaseMapper<T extends BaseEntity> extends BaseMapper<T> {
    Integer deleteAll();
}
