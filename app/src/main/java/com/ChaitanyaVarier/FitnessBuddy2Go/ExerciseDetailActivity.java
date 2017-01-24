package com.ChaitanyaVarier.FitnessBuddy2Go;

import com.ChaitanyaVarier.FitnessBuddy2Go.R;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * An activity representing a single Exercise detail screen. This activity is
 * only used on handset devices. On tablet-size devices, item details are
 * presented side-by-side with a list of items in a {@link ExerciseListActivity}
 * .
 * <p>
 * This activity is mostly just a 'shell' activity containing nothing more than
 * a {@link ExerciseDetailFragment}.
 */
public class ExerciseDetailActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exercise_detail);

		// Show the Up button in the action bar.
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		int titleId = getResources().getIdentifier("action_bar_title", "id", "android");
		TextView abTitle = (TextView) findViewById(titleId);
		abTitle.setTextColor(Color.parseColor("#39A127"));
		abTitle.setTypeface(abTitle.getTypeface(), Typeface.BOLD);

		// savedInstanceState is non-null when there is fragment state
		// saved from previous configurations of this activity
		// (e.g. when rotating the screen from portrait to landscape).
		// In this case, the fragment will automatically be re-added
		// to its container so we don't need to manually add it.
		// For more information, see the Fragments API guide at:
		//
		// http://developer.android.com/guide/components/fragments.html
		//
		if (savedInstanceState == null) {
			// Create the detail fragment and add it to the activity
			// using a fragment transaction.
			Bundle arguments = new Bundle();
			arguments.putString(ExerciseDetailFragment.ARG_ITEM_ID, getIntent()
					.getStringExtra(ExerciseDetailFragment.ARG_ITEM_ID));
			ExerciseDetailFragment fragment = new ExerciseDetailFragment();
			fragment.setArguments(arguments);
			getSupportFragmentManager().beginTransaction()
					.add(R.id.exercise_detail_container, fragment).commit();
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
