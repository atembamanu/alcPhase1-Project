package com.atemba.emmanuel.andelaprofileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button aAboutalc, aMyProfile;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aAboutalc  = findViewById(R.id.aAboutalc);
        aMyProfile = findViewById(R.id.aMyProfile);

        aAboutalc.setOnClickListener(this);
        aMyProfile.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.aAboutalc:
               aboutALC();
                break;

            case R.id.aMyProfile:
                myProfile();
                break;
        }

    }

    private void myProfile() {
        Intent intent = new Intent(MainActivity.this, MyProfile.class);
        startActivity(intent);

    }

    private void aboutALC() {
        Intent intentAbout = new Intent(MainActivity.this, AboutALC.class);
        startActivity(intentAbout);



    }
}
