package com.java.natchathira.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.java.natchathira.dto.UserDto;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "my_user")
@Getter  @Setter
public class User {

	@Id
	@GeneratedValue
	Long id;
	
	@Column(name = "name",length = 50,nullable = false)
	String name;
	
	@Column(name="code",length = 20,nullable = false)
	String code;
	
	public User() {}
	
	public User(UserDto userDto) {
		this.id = userDto.getId();
		this.name = userDto.getName();
		this.code = userDto.getCode();
	}
	
}
