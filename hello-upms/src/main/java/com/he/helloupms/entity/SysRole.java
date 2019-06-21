package com.he.helloupms.entity;

import com.he.helloupms.common.BaseEntity;
import com.he.helloupms.enums.SysRoleEnum;
import lombok.Data;

@Data
public class SysRole extends BaseEntity<Long> {
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色编码
     */
    private String code;
    /**
     * 是否系统角色
     */
    private SysRoleEnum sys;
    /**
     * 备注
     */
    private String remark;
}