package com.mk.openfeignsam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.openfeignsam.utils.RouteManagable;

@RestController
@RequestMapping(value = "/fallback")
public class FallbackController {
	@Autowired 
	private RouteManagable rManage;
	
	@GetMapping("/name")
	public ResponseEntity<String> responseSample(){
		return ResponseEntity.ok(rManage.getName());
	}
	@GetMapping("/address")
	public ResponseEntity<String> responseSample1(){
		return ResponseEntity.ok(rManage.getAddress());
	}
	@GetMapping("/time")
	public ResponseEntity<String> responseTimeLine(){
		System.out.println("========1==========");
		String response ="";
		try {
			response = rManage.getTimeLine();
		} catch (Exception e) {
			response = e.getMessage();
		}
		return ResponseEntity.ok(response);
	}
}
