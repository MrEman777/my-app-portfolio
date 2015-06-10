//Programmer: Ethan Scheffler
//Date: 2015-06-09

package com.example.ethan.my_app_portfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MyPortfolioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_portfolio);
        //Declaring button variables
        Button spotifyButton = (Button) findViewById(R.id.spotifyButton);
        Button scoresButton = (Button) findViewById(R.id.scoresButton);
        Button libraryButton = (Button) findViewById(R.id.libraryButton);
        Button buildButton = (Button) findViewById(R.id.buildButton);
        Button xyzButton = (Button) findViewById(R.id.xyzButton);
        Button capstoneButton = (Button) findViewById(R.id.capstoneButton);

        //Adding onClickListeners so that when a button is pressed a toast
        //appears at the bottom of the screen
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //The following code on initiating toasts was taken from the
                //Android Developers website as specified in the project
                //instructions. It was necessary in the completion of the project.
                //Ref.: http://developer.android.com/guide/topics/ui/notifiers/toasts.html
                Context context = getApplicationContext();
                CharSequence message = "This button will launch the Spotify App";
                int time = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, time);
                toast.show();
            }
        });
        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence message = "This button will launch the Scores App";
                int time = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, time);
                toast.show();
            }
        });
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence message = "This button will launch the Library App";
                int time = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, time);
                toast.show();
            }
        });
        buildButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence message = "This button will launch the Build It Bigger App";
                int time = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, time);
                toast.show();
            }
        });
        xyzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence message = "This button will launch the XYZ Reader App";
                int time = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, time);
                toast.show();
            }
        });
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence message = "This button will launch my Capstone App";
                int time = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, time);
                toast.show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
