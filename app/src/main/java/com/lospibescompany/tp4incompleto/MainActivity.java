package com.lospibescompany.tp4incompleto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lospibescompany.tp4incompleto.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Context context;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

    }

    public void login(){
        String usuario = binding.user.getText()+"";
        String password = binding.password.getText()+"";

        if((usuario == "eze") && (password == "41710461")){
            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Usuario incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
}