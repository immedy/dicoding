package com.dayakuraja.dicoding.data.modellogin;

import com.google.gson.annotations.SerializedName;

public class ResponseLogin{

	@SerializedName("pesan")
	private String pesan;

	@SerializedName("success")
	private String success;

	@SerializedName("user")
	private User user;
	public User getUser(){
		return user;
	}

	public void setPesan(String pesan){
		this.pesan = pesan;
	}

	public String getPesan(){
		return pesan;
	}

	public void setSuccess(String success){
		this.success = success;
	}

	public String getSuccess(){
		return success;
	}

	public void setUser(User user){
		this.user = user;
	}


}