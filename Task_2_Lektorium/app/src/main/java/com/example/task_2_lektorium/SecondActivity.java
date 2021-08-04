package com.example.task_2_lektorium;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(MainActivity.getText());
    }
    public void ShowToast(View view){
        Toast toast = Toast.makeText(getApplicationContext(),
                MainActivity.getText(), Toast.LENGTH_SHORT);
        toast.show();
    }
}
