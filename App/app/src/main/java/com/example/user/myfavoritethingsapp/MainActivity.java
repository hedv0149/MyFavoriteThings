package com.example.user.myfavoritethingsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView myFaceText;
    public ImageButton myFaceButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myFaceText = (TextView) findViewById(R.id.myFaceTxt);
        myFaceButton = (ImageButton)findViewById(R.id.myFace);//to find the button
        myFaceButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){//whatever button dose, and it must be called onClick with small o
                myFaceText.setText("You clicked it!");
            }
        });
    }
}
