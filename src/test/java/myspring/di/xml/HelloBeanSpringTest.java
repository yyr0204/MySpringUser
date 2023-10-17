package myspring.di.xml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.Resource;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)	//new GenericXmlApplicationContext
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class HelloBeanSpringTest {
	//Autowired는 타입을 기준으로 찾음
	@Autowired
	Hello hello;
	
	@Autowired
	@Qualifier("helloC")
	Hello hello2;
	
	@Resource(name = "helloC")
	Hello hello3;
	
	@Autowired
	@Qualifier("strPrinter")
	Printer printer;
	
	@Test @Disabled
	void hello() {
		assertEquals("Hello 스프링", hello.sayHello());
		hello.print();
		assertEquals("Hello 스프링", printer.toString());
	}
	
	@Test 
	void helloC() {
		assertEquals("Hello 생성자", hello2.sayHello());
		assertEquals("Hello 생성자",hello3.sayHello());
		
	}
}
