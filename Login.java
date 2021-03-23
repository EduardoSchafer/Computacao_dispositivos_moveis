package com.example.trabalho1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btlogin = (Button) findViewById(R.id.button);



        btlogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                EditText tLogin = (EditText)findViewById(R.id.editTextTextPersonName);
                String login = tLogin.getText().toString();
                EditText tSenha = (EditText)findViewById(R.id.editTextTextPassword);
                String senha = tSenha.getText().toString();

                Intent i = new Intent(Login.this, Menu.class);
                startActivity (i);
            }
        });

    }
}