package com.tareqrobin.lastintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {
    private Button hell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        hell=findViewById(R.id.button2);

        hell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent door=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(door);
            }
        });
    }
}
