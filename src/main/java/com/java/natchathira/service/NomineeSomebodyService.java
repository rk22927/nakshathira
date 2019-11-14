package com.java.natchathira.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.natchathira.constant.CodeDescription;
import com.java.natchathira.dto.BaseDto;
import com.java.natchathira.dto.UserDto;
import com.java.natchathira.entity.NomineeSomebody;
import com.java.natchathira.entity.User;
import com.java.natchathira.repository.NomineeSomebodyRepository;
import com.java.natchathira.validation.Validate;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class NomineeSomebodyService {

	@Autowired
	NomineeSomebodyRepository nomineeSomebodyRepository;
	
	public Object save(NomineeSomebody nomineeSomebody) {
		log.info("Nominee Somebody Service called -->save called with Nominee Somebody Data:"+nomineeSomebody);
		BaseDto baseDto = new BaseDto();
		try {
			Validate.notNull(nomineeSomebody, CodeDescription.NOMINEE_SOMEBODY_REQUIRED);
			nomineeSomebody = nomineeSomebodyRepository.save(nomineeSomebody);
			baseDto = new BaseDto(CodeDescription.SUCCESS,nomineeSomebody.getId());
		}catch(Exception e) {
			log.info("Exception occurs while saving User Details:",e);
			baseDto = new BaseDto(CodeDescription.INTERNAL_SERVER_ERROR);
		}
		return baseDto;
	}

}
