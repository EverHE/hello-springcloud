package com.he.hellobaseweb.entity;

import cn.hutool.core.util.IdUtil;
import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import com.he.hellobaseweb.enums.StatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class BaseEntity<PK> {

    private PK id;

    private String uuid;

    /**
     * 乐观锁实现方式：
     * 取出记录时，获取当前version
     * 更新时，带上这个version
     * 执行更新时， set version = yourVersion+1 where version = yourVersion
     * 如果version不对，就更新失败
     */
    @JSONField(serialize = false)
    @Version
    private Integer version;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    //公共字段自动填充字段需要此注解
    @TableField(fill = FieldFill.INSERT)
    private PK createUserId;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;
    @TableField(fill = FieldFill.UPDATE)
    private PK updateUserId;

    @TableLogic//逻辑删除的字段注解
    private StatusEnum status;

    @TableField(exist = false)
    private List<PK> ids;//批量删除ids


    public BaseEntity() {
        this.uuid = this.generateUuid();
        this.version = 0;
        this.status = StatusEnum.STATUS_NORMAL;
    }


    public String generateUuid() {
        return IdUtil.fastSimpleUUID();
    }
}
