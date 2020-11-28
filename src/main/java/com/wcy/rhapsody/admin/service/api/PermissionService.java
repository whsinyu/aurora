package com.wcy.rhapsody.admin.service.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wcy.rhapsody.admin.model.entity.web.Permission;

import java.util.List;

/**
 * 权限接口
 *
 * @author Yeeep 2020/11/7
 */
public interface PermissionService extends IService<Permission> {

    /**
     * 根据角色ID查询用户权限
     *
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Integer roleId);
}