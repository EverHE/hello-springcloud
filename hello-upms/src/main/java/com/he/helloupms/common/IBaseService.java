package com.he.helloupms.common;


import com.baomidou.mybatisplus.extension.service.IService;

public interface IBaseService<T extends BaseEntity> extends IService<T> {
    boolean deleteAll();
}
