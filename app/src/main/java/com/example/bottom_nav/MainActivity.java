package com.example.bottom_nav;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity{

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //getting bottom navigation view and attaching the listener
        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button
       drawerLayout.addDrawerListener(actionBarDrawerToggle);
       actionBarDrawerToggle.syncState();

        // to make the Navigation drawer icon always appear on the action bar
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);

  }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            int id = item.getItemId();
            if (id == R.id.nav_Home) {
                startActivity(new Intent(this, home.class));
                return true;
            } else if(id == R.id.nav_About){
                startActivity(new Intent(this,about.class));
                return true;
            }
        }
            return super.onOptionsItemSelected(item);

        }
}

