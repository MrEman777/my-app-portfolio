//Programmer: Ethan Scheffler
//Date: 2015-06-09

package com.example.ethan.app_portfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class PortfolioActivity extends Activity {
    //Declaring toast variable and messages
    private Toast mainPageToast;
    CharSequence message1 = "This button will launch the Spotify App";
    CharSequence message2 = "This button will launch the Scores App";
    CharSequence message3 = "This button will launch the Library App";
    CharSequence message4 = "This button will launch the Build It Bigger App";
    CharSequence message5 = "This button will launch the XYZ Reader App";
    CharSequence message6 = "This button will launch my Capstone App";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    //[1]
    //Switch to determine which button was pressed and calls
    //displayToast method
    public void showToast(View v){
        switch(v.getId()) {
            case R.id.spotifyButton:
                displayToast(message1);
                break;
            case R.id.scoresButton:
                displayToast(message2);
                break;
            case R.id.libraryButton:
                displayToast(message3);
                break;
            case R.id.buildButton:
                displayToast(message4);
                break;
            case R.id.xyzButton:
                displayToast(message5);
                break;
            case R.id.capstoneButton:
                displayToast(message6);
                break;
            default:
                break;
        }
    }

    //[1]
    //Method to display toast, called when a button is clicked
    //displays a toast relative to which button was clicked
    public void displayToast(CharSequence s){
        //Cancel any toast already on the screen
        if(mainPageToast != null){
            mainPageToast.cancel();
        }

        //Create context
        Context context = getApplicationContext();

        //Displays the toast
        mainPageToast = Toast.makeText(context, s, Toast.LENGTH_SHORT);
        mainPageToast.show();

    }



}

// References:
// [1] Udacity Code Reviewer: Suggested Changes upon submission
//  1. Replace individual actionListener for each button with switch and single displayToast method
//  2. Add if statement to cancel toast if any previous toast is still active