package com.rui.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1：start.spring.io 中构建
 * 2：maven中构建
 * 运行: mvn spring-boot:run ,java -jar xx.jar,
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
