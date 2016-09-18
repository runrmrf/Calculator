package com.mancng.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editFirst;
    private EditText editSecond;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultiplication;
    private Button btnClear;
    private TextView txtResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        editFirst = (EditText) findViewById(R.id.editFirst);
        editSecond = (EditText) findViewById(R.id.editSecond);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnClear = (Button) findViewById(R.id.btnClear);
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((editFirst.getText().length() > 0) && (editSecond.getText().length() > 0)) {


                    double numFirst = Double.parseDouble(editFirst.getText().toString());
                    double numSecond = Double.parseDouble(editSecond.getText().toString());

                    double theResult = numFirst + numSecond;
                    txtResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }

        });


        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((editFirst.getText().length() > 0) && (editSecond.getText().length() > 0)) {


                double numFirst = Double.parseDouble(editFirst.getText().toString());
                double numSecond = Double.parseDouble(editSecond.getText().toString());

                double theResult = numFirst - numSecond;
                txtResult.setText(Double.toString(theResult));

                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((editFirst.getText().length() > 0) && (editSecond.getText().length() > 0)) {

                    double numFirst = Double.parseDouble(editFirst.getText().toString());
                    double numSecond = Double.parseDouble(editSecond.getText().toString());

                    double theResult = numFirst / numSecond;
                    txtResult.setText(Double.toString(theResult));

                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener()

            {

            @Override
            public void onClick (View v) {

                if ((editFirst.getText().length() > 0) && (editSecond.getText().length() > 0)) {

                    double numFirst = Double.parseDouble(editFirst.getText().toString());
                    double numSecond = Double.parseDouble(editSecond.getText().toString());

                    double theResult = numFirst * numSecond;
                    txtResult.setText(Double.toString(theResult));

                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }


        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                editFirst.setText("");
                editSecond.setText("");
                txtResult.setText("0.00");
                editFirst.requestFocus();

            }

        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
