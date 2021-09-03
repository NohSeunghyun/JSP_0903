/*
 * DB로 SQL문을 전송하는 클래스
 */
package dao;

import java.sql.Connection;

public class BoardDAO {
	Connection con;
	/* 싱글톤 패턴 : BoardDAO객체를 단 1개만 생성
	 * 이유? 외부클래스에서 처음 생성된 BoardDAO객체를 공유해서 사용하도록 하기 위해
	 * 
	 */
	private BoardDAO() {}
	
	private static BoardDAO boardDAO;
	//static 이유? 객체를 생성하기 전에 이미 메모리에 올라간 getInstance()메서드를 통해서만 BoardDAO객체를 1개만 만들도록 하기위해
	static BoardDAO getInstance() {
		if(boardDAO == null) {
			boardDAO = new BoardDAO();
		}
		return boardDAO;
	}
	
	public void setConnection (Connection con) { // Connection객체를 받아 DB연결
		this.con = con;
	}
}
