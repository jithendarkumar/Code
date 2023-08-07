package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	@Autowired
	 KafkaTemplate<String, String> kafkaTemplate;
	 
//	@Autowired
//	RabbitTemplate rabbitTemplate;

	public void sendMsgToTopic(String message) {
		kafkaTemplate.send("codeDecode_Topic" , message);
		
//		rabbitTemplate.convertAndSend("codeDecode_Topic",message);

	}
}
