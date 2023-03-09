package com.gasystem.practice.member.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gasystem.practice.member.model.service.MemberService;
import com.gasystem.practice.member.model.vo.Member;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping("login.me")
	public ModelAndView loginMember(Member m, ModelAndView mv, HttpSession session, HttpServletResponse response) {
				
		Member loginUser = memberService.loginMember(m);
		

		if (loginUser != null) {
			
			session.setAttribute("loginUser", loginUser);
			
			session.setAttribute("alertMsg", "로그인에 성공했습니다.");
			
			
			mv.setViewName("redirect:/");
		}
		else {
			
			session.setAttribute("alertMsg", "로그인에 실패했습니다.");
			
			mv.setViewName("redirect:/");
		}
		
		return mv;
		
	}
	
	@RequestMapping("logout.me")
	public String logoutMember(HttpSession session) {
		
		// 세션을 무효화하는 메소드 : session.invalidate();
		session.invalidate();
		
		// 메인페이지로 url 요청
		return "redirect:/";
	}

	@RequestMapping("joinForm.me")
	public String joinForm() {
		
		return "member/joinForm";
	}
	
	@ResponseBody
	@RequestMapping(value="idCheck.me", produces="text/html; charset=UTF-8")
	public String idCheck(String checkId) {
				
		int count = memberService.idCheck(checkId);

		return (count > 0) ? "NNNNN" : "NNNNY";
	}
	
	@RequestMapping("insert.me")
	public String insertMember(Member m, Model model, HttpSession session) {

		/* String encPwd = bcryptPasswordEncoder.encode(m.getMemberPwd()); */
	
		/* m.setMemberPwd(encPwd); */
		
		int result = memberService.insertMember(m);
		
		if(result > 0) { // 성공
			
			// 일회성 알람 문구
			session.setAttribute("alertMsg", "성공적으로 회원가입이 되었습니다.");

			return "../../index";
		}
		else { 
			
			model.addAttribute("errorMsg", "회원가입 실패");
			
			return "common/errorPage";
		}
	}
	
}
