package com.example.demo;


	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.kafka.annotation.KafkaListener;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class KafkaConsumerRest {

		List<String> message=new ArrayList<String>();
		
		@GetMapping("/consumestringmsg")
		public List<String> consumeMsg(){
			return message;
		}
		
		@KafkaListener(groupId ="group1",topics = "dataformat",containerFactory = "kafkaListenerfactory")
		public List<String> getMsgfromTopic(String data){
			message.add(data);
			return message;
		}
		
		
		User userfromtopic=null;
		@GetMapping("/consumejsonmsg")
		public User consumejsonMsg(){
			return userfromtopic;
		}
		
		@KafkaListener(groupId ="group2",topics = "dataformat",containerFactory = "kafkaListeneruserfactory")
		public User getjsonMsgfromTopic(User user){
			userfromtopic=user;
			return userfromtopic;
		}
	}


