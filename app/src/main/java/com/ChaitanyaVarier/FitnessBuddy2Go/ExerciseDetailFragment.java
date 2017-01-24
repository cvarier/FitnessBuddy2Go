package com.ChaitanyaVarier.FitnessBuddy2Go;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ChaitanyaVarier.FitnessBuddy2Go.exerciselist.ExerciseContent;
import com.ChaitanyaVarier.FitnessBuddy2Go.R;

/**
 * A fragment representing a single Exercise detail screen. This fragment is
 * either contained in a {@link ExerciseListActivity} in two-pane mode (on
 * tablets) or a {@link ExerciseDetailActivity} on handsets.
 */
public class ExerciseDetailFragment extends Fragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String ARG_ITEM_ID = "item_id";

	/**
	 * The content this fragment is presenting.
	 */
	private ExerciseContent.Exercise mItem;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public ExerciseDetailFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(ARG_ITEM_ID)) {
			// Load the exercise content specified by the fragment
			// arguments.
			mItem = ExerciseContent.ITEM_MAP.get(getArguments().getString(
					ARG_ITEM_ID));
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_exercise_detail,
				container, false);
		

		// Show the exercise descriptions as text in a TextView.
		if (mItem != null) {
			((TextView) rootView.findViewById(R.id.exercise_detail))
					.setText(Html.fromHtml(mItem.description, new ImageGetter(){ 
												
					@Override public Drawable getDrawable(String source) {
																	
					      Drawable drawFromPath;
					      
					  	  int path =
					            ExerciseDetailFragment.this.getResources().getIdentifier(source, "drawable",
					               "com.ChaitanyaVarier.FitnessBuddy2Go");	
					      drawFromPath = (Drawable) ExerciseDetailFragment.this.getResources().getDrawable(path);
					      drawFromPath.setBounds(0, 0, drawFromPath.getIntrinsicWidth(),
					         drawFromPath.getIntrinsicHeight());
					      return drawFromPath;
					   }
					
					}, null));
					
		}
		return rootView;
		
	}
}