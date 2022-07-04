package com.enbics.map.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enbics.map.dao.MapDAO;
import com.enbics.vo.MapVO;
import com.enbics.vo.SanupdanjiVO;

@Service
public class MapService {
	
	@Autowired
	private MapDAO mapDAO;
	
	public List<MapVO> getMapList(){
		return mapDAO.selectMapList();
	}
	
	public List<SanupdanjiVO> getDanjiList(){
		return mapDAO.selectDanjiList();
	}

}
