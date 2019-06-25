package com.he.helloupms.mapper;

import com.he.helloupms.common.IBaseMapper;
import com.he.helloupms.entity.SysMenu;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISysMenuMapper extends IBaseMapper<SysMenu> {
    @Select(value = "select m.* from sysMenu m,sysRoleMenu rm where m.id=rm.menuId and rm.roleId=#{roleId}")
    List<SysMenu> getPermissionsByRoleId(Integer roleId);
}