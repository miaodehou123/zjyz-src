package com.zjyz.zjyz.controller;

import java.awt.PageAttributes.MediaType;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zjyz.zjyz.domain.User;


@RestController
public class HelloWorldController {
	
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    
    @RequestMapping(value = "/test", method = RequestMethod.POST,produces = "applicationon/json;charset=UTF-8")
    public  ResponseEntity<Map<String,String>> test(@RequestBody(required = false) User user){
    	Map<String,String> mapResult = new HashMap<String,String>();
    	mapResult.put("key", user.getName());
    	return new ResponseEntity<Map<String,String>>(mapResult, HttpStatus.OK);
    }
}
