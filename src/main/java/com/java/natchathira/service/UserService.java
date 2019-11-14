package com.java.natchathira.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.natchathira.constant.CodeDescription;
import com.java.natchathira.dto.BaseDto;
import com.java.natchathira.dto.UserDto;
import com.java.natchathira.entity.User;
import com.java.natchathira.repository.UserRepository;
import com.java.natchathira.validation.Validate;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public Object save(UserDto userDto) {
		log.info("User Service called -->save called with user Data:"+userDto);
		BaseDto baseDto = new BaseDto();
		try {
			Validate.notNull(userDto, CodeDescription.USER_REQUIRED);
			validate(userDto);
			User user = new User(userDto);
			user = userRepository.save(user);
			baseDto = new BaseDto(CodeDescription.SUCCESS,user.getId());
		}catch(Exception e) {
			log.info("Exception occurs while saving User Details:",e);
			baseDto = new BaseDto(CodeDescription.INTERNAL_SERVER_ERROR);
		}
		return baseDto;
	}
	
	public Object update(UserDto userDto) {
		log.info("User Service called -->update called with user Data:"+userDto);
		BaseDto baseDto = new BaseDto();
		try {
			Validate.notNull(userDto, CodeDescription.USER_REQUIRED);
			Validate.notNull(userDto.getId(), CodeDescription.USER_ID_REQUIRED);
			validate(userDto);
			User user = new User(userDto);
			user = userRepository.saveAndFlush(user);
			baseDto = new BaseDto(CodeDescription.SUCCESS,user.getId());
		}catch(Exception e) {
			log.info("Exception occurs while updating User Details:",e);
			baseDto = new BaseDto(CodeDescription.INTERNAL_SERVER_ERROR);
		}
		return baseDto;
	}
	public Object get(Long id) {
		log.info("User Service called -->get called with user Id:"+id);
		BaseDto baseDto = new BaseDto();
		try {
			Validate.notNull(id, CodeDescription.USER_ID_REQUIRED);
			User user = userRepository.getOne(id);
			Validate.notNull(user, CodeDescription.USER_REQUIRED);
			UserDto dto = new UserDto(user);
			baseDto = new BaseDto(CodeDescription.SUCCESS,dto);
		}catch(Exception e) {
			log.info("Exception occurs while getting User Details:",e);
			baseDto = new BaseDto(CodeDescription.INTERNAL_SERVER_ERROR);
		}
		return baseDto;
	}
	
	public Object delete(Long id) {
		log.info("User Service called -->Delete called with user Id:"+id);
		BaseDto baseDto = new BaseDto();
		try {
			Validate.notNull(id, CodeDescription.USER_ID_REQUIRED);
			userRepository.deleteById(id);
			baseDto = new BaseDto(CodeDescription.SUCCESS);
		}catch(Exception e) {
			log.info("Exception occurs while updating User Details:",e);
			baseDto = new BaseDto(CodeDescription.INTERNAL_SERVER_ERROR);
		}
		return baseDto;
	}
	
	public Object getAll() {
		log.info("User Service called -->getAll called..");
		BaseDto baseDto = new BaseDto();
		try {
			List<User> userList = userRepository.findAll();
			Validate.notNull(userList, CodeDescription.USER_REQUIRED);
			List<UserDto> dtoList = UserDto.toList(userList);
			baseDto = new BaseDto(CodeDescription.SUCCESS,dtoList);
		}catch(Exception e) {
			log.info("Exception occurs while getting User List Details:",e);
			baseDto = new BaseDto(CodeDescription.INTERNAL_SERVER_ERROR);
		}
		return baseDto;
	}
	
	public void validate(UserDto userDto) {
		Validate.notNull(userDto.getName(), CodeDescription.USER_NAME_REQUIRED);
		Validate.notNull(userDto.getCode(), CodeDescription.USER_CODE_REQUIRED);
		Validate.lengthCheck(userDto.getName(), 3, 50, CodeDescription.USER_NAME_LENGTH_MISMATCHED);
		Validate.lengthCheck(userDto.getCode(), 2, 20, CodeDescription.USER_CODE_LENGTH_MISMATCHED);
	}
}
