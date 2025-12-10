package com.sist.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import com.sist.web.mapper.*;
import com.sist.web.vo.*;
/* 3.xx 버전 => mybatis (XML 허용) 
 * 	=> <select>, <insert>, <update>, <delete>, <resultMap>
 * 4.xx 버전 => mybatis (Annotation)
 *  => @Select(), @Insert(), @Update(), @Delete(), @Results
 */
@Service
public class RecipeServiceImpl implements RecipeService{
	// 통합 => BI => Mapper 2개
	@Autowired
	private RecipeMapper mapper;
	
	@Override
	public List<RecipeVO> recipeListData(Map map) {
		// TODO Auto-generated method stub
		return mapper.recipeListData(map);
	}

	@Override
	public int recipeTotalPage() {
		// TODO Auto-generated method stub
		return mapper.recipeTotalPage();
	}

	@Override
	public List<RecipeVO> recipeTop10() {
		// TODO Auto-generated method stub
		return mapper.recipeTop10();
	}
}
