package com.niit.collaboration.model;

import java.util.Date;

public class OutputMessage extends Message{
	private String username;
	private Date time;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

}
