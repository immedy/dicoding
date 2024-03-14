package com.dayakuraja.dicoding.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.dayakuraja.dicoding.MainActivity;
import com.dayakuraja.dicoding.data.ApiClient;
import com.dayakuraja.dicoding.data.Constans;
import com.dayakuraja.dicoding.data.PrefManager;
import com.dayakuraja.dicoding.data.modellogin.ModelLogin;
import com.dayakuraja.dicoding.data.modellogin.ResponseLogin;
import com.dayakuraja.dicoding.databinding.ActivityLoginBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ModelLogin modelLogin = new ModelLogin();
                modelLogin.setUsername(binding.editTextUsername.getText().toString());
                modelLogin.setPassword(binding.etPassword.getText().toString());
                Call<ResponseLogin> client = ApiClient.getApiService().getLogin(modelLogin);
                client.enqueue(new Callback<ResponseLogin>() {
                    @Override
                    public void onResponse(Call<ResponseLogin> call, Response<ResponseLogin> response) {
                        if (response.isSuccessful()){
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            PrefManager prf = new PrefManager(LoginActivity.this);
                            prf.setString(Constans.TOKEN, response.body().getUser().getToken());
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseLogin> call, Throwable t) {

                    }
                });
            }
        });

    }
}