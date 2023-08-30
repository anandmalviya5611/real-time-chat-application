package com.admalv.realtimechatapplication.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import com.admalv.realtimechatapplication.chat.ChatMessage;
import com.admalv.realtimechatapplication.chat.MessageType;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Component
@RequiredArgsConstructor
@Slf4j
public class WebSocketEventListener {
	
	//initialization
	private static final Logger log = LoggerFactory.getLogger(WebSocketEventListener.class);

	@EventListener
	public void handleWebSocketDisconnectListener(SessionDisconnectEvent event ) {
		
		StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
		String username =(String) headerAccessor.getSessionAttributes().get("username");
		if(username != null) {
			log.info("User disconnected: {}", username);
			ChatMessage chatMessage = ChatMessage.builder()
				.type(MessageType.LEAVE)
				.sender(username)
				.build(); 
		}
		
	}
}
