package com.java.natchathira.validation;

import org.springframework.util.StringUtils;

import com.java.natchathira.constant.CodeDescription;
import com.java.natchathira.exception.BadRequestException;

public class Validate {

	
	public static boolean notNull(Object obj,CodeDescription codeDescription) {
		if(obj != null || !StringUtils.isEmpty(obj)) 
			return true;
		else
			throw new BadRequestException(codeDescription);
	}
	
	public static boolean lengthCheck(String obj,int minLength,int maxLength,CodeDescription codeDescription) {
		if(obj.length() >= minLength && obj.length() <= maxLength) 
			return false;
		else
			throw new BadRequestException(codeDescription);
	}
}
