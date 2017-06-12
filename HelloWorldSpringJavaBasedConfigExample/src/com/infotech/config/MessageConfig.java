package com.infotech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infotech.model.Message;

@Configuration
public class MessageConfig {

	@Bean(name={"message","MyMessage1","MyMessage2"})
	public Message getMessage(){
		return new Message();
	}
}
