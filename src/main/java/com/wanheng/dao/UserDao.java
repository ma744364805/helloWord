package com.wanheng.dao;

import java.util.List;

import com.wanheng.entity.UserEntity;

public interface UserDao {
		List<UserEntity> getAll();

		void addUser(UserEntity userEntity);

		int deleteUser(Integer id);

		Integer updateUser(UserEntity userEntity);

		List<UserEntity> getName(String name);
}
