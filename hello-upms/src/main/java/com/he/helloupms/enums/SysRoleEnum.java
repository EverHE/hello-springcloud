package com.he.helloupms.enums;

import com.he.helloupms.common.IBaseEnum;

import java.io.Serializable;

public enum SysRoleEnum implements IBaseEnum {
    SYS_ROLE_YES(1,"系统角色"),
    SYS_ROLE_NO(0,"普通角色");

    private int value;
    private String desc;

    SysRoleEnum(final int value,final String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Serializable getValue() {
        return this.value;
    }

    public Serializable getDesc(){
        return this.desc;
    }
}
