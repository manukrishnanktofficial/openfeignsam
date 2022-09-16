package com.mk.openfeignsam.utils;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.mk.openfeignsam.utils.FallBackDemoClass.FallbackDemo;

@FeignClient(name = "${feign.name}", url = "${feign.url}", fallback = FallbackDemo.class)
public interface RouteManagable {
	@GetMapping("/name")
	public String getName();
	
	@GetMapping("/address")
	public String getAddress();
	
	@GetMapping("/time")
	public String getTimeLine();
}
