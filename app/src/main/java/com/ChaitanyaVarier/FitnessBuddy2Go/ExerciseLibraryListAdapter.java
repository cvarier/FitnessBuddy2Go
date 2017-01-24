package com.ChaitanyaVarier.FitnessBuddy2Go;

import java.util.List;

import com.ChaitanyaVarier.FitnessBuddy2Go.exerciselist.ExerciseContent.Exercise;
import com.ChaitanyaVarier.FitnessBuddy2Go.R;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



public class ExerciseLibraryListAdapter extends ArrayAdapter<Exercise> {

    private Context mContext;
    private int id;
    private List <Exercise>items ;

    public ExerciseLibraryListAdapter(Context context, int textViewResourceId , List<Exercise> list ) 
    {
        super(context, textViewResourceId, list);           
        mContext = context;
        id = textViewResourceId;
        items = list ;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent)
    {
        View mView = v ;
        if(mView == null){
            LayoutInflater vi = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = vi.inflate(id, null);
        }

        TextView text = (TextView) mView.findViewById(R.id.exerciselist);

        if(items.get(position) != null )
        {
            text.setTextColor(Color.WHITE);
            text.setText((CharSequence) items.get(position));
            text.setBackgroundColor(Color.RED); 
            int color = Color.argb( 200, 255, 64, 64 );
                text.setBackgroundColor( color );

        }

        return mView;
    }

}