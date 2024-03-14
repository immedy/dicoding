package com.dayakuraja.dicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dayakuraja.dicoding.data.ApiClient;
import com.dayakuraja.dicoding.data.Constans;
import com.dayakuraja.dicoding.data.PrefManager;
import com.dayakuraja.dicoding.data.modellogin.ResponseLogin;
import com.dayakuraja.dicoding.databinding.ActivityMainBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        PrefManager prf = new PrefManager(MainActivity.this);
        Call<ResponseLogin> data = ApiClient.getApiService().getUser("Bearer " + prf.getString(Constans.TOKEN));
        data.enqueue(new Callback<ResponseLogin>() {
            @Override
            public void onResponse(Call<ResponseLogin> call, Response<ResponseLogin> response) {
                binding.textUsername.setText(response.body().getUser().getNamaLengkap());
            }

            @Override
            public void onFailure(Call<ResponseLogin> call, Throwable t) {

            }
        });

    }
}