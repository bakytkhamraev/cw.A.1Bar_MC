package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    boolean one =false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manchester_city);
     //   textView=findViewById(R.id.one_tv);

    }



    public void onOperationClick(View view) {
        Log.d("xexe", "parol");

        String first="12";

        Integer firstInt= Integer.parseInt(first);

        if(one){
            textView.setText("Напишите пароль");

        } else {
            textView.setText("Ещё раз напишите пароль");
        }
        one=!one;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("xexe","onPause");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("xexe","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("xexe","onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("xexe","onStart");
    }
}
