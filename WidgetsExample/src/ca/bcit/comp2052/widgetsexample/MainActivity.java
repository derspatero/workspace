package ca.bcit.comp2052.widgetsexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new android.view.View.OnClickListener() {
        	public void onClick(View v) {
        		// Implement your logic here
        		Toast.makeText(MainActivity.this, "Button Pressed!", 
        			Toast.LENGTH_SHORT).show();
        	}
        });
        
        CheckBox checkbox = (CheckBox) findViewById(R.id.checkBox1);
        checkbox.setOnClickListener(new android.view.View.OnClickListener() {
        	public void onClick(View v) {
        		if (((CheckBox) v).isChecked()) {
        			// Your logic when checkBox1 is checked
        			setTitle("CheckBox Selected!");
        		} else {
        			// Your logic when checkBox1 is cleared
        			setTitle("CheckBox Cleared.");
        		}
        	}
        });
        
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.radio0);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio1);
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.radio2);
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.radio3);
        radioButton1.setText("Radio Button 1");
        radioButton2.setText("Radio Button 2");
        radioButton3.setText("Radio Button 3");
        radioButton4.setText("Radio Button 4");
        radioButton1.setOnClickListener(radioListener);
        radioButton2.setOnClickListener(radioListener);
        radioButton3.setOnClickListener(radioListener);
        radioButton4.setOnClickListener(radioListener);
        
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar1);
        ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
        	@Override
        	public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        		// Implement your logic here
        		setTitle("Rating: " + rating);
        	}
        });
        
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar1);
        seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
        	@Override
        	public void onStopTrackingTouch(SeekBar seekBar)  { }
        	@Override
        	public void onStartTrackingTouch(SeekBar seekBar) { }
        	@Override
        	public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        		// Implement your logic here
        		setTitle("Progress: " + progress);
        	}
        });
        
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new OnItemSelectedListener(){
        	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
        		// Implement your logic here
        		setTitle("Selected: " + parent.getItemAtPosition(pos).toString());
        	}
        	@Override
        	public void onNothingSelected(AdapterView arg0) { }
        });

    }

    private OnClickListener radioListener = new android.view.View.OnClickListener() {
    	public void onClick(View v) {
    		RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup1);
    		int rbIndex = rg.indexOfChild(
    			findViewById(rg.getCheckedRadioButtonId())
    		);
    		RadioButton rb = (RadioButton) v;
    		// Implement your logic here
    		setTitle("Selected: " + rb.getText());
    	}
    };

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
