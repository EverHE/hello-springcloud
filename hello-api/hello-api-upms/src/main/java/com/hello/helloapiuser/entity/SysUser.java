package com.hello.helloapiuser.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.he.hellobaseweb.entity.BaseEntity;
import com.hello.helloapiuser.enums.SexEnum;
import lombok.Data;

@Data
public class SysUser extends BaseEntity<Long> {
    /**
     * 用户账号
     */
    private String account;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 密码
     */
    @JSONField(serialize = false)
    private String password;

    /**
     * 密码盐
     */
    @JSONField(serialize = false)
    private String salt;

    /**
     * 性别，默认2-未知
     */
    private SexEnum sex = SexEnum.SEX_UNKNOWN;
    /**
     * 手机
     */
    private Integer phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 备注
     */
    private String remark;
}