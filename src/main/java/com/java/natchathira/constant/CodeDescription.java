package com.java.natchathira.constant;



public enum CodeDescription {

	SUCCESS(200,"Success",true),
	INTERNAL_SERVER_ERROR(500,"Internal Server Error occured",false),
	FAILED(501,"Failed",false),
	
	
	//User
	USER_NAME_REQUIRED(201,"User Name is Required",false),
	USER_CODE_REQUIRED(201,"User Code is Required",false),
	USER_NAME_LENGTH_MISMATCHED(203,"User Name length should be in 3 to 50 charactor",false),
	USER_CODE_LENGTH_MISMATCHED(204,"User Code length should be in 3 to 20 charactor",false),
	USER_REQUIRED(205,"User is Required",false),
	NOMINEE_MYSELF_REQUIRED(206,"Nominee is Required",false),
	NOMINEE_SOMEBODY_REQUIRED(207,"Nominee is Required",false),
	
	USER_ID_REQUIRED(206,"User ID is Required",false),
	;
	Integer code;
	
	String description;
	
	Boolean status;
	
	private CodeDescription(Integer code,String description,Boolean status) {
		this.code = code;
		this.description = description;
		this.status = status;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
}
