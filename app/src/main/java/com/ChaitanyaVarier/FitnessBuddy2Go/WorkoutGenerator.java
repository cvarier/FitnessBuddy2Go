package com.ChaitanyaVarier.FitnessBuddy2Go;

import com.ChaitanyaVarier.FitnessBuddy2Go.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Matrix;
import android.view.ScaleGestureDetector;
import android.view.MotionEvent;


public class WorkoutGenerator extends Activity {

	public static int generated = 0;
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	  // ignore orientation/keyboard change
	  super.onConfigurationChanged(newConfig);
	}
	
	 private Matrix matrix = new Matrix();
	 private ScaleGestureDetector SGD;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_workout_generator);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		int titleId = getResources().getIdentifier("action_bar_title", "id", "android");
		TextView abTitle = (TextView) findViewById(titleId);
		abTitle.setTextColor(Color.parseColor("#163EB5"));
		abTitle.setTypeface(abTitle.getTypeface(), Typeface.BOLD);
		
		SGD = new ScaleGestureDetector(this, new ScaleListener());
		Log.d("event", "initialized");
		
		
		//Workout Generator Algorithm
		
    	final EditText agetext = (EditText)findViewById(R.id.age);
		final EditText heighttext = (EditText)findViewById(R.id.height);
		final EditText weighttext = (EditText)findViewById(R.id.weight);
		final EditText assesstext = (EditText)findViewById(R.id.selfassess);
		final EditText generatorlist = (EditText)findViewById(R.id.GeneratorList);

		
		Button Generate = (Button) findViewById(R.id.Generate);
		
        Generate.setOnClickListener(
        	new View.OnClickListener() 
        	{
        		
        		public void onClick(View view) 
        		
        		{   
        			InputMethodManager imm = 
        				    (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        				imm.hideSoftInputFromWindow(weighttext.getWindowToken(), 0);
        			
        			Integer age = null;
        			Integer weight = null;     			        			
        			Integer height = null;
        			Integer skillassess = null;          			
        			
        			String nullerror = "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<b><i><font color=\"#FF0000\">You did not enter a valid<br>" +
        					"&nbsp&nbsp&nbsp&nbsp&nbsp value for one or<br>&nbsp&nbsp&nbsp&nbsp&nbsp more fields.</font></i></b>";
        			
        			try {
        				age = Integer.valueOf(agetext.getText().toString());
        				weight = Integer.valueOf(weighttext.getText().toString());
        				height = Integer.valueOf(heighttext.getText().toString());
        				skillassess = Integer.valueOf(assesstext.getText().toString());
        				}
        				catch (NumberFormatException e) {       					
        					generatorlist.setText(Html.fromHtml(nullerror));
        					age = 0;
            				weight = 0;
            				height = 0;
            				skillassess = 0;
        				}       			
        			
        			int skillage = 0;
        			int skillbmi = 0;
        			
        			
        				if (age > 0 && age < 10) {

        				skillage = 1;

        				}
        				
        				if (age >= 10 && age < 12) {

            			skillage = 3;

            			}

        				if (age >= 12 && age < 14) {

        				skillage = 5;

        				}
        				
        				if (age >= 14 && age < 15) {

            			skillage = 7;

            			}

        				if (age >= 15 && age < 17) {

        				skillage = 8;

        				}

        				if (age >= 17 && age < 20) {

        				skillage = 9;

        				}

        				if (age >= 20 && age < 27) {

        				skillage = 10;

        				}

        				if (age >= 27 && age < 30) {

        				skillage = 9;

        				}
        				
        				if (age >= 30 && age < 35) {

            			skillage = 8;

            			}

        				if (age >= 35 && age < 45) {

        				skillage = 7;

        				}

        				if (age >= 45 && age < 50) {

        				skillage = 6;

        				}

        				if (age >= 50 && age < 60) {

            			skillage = 5;

            			}
        				
        				if (age >= 60 && age < 70) {

        				skillage = 3;

        				}
        				
        				if (age >= 70) {

            			skillage = 1;

            			}

        			       			
        			
        			//bmi formula
        			
        			double heightsq = height*height;
        			double whratio = weight/heightsq;
        			
        			double bmi = 703*whratio;
        			
        			//end bmi formula

        				if (bmi == 0  || bmi < 0) {       					
        				skillbmi = 0;       					
        				}
        				        	
        				if (bmi <= 16 ) {
    					skillbmi = 1;
        				}
        			
        				if (bmi > 16 && bmi < 17 ) {
        					skillbmi = 2;
        				}
        				
        				if (bmi >= 17 && bmi < 18.5) {
        					skillbmi = 4;
        				}
        				
        				if (bmi >= 18.5 && bmi < 19) {
        					skillbmi = 6;
        				}
        				
        				if (bmi >= 19 && bmi < 20) {
        					skillbmi = 8;
        				}        				
        				
        				if (bmi >= 20 && bmi < 24) {
        					skillbmi = 10;
        				}
        				
        				if (bmi >= 24 && bmi < 25) {
        					skillbmi = 8;
        				}
        				
        				if (bmi >= 25 && bmi < 27) {
        					skillbmi = 5;
        				}
        				
        				if (bmi >= 27 && bmi < 30) {
        					skillbmi = 3;
        				}
        				
        				if (bmi >= 30) {
        					skillbmi = 1;
        				}
        			
        			double skillageweighted = skillage*3.5;        	
        			double skillbmiweighted = skillbmi*2.5;
        			double skillassessweighted = skillassess*4;       			
        			
    				if (skillage == 1) {

            			skillageweighted = 6.5;
            			skillbmiweighted = skillbmi*1;
            			skillassessweighted = skillassess*2.5;

            			}
    				
    				if (skillbmi == 1) {
    					skillageweighted = skillage*1;
            			skillbmiweighted = 6.5;
            			skillassessweighted = skillassess*2.5;
    				}
    				
    				if (skillbmi == 1 && skillage == 1) {
    					skillageweighted = 3.75;
            			skillbmiweighted = 3.75;
            			skillassessweighted = skillassess*2.5;
    				}
    				
        			double skillsum = skillageweighted+skillbmiweighted+skillassessweighted;   				
        			double skilllvlpre = skillsum/10;
        			Integer skilllvlfinal = (int)Math.round(skilllvlpre);       	
        			
        			if (height == 0 || skillage == 0 || skillbmi == 0 || skillassess == 0 || weight == 0 || skillassess > 10) {
        				skilllvlfinal = 0;
        			}
        			
        			double rbmi = bmi * 100;       			
        			double rbmif = (int)Math.round(rbmi);
        			double rbmifinal = rbmif/100;
        			
        			String pbmi = "&nbsp&nbsp Your BMI is : "+String.valueOf(rbmifinal)+"<br><br>";
        			       			       			
        			String w1 = "&nbsp&nbsp Your ability level is (1-10): 1<br><br><font color=\"#FF0000\">&nbsp&nbsp Sit-Up<br><br>&nbsp&nbsp Push-Up<br><br>&nbsp&nbsp Squat</font><br><br><font color=\"#2D7A0F\">" +
        					"&nbsp&nbsp Jumping Jack<br><br>&nbsp&nbsp Long Jump<br><br>&nbsp&nbsp Alternate Leg Bounding</font>" +
        					"<br><br><font color=\"#190EE8\">&nbsp&nbsp Weight Shifts<br><br>&nbsp&nbsp Leg Lifts<br><br>&nbsp&nbsp Leg Hover Step-Up</font>";
        			
        			String w2 = "&nbsp&nbsp Your ability level is (1-10): 2<br><br><font color=\"#FF0000\">&nbsp&nbsp Push-Up<br><br>&nbsp&nbsp Sit-Up<br><br>&nbsp&nbsp Squat</font><br><br><font color=\"#2D7A0F\">" +
        					"&nbsp&nbsp Long Jump<br><br>&nbsp&nbsp Jumping Jack<br><br>&nbsp&nbsp Alternate Leg Bounding</font>" +
        					"<br><br><font color=\"#190EE8\">&nbsp&nbsp Leg Lifts<br><br>&nbsp&nbsp Weight Shifts<br><br>&nbsp&nbsp Leg Hover Step-Up</font>";
        			
        			String w3 = "&nbsp&nbsp Your ability level is (1-10): 3<br><br><font color=\"#FF0000\">&nbsp&nbsp Squat<br><br>&nbsp&nbsp Push-Up<br><br>&nbsp&nbsp Crunch</font><br><br><font color=\"#2D7A0F\">" +
        					"&nbsp&nbsp Alternate Leg Bounding<br><br>&nbsp&nbsp Long Jump<br><br>&nbsp&nbsp Lateral Jump</font>" +
        					"<br><br><font color=\"#190EE8\">&nbsp&nbsp Leg Hover Step-Up<br><br>&nbsp&nbsp Leg Lifts<br><br>&nbsp&nbsp Single Leg Squat</font>";
        			
        			String w4 = "&nbsp&nbsp Your ability level is (1-10): 4<br><br><font color=\"#FF0000\">&nbsp&nbsp Crunch<br><br>&nbsp&nbsp Squat<br><br>&nbsp&nbsp Bicycle Crunch</font><br><br><font color=\"#2D7A0F\">" +
        					"&nbsp&nbsp Lateral Jump<br><br>&nbsp&nbsp Alternate Leg Bounding<br><br>&nbsp&nbsp Tuck Jump</font>" +
        					"<br><br><font color=\"#190EE8\">&nbsp&nbsp Single Leg Squat<br><br>&nbsp&nbsp Leg Hover Step-Up<br><br>&nbsp&nbsp Tree Pose</font>";
        			
        			String w5 = "&nbsp&nbsp Your ability level is (1-10): 5<br><br><font color=\"#FF0000\">&nbsp&nbsp Bicycle Crunch<br><br>&nbsp&nbsp Crunch<br><br>&nbsp&nbsp Plank</font><br><br><font color=\"#2D7A0F\">" +
        					"&nbsp&nbsp Tuck Jump<br><br>&nbsp&nbsp Lateral Jump<br><br>&nbsp&nbsp Skipping Rope</font>" +
        					"<br><br><font color=\"#190EE8\">&nbsp&nbsp Tree Pose<br><br>&nbsp&nbsp Single Leg Squat<br><br>&nbsp&nbsp Eagle Pose</font>";
        			
        			String w6 = "&nbsp&nbsp Your ability level is (1-10): 6<br><br><font color=\"#FF0000\">&nbsp&nbsp Plank<br><br>&nbsp&nbsp Bicycle Crunch<br><br>&nbsp&nbsp Spider Crawl</font><br><br><font color=\"#2D7A0F\">" +
        					"&nbsp&nbsp Skipping Rope<br><br>&nbsp&nbsp Tuck Jump<br><br>&nbsp&nbsp Mountain Climber</font>" +
        					"<br><br><font color=\"#190EE8\">&nbsp&nbsp Eagle Pose<br><br>&nbsp&nbsp Tree Pose<br><br>&nbsp&nbsp King Dancer Pose</font>";
        			
        			String w7 = "&nbsp&nbsp Your ability level is (1-10): 7<br><br><font color=\"#FF0000\">&nbsp&nbsp Spider Crawl<br><br>&nbsp&nbsp Plank<br><br>&nbsp&nbsp Superman</font><br><br><font color=\"#2D7A0F\">" +
        					"&nbsp&nbsp Mountain Climber<br><br>&nbsp&nbsp Skipping Rope<br><br>&nbsp&nbsp Squat Jump</font>" +
        					"<br><br><font color=\"#190EE8\">&nbsp&nbsp King Dancer Pose<br><br>&nbsp&nbsp Eagle Pose<br><br>&nbsp&nbsp Half Moon Pose</font>";
        			
        			String w8 = "&nbsp&nbsp Your ability level is (1-10): 8<br><br><font color=\"#FF0000\">&nbsp&nbsp Superman<br><br>&nbsp&nbsp Spider Crawl<br><br>&nbsp&nbsp Chin-Up</font><br><br><font color=\"#2D7A0F\">" +
        					"&nbsp&nbsp Squat Jump<br><br>&nbsp&nbsp Mountain Climber<br><br>&nbsp&nbsp Burpee</font>" +
        					"<br><br><font color=\"#190EE8\">&nbsp&nbsp Half Moon Pose<br><br>&nbsp&nbsp King Dancer Pose<br><br>&nbsp&nbsp Warrior III Pose</font>";
        			
        			String w9 = "&nbsp&nbsp Your ability level is (1-10): 9<br><br><font color=\"#FF0000\">&nbsp&nbsp Chin-Up<br><br>&nbsp&nbsp Superman<br><br>&nbsp&nbsp Pull-Up</font><br><br><font color=\"#2D7A0F\">" +
        					"&nbsp&nbsp Burpee<br><br>&nbsp&nbsp Squat Jump<br><br>&nbsp&nbsp Front Kick Lunge</font>" +
        					"<br><br><font color=\"#190EE8\">&nbsp&nbsp Warrior III Pose<br><br>&nbsp&nbsp Half Moon Pose<br><br>&nbsp&nbsp Standing Forward Bend</font>";
        			
        			String w10 = "&nbsp&nbsp Your ability level is (1-10): 10<br><br><font color=\"#FF0000\">&nbsp&nbsp Pull-Up<br><br>&nbsp&nbsp Chin-Up<br><br>&nbsp&nbsp Superman</font><br><br><font color=\"#2D7A0F\">" +
        					"&nbsp&nbsp Front Kick Lunge<br><br>&nbsp&nbsp Burpee<br><br>&nbsp&nbsp Squat Jump</font>" +
        					"<br><br><font color=\"#190EE8\">&nbsp&nbsp Standing Forward Bend<br><br>&nbsp&nbsp Warrior III Pose<br><br>&nbsp&nbsp Half Moon Pose</font>";
        			
        			if (skilllvlfinal == 0) {
        				generatorlist.setText(Html.fromHtml(nullerror));
        			}
        			
        			if (skilllvlfinal == 1) {
        				generatorlist.setText(Html.fromHtml(pbmi + w1));
        			}
        			
        			if (skilllvlfinal == 2) {
        				generatorlist.setText(Html.fromHtml(pbmi +w2));
        			}
        			
        			if (skilllvlfinal == 3) {
        				generatorlist.setText(Html.fromHtml(pbmi +w3));
        			}
        			
        			if (skilllvlfinal == 4) {
        				generatorlist.setText(Html.fromHtml(pbmi +w4));
        			}
        			
        			if (skilllvlfinal == 5) {
        				generatorlist.setText(Html.fromHtml(pbmi +w5));
        			}
        			
        			if (skilllvlfinal == 6) {
        				generatorlist.setText(Html.fromHtml(pbmi +w6));
        			}
        			
        			if (skilllvlfinal == 7) {
        				generatorlist.setText(Html.fromHtml(pbmi +w7));
        			}
        			
        			if (skilllvlfinal == 8) {
        				generatorlist.setText(Html.fromHtml(pbmi +w8));
        			}
        			
        			if (skilllvlfinal == 9) {
        				generatorlist.setText(Html.fromHtml(pbmi +w9));
        			}
        			
        			if (skilllvlfinal == 10) {
        				generatorlist.setText(Html.fromHtml(pbmi +w10));
        			}
        			
        			generated = skilllvlfinal + 1;
        				
        		}
        		
        		
        });
        
		//(End) Workout Generator Algorithm
        
        //Button to go to Exercise Library
        
        Button GoToExerciseLibrary = (Button) findViewById(R.id.GoToExerciseLibrary);
        
        GoToExerciseLibrary.setOnClickListener(
            	new View.OnClickListener() 
            	{           		
            		public void onClick(View view) {
            			startActivity(new Intent("com.ChaitanyaVarier.FitnessBuddy2Go.ExerciseLibrary"));
            			
            			if (generated == 1) {
            			}
            			
            			generated = 0;
					}
            	});
        
        //(End) Button 
	}
	
	@Override
	   public boolean onTouchEvent(MotionEvent ev) {
	      SGD.onTouchEvent(ev);
	      return true;
	   }
	
	private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
	   @Override
	   public boolean onScale(ScaleGestureDetector detector) {
	      Log.d("event", "done" + " " + matrix);
	      return true;
	   }
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpTo(this, new Intent(this,
					ExerciseListActivity.class));
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
