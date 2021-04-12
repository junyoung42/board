package com.board.domain;

import java.util.Date;

public class BoardVO {
/*
 CREATE TABLE tbl_board(
	bno INT NOT NULL AUTO_INCREMENT, #각 게시물을 구분할 고유번호 
	title VARCHAR(50) NOT NULL, #게시물 제목
	content TEXT NOT NULL, # 게시물 내용
	writer VARCHAR(30) NOT NULL, #작성자
	regDate TIMESTAMP DEFAULT NOW(), #작성일
	viewCnt INT DEFAULT 0, #조호수
	PRIMARY KEY(bno)
);
*/
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	private int viewCnt;

}
