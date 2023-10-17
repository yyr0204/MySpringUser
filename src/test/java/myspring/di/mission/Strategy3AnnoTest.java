package myspring.di.mission;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import myspring.di.strategy2.service.UserService;
import myspring.di.strategy3.config.AnnoUserConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AnnoUserConfig.class, loader = AnnotationConfigContextLoader.class)
public class Strategy3AnnoTest {
	@Autowired
	UserService us;
	
	@Test
	public void User() {
		System.out.println(us.getUserList());
	}
	
}
