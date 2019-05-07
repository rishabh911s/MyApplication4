package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvLifeCycle;
    private Button btndata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvLifeCycle=(TextView) findViewById(R.id.tvLifeCycle);
        tvLifeCycle.setText("onCreate");
        Log.d("TAG","oncreate");
        btndata = (Button) findViewById(R.id.btndata);

        btndata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edit = (EditText) findViewById(R.id.editText);
                String result = edit.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivityTwo.class);
                intent.putExtra("KEY",result);
                startActivity(intent);
            }
        });

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
        tvLifeCycle.setText("Processing");
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
        tvLifeCycle.setText("Enter Data");
        Log.d("TAG","onresume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG","onrestart");
    }
}
