package com.dayakuraja.dicoding.data.modeldata;

import com.google.gson.annotations.SerializedName;

public class ResponseData{

	@SerializedName("nama")
	private String nama;

	@SerializedName("nip")
	private String nip;

	@SerializedName("username")
	private String username;

	public String getNama(){
		return nama;
	}

	public String getNip(){
		return nip;
	}

	public String getUsername(){
		return username;
	}
}