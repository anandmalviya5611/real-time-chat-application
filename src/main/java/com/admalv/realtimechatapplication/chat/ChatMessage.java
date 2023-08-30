package com.admalv.realtimechatapplication.chat;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class ChatMessage {
	
	private String content;
	private String sender;
	private MessageType type;
	
	
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public MessageType getType() {
		return type;
	}
	public void setType(MessageType type) {
		this.type = type;
	}
	
	
	// public static ChatMessageBuilder builder() {
	
	// 	return new ChatMessageBuilder();

	// }
}
