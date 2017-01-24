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
 * An activity representing a list of Exercises. This activity has different
 * presentations for handset and tablet-size devices. On handsets, the activity
 * presents a list of items, which when touched, lead to a
 * {@link ExerciseDetailActivity} representing item details. On tablets, the
 * activity presents the list of items and item details side-by-side using two
 * vertical panes.
 * <p>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link ExerciseListFragment} and the item details (if present) is a
 * {@link ExerciseDetailFragment}.
 * <p>
 * This activity also implements the required
 * {@link ExerciseListFragment.Callbacks} interface to listen for item
 * selections.
 */
public class ExerciseListActivity extends FragmentActivity implements
		ExerciseListFragment.Callbacks {

	/**
	 * Whether or not the activity is in two-pane mode, i.e. running on a tablet
	 * device.
	 */
	private boolean mTwoPane;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exercise_list);
		// Show the Up button in the action bar.
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		int titleId = getResources().getIdentifier("action_bar_title", "id", "android");
		TextView abTitle = (TextView) findViewById(titleId);
		abTitle.setTextColor(Color.parseColor("#39A127"));
		abTitle.setTypeface(abTitle.getTypeface(), Typeface.BOLD);

		if (findViewById(R.id.exercise_detail_container) != null) {
			// The detail container view will be present only in the
			// large-screen layouts (res/values-large and
			// res/values-sw600dp). If this view is present, then the
			// activity should be in two-pane mode.
			mTwoPane = true;

			// In two-pane mode, list items should be given the
			// 'activated' state when touched.
			((ExerciseListFragment) getSupportFragmentManager()
					.findFragmentById(R.id.exercise_list))
					.setActivateOnItemClick(true);
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
					WorkoutGenerator.class));
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * Callback method from {@link ExerciseListFragment.Callbacks} indicating
	 * that the item with the given ID was selected.
	 */
	@Override
	public void onItemSelected(String id) {
		if (mTwoPane) {
			// In two-pane mode, show the detail view in this activity by
			// adding or replacing the detail fragment using a
			// fragment transaction.
			Bundle arguments = new Bundle();
			arguments.putString(ExerciseDetailFragment.ARG_ITEM_ID, id);
			ExerciseDetailFragment fragment = new ExerciseDetailFragment();
			fragment.setArguments(arguments);
			getSupportFragmentManager().beginTransaction()
					.replace(R.id.exercise_detail_container, fragment).commit();

		} else {
			// In single-pane mode, simply start the detail activity
			// for the selected item ID.
			Intent detailIntent = new Intent(this, ExerciseDetailActivity.class);
			detailIntent.putExtra(ExerciseDetailFragment.ARG_ITEM_ID, id);
			startActivity(detailIntent);
		}
	}
}
