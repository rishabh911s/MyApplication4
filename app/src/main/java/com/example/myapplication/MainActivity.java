package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvLifeCycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvLifeCycle=(TextView) findViewById(R.id.tvLifeCycle);
        tvLifeCycle.setText("onCreate");
        Log.d("TAG","oncreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        tvLifeCycle=(TextView) findViewById(R.id.tvLifeCycle);
        tvLifeCycle.setText("onstart");
        Log.d("TAG","onstart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        tvLifeCycle=(TextView) findViewById(R.id.tvLifeCycle);
        tvLifeCycle.setText("onPause");
        Log.d("TAG","onpause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","onstop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        tvLifeCycle=(TextView) findViewById(R.id.tvLifeCycle);
        tvLifeCycle.setText("onResume");
        Log.d("TAG","onresume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG","onrestart");
    }
}
