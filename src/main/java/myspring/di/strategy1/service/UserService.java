package myspring.di.strategy1.service;

import java.util.List;

import myspring.di.strategy1.dao.UserDao;
import myspring.user.vo.UserVO;

public interface UserService {
	
	public List<UserVO> getUserList();

	public UserVO getUser(int index);
	
	public void setUserDao(UserDao userdao);
	
}
