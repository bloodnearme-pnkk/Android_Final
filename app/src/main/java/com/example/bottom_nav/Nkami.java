package com.example.bottom_nav;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;

public class Nkami extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nkami);

        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        Button send = findViewById(R.id.how);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(Nkami.this, MainActivity.class);
                startActivity(send);
            }
        });
    }
    public void signinscreen(View view){
        Intent i1 = new Intent(getApplicationContext(),SignIn.class);
        Pair[] pair = new Pair[1];
        pair[0] = new Pair<View,String>(findViewById(R.id.SignInBtn),"transition_SignIn");

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Nkami.this,pair);
            startActivity(i1,options.toBundle());
        }
        else{ startActivity(i1); }
    }

    public void signupscreen(View view) {
        Intent i1 = new Intent(getApplicationContext(),SignUp.class);
        Pair[] pair = new Pair[1];
        pair[0] = new Pair<View,String>(findViewById(R.id.SignUpBtn),"transition_SignUp");

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Nkami.this,pair);
            startActivity(i1,options.toBundle());
        }
        else{ startActivity(i1); }
    }
}