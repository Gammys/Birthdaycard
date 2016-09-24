package com.example.android.birthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

   private Button gift;
    private Button launchbutton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        gift=(Button)findViewById(R.id.button2);

        gift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent1 = new Intent(getApplicationContext(),Main3Activity.class);//to get the current running activity.specifies the sender's address
                //giving the data a tag

                startActivity(intent1);//data is sent in bundle

            }
        });


    }
}
