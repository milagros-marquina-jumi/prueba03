package com.java.entelgy;

import javax.ws.rs.core.Application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class EntelgyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntelgyApplication.class, args);
	}

}
