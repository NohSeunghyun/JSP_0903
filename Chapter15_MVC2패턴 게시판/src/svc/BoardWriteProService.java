/*
 * 글 등록 요청을 처리하는 비지니스 로직을 구현하는 Service클래스
 */
package svc;

import vo.BoardBean;

import static db.JdbcUtil.*;

//import db.JdbcUtil;

import java.sql.Connection;

public class BoardWriteProService {
	//기본생성자
	
	//추가 메서드
	public boolean registArticle(BoardBean boardBean) {
		//DB연결작업
		//JdbcUtil.getConnection(); // 클래스명.static메서드 호출
		Connection con = getConnection();
		
		//BoardDAO
		
		//추가
		
		return false;
	}
}
