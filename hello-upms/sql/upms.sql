drop database if exists hello;
create database hello;
use hello;

DROP TABLE IF EXISTS `sysMenu`;
CREATE TABLE `sysMenu` (
`id` bigint(20) NOT NULL COMMENT 'ID',
`uuid` varchar(32) NOT NULL COMMENT 'UUID',
`version` tinyint NULL DEFAULT 0 COMMENT '版本',
`createTime` datetime NULL DEFAULT now() COMMENT '创建时间',
`createUserId` bigint(20) NULL COMMENT '创建人员ID',
`updateTime` datetime NULL COMMENT '更新时间',
`updateUserId` bigint NULL COMMENT '更新人员ID',
`status` tinyint NULL COMMENT '状态。statusEnum',
`name` varchar(255) NULL COMMENT '菜单名称',
`code` varchar(255) NULL COMMENT '菜单编码',
`pid` bigint(20) NULL COMMENT '父ID',
`ico` varchar(128) NULL COMMENT '图标',
`url` varchar(128) NULL COMMENT 'URL',
`type` tinyint NULL COMMENT '类型。MenuTypeEnum',
`remark` varchar(255) NULL COMMENT '备注',
`sort` int(11) DEFAULT NULL COMMENT '排序',
PRIMARY KEY (`id`) ,
UNIQUE INDEX `uuid` (`uuid`)
)
COMMENT='菜单表';

DROP TABLE IF EXISTS `sysRole`;
CREATE TABLE `sysRole` (
`id` bigint(20) NOT NULL COMMENT 'ID',
`uuid` varchar(32) NOT NULL COMMENT 'UUID',
`version` tinyint NULL DEFAULT 0 COMMENT '版本',
`createTime` datetime NULL DEFAULT now() COMMENT '创建时间',
`createUserId` bigint(20) NULL COMMENT '创建人员ID',
`updateTime` datetime NULL COMMENT '更新时间',
`updateUserId` bigint NULL COMMENT '更新人员ID',
`status` tinyint NULL COMMENT '状态。statusEnum',
`name` varchar(255) NULL COMMENT '角色名称',
`code` varchar(255) NULL COMMENT '角色编码',
`sys` tinyint NULL COMMENT '角色标记。SysRoleEnum',
`remark` varchar(255) NULL COMMENT '备注',
PRIMARY KEY (`id`) ,
UNIQUE INDEX `uuid` (`uuid`)
)
COMMENT='角色表';

DROP TABLE IF EXISTS `sysUser`;
CREATE TABLE `sysUser` (
`id` bigint(20) NOT NULL COMMENT 'ID',
`uuid` varchar(32) NOT NULL COMMENT 'UUID',
`version` tinyint NULL DEFAULT 0 COMMENT '版本',
`createTime` datetime NULL DEFAULT now() COMMENT '创建时间',
`createUserId` bigint(20) NULL COMMENT '创建人员ID',
`updateTime` datetime NULL COMMENT '更新时间',
`updateUserId` bigint NULL COMMENT '更新人员ID',
`status` tinyint NULL COMMENT '状态。statusEnum',
`account` varchar(255) NULL COMMENT '账号',
`userName` varchar(255) NULL COMMENT '姓名',
`password` varchar(64) NULL COMMENT '密码',
`salt` varchar(64) NULL COMMENT '密码盐',
`sex` tinyint NULL COMMENT '性别。SexEnum',
`phone` char(11) NULL COMMENT '电话',
`email` varchar(255) NULL COMMENT '邮箱',
`remark` varchar(255) NULL COMMENT '备注',
PRIMARY KEY (`id`) ,
UNIQUE INDEX `uuid` (`uuid`)
)
COMMENT='用户表';

DROP TABLE IF EXISTS `sysUserRole`;
CREATE TABLE `sysUserRole` (
`id` bigint(20) NOT NULL COMMENT 'ID',
`uuid` varchar(32) NOT NULL COMMENT 'UUID',
`version` tinyint NULL DEFAULT 0 COMMENT '版本',
`createTime` datetime NULL DEFAULT now() COMMENT '创建时间',
`createUserId` bigint(20) NULL COMMENT '创建人员ID',
`updateTime` datetime NULL COMMENT '更新时间',
`updateUserId` bigint NULL COMMENT '更新人员ID',
`status` tinyint NULL COMMENT '状态。statusEnum',
`userId` bigint NULL COMMENT '用户ID',
`roleId` bigint NULL COMMENT '角色ID',
PRIMARY KEY (`id`) ,
UNIQUE INDEX `uuid` (`uuid`)
)
COMMENT='用户角色关联表';

DROP TABLE IF EXISTS `sysRoleMenu`;
CREATE TABLE `sysRoleMenu` (
`id` bigint(20) NOT NULL COMMENT 'ID',
`uuid` varchar(32) NOT NULL COMMENT 'UUID',
`version` tinyint NULL DEFAULT 0 COMMENT '版本',
`createTime` datetime NULL DEFAULT now() COMMENT '创建时间',
`createUserId` bigint(20) NULL COMMENT '创建人员ID',
`updateTime` datetime NULL COMMENT '更新时间',
`updateUserId` bigint NULL COMMENT '更新人员ID',
`status` tinyint NULL COMMENT '状态。statusEnum',
`roleId` bigint NULL COMMENT '角色ID',
`menuId` bigint NULL COMMENT '菜单ID',
PRIMARY KEY (`id`) ,
UNIQUE INDEX `uuid` (`uuid`)
)
COMMENT='角色菜单关联表';