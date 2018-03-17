package com.mvc;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;


import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;


public class BlogEntryControllerTest {
	
	@InjectMocks
	private BlogEntryController controller;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();   // MockMvc object 	
		
	}
	
	@Test
	public void test() throws Exception{
		
		mockMvc.perform(get("/test")).andDo(print());
	}
	

	@Test
	public void testpost() throws Exception{
		
		mockMvc.perform(post("/test")
				.content("{\"title\":\"test blog post\"}")
				.contentType(MediaType.APPLICATION_JSON)) // Add this so that you do not get not supported exception error...
				.andExpect(jsonPath("$.title", is("test blog post")))
				.andDo(print());
	}
}
