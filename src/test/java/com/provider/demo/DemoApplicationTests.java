package com.provider.demo;

import com.provider.demo.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

//	@Autowired
//	private RabbitTemplate template;

	@Autowired
	private TestService service;

	@Test
	public void contextLoads() throws Exception {
		service.recevice();
		System.out.println("01111111111111");
//		while (true){
//
//			Thread.sleep(2000);
//			Message msg = template.receive("fanout.hello");
//			if(msg!=null) System.out.println("hello队列:   " + new String(msg.getBody()));
//
//			Thread.sleep(2000);
//			msg = template.receive("fanout.say");
//			if(msg!=null) System.out.println("  say队列:   " + new String(msg.getBody()));
//
//		}
	}

}
