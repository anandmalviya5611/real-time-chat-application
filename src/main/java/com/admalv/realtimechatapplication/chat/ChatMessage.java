package com.admalv.realtimechatapplication.chat;



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
	
	public ChatMessage(String content, String sender, MessageType type) {
		super();
		this.content = content;
		this.sender = sender;
		this.type = type;
	}
	
	public static ChatMessageBuilder builder() {
	
		return new ChatMessageBuilder();

	}
}
