package com.example.android.birthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button launchButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        launchButton = (Button)findViewById(R.id.button);


        launchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);//to get the current running activity.specifies the sender's address
                //giving the data a tag

                startActivity(intent);//data is sent in bundle

            }
        });
    }
}