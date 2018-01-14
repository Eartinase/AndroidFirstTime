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

        final Button btnDoSomething =(Button)(findViewById(R.id.btnDoSomething));
        btnDoSomething.setOnClickListener(new View.OnClickListener() {
       //     TextView text = (TextView) findViewById(R.id.someText);
            TextView num1 = (TextView) findViewById(R.id.editText);
            TextView num2 = (TextView) findViewById(R.id.editText2);
            TextView ans = (TextView) findViewById(R.id.ans);
            int x = 0;
            @Override
            public void onClick(View view) {

                int result = Integer.parseInt(num1.getText().toString())+ Integer.parseInt(num2.getText().toString());
                ans.setText("Result is "+result);
             //   text.setText(btnDoSomething.getText());
            //    text.append();
                x++;
                Log.i(TAG, "Clicked!");
            }
        });
    }
}
