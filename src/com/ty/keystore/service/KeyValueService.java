package com.ty.keystore.service;

import com.ty.keystore.dto.KeyValue;
import com.ty.keyvalue.dao.KeyValueDao;

public class KeyValueService {

	KeyValueDao dao = new KeyValueDao() ;
	
	public int saveKeyValue(KeyValue keyValue) {
		
		return dao.savekeyvalue(keyValue) ;
	}
	

}
