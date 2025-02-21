package com.example.mealshare;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    private EditText username, email, password, confirmPassword;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView signUpTextView2 = findViewById(R.id.textViewSignIn);
        signUpTextView2.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity3.this, MainActivity2.class));
        });


        username = findViewById(R.id.editTextTextEmailAddress2);
        email = findViewById(R.id.editTextTextEmailAddress3);
        password = findViewById(R.id.editTextTextPassword2);
        confirmPassword = findViewById(R.id.editTextTextPassword3);
        registerButton = findViewById(R.id.button2);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

    private void registerUser() {
        String user = username.getText().toString().trim();
        String emailInput = email.getText().toString().trim();
        String pass = password.getText().toString().trim();
        String confirmPass = confirmPassword.getText().toString().trim();


        if (TextUtils.isEmpty(user)) {
            username.setError("Username is required");
            return;
        }
        if (TextUtils.isEmpty(emailInput)) {
            email.setError("Email is required");
            return;
        }
        if (TextUtils.isEmpty(pass)) {
            password.setError("Password is required");
            return;
        }
        if (TextUtils.isEmpty(confirmPass)) {
            confirmPassword.setError("Confirm password is required");
            return;
        }
        if (!pass.equals(confirmPass)) {
            confirmPassword.setError("Passwords do not match");
            return;
        }

        Toast.makeText(MainActivity3.this, "Registration Successful!", Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(intent);
        finish();
    }
}
