package com.cowboy.mvn;

import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyHandler extends TextWebSocketHandler{

	@Override
	protected void handleBinaryMessage(WebSocketSession arg0, BinaryMessage arg1) {
		// TODO Auto-generated method stub
		super.handleBinaryMessage(arg0, arg1);
	}

	
}
