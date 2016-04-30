package com.example.anil.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("HELLO", "onCreate: reached");
        Toast.makeText(this, "hi there!!", Toast.LENGTH_SHORT).show();

        //added comments  again
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("HELLO","onRestart: reached");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("HELLO","onStart: reached");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("HELLO","onStop: reached");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("HELLO","onDestroy: reached");
    }


}
