package com.dayakuraja.dicoding.data;

import com.dayakuraja.dicoding.data.modellogin.ModelLogin;
import com.dayakuraja.dicoding.data.modellogin.ResponseLogin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiClientInterface {

    @POST("api/login")
    Call<ResponseLogin> getLogin (@Body ModelLogin modelLogin);

    @GET ("api/checkAutentikasi")
    Call<ResponseLogin> getUser(@Header("Authorization") String token);


}
