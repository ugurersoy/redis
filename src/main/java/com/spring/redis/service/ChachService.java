package com.spring.redis.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ChachService {

	@Cacheable(cacheNames ="TestCache")
	public String longRunningMetodExample() throws InterruptedException{
		
		Thread.sleep(4000l);
		
		return "done";
	}
	
	@CacheEvict(cacheNames="Testcache")
	public void clearCache() {
	  System.out.println("Cache has been cleaned");
	}
}
