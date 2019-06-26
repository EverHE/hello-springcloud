package com.he.hellobaseweb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import com.he.hellobaseweb.entity.BaseEntity;
import com.he.hellobaseweb.mapper.IBaseMapper;
import com.he.hellobaseweb.service.IBaseService;

public class BaseService<M extends IBaseMapper<T>,T extends BaseEntity> extends ServiceImpl<M,T> implements IBaseService<T> {

    @Override
    public boolean deleteAll() {
        return SqlHelper.delBool(this.baseMapper.deleteAll());
    }
}
