package com.admalv.realtimechatapplication.chat;

public class ChatMessageBuilder {
	private String content;
	private String sender;
	private MessageType type;
	
	public ChatMessageBuilder content(String content) {
		this.content = content;
		return this;
	}
	
	public ChatMessageBuilder sender(String sender) {
		this.sender = sender;
		return this;
	}
	
	public ChatMessageBuilder type(MessageType type) {
		this.type = type;
		return this;
	}
	
	public ChatMessage build() {
		
		return new ChatMessage(content, sender, type);
	}
	
}
