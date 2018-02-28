package com.example.dell.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {
    ImageButton myImageButton1,myImageButton2,myImageButton3,myImageButton4,myImageButton5,myImageButton6,myImageButton7,
            myImageButton8,myImageButton9,myImageButton10,myImageButton11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        myImageButton1=(ImageButton)findViewById(R.id.imageButton);
        myImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(HomeActivity.this,TrainActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton2=(ImageButton)findViewById(R.id.imageButton2);
        myImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(HomeActivity.this,HorseActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton4=(ImageButton)findViewById(R.id.imageButton4);
        myImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(HomeActivity.this,HandRikshawActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton5=(ImageButton)findViewById(R.id.imageButton6);
        myImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(HomeActivity.this,SightSeeingActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton6=(ImageButton)findViewById(R.id.imageButton7);
        myImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(HomeActivity.this,MapsActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton7=(ImageButton)findViewById(R.id.imageButton8);
        myImageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(HomeActivity.this,WeatherActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
        myImageButton8=(ImageButton)findViewById(R.id.imageButton9);
        myImageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(HomeActivity.this,MapsActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
        myImageButton9=(ImageButton)findViewById(R.id.imageButton10);
        myImageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(HomeActivity.this,MapsActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });
        myImageButton10=(ImageButton)findViewById(R.id.imageButton11);
        myImageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(HomeActivity.this,MapsActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
        myImageButton11=(ImageButton)findViewById(R.id.imageButton12);
        myImageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(HomeActivity.this,MapsActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });



    }
}