package com.wanheng.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanheng.dao.UserDao;
import com.wanheng.entity.UserEntity;
import com.wanheng.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	public UserDao userDao;
	
	
	@Override
	public List<UserEntity> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}


	@Override
	public void addUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		 userDao.addUser(userEntity);
	}


	

	@Override
	public int deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}


	@Override
	public Integer updateUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		return userDao.updateUser(userEntity);
	}


	@Override
	public List<UserEntity> getName(String name) {
		// TODO Auto-generated method stub
		return userDao.getName(name);
	}


	



	

	
}
