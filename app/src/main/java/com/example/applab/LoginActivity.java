package com.example.applab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private static String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText etEmail = findViewById(R.id.etEmail);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                if (email.equals("prueba@gmail.com")&&password.equals("prueba")) {
                    Intent next = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(next);
                    String str = email + " " + password;
                    Log.d(TAG, str);
                }
                else{
                    TextView login = findViewById(R.id.textView);
                    login.setText("Usuario o contraseña incorrecto");
                }
            }
        });
    }
}