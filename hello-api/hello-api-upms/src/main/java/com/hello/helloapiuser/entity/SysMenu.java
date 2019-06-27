package com.hello.helloapiuser.entity;

import com.he.hellobaseweb.entity.BaseEntity;
import com.hello.helloapiuser.enums.ResourceTypeEnum;
import lombok.Data;

@Data
public class SysMenu extends BaseEntity<Long> {
    /**
     * 菜单名
     */
    private String name;
    /**
     * 菜单编码
     */
    private String code;
    /**
     * 父ID
     */
    private Long pid;
    /**
     * 图标
     */
    private String ico;
    /**
     * url
     */
    private String url;
    /**
     * 类型
     */
    private ResourceTypeEnum type;
    /**
     * 备注
     */
    private String remark;
    /**
     * 排序
     */
    private Integer sort;

}