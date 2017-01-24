package com.ChaitanyaVarier.FitnessBuddy2Go;

import com.ChaitanyaVarier.FitnessBuddy2Go.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainMenu extends Activity implements OnClickListener {


    Button create_my_workout;
    Button view_exercise_library;
    Button open_info;

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        // ignore orientation/keyboard change
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_menu);
        create_my_workout = (Button) findViewById(R.id.create_my_workout);
        create_my_workout.setOnClickListener(this);

        view_exercise_library = (Button) findViewById(R.id.view_exercise_library);
        view_exercise_library.setOnClickListener(this);

        open_info = (Button) findViewById(R.id.open_guide);
        open_info.setOnClickListener(this);

        int titleId = getResources().getIdentifier("action_bar_title", "id", "android");
        TextView abTitle = (TextView) findViewById(titleId);
        abTitle.setTypeface(abTitle.getTypeface(), Typeface.BOLD);

        Shader textShader = new LinearGradient(0, 0, 220, 40,
                new int[]{Color.parseColor("#163EB5"), Color.parseColor("#39A127"), Color.parseColor("#ABA224")},
                new float[]{0, 0.5f, 1}, TileMode.CLAMP);
        abTitle.getPaint().setShader(textShader);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int density = metrics.densityDpi;

        if (density == DisplayMetrics.DENSITY_XXHIGH) {

            LayoutInflater factory = LayoutInflater.from(this);
            final View message = factory.inflate(R.layout.dialog_layout, null);
            AlertDialog.Builder dialog = new AlertDialog.Builder(this, R.style.AlertDialogCustom);
            dialog.setIcon(R.drawable.app_icon)
                    .setCancelable(false)
                    .setTitle(Html.fromHtml("<font color='#33b5e5'><b>Disclaimer</b></font>"))
                    .setView(message)
                    .setPositiveButton(Html.fromHtml("<b><small><small><small>I Understand</small></small></small></b>"), new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });
            AlertDialog alert = dialog.create();
            alert.show();
            alert.getButton(DialogInterface.BUTTON_POSITIVE).setTextSize(getResources().getDimension(R.dimen.alert_button_textsize));
            alert.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

            int dividerId = alert.getContext().getResources().getIdentifier("android:id/titleDivider", null, null);
            ImageView divider = (ImageView) alert.findViewById(dividerId);
            divider.setBackgroundColor(getResources().getColor(R.color.Blue));
            divider.getLayoutParams().height = 8;

        } else if (density == DisplayMetrics.DENSITY_LOW) {

            LayoutInflater factory = LayoutInflater.from(this);
            final View message = factory.inflate(R.layout.dialog_layout, null);
            AlertDialog.Builder dialog = new AlertDialog.Builder(this, R.style.AlertDialogCustom);
            dialog.setIcon(R.drawable.app_icon)
                    .setCancelable(false)
                    .setTitle(Html.fromHtml("<font color='#33b5e5'><b>Disclaimer</b></font>"))
                    .setView(message)
                    .setPositiveButton(Html.fromHtml("<b><big><big><big>I Understand</big></big></big></b>"), new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });
            AlertDialog alert = dialog.create();
            alert.show();
            alert.getButton(DialogInterface.BUTTON_POSITIVE).setTextSize(getResources().getDimension(R.dimen.alert_button_textsize));
            alert.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

            int dividerId = alert.getContext().getResources().getIdentifier("android:id/titleDivider", null, null);
            ImageView divider = (ImageView) alert.findViewById(dividerId);
            divider.setBackgroundColor(getResources().getColor(R.color.Blue));
            divider.getLayoutParams().height = 2;
        } else {

            LayoutInflater factory = LayoutInflater.from(this);
            final View message = factory.inflate(R.layout.dialog_layout, null);
            AlertDialog.Builder dialog = new AlertDialog.Builder(this, R.style.AlertDialogCustom);
            dialog.setIcon(R.drawable.app_icon)
                    .setCancelable(false)
                    .setTitle(Html.fromHtml("<font color='#33b5e5'><b>Disclaimer</b></font>"))
                    .setView(message)
                    .setPositiveButton(Html.fromHtml("<b>I Understand</b>"), new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });
            AlertDialog alert = dialog.create();
            alert.show();
            alert.getButton(DialogInterface.BUTTON_POSITIVE).setTextSize(getResources().getDimension(R.dimen.alert_button_textsize));
            alert.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

            int dividerId = alert.getContext().getResources().getIdentifier("android:id/titleDivider", null, null);
            ImageView divider = (ImageView) alert.findViewById(dividerId);
            divider.setBackgroundColor(getResources().getColor(R.color.Blue));
            divider.getLayoutParams().height = 4;
        }


//		Install Shortcut on HomeScreen

/*	    Intent shortcutIntent = new Intent(getApplicationContext(), MainMenu.class);      
	    shortcutIntent.setAction(Intent.ACTION_MAIN);

	    Intent addIntent = new Intent();
	    addIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
	    addIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "FitnessBuddy2Go");
	    addIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE,Intent.ShortcutIconResource.fromContext(getApplicationContext(), R.drawable.ic_launcher));
	    addIntent.putExtra("duplicate", false);
	    addIntent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
	    getApplicationContext().sendBroadcast(addIntent); */

    }


    private void create_my_workoutClick() {
        startActivity(new Intent("com.ChaitanyaVarier.FitnessBuddy2Go.WorkoutGenerator"));

    }

    private void view_exercise_libraryClick() {
        startActivity(new Intent("com.ChaitanyaVarier.FitnessBuddy2Go.ExerciseLibrary"));

    }

    private void open_guideClick() {
        startActivity(new Intent("com.ChaitanyaVarier.FitnessBuddy2Go.Info"));

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.create_my_workout:
                create_my_workoutClick();
                break;

            case R.id.view_exercise_library:
                view_exercise_libraryClick();
                break;

            case R.id.open_guide:
                open_guideClick();
                break;
        }

    }
}
