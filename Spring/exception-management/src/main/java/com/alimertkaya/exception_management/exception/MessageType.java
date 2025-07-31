package com.alimertkaya.exception_management.exception;

import lombok.Getter;

@Getter
public enum MessageType {
	
	NO_RECORD_EXIST("1001","kayit bulunamadi"),
	GENERAL_EXCEPTİON("9999", "genel bir hata oluştu");
	
	private String code;
	private String message;
	
	private MessageType(String code, String message) {
		this.code = code;
		this.message = message;
	}
}
