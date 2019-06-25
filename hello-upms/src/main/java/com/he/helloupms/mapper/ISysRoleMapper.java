package com.he.helloupms.mapper;

import com.he.helloupms.common.IBaseMapper;
import com.he.helloupms.entity.SysRole;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISysRoleMapper extends IBaseMapper<SysRole> {
    @Select(value = "select r.* from sysRole r,sysUserRole ur where r.id=ur.roleId and ur.userId=#{userId}")
    List<SysRole> getRoleByUserId(Integer userId);
}