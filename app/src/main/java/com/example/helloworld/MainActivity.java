package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialButton red,green;
    TextView text_view;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_view=findViewById(R.id.textInput);

        red = findViewById(R.id.redBtn);
        red.setOnClickListener(this);

        green = findViewById(R.id.greenBtn);
        green.setOnClickListener(this);


    }

    @Override
    public void onClick(View view)
    {
        MaterialButton button =(MaterialButton) view;
        String buttonText = button.getText().toString();
        System.out.println(buttonText+ "--");
//        text_view.setText(buttonText);
        if(buttonText.equals("Go"))
        {
            text_view.setText("Go !!!!!!!!!");
        }
        else
        {
            text_view.setText("Stoooooppp !!!!!!!!!");
        }
    }
}