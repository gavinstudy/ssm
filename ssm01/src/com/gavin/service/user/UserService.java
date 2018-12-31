package com.gavin.service.user;

import java.util.List;

import com.gavin.entity.User;

public interface UserService {
	//通过名字条件查询User
	public List<User> queryListByUserName(String userName) throws Exception;
	//查询所有User
	public List<User> queryList()  throws Exception;
	//通过id查询User
	public User queryTheUser(String id);
	//添加一个User
	public void insertOneUser(User user)  throws Exception;
	//修改数据
	public void updateTheUser(User user)throws Exception;
	//删除定向数据
	public void deleteTheUser(String id)throws Exception;
}
