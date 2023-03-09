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
			
			session.setAttribute("alertMsg", "�α��ο� �����߽��ϴ�.");
			
			
			mv.setViewName("redirect:/");
		}
		else {
			
			session.setAttribute("alertMsg", "�α��ο� �����߽��ϴ�.");
			
			mv.setViewName("redirect:/");
		}
		
		return mv;
		
	}
	
	@RequestMapping("logout.me")
	public String logoutMember(HttpSession session) {
		
		// ������ ��ȿȭ�ϴ� �޼ҵ� : session.invalidate();
		session.invalidate();
		
		// ������������ url ��û
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
		
		if(result > 0) { // ����
			
			// ��ȸ�� �˶� ����
			session.setAttribute("alertMsg", "���������� ȸ�������� �Ǿ����ϴ�.");

			return "../../index";
		}
		else { 
			
			model.addAttribute("errorMsg", "ȸ������ ����");
			
			return "common/errorPage";
		}
	}
	
}