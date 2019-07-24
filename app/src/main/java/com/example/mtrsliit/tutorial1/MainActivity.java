package com.example.mtrsliit.tutorial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

 TextView txtView2;    //define text view Object


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(   "Lifecycle", "OnCreate() invoked");

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);
    }

    public  void onStart()
    {
        super.onStart();
        Log.i( "Lifecycle", "onStart() invoked");

    }

    public void onRestart()
    {
        super.onRestart();
        Log.i("Lifecycle", "onRestart() invoked");

    }
    public void onResume()
    {
        super.onResume();
        Log.i( "Lifecycle", "onResume() invoked");
    }

}
