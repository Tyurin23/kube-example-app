package com.github.tyurin23.kubeexampleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.UnknownHostException;

/**
 * Created by Y. Tyurin <tyurin23@gmail.com> on 29.03.17.
 */
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) throws UnknownHostException {
		SpringApplication application = new SpringApplication(Application.class);
		application.run(args);
	}

}
