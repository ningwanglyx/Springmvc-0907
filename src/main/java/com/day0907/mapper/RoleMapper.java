package com.day0907.mapper;

import com.day0907.pojo.Role;
import org.springframework.stereotype.Repository;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/9/16 22:45
 * @Modified By:
 */
@Repository
public interface RoleMapper {
    public Role queryRoleById(Integer id);
}
