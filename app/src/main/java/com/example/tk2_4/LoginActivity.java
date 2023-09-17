package com.example.tk2_4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private static final String HARDCODED_USERNAME = "pengguna";
    private static final String HARDCODED_PASSWORD = "masuk";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.loginButton);
        final EditText userInput = findViewById(R.id.userInput);
        final EditText passwordInput = findViewById(R.id.passwordInput);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = userInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();

                // Check for hardcoded username and password
                if (username.equals(HARDCODED_USERNAME) && password.equals(HARDCODED_PASSWORD)) {
                    Log.d("LoginActivity", "Login successful for user: " + username);
                    Intent intent = new Intent(LoginActivity.this, AppActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Log.d("LoginActivity", "Login failed. Invalid username or password.");
                    // Handle invalid login (e.g., display an error message)
                }
            }
        });
    }
}