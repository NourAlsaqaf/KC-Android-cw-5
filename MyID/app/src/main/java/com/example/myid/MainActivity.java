package com.example.myid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        EditText nameEdt = findViewById(R.id.nameEdt);
        EditText ageEdt = findViewById(R.id.ageEdt);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String name = nameEdt.getText().toString();
                int age = Integer.parseInt(ageEdt.getText().toString());
                Intent bro = new Intent(MainActivity.this,MainActivity2.class);
                bro.putExtra("name", name);
                bro.putExtra("age", age);
            startActivity(bro);

            }
        });

    }


}