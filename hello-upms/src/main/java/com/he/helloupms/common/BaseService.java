package com.he.helloupms.common;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;

public class BaseService<M extends IBaseMapper<T>,T extends BaseEntity> extends ServiceImpl<M,T> implements IBaseService<T> {

    @Override
    public boolean deleteAll() {
        return SqlHelper.delBool(this.baseMapper.deleteAll());
    }
}
