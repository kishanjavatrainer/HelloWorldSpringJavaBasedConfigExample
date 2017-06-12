package com.infotech.model;

import org.springframework.beans.factory.annotation.Value;

public class Message  {
	
	@Value(value = "1001")
	private int messageId;
	
	@Value(value = "Hello World!!!!")
	private String message;
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
