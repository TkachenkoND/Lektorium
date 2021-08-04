package com.example.task_2_lektorium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static String text;

    public static String getText() {
        return text;
    }

    public static void setText(String text) {
        MainActivity.text = text;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

    }
    public void goToSecondActivity (View view) {
        EditText editText = (EditText)findViewById(R.id.editText);

        if(editText.getText().toString().isEmpty()){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "the field is empty", Toast.LENGTH_SHORT);
            toast.show();
        }else{
            setText(editText.getText().toString());
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }

    }
}