package com.example.demo;


	import java.util.HashMap;
	import java.util.Map;

	import org.apache.kafka.clients.consumer.ConsumerConfig;
	import org.apache.kafka.common.serialization.StringDeserializer;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
	import org.springframework.kafka.core.ConsumerFactory;
	import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
	import org.springframework.kafka.support.serializer.JsonDeserializer;



	@Configuration
	public class KafkaConsumerConfig {

		//<String, String>
		@Bean
		public ConsumerFactory<String,String> consumerfactory(){
			Map<String,Object> config=new HashMap<>();
			config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
			config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
			config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
			config.put(ConsumerConfig.GROUP_ID_CONFIG,"group1");
			return new DefaultKafkaConsumerFactory<>(config);		
		}
		
		@Bean
		public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerfactory(){
			ConcurrentKafkaListenerContainerFactory<String, String> factory=new ConcurrentKafkaListenerContainerFactory<>();
			factory.setConsumerFactory(consumerfactory());
			return factory;
		}
		
		
		//String,Object
		
		@Bean
		public ConsumerFactory<String,User> consumeruserfactory(){
			Map<String,Object> config=new HashMap<>();
			config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
			config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
			config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,JsonDeserializer.class);
			config.put(ConsumerConfig.GROUP_ID_CONFIG,"group2");
			return new DefaultKafkaConsumerFactory<>(config,new StringDeserializer(),new JsonDeserializer<>(User.class));		
		}
		
		@Bean
		public ConcurrentKafkaListenerContainerFactory<String, User> kafkaListeneruserfactory(){
			ConcurrentKafkaListenerContainerFactory<String, User> factory=new ConcurrentKafkaListenerContainerFactory<>();
			factory.setConsumerFactory(consumeruserfactory());
			return factory;
		}
		
	}



