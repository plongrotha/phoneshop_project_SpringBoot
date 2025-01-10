package com.phoneshopmanagement.exception;

import org.springframework.http.HttpStatus;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends ApiException {

	public ResourceNotFoundException(HttpStatus httpStatus, String message) {
		super(httpStatus, message);
		// TODO Auto-generated constructor stub
	}

//	public ResourceNotFoundException(String resourceName, Integer id) {
//		String text = String.format("%s with id is not found", resourceName, id);
//		super(HttpStatus.NOT_FOUND);
//	}

}
 