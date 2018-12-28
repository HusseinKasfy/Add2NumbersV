package com.example.mjeuser.add2numbers;

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


        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText FirstNum = (EditText) findViewById(R.id.txtFirstNumber);
                EditText SecondNum = (EditText) findViewById(R.id.txtSecondNumber);
                TextView tvResult = (TextView) findViewById(R.id.tvResult);

                int num1 = Integer.parseInt(FirstNum.getText().toString());
                int num2 = Integer.parseInt(SecondNum.getText().toString());
                int result = num1 + num2;
                tvResult.setText(result + "");
            }
        });

    }
}
