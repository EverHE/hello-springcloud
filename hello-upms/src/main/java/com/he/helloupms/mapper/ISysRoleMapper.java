package com.he.helloupms.mapper;

import com.he.helloupms.common.IBaseMapper;
import com.he.helloupms.entity.SysRole;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISysRoleMapper extends IBaseMapper<SysRole> {
    @Select(value = "select role.* from sys_role role,sys_user_role ur where role.id=ur.role_id and ur.user_id=#{userId}")
    List<SysRole> getRoleByUserId(Integer userId);
}