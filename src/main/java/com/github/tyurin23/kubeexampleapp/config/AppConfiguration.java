package com.github.tyurin23.kubeexampleapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Y. Tyurin <tyurin23@gmail.com> on 29.03.17.
 */
@Configuration
public class AppConfiguration {

	@Bean(name = "hostname")
	public String hostname(){
		try {
			return InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			return "localhost";
		}
	}


	@Bean(name = "app")
	public String app(@Value("${application.name:app}") String name){
		return name;
	}
}
