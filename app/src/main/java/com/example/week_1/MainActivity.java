package com.example.week_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityViewCommand;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int number1,number2,total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton add,minus,divide,multiply;
        Button calculation;
        Button clear;
        EditText val_1,val_2;

        add = findViewById(R.id.add);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        val_1 = findViewById(R.id.val_1);
        val_2 = findViewById(R.id.val_2);

        calculation = findViewById(R.id.cal);


        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //method = ischecked()


                number1 = Integer.parseInt(val_1.getText().toString());
                number2 = Integer.parseInt(val_2.getText().toString());


                if (add.isChecked()) {
                    total = number1 + number2;
                    Toast.makeText(MainActivity.this, Integer.toString(total), Toast.LENGTH_LONG).show();
                } else if (minus.isChecked()) {
                    total = number1 - number2;
                    Toast.makeText(MainActivity.this, Integer.toString(total), Toast.LENGTH_LONG).show();
                } else if (multiply.isChecked()) {
                    total = number1 * number2;
                    Toast.makeText(MainActivity.this, Integer.toString(total), Toast.LENGTH_LONG).show();
                } else if (divide.isChecked()) {
                    total = number1 / number2;
                    Toast.makeText(MainActivity.this, Integer.toString(total), Toast.LENGTH_LONG).show();
                } else {
                    val_1.setText("");
                    val_2.setText("");
                }
            }
        });
    }
}