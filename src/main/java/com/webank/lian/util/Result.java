package com.webank.lian.util;


public class Result<T> {
	
	private Integer status;//状态码
	private String message;//消息
	private T data;
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	private Result(Integer status, String message, T data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}
	
	/*
	登录验证成功，返回success
	 */
	public static <T> Result success(T t) {
		return new Result(0, "success", t);
	}
	
	/*
	登录验证失败，返回状态码和相应的消息
	
	1 : 用户名或密码为空
	2 ：用户不存在
	3 : 用户名或密码错误
	 */
	public static Result error(Integer status, String message) {
		return new Result(status, message, null);
	}
}
