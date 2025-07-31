package com.alimertkaya.exception_management.controller.impl;

import com.alimertkaya.exception_management.model.RootEntity;

public class RestBaseController {

	public <T> RootEntity<T> ok(T data) {
		return RootEntity.ok(data);
	}
	
	public <T> RootEntity<T> error(String errorMessage) {
		return RootEntity.error(errorMessage);
	}
}
