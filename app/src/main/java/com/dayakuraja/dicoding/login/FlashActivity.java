package com.dayakuraja.dicoding.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.dayakuraja.dicoding.MainActivity;
import com.dayakuraja.dicoding.R;
import com.dayakuraja.dicoding.data.Constans;
import com.dayakuraja.dicoding.data.PrefManager;
import com.dayakuraja.dicoding.databinding.ActivityFlashBinding;

public class FlashActivity extends AppCompatActivity {
ActivityFlashBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFlashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                PrefManager prf = new PrefManager( FlashActivity.this);
                if (prf.getString(Constans.TOKEN).equals("")){
                    Intent intent = new Intent(FlashActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Intent intent = new Intent(FlashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        },1000);
    }
}