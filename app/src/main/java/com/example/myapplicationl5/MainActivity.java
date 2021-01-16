package com.example.myapplicationl5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText pass;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addListenerOnButon() {
        pass = (EditText)findViewById(R.id.editText);
        btn = (Button)findVeiwById(R.id.button);
        btn.setOnClickListenner{
            new View.OnClickListener()

        }

    }
}