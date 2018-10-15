package com.example.whgml.primenumberapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button isPrimeBtn;
    private TextView answerText;
    private EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitElement();
    }

    private void InitElement()
    {
        isPrimeBtn = (Button)findViewById(R.id.isPrimeBtn);
        answerText = (TextView)findViewById(R.id.numberOutput);
        inputText = (EditText)findViewById(R.id.numberInput);

        isPrimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcPrimeNumber(v);
            }
        });
    }


    private void CalcPrimeNumber(View v)
    {
        int i;
        if(v.getId() == R.id.isPrimeBtn)
        {
            CharSequence numberCharSeq = inputText.getText();
            StringBuilder numberString = new StringBuilder(numberCharSeq);
            int primeNum = Integer.parseInt(numberCharSeq.toString());
            for(i = primeNum - 1; i>2; i--)
            {
                if(primeNum % i == 0)
                {
                    break;
                }
            }

            if(i == 1)
            {
                numberString.append(" is a prime Number");
            }
            else
            {
                numberString.append(" is not a prime Number");
            }

            answerText.setText(numberString);
        }
    }

}
