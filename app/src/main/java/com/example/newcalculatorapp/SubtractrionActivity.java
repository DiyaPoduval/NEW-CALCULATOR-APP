package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubtractrionActivity extends AppCompatActivity {


    EditText et1,et2;
    Button bt1,bt2;
    TextView tv1;
    String getNum1,getNum2,result;
    Integer num1,num2,ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subtractrion);


        et1=(EditText) findViewById(R.id.b);
        et2=(EditText) findViewById(R.id.a);
        bt1=(Button) findViewById(R.id.s);
        bt2=(Button) findViewById(R.id.w);
        tv1=(TextView) findViewById(R.id.d);


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob3=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ob3);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                Integer.parseInt(getNum1);
                Integer.parseInt(getNum2);
                ans=num1+num2;
                result=String.valueOf(ans);
                tv1.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

            }
        });
    }
}