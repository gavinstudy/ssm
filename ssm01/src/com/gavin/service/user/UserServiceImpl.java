package com.gavin.service.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gavin.dao.user.UserDao;
import com.gavin.entity.User;

@Service(value="userService")
public class UserServiceImpl implements UserService{
	private UserDao userDao;
	private SqlSessionFactory sqlSessionFactory;
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}


	@Override
	public List<User> queryListByUserName(String userName) {
		return userDao.queryListByUserName(userName);
	}

	@Override
	public List<User> queryList() {
		return userDao.queryList();
	}

	@Override
	public void insertOneUser(User user) {
		userDao.insertOneUser(user);
	}

	@Override
	public void updateTheUser(User user) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		userDao.updateTheUser(user);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void deleteTheUser(String id) throws Exception {
		userDao.deleteTheUser(id);
	}

	@Override
	public User queryTheUser(String id) {
		return userDao.queryTheUser(id);
	}
}