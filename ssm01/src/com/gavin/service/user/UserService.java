package com.gavin.service.user;

import java.util.List;

import com.gavin.entity.User;

public interface UserService {
	//ͨ������������ѯUser
	public List<User> queryListByUserName(String userName) throws Exception;
	//��ѯ����User
	public List<User> queryList()  throws Exception;
	//ͨ��id��ѯUser
	public User queryTheUser(String id);
	//���һ��User
	public void insertOneUser(User user)  throws Exception;
	//�޸�����
	public void updateTheUser(User user)throws Exception;
	//ɾ����������
	public void deleteTheUser(String id)throws Exception;
}
