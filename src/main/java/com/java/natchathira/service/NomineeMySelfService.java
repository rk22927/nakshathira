package com.java.natchathira.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.natchathira.constant.CodeDescription;
import com.java.natchathira.dto.BaseDto;
import com.java.natchathira.entity.NomineeMySelf;
import com.java.natchathira.repository.NomineeMySelfRepository;
import com.java.natchathira.validation.Validate;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class NomineeMySelfService {

	
	@Autowired
	NomineeMySelfRepository mySelfRepository;
	
	public Object save(NomineeMySelf nomineeMySelf) {
		log.info("Nominee MySelf Service called -->save called with Nominee Myselef Data:"+nomineeMySelf);
		BaseDto baseDto = new BaseDto();
		try {
			Validate.notNull(nomineeMySelf, CodeDescription.NOMINEE_MYSELF_REQUIRED);
			nomineeMySelf = mySelfRepository.save(nomineeMySelf);
			baseDto = new BaseDto(CodeDescription.SUCCESS,nomineeMySelf.getId());
		}catch(Exception e) {
			log.info("Exception occurs while saving User Details:",e);
			baseDto = new BaseDto(CodeDescription.INTERNAL_SERVER_ERROR);
		}
		return baseDto;
	}
}
