package com.ecopointstandard.demo;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import com.ecopointstandard.demo.kafka.KafkaProcessor;

@Service
public class PolicyHandler {

  // @StreamListener(KafkaProcessor.INPUT)
  //   public void whatever(@Payload String eventString){}

    
 //배출할 때, 카프카 이벤트 받아서.. 해당 포인트 기준 전달해줘야함 
}
