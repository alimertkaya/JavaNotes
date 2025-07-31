package com.alimertkaya.exception_management.handler;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.alimertkaya.exception_management.exception.BaseException;

// user -> controller -> service -> repo -> db -> repo -> service -> expection -> handler -> user
// butun exceptionlari tutan, yakalayan siniftir diyoruz bu annotation ile
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = {BaseException.class})
	public ResponseEntity<ApiError> handleBaseException(BaseException exception, WebRequest request) {
		return ResponseEntity.badRequest().body(creatApiError(exception.getMessage(), request));
	}
	
	public <E> ApiError<E> creatApiError(E message,WebRequest request) {
		ApiError<E> apiError = new ApiError<>();
		apiError.setStatus(HttpStatus.BAD_REQUEST.value());
		
		Exception<E> exception = new Exception<>();
		exception.setHostName(getHostName());
		exception.setPath(request.getDescription(false).substring(4));
		exception.setCreateDate(new Date());
		exception.setMessage(message);
		
		apiError.setException(exception);
		return apiError;
	}
	
	public String getHostName() {
		try {
			return InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			System.out.println("bir hata olustu");
		}
		return null;
	}
}
