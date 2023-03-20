package org.cadenzu.androidex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Suora syöte käyttäjältä
    private EditText textInNum1;
    private EditText textInNum2;
    private TextView textOutNum;

    // Laskentaa varten
    private float calcInNum1;
    private float calcInNum2;
    private float calcOutNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInNum1 = findViewById(R.id.inputNum1);
        textInNum2 = findViewById(R.id.inputNum2);
        textOutNum = findViewById(R.id.outputNum);
    }

    float buildFloat(EditText textNum) {
        float calcNum = Float.parseFloat(textNum.getText().toString());
        return calcNum;
    }

    public void addNumbers(View view) {
        calcInNum1 = buildFloat(textInNum1);
        calcInNum2 = buildFloat(textInNum2);
        calcOutNum = calcInNum1 + calcInNum2;
        textOutNum.setText(String.valueOf(calcOutNum));
    }

    public void subtractNumbers(View view) {
        calcInNum1 = buildFloat(textInNum1);
        calcInNum2 = buildFloat(textInNum2);
        calcOutNum = calcInNum1 - calcInNum2;
        textOutNum.setText(String.valueOf(calcOutNum));
    }

    public void multiplyNumbers(View view) {
        calcInNum1 = buildFloat(textInNum1);
        calcInNum2 = buildFloat(textInNum2);
        calcOutNum = calcInNum1 * calcInNum2;
        textOutNum.setText(String.valueOf(calcOutNum));
    }

    public void divideNumbers(View view) {
        calcInNum1 = buildFloat(textInNum1);
        calcInNum2 = buildFloat(textInNum2);
        calcOutNum = calcInNum1 / calcInNum2;
        textOutNum.setText(String.valueOf(calcOutNum));
    }




}