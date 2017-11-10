package com.robprane.quickmath;

import android.support.annotation.BoolRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.robprane.quickmath.MathCore.calculate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.textview);
        ArrayList<Double> list = new ArrayList<Double>();
        for (int i = 0; i < getResources().getStringArray(R.array.level1).length; i++) {
            switch (getResources().getStringArray(R.array.level1)[i]) {
                case "(": list.add(111.111); break;
                case ")": list.add(222.222); break;
                case "^": list.add(333.333); break;
                case "*": list.add(444.444); break;
                case "/": list.add(555.555); break;
                case "+": list.add(666.666); break;
                case "-": list.add(777.777); break;
                default: list.add(Double.parseDouble(getResources().getStringArray(R.array.level1)[i]));
            }
        }
        ArrayList newlist = calculate(list);
        for (int i = 0; i < newlist.size(); i++) {
            text.setText(text.getText() + newlist.get(i).toString() + ", ");
        }
//        Toast.makeText(this, list.get(0).toString(), Toast.LENGTH_LONG).show();
    }
}
