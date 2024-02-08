package com.SpringBootRestRedisCacheEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootRestRedisCacheExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestRedisCacheExApplication.class, args);
	}

}
