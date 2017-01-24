package com.ChaitanyaVarier.FitnessBuddy2Go;

import com.ChaitanyaVarier.FitnessBuddy2Go.R;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.TextView;



public class Info extends Activity {
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	  // ignore orientation/keyboard change
	  super.onConfigurationChanged(newConfig);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_info);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		int titleId = getResources().getIdentifier("action_bar_title", "id", "android");
		TextView abTitle = (TextView) findViewById(titleId);
		abTitle.setTextColor(Color.parseColor("#ABA224"));
		abTitle.setTypeface(abTitle.getTypeface(), Typeface.BOLD);
		
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
