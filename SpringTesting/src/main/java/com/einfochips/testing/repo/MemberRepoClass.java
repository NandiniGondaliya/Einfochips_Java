package com.einfochips.testing.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.einfochips.testing.model.Member;

@Repository
public class MemberRepoClass {

	public List<Member> getMembers(){
		List<Member> li=new ArrayList<Member>();
		li.add(new Member("Nandini@.com","Nandini","9988","f"));
		li.add(new Member("Ram@.com","RamKrishna","7788","m"));
		return li;
	}
	public Member getMemberByEmail(String email) {
		return new Member("Nandini@.com","Nandini","9988","f");
	}
}
