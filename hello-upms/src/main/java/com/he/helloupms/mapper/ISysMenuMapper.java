package com.he.helloupms.mapper;

import com.he.helloupms.common.IBaseMapper;
import com.he.helloupms.entity.SysMenu;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISysMenuMapper extends IBaseMapper<SysMenu> {
    @Select(value = "select menu.* from sys_menu menu,sys_privilege p where menu.id=p.menu_id and p.role_id=#{roleId}")
    List<SysMenu> getPermissionsByRoleId(Integer roleId);
}