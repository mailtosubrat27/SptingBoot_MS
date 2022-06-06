package com.prd;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(name="countries-service")

public class ProductServiceController {

	@GetMapping("/fashon/shirts") 
	public String getFashion() {
		return "Fashion";
	}
}
