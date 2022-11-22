package com.example.bottom_nav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }

        EditText email = findViewById(R.id.signinEmailTxt);
        EditText pass = findViewById(R.id.signinPasswordTxt);
        Button SignInbtn = findViewById(R.id.SignIn);
        Button SignInUp = (Button) findViewById(R.id.signInUp);

        SignInbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String SignINemail = email.getText().toString();
                String SignINpass = pass.getText().toString();

                if(SignINemail.equals("admin123@gmail.com") && SignINpass.equals("admin123")){
                    Intent intent = new Intent(SignIn.this,MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Wrong ID & Password",Toast.LENGTH_SHORT).show();
                }

            }
        });

        SignInUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignIn.this, SignUp.class));
            }
        });
    }
}