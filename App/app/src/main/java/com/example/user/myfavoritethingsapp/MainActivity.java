package com.example.user.myfavoritethingsapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView myFaceText;
    public ImageButton myFaceButton;
    public Handler h = new Handler(){};
    //public Thread thrd;  //thread didnt work, but just in case i will leave it
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myFaceText = (TextView) findViewById(R.id.myFaceTxt);
        myFaceButton = (ImageButton)findViewById(R.id.myFace);//to find the button
        myFaceButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){//whatever button does, and it must be called onClick with small o
                //thrd = new Thread() {
                myFaceText.setText("You pressed it!");
                boolean b = h.postDelayed(new Runnable() {
                    @Override
                    public void run() {



                        //thrd.sleep(300);
                        Intent moveToNewActivity = new Intent(MainActivity.this, Menu.class);
                        startActivity(moveToNewActivity);//}; }
                    }
                },1000);
            };
        });
    }
}
