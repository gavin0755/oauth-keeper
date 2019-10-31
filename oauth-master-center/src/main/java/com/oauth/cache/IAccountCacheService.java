package com.oauth.cache;

public interface IAccountCacheService {

	/**
	 * 缓存token，如果已经存在则返回已存在token，并刷新过期时间
	 */
	String cacheToken(String clientId, String phone, String token);
	
	/**
	 * 清理token，会先检查token是否合法
	 */
	boolean delToken(String clientId, String phone, String token);
	
	/**
	 * 重置token
	 */
	boolean resetToken(String clientId, String phone, String token);
	
	/**
	 * 检查token，并刷新过期时间
	 */
	boolean checkToken(String clientId, String phone, String token);
}
