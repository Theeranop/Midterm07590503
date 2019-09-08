package com.example.midterm07590503;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.midterm07590503.Auth.Auth;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button loginButton = findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText emailEditText = findViewById(R.id.username);
                EditText passwordEditText = findViewById(R.id.password);

                String inputEmail = emailEditText.getText().toString();
                String inputPassword = passwordEditText.getText().toString();

                Auth auth = new Auth(inputEmail, inputPassword);

                boolean result = auth.check();
                if (result) {
                    Toast.makeText(
                            LoginActivity.this,
                            R.string.Login_success,
                            Toast.LENGTH_SHORT
                    ).show();
                } else {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage(R.string.Login_failed);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });

                    dialog.show();
                }
            }
        });

    }
}
