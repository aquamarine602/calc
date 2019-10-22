package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity implements OnClickListener{

	Button butt1;
	Button butt2;
	Button butt3;
	Button butt4;
	Button butt5;
	Button butt6;
	Button butt7;
	Button butt8;
	Button butt9;
	Button butt0;
	Button butt_plus;
	Button butt_min;
	Button butt_mult;
	Button butt_div;
	Button butt_dec;
	Button butt_eq;
	TextView num;
	String numstring;
	double ans;
	double num1;
	double num2;
	String operator;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// getting button ids
		butt1 = (Button)findViewById(R.id.button1);
		butt2 = (Button)findViewById(R.id.button2);
		butt3 = (Button)findViewById(R.id.button3);
		butt4 = (Button)findViewById(R.id.button4);
		butt5 = (Button)findViewById(R.id.button5);
		butt6 = (Button)findViewById(R.id.button6);
		butt7 = (Button)findViewById(R.id.button7);
		butt8 = (Button)findViewById(R.id.button8);
		butt9 = (Button)findViewById(R.id.button9);
		butt0 = (Button)findViewById(R.id.button0);
		butt_plus = (Button)findViewById(R.id.button_plus);
		butt_min = (Button)findViewById(R.id.button_minus);
		butt_mult = (Button)findViewById(R.id.button_mult);
		butt_div = (Button)findViewById(R.id.button_div);
		butt_dec = (Button)findViewById(R.id.button_decimal);
		butt_eq = (Button)findViewById(R.id.button_equals);
		
		// setting buttons' onclicklistener
		butt1.setOnClickListener(this);
		butt2.setOnClickListener(this);
		butt3.setOnClickListener(this);
		butt4.setOnClickListener(this);
		butt5.setOnClickListener(this);
		butt6.setOnClickListener(this);
		butt7.setOnClickListener(this);
		butt8.setOnClickListener(this);
		butt9.setOnClickListener(this);
		butt0.setOnClickListener(this);
		butt_plus.setOnClickListener(this);
		butt_min.setOnClickListener(this);
		butt_mult.setOnClickListener(this);
		butt_div.setOnClickListener(this);
		butt_dec.setOnClickListener(this);
		butt_eq.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		num = (TextView)findViewById(R.id.textView1);
		
		// get operator
		if (v == butt_plus) {
			operator = "+";
			String x = num.getText().toString();
			double y = Double.parseDouble(x);
			num1 = y;
			numstring = "-----";
			num.setText(numstring);
		}
		
		if (v == butt_min) {
			operator = "-";
			String x = num.getText().toString();
			double y = Double.parseDouble(x);
			num1 = y;
			numstring = "-----";
			num.setText(numstring);
		}
		
		if (v == butt_mult) {
			operator = "*";
			String x = num.getText().toString();
			double y = Double.parseDouble(x);
			num1 = y;
			numstring = "-----";
			num.setText(numstring);
		}
		
		if (v == butt_div) {
			operator = "/";
			String x = num.getText().toString();
			double y = Double.parseDouble(x);
			num1 = y;
			numstring = "-----";
			num.setText(numstring);
		}
		
		// equals button
		
		if (v == butt_eq) {
			
			String x = num.getText().toString();
			double y = Double.parseDouble(x);
			num2 = y;
			
			if (operator.equals("+")) {
				ans = num1 + num2;
			} else if (operator.equals("-")) {
				ans = num1 - num2;
			} else if (operator.equals("*")) {
				ans = num1 * num2;
			} else if (operator.equals("/")) {
				if (num2 == 0) {
					numstring = "Error";
					num.setText(numstring);
				} else {
					ans = num1 / num2;
				}
			}
			
			if (x.equals("-----")){
				numstring = "";
			}
			
			numstring = Double.toString(ans);
			num.setText(numstring);
			
		}
		
		// clear results
		if (v== butt_dec) {
			numstring = "-----";
			num.setText(numstring);
			
			num1 = 0;
			num2 = 0;
			ans = 0;
			operator = "";
		}
		
		// get number
		if (v == butt1) {
			String x = num.getText().toString();
			if (x.equals("-----")){
				numstring = "";
			}
			numstring += 1;
			num.setText(numstring);
			
		} else if (v == butt2) {
			String x = num.getText().toString();
			if (x.equals("-----")){
				numstring = "";
			}
			numstring += 2;
			num.setText(numstring);
			
		} else if (v == butt3) {
			String x = num.getText().toString();
			if (x.equals("-----")){
				numstring = "";
			}
			numstring += 3;
			num.setText(numstring);
			
		} else if (v == butt4) {
			String x = num.getText().toString();
			if (x.equals("-----")){
				numstring = "";
			}
			numstring += 4;
			num.setText(numstring);
			
		} else if (v == butt5) {
			String x = num.getText().toString();
			if (x.equals("-----")){
				numstring = "";
			}
			numstring += 5;
			num.setText(numstring);
			
		} else if (v == butt6) {
			String x = num.getText().toString();
			if (x.equals("-----")){
				numstring = "";
			}
			numstring += 6;
			num.setText(numstring);
			
		} else if (v == butt7) {
			String x = num.getText().toString();
			if (x.equals("-----")){
				numstring = "";
			}
			numstring += 7;
			num.setText(numstring);
			
		} else if (v == butt8) {
			String x = num.getText().toString();
			if (x.equals("-----")){
				numstring = "";
			}
			numstring += 8;
			num.setText(numstring);
			
		} else if (v == butt9) {
			String x = num.getText().toString();
			if (x.equals("-----")){
				numstring = "";
			}
			numstring += 9;
			num.setText(numstring);
			
		} else if (v == butt0) {
			String x = num.getText().toString();
			if (x.equals("-----")){
				numstring = "";
			}
			numstring += 0;
			num.setText(numstring);
			
		}
		
	}

}





















