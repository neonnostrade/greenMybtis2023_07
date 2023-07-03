package aaa.control;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.MemData;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@Controller
public class SessionLoginExam {
	@RequestMapping("/session/loginExam")
	String login() {
		return "session/loginExam";
	}
	
	@RequestMapping("/session/loginReg")
	String loginReg(String pid, String pw, HttpSession session, Model model) {
		MemData md = new MemData();
		
		for (Map.Entry<String, ArrayList<String>> mm : md.mem.entrySet()) {
			if(pid.equals(mm.getKey())) {
				if(pw.equals(mm.getValue().get(1))) {
					
					session.setAttribute("pid", mm.getKey());
					session.setAttribute("pname", mm.getValue().get(0));
					session.setAttribute("pw",mm.getValue().get(1));
					
					model.addAttribute("msg",mm.getValue().get(0)+"님 로그인 하셨습니다. (id:"+pid+",pw:"+pw+")");
					model.addAttribute("goUrl","/session/viewExam");
				}
				else {
					model.addAttribute("msg","없는회원입니다");
					model.addAttribute("goUrl","/session/loginExam");
				}
			}
		}
		return "session/alert";
	}
	
	@RequestMapping("/session/viewExam")
	String viewExam(HttpSession session, Model model) {
		Object pname = session.getAttribute("pname");
		Object pid = session.getAttribute("pid");
		Object pw = session.getAttribute("pw");
		session.setAttribute("pid", pname);
		session.setAttribute("pname", pid);
		session.setAttribute("pw",pw);
		
		model.addAttribute("text",pname+"님("+pid+") 로그인 중");
		System.out.println(pname+","+pid+","+pw);
		model.addAttribute("pid",pid);
		return "session/viewExam";
	}
	
	@RequestMapping("/session/logoutt")
	String logout(HttpSession session, Model model) {
		Object pname = session.getAttribute("pname");
		model.addAttribute("msg",pname+"님 로그아웃하셨습니다.");
		model.addAttribute("goUrl","/session/loginExam");
		
		session.invalidate();
		
		return "session/alert";
	}
}
  