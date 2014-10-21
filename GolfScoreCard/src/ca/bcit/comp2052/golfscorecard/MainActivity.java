package ca.bcit.comp2052.golfscorecard;

import ca.bcit.comp2052.queenelizabethpitchandputt.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;


public class MainActivity extends Activity {

	int[][] holeScores = new int[18][4];
	int[][] totalScores = new int[3][4];
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initializeScoreCard();
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new OnItemSelectedListener(){
        	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
        		// Implement your logic here
                TextView text1 = (TextView)findViewById(R.id.textView1);
                TextView text2 = (TextView)findViewById(R.id.textViewFront9_0);
                TextView text3 = (TextView)findViewById(R.id.textViewFront9_1);
                TextView text4 = (TextView)findViewById(R.id.textViewFront9_2);
        		setTitle("player: 0 hole 0");
        		setHoleScore(0, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));
        		text1.setText("Selected: " + String.valueOf(getHoleScore(0, 0)));
        		text2.setText(String.valueOf(getTotalScore(0, 0)));
        		text3.setText(String.valueOf(getTotalScore(1, 0)));
        		text4.setText(String.valueOf(getTotalScore(2, 0)));

        	}
        	@Override
        	public void onNothingSelected(AdapterView arg0) { }
        });
        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
        spinner5.setOnItemSelectedListener(new OnItemSelectedListener(){
        	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
        		// Implement your logic here
                TextView text1 = (TextView)findViewById(R.id.textView1);
                TextView text2 = (TextView)findViewById(R.id.textViewFront9_0);
                TextView text3 = (TextView)findViewById(R.id.textViewFront9_1);
                TextView text4 = (TextView)findViewById(R.id.textViewFront9_2);
        		setTitle("player: 0 hole: 1");
        		setHoleScore(11, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));
        		text1.setText("Selected: " + String.valueOf(getHoleScore(11, 0)));
        		text2.setText(String.valueOf(getTotalScore(0, 0)));
        		text3.setText(String.valueOf(getTotalScore(1, 0)));
        		text4.setText(String.valueOf(getTotalScore(2, 0)));

        	}
        	@Override
        	public void onNothingSelected(AdapterView arg0) { }
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
    
	void setHoleScore(int hole, int player, int score) {
		holeScores[hole][player]=score;
		calculateTotalScores();

	}
	
	private void calculateTotalScores() {
		initializeTotalScores();
		for (int i = 0; i<9; i++) {
			for (int j = 0; j<4; j++) {
				totalScores[0][j] += holeScores[i][j];
				totalScores[1][j] += holeScores[i][j];
			}
		}
		for (int i = 9; i<18; i++) {
			for (int j = 0; j<4; j++) {
				totalScores[0][j] += holeScores[i][j];
				totalScores[2][j] += holeScores[i][j];
			}
		}
	}


	int getHoleScore(int hole, int player) {
		return holeScores[hole][player];
	}
	
	int getTotalScore(int half, int player){
		int total = 0;

		if(half == 1){
			total = totalScores[1][player];
		}
		if(half ==2 ){
			total = totalScores[2][player];
		}
		else {
			total = totalScores[0][player];
		}
		return total;
	}
	
	void initializeScoreCard(){
		initializeHoleScores();
		initializeTotalScores();
		
	}
	
	private void initializeTotalScores() {
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<4; j++) {
				totalScores[i][j] = 0;
			}
		}
	}


	void initializeHoleScores(){
		for (int i = 0; i<18; i++) {
			for (int j = 0; j<4; j++) {
				holeScores[i][j] = 0;
			}
		}
	}
	
	
}
