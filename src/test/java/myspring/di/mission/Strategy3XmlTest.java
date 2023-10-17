package myspring.di.mission;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import myspring.di.strategy1.service.UserService;
import myspring.di.strategy3.config.XmlUserConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = XmlUserConfig.class)
public class Strategy3XmlTest {
	@Autowired
	UserService us;
	
	@Test
	public void User() {
		System.out.println(us.getUserList());
	}
	
}
