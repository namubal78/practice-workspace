package com.gasystem.practice.member.model.service;

import com.gasystem.practice.member.model.vo.Member;

public interface MemberService {

	Member loginMember(Member m);

	int idCheck(String checkId);

	int insertMember(Member m);

}
