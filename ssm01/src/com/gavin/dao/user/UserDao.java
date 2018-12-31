package com.gavin.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gavin.entity.User;

@Repository(value="userDao")
public interface UserDao {
	//通过名字条件查询User
	public List<User> queryListByUserName(String userName);
	//查询所有User
	public List<User> queryList();
	//通过id查询User
	public User queryTheUser(String id);
	//添加一个User
	public void insertOneUser(User user);
	//修改数据
	public void updateTheUser(User user)throws Exception;
	//删除定向数据
	public void deleteTheUser(String id)throws Exception;
}
