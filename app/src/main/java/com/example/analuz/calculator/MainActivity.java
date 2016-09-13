package com.example.analuz.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void calc(View view) {
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        TextView comparison = (TextView) findViewById(R.id.comparison);
        TextView addition = (TextView) findViewById(R.id.addition);
        TextView substraction = (TextView) findViewById(R.id.substraction);
        TextView product = (TextView) findViewById(R.id.product);
        TextView division = (TextView) findViewById(R.id.division);
        Button clean = (Button) findViewById(R.id.clean);
        clean.setEnabled(false);
        clean.setVisibility(View.INVISIBLE);

        TextView error = (TextView) findViewById(R.id.error);
        error.setVisibility(View.INVISIBLE);

        String snum1 = num1.getText().toString().trim();
        String snum2 = num2.getText().toString().trim();

        int dnum1 = Integer.parseInt(snum1);
        int dnum2 = Integer.parseInt(snum2);

        if (dnum1 <= 0 || dnum2 <= 0) {
            error.setVisibility(View.VISIBLE);
        } else {

            int addnum = (dnum1 + dnum2);
            addition.setText(addnum);
            int subnum = (dnum1 - dnum2);
            substraction.setText(subnum);
            int pronum = (dnum1 * dnum2);
            product.setText(pronum);
            int divnum = (dnum1 / dnum2);
            division.setText(divnum);

            if (dnum1 > dnum2) {
                comparison.setText(dnum1 + " > " + dnum2);
            } else {
                comparison.setText(dnum1 + " < " + dnum2);

            }

        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clean = (Button) findViewById(R.id.clean);
        clean.setEnabled(false);
        clean.setVisibility(View.INVISIBLE);

        TextView error = (TextView) findViewById(R.id.error);
        error.setVisibility(View.INVISIBLE);
    }
}
