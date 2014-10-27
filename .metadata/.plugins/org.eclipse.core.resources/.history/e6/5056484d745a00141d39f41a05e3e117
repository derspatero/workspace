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
        
//      hole 0
        Spinner spinner00 = (Spinner) findViewById(R.id.spinner_hole_0_player_0);
        spinner00.setOnItemSelectedListener(new OnItemSelectedListener(){
        	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
        		// Implement your logic here
        		setHoleScore(0, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

        	}
        	@Override
        	public void onNothingSelected(AdapterView arg0) { }
        });
        Spinner spinner01 = (Spinner) findViewById(R.id.spinner_hole_0_player_1);
        spinner01.setOnItemSelectedListener(new OnItemSelectedListener(){
        	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
        		// Implement your logic here
        		setHoleScore(0, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

        	}
        	@Override
        	public void onNothingSelected(AdapterView arg0) { }
        });
        Spinner spinner02 = (Spinner) findViewById(R.id.spinner_hole_0_player_2);
        spinner02.setOnItemSelectedListener(new OnItemSelectedListener(){
        	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
        		// Implement your logic here
        		setHoleScore(0, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

        	}
        	@Override
        	public void onNothingSelected(AdapterView arg0) { }
        });
        Spinner spinner03 = (Spinner) findViewById(R.id.spinner_hole_0_player_3);
        spinner03.setOnItemSelectedListener(new OnItemSelectedListener(){
        	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
        		// Implement your logic here
        		setHoleScore(0, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

        	}
        	@Override
        	public void onNothingSelected(AdapterView arg0) { }
        });
        
