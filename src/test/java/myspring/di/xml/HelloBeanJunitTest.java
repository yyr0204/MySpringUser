package myspring.di.xml;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloBeanJunitTest {
	BeanFactory factory;
	
	@BeforeEach
	void init() {
		//1. Spring Bean Container 객체생성
		factory = new GenericXmlApplicationContext("classpath:spring-beans.xml");
		
	}
	
	@Test
	void helloCons() {
		Hello bean = factory.getBean("helloC",Hello.class);
		assertEquals("Hello 생성자", bean.sayHello());
		bean.print();
		
		List<String> names = bean.getNames();
		assertEquals(3, names.size());
		assertEquals("SpringBoot", names.get(1));
	}
	
	
	@Test @Disabled
	void hello() {
		//2. Container가 생성한 Bean요청
		Hello hello1 = (Hello)factory.getBean("hello");
		Hello hello2 = factory.getBean("hello", Hello.class);	//권장
		//3. HelloBean 레퍼런스 비교하기  - 싱글톤인지 확인
		assertSame(hello1, hello2); //같으면 테스트성공
		
		assertEquals("Hello 스프링", hello2.sayHello());
		hello2.print();
		
		Printer printer = factory.getBean("strPrinter",Printer.class);
		assertEquals("Hello 스프링",printer.toString());
	}
}
