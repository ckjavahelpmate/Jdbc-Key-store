package com.ty.keystore.dto;

public class KeyValue {
	private int pid ;
	private String key ;
	private String value ;
	private String desc ;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "KeyStore [pid=" + pid + ", key=" + key + ", value=" + value + ", desc=" + desc + "]";
	}
	
	
}
