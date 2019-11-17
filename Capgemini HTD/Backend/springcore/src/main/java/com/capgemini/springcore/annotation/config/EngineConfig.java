package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotation.bean.Honda;
import com.capgemini.springcore.annotation.bean.Vw;
import com.capgemini.springcore.interfaces.Engine;

@Configuration
public class EngineConfig {
	
	
@Bean(name="honda")
@Primary
	public Engine getHonda() {
		return new Honda();
		}

@Bean(name="Vw")
public Engine getVw() {
	return new Vw();
	}
}//End of class
