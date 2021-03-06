package com.bocsoft.rdmr.cvs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@EnableDubboConfiguration
@SpringBootApplication
public class DubboServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(DubboServerApplication.class, args);
	}
}
