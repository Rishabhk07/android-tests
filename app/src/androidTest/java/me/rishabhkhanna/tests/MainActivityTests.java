package me.rishabhkhanna.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
/**
 * Created by rishabhkhanna on 02/10/17.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTests {
    public MainActivity mainActivity;
    public KotlinActivity kotlinActivity;
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTessRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Rule
    public ActivityTestRule<KotlinActivity> kotlinActivityTessRule = new ActivityTestRule<KotlinActivity>(KotlinActivity.class);


    @Before
    public void startActivity(){
        mainActivity = mainActivityActivityTessRule.getActivity();
        kotlinActivity = kotlinActivityTessRule.getActivity();
    }

    @Test
    public void calcFareWorksOnUi(){
        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ((EditText)mainActivity.findViewById(R.id.etOne)).setText("0");
                ((EditText)mainActivity.findViewById(R.id.etTwo)).setText("0");

                ((Button)mainActivity.findViewById(R.id.btnCal)).performClick();
//        this will perform click and call set on click listener
                String result = ((TextView)mainActivity.findViewById(R.id.tvFare)).getText().toString();
                assertEquals("50.0",result);
            }
        });

    }

    @Test
    public void KotlincacFareWorksOnUi(){
        kotlinActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ((EditText)kotlinActivity.findViewById(R.id.etOne)).setText("0");
                ((EditText)kotlinActivity.findViewById(R.id.etTwo)).setText("0");

                ((Button)kotlinActivity.findViewById(R.id.btnCal)).performClick();

                String result = ((TextView)kotlinActivity.findViewById(R.id.tvFare)).getText().toString();

                assertEquals("50.0",result);

            }
        });
    }

}
