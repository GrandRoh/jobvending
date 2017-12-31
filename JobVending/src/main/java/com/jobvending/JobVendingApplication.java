package com.jobvending;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration  				// �� Java Ŭ������ Spring�� ȯ�漳���� ���� �� �����̶�� ��.
@SpringBootApplication			// spring boot��� ��
public class JobVendingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobVendingApplication.class, args);
	}
}
