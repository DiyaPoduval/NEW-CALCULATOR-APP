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

public class AddActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1,b2;
    TextView tv;
    String getNum1,getNum2,result;
    Integer num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);


        e1=(EditText) findViewById(R.id.n1);
        e2=(EditText) findViewById(R.id.n2);
        b1=(Button) findViewById(R.id.add);
        b2=(Button) findViewById(R.id.btm);
        tv=(TextView) findViewById(R.id.z);

        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent ob4 = new Intent(getApplicationContext(), MainActivity);
                                      startActivity(ob4);
                                  }
                              }
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getNum1=e1.getText().toString();
                        getNum2=e2.getText().toString();
                        Integer.parseInt(getNum1);
                        Integer.parseInt(getNum2);
                        sum=num1+num2;
                        result=String.valueOf(sum);
                        tv.setText(result);
                        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

                    }
                });

    }
}