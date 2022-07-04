package com.enbics.map.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import com.enbics.vo.MapVO;
import com.enbics.vo.SanupdanjiVO;

@Mapper
public interface MapDAO {
	public List<MapVO> selectMapList() throws DataAccessException; 
	public List<SanupdanjiVO> selectDanjiList() throws DataAccessException; 
}
