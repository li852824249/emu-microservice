package com.cn.emu.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
	
	@Bean
	public RestTemplate geTemplateP() {
		return new RestTemplate();
	}
	
	

}
