package com.Chen.mapper;

import com.Chen.pojo.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.math.BigInteger;
import java.util.List;

public class SysUserMapperImpl extends SqlSessionDaoSupport implements SysUserMapper {

    private SqlSession sqlSession;

    public List<SysUser> getUserList(){
        SysUserMapper mapper=sqlSession.getMapper(SysUserMapper.class);
        return mapper.getUserList();
    }

    public int insertUser(SysUser user) {
        sqlSession=getSqlSession();
        SysUserMapper mapper=sqlSession.getMapper(SysUserMapper.class);
        mapper.insertUser(user);
        return Integer.parseInt(user.getUserId().toString());
    }

    public int updateUser(SysUser user) {
        sqlSession=getSqlSession();
        SysUserMapper mapper=sqlSession.getMapper(SysUserMapper.class);
        return mapper.updateUser(user);
    }

    public int deleteUser(Long userId) {
        sqlSession=getSqlSession();
        SysUserMapper mapper=sqlSession.getMapper(SysUserMapper.class);
        return mapper.deleteUser(userId);
    }
}
