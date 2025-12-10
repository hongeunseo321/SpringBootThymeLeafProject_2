package com.sist.web.service;

import java.util.List;
import java.util.Map;

import com.sist.web.vo.RecipeVO;
/*
 * 사용자 요청 === Controller === Mapper
 * 	=> Mapper 에러 발생 시, Controller가 영향을 받는 결합성/의존성이 높은 프로그램
 * 	=> Mapper 소스 추가/수정이 어렵다
 * 
 * 사용자 요청 === Controller === **Service === Mapper
 * 	=> 결합성/의존성이 낮은 프로그램
 * 	=> 스프링 목표 (로드 존슨): 의존성이 낮은 프로그램
 */
public interface RecipeService {
	public List<RecipeVO> recipeListData(Map map);
	public int recipeTotalPage();
	public List<RecipeVO> recipeTop10();
}
