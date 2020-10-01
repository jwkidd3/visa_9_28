package com.kiddcorp.amqp;

import com.kiddcorp.domain.Order;

public interface MessageSender {
	public void sendOrderMessage(Order toSend);
	
}
