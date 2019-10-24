package com.oauth.vip.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:vip.properties")
@ConfigurationProperties(prefix = "vip")
public class VipCommonConfig {

	public static long TOKEN_TIMEOUT;	//登陆token过期时间，秒
	
	public static String img;
	
	public void setTokenTimeout(long tokenTimeout) {
		TOKEN_TIMEOUT = tokenTimeout;
	}
}
