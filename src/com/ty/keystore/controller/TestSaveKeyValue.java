package com.ty.keystore.controller;

import com.ty.keystore.dto.KeyValue;
import com.ty.keystore.service.KeyValueService;

public class TestSaveKeyValue {

	public static void main(String[] args) {

		KeyValueService keyValueService = new KeyValueService() ;
		KeyValue keyValue = new KeyValue() ;
		
		keyValue.setPid(1) ;
		keyValue.setKey("leela@mail.com") ;
		keyValue.setValue("1345abcd") ;
		keyValue.setDesc("Instagram");
		
		int res = keyValueService.saveKeyValue(keyValue) ;
	
		if( res != 0 ) System.out.println("Data is inserted") ;
		else System.out.println("No data is inserted") ;
		
		
	}

}
