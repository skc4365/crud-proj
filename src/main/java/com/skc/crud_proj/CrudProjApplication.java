package com.skc.crud_proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude =  { DataSourceAutoConfiguration.class })
@SpringBootApplication
public class CrudProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudProjApplication.class, args);
	}

}
