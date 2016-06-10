package com.example.kenzo.gspro1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameView = (TextView)findViewById(R.id.kenzotext);
        String name = "岡野健三";
        nameView.setText(name);

//        TextView textView = (TextView)findViewById(R.id.sum);
//        double number = 103.89;
//        int value = (int)Math.floor(number);
//        textView.setText(value+"");

//        int[] intArg = new int[3];
//        int[0] = 4;
//        int[1] = 4;
//        int[2] = 4;
//        int[3] = 4;
//
//        int total = 0;
//        for(int i =0; i<intArg.length; i++){
//            total+= intArg[i];
//        }
//
        String[] txtArg = new String[3];
        txtArg[0] = "岡野";
        txtArg[1] = "健三";
        txtArg[2] = "です";
        txtArg[3] = "けど！！";

        returnName("岡野健三");
    }

    private String returnName (String name){
        String kenzoname = name + "様";
        return kenzoname;
    }
}
