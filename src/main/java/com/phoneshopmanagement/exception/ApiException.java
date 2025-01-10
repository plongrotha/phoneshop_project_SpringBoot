package com.phoneshopmanagement.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;

@SuppressWarnings("serial")
public class ApiException extends RuntimeException {

	private HttpStatus httpStatus;
	private String message;

	public ApiException(HttpStatus httpStatus, String message) {
		super();
		this.httpStatus = httpStatus;
		this.message = message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
