package com.enbics.map.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enbics.map.service.MapService;
import com.enbics.vo.MapVO;
import com.enbics.vo.SanupdanjiVO;

@Controller
public class MapController {

	@Autowired
	private MapService markerService;
	
	@RequestMapping(value="/map.do")
	public String markerPage(Model model) {
		List<MapVO> mapList = markerService.getMapList();
		model.addAttribute("mapList",mapList);
		return "map/map";
	}
	
	@RequestMapping(value="/sanupdanji.do")
	public String sanupdanjiPage(Model model) {
		List<SanupdanjiVO> mapList = markerService.getDanjiList();
		model.addAttribute("mapList",mapList);
		return "map/map";
	}
	
	@RequestMapping(value="/sanupdanji2.do")
	public String sanupdanjiPage2(Model model) {
		List<SanupdanjiVO> mapList = markerService.getDanjiList();
		model.addAttribute("mapList",mapList);
		return "map/map2";
	}
}
