package com.myworld.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.myworld.member.model.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@SessionAttributes({"loginMember"})
@RequiredArgsConstructor
@Controller
@Slf4j
@RequestMapping("member")
public class MemberController {
	
	private final MemberService service;
	
	@GetMapping("login")
	public String memberLogin() {
		
		return "member/login";
	}
	
}
