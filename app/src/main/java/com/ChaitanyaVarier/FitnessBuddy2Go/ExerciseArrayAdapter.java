package com.ChaitanyaVarier.FitnessBuddy2Go;

/*import java.util.List;
import java.util.zip.Inflater;

import com.ChaitanyaVarier.mytrainer2go.exerciselist.ExerciseContent;
import com.ChaitanyaVarier.mytrainer2go.exerciselist.ExerciseContent.Exercise;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ExerciseArrayAdapter extends ArrayAdapter<ExerciseContent.Exercise> {
	
	Context context;
	int textViewResourceId;
	List<Exercise> Exercises = ExerciseContent.ITEMS;

	public ExerciseArrayAdapter(Context context, int textViewResourceId, List<Exercise> Exercises) {
		super(context, textViewResourceId);
		this.textViewResourceId = textViewResourceId;
        this.context = context;
        this.Exercises = Exercises;
		
	}
	
	@Override
    public View getView(int position, View convertView, ViewGroup parent) 
    {
        View row;
//        LayoutInflater mInflater = ;
        if (null == convertView) {
		row = mInflater.inflate(R.layout.exercise_library_list, null);
        } else {
        row = convertView;
        }

        TextView tv = (TextView) row.findViewById(R.id.exerciselist);
        tv.setText(Html.fromHtml(getItem(position)));

        return row;
    }


}*/
