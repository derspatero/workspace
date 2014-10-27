package ca.bcit.comp2052.edwardlambke;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ResultsFragment extends Fragment {

	public static int answers[] = {0, 0, 0, 0};

	
	public ResultsFragment() {
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View fragmentView = inflater.inflate(R.layout.results, container, false);
		Button button1 = (Button) fragmentView.findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {	
				
				int score = 0;
				for (int i=0;i<answers.length;i++){
					score += answers[i];
				}
					
				Toast.makeText(
					getActivity(), 
					"Score: " + score + " out of 4", 
					Toast.LENGTH_SHORT).show();
			}
		});
		return fragmentView;
	}
	
}	