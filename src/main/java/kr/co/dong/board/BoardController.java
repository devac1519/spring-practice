package kr.co.dong.board;

import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService boardService;
	
	@RequestMapping(value="board/login", method= RequestMethod.GET)
	public String login() {
		logger.info("login view 이동");
		return "login";
	}
	
	@RequestMapping(value="board/login", method= RequestMethod.POST)
	public String login(@RequestParam Map<String,Object> map,
			HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		request.setCharacterEncoding("utf-8");
		logger.info("요청정보 받아서 보내기");
		Map user = boardService.login(map);
		
		if(user == null) { //로그인 실패
			logger.info("로그인 안됨");
			return "redirect:login";
		}else {  // 로그인 성공
			//세션부여
			session.setAttribute("user", user);
			return "redirect:/";
		}		
	}
	
	@RequestMapping(value = "board/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}	
	
}




