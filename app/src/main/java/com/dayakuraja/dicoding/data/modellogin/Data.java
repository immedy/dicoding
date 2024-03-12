package com.dayakuraja.dicoding.data.modellogin;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("pegawai_id")
	private String pegawaiId;

	@SerializedName("id")
	private int id;

	@SerializedName("username")
	private String username;

	@SerializedName("token")
	private String token;

	public void setPegawaiId(String pegawaiId){
		this.pegawaiId = pegawaiId;
	}

	public String getPegawaiId(){
		return pegawaiId;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public void setToken(String token){
		this.token = token;
	}

	public String getToken(){
		return token;
	}
}