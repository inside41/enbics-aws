package com.enbics.member.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import com.enbics.vo.AuthoritiesVO;
import com.enbics.vo.UserVO;

@Mapper
public interface UserDAO {
	
	public int selectUser(String userID) throws DataAccessException;
	public void insertUser(UserVO user) throws DataAccessException;
	public void insertAuthorities(AuthoritiesVO authoritiesVO) throws DataAccessException;
	public void deleteUser(UserVO userVO) throws DataAccessException;
}
