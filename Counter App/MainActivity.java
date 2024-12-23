package com.rehnooraulakh.counterapp;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView number;
    private Button counterUp;
    private Button counterDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        number=findViewById(R.id.number);
        counterUp=findViewById(R.id.counterUp);
        counterDown=findViewById(R.id.counterDown);
        counterUp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Get the current number from the textView
                String currentNumberStr=number.getText().toString();
                int currentNumber=Integer.parseInt(currentNumberStr);
                currentNumber++;
                //Update it in the textView
                number.setText(String.valueOf(currentNumber));
            }
        });
        counterDown.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Get the current number from the textView
                String currentNumberStr=number.getText().toString();
                int currentNumber=Integer.parseInt(currentNumberStr);
                currentNumber--;
                //Update it in the textView
                number.setText(String.valueOf(currentNumber));
            }
        });

    }

}
