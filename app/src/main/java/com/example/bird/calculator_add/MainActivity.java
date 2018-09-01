package com.example.bird.calculator_add;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calc = (Button) findViewById(R.id.button4);
        Button secret = (Button) findViewById(R.id.button);
        final EditText input_1 = (EditText) findViewById(R.id.editText);
        final EditText input_2 = (EditText) findViewById(R.id.editText2);
        final TextView answer = (TextView) findViewById(R.id.textView);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int input_1_num = Integer.parseInt(input_1.getText().toString());
                int input_2_num = Integer.parseInt(input_2.getText().toString());
                answer.setText(String.valueOf(input_1_num) + " + " + String.valueOf(input_2_num) + " = " + String.valueOf(input_1_num + input_2_num));
            }
        });

        input_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_1.setText("");
            }
        });

        input_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_2.setText("");
            }
        });

        secret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.miku);
            }
        });

    }
}
