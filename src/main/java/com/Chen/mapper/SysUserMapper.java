package com.Chen.mapper;

import com.Chen.pojo.SysUser;

import java.math.BigInteger;
import java.util.List;

public interface SysUserMapper {

    List<SysUser> getUserList();

    /**
     * 创建一个用户
     * @param user  创建的用户信息
     * @return 返回用户id
     */
    int insertUser(SysUser user);

    /**
     * 根据用户id更新用户信息
     * @param user 用户信息
     * @return
     */
    int updateUser(SysUser user);

    /**
     * 根据用户id删除用户信息
     * @param userId  用户id
     * @return 返回删除数量
     */
    int deleteUser(Long userId);
}
