package com.java.natchathira.dto;

import java.util.ArrayList;
import java.util.List;

import com.java.natchathira.entity.User;

import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class UserDto {

	Long id;
	
	String name;
	
	String code;
	
	public UserDto() {}
	
	public UserDto(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.code = user.getCode();
	}
	
	public static List<UserDto> toList(List<User> userList){
		List<UserDto> userDtoList = new ArrayList<UserDto>();;
		if(userList != null) {
			userList.forEach(list ->{
				userDtoList.add(new UserDto(list));
			});
		}
		return userDtoList;
	}
	
}
