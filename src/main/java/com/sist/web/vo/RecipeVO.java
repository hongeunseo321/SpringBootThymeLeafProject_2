package com.sist.web.vo;
/*
이름         널? 유형             
---------- -- -------------- 
NO            NUMBER(38)     
TITLE         VARCHAR2(4000) 
POSTER        VARCHAR2(4000) 
CHEF          VARCHAR2(4000) 
LINK          VARCHAR2(4000) 
HIT           NUMBER(38)     
LIKECOUNT     NUMBER(38)     
JJIMECOUNT    NUMBER(38)     
REPLYCOUNT    NUMBER(38)     
 */
public class RecipeVO {
	private int no,hit;
	private String title,poster,chef;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getChef() {
		return chef;
	}
	public void setChef(String chef) {
		this.chef = chef;
	}
	
}
