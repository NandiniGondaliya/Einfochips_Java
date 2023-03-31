package com.einfochips.testing;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.einfochips.testing.model.Member;
import com.einfochips.testing.repo.MemberRepoClass;

@WebMvcTest
@ExtendWith(MockitoExtension.class)
public class TestDemo {

	@Autowired
	MockMvc mm;
	
	@MockBean
	MemberRepoClass mrc;
	
	@Test
	public void testHome() throws Exception{
		mm.perform(get("/home")).andExpect(status().isOk());
	}
	@Test
	public void testepoClass() throws Exception{
        //Given 
		//When
		//Then
		//when(mrc.getMemberByEmail("Nandini@.com")).thenReturn(new Member("Nandi@.com","Nandini","9988","f"));
		
		List<Member> li=mrc.getMembers();
		System.out.println(li);
		when(mrc.getMembers().size()).thenReturn(2);
		
	}
	
}
