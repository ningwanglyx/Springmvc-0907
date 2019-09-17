package com.day0907.service;

import com.day0907.mapper.RoleMapper;
import com.day0907.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/9/16 22:49
 * @Modified By:
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public Role queryRoleById(Integer id) {
        return this.roleMapper.queryRoleById(id);
    }
}
