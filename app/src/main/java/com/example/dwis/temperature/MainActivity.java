package com.example.dwis.temperature;

import androidx.appcompat.app.AppCompatActivity;
/*hello*/

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    Button Ce,Fh;
    TextView display;
    Double f1,c1,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt=findViewById(R.id.editText);
        Fh=findViewById(R.id.button);
        Ce=findViewById(R.id.button2);
        display=findViewById(R.id.textView2);
        Fh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1=Double.parseDouble(edt.getText().toString());
                result=(f1-32)*5/9;
                display.setText("The Celsius is: "+result+"C");
            }
        });
        Ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1=Double.parseDouble(edt.getText().toString());
                result=(c1*9/5)+32;
                display.setText("The Fahrenheit is: "+result+"F");
            }
        });








    }
}
