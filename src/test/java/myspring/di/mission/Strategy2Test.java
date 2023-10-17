package myspring.di.mission;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import myspring.di.strategy2.service.UserService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/resources/Spring-Bean-Configuration2.xml")
public class Strategy2Test {
	@Autowired
	UserService us;
	
	
	@Test
	public void user() {
		System.out.println(us.getUserList());
	}
}