//    hole 1
      Spinner spinner10 = (Spinner) findViewById(R.id.spinner_hole_1_player_0);
      spinner10.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(1, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner11 = (Spinner) findViewById(R.id.spinner_hole_1_player_1);
      spinner11.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(1, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner12 = (Spinner) findViewById(R.id.spinner_hole_1_player_2);
      spinner12.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(1, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner13 = (Spinner) findViewById(R.id.spinner_hole_1_player_3);
      spinner13.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(1, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      
//    hole 2
      Spinner spinner20 = (Spinner) findViewById(R.id.spinner_hole_2_player_0);
      spinner20.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(2, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner21 = (Spinner) findViewById(R.id.spinner_hole_2_player_1);
      spinner21.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(2, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner22 = (Spinner) findViewById(R.id.spinner_hole_2_player_2);
      spinner22.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(2, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner23 = (Spinner) findViewById(R.id.spinner_hole_2_player_3);
      spinner23.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(2, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
              
//    hole 3
      Spinner spinner30 = (Spinner) findViewById(R.id.spinner_hole_3_player_0);
      spinner30.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(3, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner31 = (Spinner) findViewById(R.id.spinner_hole_3_player_1);
      spinner31.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(3, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner32 = (Spinner) findViewById(R.id.spinner_hole_3_player_2);
      spinner32.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(3, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner33 = (Spinner) findViewById(R.id.spinner_hole_3_player_3);
      spinner33.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(3, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
              

              
//    hole 4
      Spinner spinner40 = (Spinner) findViewById(R.id.spinner_hole_4_player_0);
      spinner40.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(4, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner41 = (Spinner) findViewById(R.id.spinner_hole_4_player_1);
      spinner41.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(4, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner42 = (Spinner) findViewById(R.id.spinner_hole_4_player_2);
      spinner42.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(4, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner43 = (Spinner) findViewById(R.id.spinner_hole_4_player_3);
      spinner43.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(4, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
              
//    hole 5
      Spinner spinner50 = (Spinner) findViewById(R.id.spinner_hole_5_player_0);
      spinner50.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(5, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner51 = (Spinner) findViewById(R.id.spinner_hole_5_player_1);
      spinner51.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(5, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner52 = (Spinner) findViewById(R.id.spinner_hole_5_player_2);
      spinner52.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(5, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner53 = (Spinner) findViewById(R.id.spinner_hole_5_player_3);
      spinner53.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(5, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
              
//    hole 6
      Spinner spinner60 = (Spinner) findViewById(R.id.spinner_hole_6_player_0);
      spinner60.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(6, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner61 = (Spinner) findViewById(R.id.spinner_hole_6_player_1);
      spinner61.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(6, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner62 = (Spinner) findViewById(R.id.spinner_hole_6_player_2);
      spinner62.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(6, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner63 = (Spinner) findViewById(R.id.spinner_hole_6_player_3);
      spinner63.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(6, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
              
//    hole 7
      Spinner spinner70 = (Spinner) findViewById(R.id.spinner_hole_7_player_0);
      spinner70.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(7, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner71 = (Spinner) findViewById(R.id.spinner_hole_7_player_1);
      spinner71.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(7, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner72 = (Spinner) findViewById(R.id.spinner_hole_7_player_2);
      spinner72.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(7, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner73 = (Spinner) findViewById(R.id.spinner_hole_7_player_3);
      spinner73.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(7, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
           
 //	hole 8     
      Spinner spinner80 = (Spinner) findViewById(R.id.spinner_hole_8_player_0);
      spinner80.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(8, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner81 = (Spinner) findViewById(R.id.spinner_hole_8_player_1);
      spinner81.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(8, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner82 = (Spinner) findViewById(R.id.spinner_hole_8_player_2);
      spinner82.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(8, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner83 = (Spinner) findViewById(R.id.spinner_hole_8_player_3);
      spinner83.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(8, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
              
//  	hole 9     
      Spinner spinner90 = (Spinner) findViewById(R.id.spinner_hole_9_player_0);
      spinner90.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(9, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner91 = (Spinner) findViewById(R.id.spinner_hole_9_player_1);
      spinner91.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(9, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner92 = (Spinner) findViewById(R.id.spinner_hole_9_player_2);
      spinner92.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(9, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner93 = (Spinner) findViewById(R.id.spinner_hole_9_player_3);
      spinner93.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(9, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
              
//	hole 10    
      Spinner spinner100 = (Spinner) findViewById(R.id.spinner_hole_10_player_0);
      spinner100.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(10, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner101 = (Spinner) findViewById(R.id.spinner_hole_10_player_1);
      spinner101.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(10, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner102 = (Spinner) findViewById(R.id.spinner_hole_10_player_2);
      spinner102.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(10, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner103 = (Spinner) findViewById(R.id.spinner_hole_10_player_3);
      spinner103.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(10, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
              
//  	hole 11    
      Spinner spinner110 = (Spinner) findViewById(R.id.spinner_hole_11_player_0);
      spinner110.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(11, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner111 = (Spinner) findViewById(R.id.spinner_hole_11_player_1);
      spinner111.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(11, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner112 = (Spinner) findViewById(R.id.spinner_hole_11_player_2);
      spinner112.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(11, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner113 = (Spinner) findViewById(R.id.spinner_hole_11_player_3);
      spinner113.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(11, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
              
//	hole 12    
      Spinner spinner120 = (Spinner) findViewById(R.id.spinner_hole_12_player_0);
      spinner120.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(12, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner121 = (Spinner) findViewById(R.id.spinner_hole_12_player_1);
      spinner121.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(12, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner122 = (Spinner) findViewById(R.id.spinner_hole_12_player_2);
      spinner122.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(12, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner123 = (Spinner) findViewById(R.id.spinner_hole_12_player_3);
      spinner123.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(12, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
              
//  	hole 13    
      Spinner spinner130 = (Spinner) findViewById(R.id.spinner_hole_13_player_0);
      spinner130.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(13, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner131 = (Spinner) findViewById(R.id.spinner_hole_13_player_1);
      spinner131.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(13, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner132 = (Spinner) findViewById(R.id.spinner_hole_13_player_2);
      spinner132.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(13, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner133 = (Spinner) findViewById(R.id.spinner_hole_13_player_3);
      spinner133.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(13, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
                              
//	hole 14    
      Spinner spinner140 = (Spinner) findViewById(R.id.spinner_hole_14_player_0);
      spinner140.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(14, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner141 = (Spinner) findViewById(R.id.spinner_hole_14_player_1);
      spinner141.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(14, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner142 = (Spinner) findViewById(R.id.spinner_hole_14_player_2);
      spinner142.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(14, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner143 = (Spinner) findViewById(R.id.spinner_hole_14_player_3);
      spinner143.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(14, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
 
//  	hole 15    
      Spinner spinner150 = (Spinner) findViewById(R.id.spinner_hole_15_player_0);
      spinner150.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(15, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner151 = (Spinner) findViewById(R.id.spinner_hole_15_player_1);
      spinner151.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(15, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner152 = (Spinner) findViewById(R.id.spinner_hole_15_player_2);
      spinner152.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(15, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner153 = (Spinner) findViewById(R.id.spinner_hole_15_player_3);
      spinner153.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(15, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });      
      
//	hole 16    
      Spinner spinner160 = (Spinner) findViewById(R.id.spinner_hole_16_player_0);
      spinner160.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(16, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner161 = (Spinner) findViewById(R.id.spinner_hole_16_player_1);
      spinner161.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(16, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner162 = (Spinner) findViewById(R.id.spinner_hole_16_player_2);
      spinner162.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(16, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner163 = (Spinner) findViewById(R.id.spinner_hole_16_player_3);
      spinner163.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(16, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });      
      
//  	hole 17   
      Spinner spinner170 = (Spinner) findViewById(R.id.spinner_hole_17_player_0);
      spinner170.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(17, 0, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner171 = (Spinner) findViewById(R.id.spinner_hole_17_player_1);
      spinner171.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(17, 1, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner172 = (Spinner) findViewById(R.id.spinner_hole_17_player_2);
      spinner172.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(17, 2, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

      	}
      	@Override
      	public void onNothingSelected(AdapterView arg0) { }
      });
      Spinner spinner173 = (Spinner) findViewById(R.id.spinner_hole_17_player_3);
      spinner173.setOnItemSelectedListener(new OnItemSelectedListener(){
      	public void onItemSelected(AdapterView parent, View view, int pos, long id) {
      		// Implement your logic here
      		setHoleScore(17, 3, Integer.parseInt(parent.getItemAtPosition(pos).toString()));

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
		updateScoreDisplay();

		setTitle("player: " + player + " hole: " + hole);


	}
	
	private void updateScoreDisplay() {
        TextView text1 = (TextView)findViewById(R.id.textViewFront9_0);
        TextView text2 = (TextView)findViewById(R.id.textViewFront9_1);
        TextView text3 = (TextView)findViewById(R.id.textViewFront9_2);
        TextView text4 = (TextView)findViewById(R.id.textViewFront9_3);
        TextView text5 = (TextView)findViewById(R.id.textViewBack9_0);
        TextView text6 = (TextView)findViewById(R.id.textViewBack9_1);
        TextView text7 = (TextView)findViewById(R.id.textViewBack9_2);
        TextView text8 = (TextView)findViewById(R.id.textViewBack9_3);
        TextView text9 = (TextView)findViewById(R.id.textViewTotal_0);
        TextView text10 = (TextView)findViewById(R.id.textViewTotal_1);
        TextView text11 = (TextView)findViewById(R.id.textViewTotal_2);
        TextView text12 = (TextView)findViewById(R.id.textViewTotal_3);
        text1.setText(String.valueOf(getTotalScore(1, 0)));
		text2.setText(String.valueOf(getTotalScore(1, 1)));
		text3.setText(String.valueOf(getTotalScore(1, 2)));
		text4.setText(String.valueOf(getTotalScore(1, 3)));
        text5.setText(String.valueOf(getTotalScore(2, 0)));
		text6.setText(String.valueOf(getTotalScore(2, 1)));
		text7.setText(String.valueOf(getTotalScore(2, 2)));
		text8.setText(String.valueOf(getTotalScore(2, 3)));
        text9.setText(String.valueOf(getTotalScore(0, 0)));
		text10.setText(String.valueOf(getTotalScore(0, 1)));
		text11.setText(String.valueOf(getTotalScore(0, 2)));
		text12.setText(String.valueOf(getTotalScore(0, 3)));
		
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
		else if(half ==2 ){
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


	private void initializeHoleScores(){
		for (int i = 0; i<18; i++) {
			for (int j = 0; j<4; j++) {
				holeScores[i][j] = 0;
			}
		}
		
	}

	

	
	
}
