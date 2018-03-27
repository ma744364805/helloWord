package com.wanheng.cotroller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wanheng.entity.Msg;
import com.wanheng.entity.UserEntity;
import com.wanheng.service.UserService;
@Controller
public class UserCotroller {
	@Autowired
	UserService userServise;
	
	
	@RequestMapping("getAll")
	@ResponseBody
	public Msg getAll(@RequestParam( name="pn",required=false,defaultValue="1") Integer pn,Model model){
		PageHelper.startPage(pn,5);
		List<UserEntity> list=userServise.getAll();
		
		PageInfo<UserEntity> page=new PageInfo<UserEntity>(list,5);
		System.out.println(page);
		return Msg.success().add("page", page);
		
	}
	@RequestMapping("addUser")
	@ResponseBody
	public void addUSer(UserEntity u){
		 userServise.addUser(u);
	}
	
	@RequestMapping(value="deleteUser")
	@ResponseBody
	public int deleteUser(Integer id) {
		return userServise.deleteUser(id);
		
	}
	
	@RequestMapping("updateUser")
	@ResponseBody
	public Integer updateUser(UserEntity userEntity,Integer id){
		userServise.updateUser(userEntity);
		return id;
		
	}
	
	

	
	@RequestMapping("getName")
	@ResponseBody
	public List<UserEntity> getName(String name){
		
		List<UserEntity> list=userServise.getName(name);
		
		
		return list ;
		
		
		
	}
}
