package com.example.asus.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by asus on 9/22/2017.
 */

public class NextActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        MainObject mainObject = getIntent().getParcelableExtra("mainObject");

        TextView output1 = (TextView)findViewById(R.id.output1);
        TextView output2 = (TextView)findViewById(R.id.output2);
        TextView output3 = (TextView)findViewById(R.id.output3);
        TextView output4 = (TextView)findViewById(R.id.output4);

        if (mainObject != null){
            output1.setText("Hello1: "+mainObject.string1);
            output2.setText("Hello2: "+mainObject.string2);
            output3.setText("Hello3: "+mainObject.string3);
            output4.setText("Hello4: "+mainObject.string4);
        }

        doSomething();
    }

    private void doSomething(){
        //doSomething here
    }
}
