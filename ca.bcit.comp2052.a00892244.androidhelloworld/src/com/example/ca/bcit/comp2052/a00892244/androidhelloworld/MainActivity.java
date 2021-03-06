package com.example.ca.bcit.comp2052.a00892244.androidhelloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new android.view.View.OnClickListener() {
           @Override
           public void onClick(View arg0) {
        	  EditText edit = (EditText)findViewById(R.id.editText1);
        	  TextView text = (TextView)findViewById(R.id.textView1);
        	  String input = edit.getText().toString();
        	  Float result = (float) 0;
        	  try {
        		 result = Float.parseFloat(input);
        		 result = (float) (result/238.480942);
        		 
        	  } catch (NumberFormatException e) {
        		 input = "0";
        	  }
        	  text.setText(input + " litres = " + result + " hogshead");
           }
        });
        

        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
