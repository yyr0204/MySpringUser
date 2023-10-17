package myspring.di.strategy2.service;

import java.util.List;

import myspring.user.vo.UserVO;

public interface UserService {
	
	public List<UserVO> getUserList();

	public UserVO getUser(int index);
	
}
