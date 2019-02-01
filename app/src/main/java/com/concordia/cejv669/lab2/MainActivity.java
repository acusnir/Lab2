package com.concordia.cejv669.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lab2", "Main activity : onStart");
        Toast.makeText(getApplicationContext(), "Main activity : onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Lab2", "Main activity : onRestart");
        Toast.makeText(getApplicationContext(), "Main activity : onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lab2", "Main activity : onResume");
        Toast.makeText(getApplicationContext(), "Main activity : onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lab2", "Main activity : onPause");
        Toast.makeText(getApplicationContext(), "Main activity : onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lab2", "Main activity : onStop");
        Toast.makeText(getApplicationContext(), "Main activity : onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lab2", "Main activity : onDestroy");
        Toast.makeText(getApplicationContext(), "Main activity : onDestroy", Toast.LENGTH_SHORT).show();
    }




}
