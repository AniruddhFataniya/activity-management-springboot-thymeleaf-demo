package com.rudraksh.springboot.helper;

public class Message {
	
	private String Content;
	private String type;
	
	Message(){
		
	}
	public Message(String content, String type) {
		Content = content;
		this.type = type;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	

}
