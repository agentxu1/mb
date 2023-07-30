package com.xys.mb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class MbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbApplication.class, args);
	}

}
