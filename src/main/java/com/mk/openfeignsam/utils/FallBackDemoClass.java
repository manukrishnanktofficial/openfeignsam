package com.mk.openfeignsam.utils;

import org.springframework.cloud.client.circuitbreaker.NoFallbackAvailableException;
import org.springframework.stereotype.Component;

public class FallBackDemoClass {

	@Component
	static class FallbackDemo implements RouteManagable {
	
		@Override
		public String getName() {
	        return "HardCoded Response when Timeout Hits!";
		}
	
		@Override
		public String getAddress() {
	        throw new NoFallbackAvailableException("Exception Thrown 1!", new RuntimeException());
		}
	
		@Override
		public String getTimeLine() {

			System.out.println("========2==========");
	        throw new NoFallbackAvailableException("Exception Thrown 2!", new RuntimeException("Exception Thrown 2"));
		}
	
	}
}
