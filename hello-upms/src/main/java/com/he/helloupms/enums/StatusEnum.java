package com.he.helloupms.enums;

import com.he.helloupms.common.IBaseEnum;

import java.io.Serializable;

public enum StatusEnum implements IBaseEnum {
    STATUS_DELETE(0,"删除"),
    STATUS_NORMAL(1,"正常");

    private int value;
    private String desc;

    StatusEnum(final int value,final String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Serializable getValue(){
        return this.value;
    }

    public Serializable getDesc(){
        return this.desc;
    }
}
