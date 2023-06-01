package com.rakesh.connecttomultipledb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "{com.rakesh.connecttomultipledb.*}")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ConnectToMultipleDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectToMultipleDbApplication.class, args);
	}

}
