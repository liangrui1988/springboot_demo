package com.rui.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1：start.spring.io 中构建
 * <p>
 * 2：maven中构建
 * <p>
 * 运行: mvn spring-boot:run ,java -jar xx.jar,
 * <p>
 * 修改端口-Dserver.port=8009
 * <p>
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
