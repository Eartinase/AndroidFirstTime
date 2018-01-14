package com.example.ormwiwitumpon.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Happy");

        Button btnDoSomething =(Button)(findViewById(R.id.btnDoSomething));
        btnDoSomething.setOnClickListener(new View.OnClickListener() {
            TextView text = (TextView) findViewById(R.id.someText);
            int x = 0;
            @Override
            public void onClick(View view) {
                text.setText("You clicked "+x+" time(s)!");
            //    text.append();
                x++;
                Log.i(TAG, "Clicked!");
            }
        });
    }
}
