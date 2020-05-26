package com.spring.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.redis.service.ChachService;

@RestController
@RequestMapping("/redis")
public class CacheController {

    @Autowired
    private ChachService chachService;
    
    
    private int count = 0;
	
	@GetMapping
	public String cacheCheck() throws InterruptedException {
		if(count==5) {
			chachService.clearCache();
			count=0;
		}
		count++;
		return chachService.longRunningMetodExample();
	}
}
