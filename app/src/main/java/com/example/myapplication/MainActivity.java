package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String display1="";
    String display2="";
    int operator=0;
    boolean operatorClicked=false;


    Button oneButton,twoButton,threeButton,fourButton,fiveButton,sixButton,sevenButton,eightButton,nineButton,zeroButton,acButton,clrButton,modButton,divButton,multiButton,minusButton,plusButton,equalButton,dotButton;
    TextView Calculation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculation=findViewById(R.id.calculation);
        oneButton=findViewById(R.id.button01);
        twoButton=findViewById(R.id.button02);
        threeButton=findViewById(R.id.button03);
        fourButton=findViewById(R.id.button04);
        fiveButton=findViewById(R.id.button05);
        sixButton=findViewById(R.id.button06);
        sevenButton=findViewById(R.id.button07);
        eightButton=findViewById(R.id.button08);
        nineButton=findViewById(R.id.button09);
        zeroButton=findViewById(R.id.button00);
        acButton=findViewById(R.id.buttonac);
        clrButton=findViewById(R.id.buttonclr);
        modButton=findViewById(R.id.buttonmod);
        divButton=findViewById(R.id.buttondiv);
        multiButton=findViewById(R.id.buttonmul);
        minusButton=findViewById(R.id.buttonmin);
        plusButton=findViewById(R.id.buttonplu);
        equalButton=findViewById(R.id.buttonequ);
        dotButton=findViewById(R.id.buttondot);


        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operatorClicked)
                {
                    display1="1";
                    Calculation.setText(display1);
                    operatorClicked=false;
                }
                else
                {
                    display1=display1+1;
                    Calculation.setText(display1);
                }

            }
        });
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operatorClicked)
                {
                    display1="2";
                    Calculation.setText(display1);
                    operatorClicked=false;

                }
                else
                {
                    display1=display1+2;
                    Calculation.setText(display1);
                }

            }
        });
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operatorClicked)
                {
                    display1="3";
                    Calculation.setText(display1);
                    operatorClicked=false;

                }
                else
                {
                    display1=display1+3;
                    Calculation.setText(display1);
                }

            }
        });
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operatorClicked)
                {
                    display1="4";
                    Calculation.setText(display1);
                    operatorClicked=false;

                }
                else
                {
                    display1=display1+4;
                    Calculation.setText(display1);
                }

            }
        });
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operatorClicked)
                {
                    display1="5";
                    Calculation.setText(display1);
                    operatorClicked=false;

                }
                else
                {
                    display1=display1+5;
                    Calculation.setText(display1);
                }

            }
        });
        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operatorClicked)
                {
                    display1="6";
                    Calculation.setText(display1);
                    operatorClicked=false;

                }
                else
                {
                    display1=display1+6;
                    Calculation.setText(display1);
                }

            }
        });
        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operatorClicked)
                {
                    display1="7";
                    Calculation.setText(display1);
                    operatorClicked=false;

                }
                else
                {
                    display1=display1+7;
                    Calculation.setText(display1);
                }

            }
        });
        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operatorClicked)
                {
                    display1="8";
                    Calculation.setText(display1);
                    operatorClicked=false;

                }
                else
                {
                    display1=display1+8;
                    Calculation.setText(display1);
                }

            }
        });
        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operatorClicked)
                {
                    display1="9";
                    Calculation.setText(display1);
                    operatorClicked=false;

                }
                else
                {
                    display1=display1+9;
                    Calculation.setText(display1);
                }

            }
        });
        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operatorClicked)
                {
                    display1="0";
                    Calculation.setText(display1);
                    operatorClicked=false;

                }
                else
                {
                    display1=display1+0;
                    Calculation.setText(display1);
                }

            }
        });
        dotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(operatorClicked)
                {
                    display1=".";
                    Calculation.setText(display1);
                    operatorClicked=false;

                }
                else
                {
                    display1=display1+".";
                    Calculation.setText(display1);
                }

            }
        });
        acButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display1="";
                Calculation.setText("0");
            }
        });
        clrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display1="";
                Calculation.setText("0");
            }
        });
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(display1=="")
                {
                    display1="0";
                    display2=display1;
                    Calculation.setText("+");
                    operatorClicked = true;
                    operator=1;

                }
                else
                {
                    display2 = display1;
                    display1="0";
                    Calculation.setText("+");
                    operator = 1;
                    operatorClicked = true;
                }

            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display1=="")
                {
                    display1="0";
                    display2=display1;
                    Calculation.setText("-");
                    operatorClicked = true;
                    operator=2;

                }
                else
                    {
                    display2 = display1;
                        display1="0";
                    Calculation.setText("-");
                    operator = 2;
                    operatorClicked = true;
                }

            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display1=="")
                {
                    display1="0";
                    display2=display1;
                    Calculation.setText("/");
                    operatorClicked = true;
                    operator=3;

                }
                else {


                    display2 = display1;
                    display1="0";
                    Calculation.setText("/");
                    operator = 3;
                    operatorClicked = true;
                }
            }
        });
        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display1=="")
                {
                    display1="0";
                    display2=display1;
                    Calculation.setText("x");
                    operatorClicked = true;
                    operator=4;

                }
                else {
                    display2 = display1;
                    display1="0";
                    Calculation.setText("x");
                    operator = 4;
                    operatorClicked = true;
                }

            }
        });
        modButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display1=="")
                {
                    display1="0";
                    display2=display1;
                    Calculation.setText("%");
                    operatorClicked = true;
                    operator=5;

                }
                else {


                    display2 = display1;
                    display1="0";
                    Calculation.setText("%");
                    operator = 5;
                    operatorClicked = true;
                }

            }
        });
        equalButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


            float result = 0;



            if(display1=="" && display2=="")
            {
                Calculation.setText("0");
            }
                else if (operator==0)
                {
                    result=Float.parseFloat(display1);
                }
                else if (operator == 1) {
                    float number1=Float.parseFloat(display2);
                    float number2=Float.parseFloat(display1);
                    result = number1 + number2;
                Calculation.setText("="+result);
                } else if (operator == 2) {
                    float number1=Float.parseFloat(display2);
                    float number2=Float.parseFloat(display1);
                    result = number1 - number2;
                Calculation.setText("="+result);
                } else if (operator == 3) {
                    float number1=Float.parseFloat(display2);
                    float number2=Float.parseFloat(display1);
                    result = number1 / number2;
                Calculation.setText("="+result);
                } else if (operator == 4) {
                    float number1=Float.parseFloat(display2);
                    float number2=Float.parseFloat(display1);
                    result = number1 * number2;
                Calculation.setText("="+result);
                } else if (operator == 5) {
                    float number1=Float.parseFloat(display2);
                    float number2=Float.parseFloat(display1);
                    result = number1 % number2;
                Calculation.setText("="+result);
                }

            display1="";
                display2="";



            }

        });


    }
}