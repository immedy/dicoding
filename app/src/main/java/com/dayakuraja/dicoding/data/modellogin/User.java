package com.dayakuraja.dicoding.data.modellogin;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("pegawai_id")
	private String pegawaiId;

	@SerializedName("nama_lengkap")
	private String namaLengkap;

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

	public void setNamaLengkap(String namaLengkap){
		this.namaLengkap = namaLengkap;
	}

	public String getNamaLengkap(){
		return namaLengkap;
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