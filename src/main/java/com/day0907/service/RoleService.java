package com.day0907.service;

import com.day0907.pojo.Role;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/9/16 22:47
 * @Modified By:
 */
public interface RoleService {
    /**
     * @Author: YangxingLiu
     * @Description: 根据id查询角色
     * @Date: Created in 22:48 2019/9/16
     * @Param id:
     * @return: com.day0907.pojo.Role
     **/
    public Role queryRoleById(Integer id);
}
