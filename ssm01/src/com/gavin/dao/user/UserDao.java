package com.gavin.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gavin.entity.User;

@Repository(value="userDao")
public interface UserDao {
	//ͨ������������ѯUser
	public List<User> queryListByUserName(String userName);
	//��ѯ����User
	public List<User> queryList();
	//ͨ��id��ѯUser
	public User queryTheUser(String id);
	//���һ��User
	public void insertOneUser(User user);
	//�޸�����
	public void updateTheUser(User user)throws Exception;
	//ɾ����������
	public void deleteTheUser(String id)throws Exception;
}
