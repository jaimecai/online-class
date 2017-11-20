package com.ucai.onlineclass.dto;

public class ResponseDto {
	String code;
	String message;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ResponseDto(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public ResponseDto() {
		super();
	}
	
}
