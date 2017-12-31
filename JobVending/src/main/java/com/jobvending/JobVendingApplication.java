package com.jobvending;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration  				// 이 Java 클래스는 Spring의 환경설정과 관련 된 파일이라는 것.
@SpringBootApplication			// spring boot라는 것
public class JobVendingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobVendingApplication.class, args);
	}
}
