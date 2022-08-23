package com.example.myid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       TextView nameTXT = findViewById(R.id.textView8);
       TextView ageTXT = findViewById(R.id.textView7);

        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("name");
        nameTXT.setText(name);


         int age = bundle.getInt("age");
        ageTXT.setText(String.valueOf(age));


    }
}