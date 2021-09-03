/* 2. Action인터페이스
 * 1). 반드시 구현한 클래스에서 추상메서드 재정의 해줘야함
 * 2). 컨트롤러에서 요청이 파악되면 해당 요청을 처리하는 각 Action클래스를 사용하여 요청을 처리함
	    각 요청에 해당하는 Action클래스 객체들을 다형성을 이용해서 동일한 타입(Action)으로 참조하기 위해  
 */
package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;

public interface Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
