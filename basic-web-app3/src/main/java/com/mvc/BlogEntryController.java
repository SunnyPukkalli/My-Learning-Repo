package com.mvc;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entities.BlogEntry;

@Controller
public class BlogEntryController {

	
	// Method 1
/*	@RequestMapping("/test")
	public ResponseEntity<Object> test(){
		
		BlogEntry entry = new BlogEntry();
		entry.setTitle("test blog entry");
		
		return new ResponseEntity<Object>(entry,HttpStatus.OK);
	}*/
	
	
	// Method 2
	@RequestMapping("/test")
	public @ResponseBody BlogEntry test(){
		
		BlogEntry entry = new BlogEntry();
		entry.setTitle("test blog entry");
		
		return entry;
	}
	
	// to recieve an object as input ; use requestbody as input parameter... (@RequestBody BlogEntry entry)
		
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public @ResponseBody BlogEntry test(@RequestBody BlogEntry entry){
		// change the test class as well..
		return entry;
	}
	
}
