package com.gasystem.practice.member.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gasystem.practice.member.model.dao.MemberDao;
import com.gasystem.practice.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	@Override
	public Member loginMember(Member m) {
		
		Member loginUser = memberDao.loginMember(sqlSession, m);
				
		return loginUser;
	}


	@Override
	public int idCheck(String checkId) {
		return memberDao.idCheck(sqlSession, checkId);
	}


	@Override
	public int insertMember(Member m) {
		return memberDao.insertMember(sqlSession, m);
	}

}
