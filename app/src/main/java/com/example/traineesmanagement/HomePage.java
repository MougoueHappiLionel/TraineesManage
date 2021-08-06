package com.example.traineesmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.cardview.widget.CardView;

public class HomePage extends Activity {


    CardView cardChat;
    CardView cardInfos;
    CardView cardProfile;
    CardView cardBook;
    CardView cardSettings;
    CardView cardExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        cardInfos = (CardView) findViewById(R.id.cardInfos);
        cardChat = (CardView) findViewById(R.id.cardContact);
        cardProfile = (CardView) findViewById(R.id.cardProfile);
        cardBook = (CardView) findViewById(R.id.cardRapports);
        cardSettings = (CardView) findViewById(R.id.cardSettings);
        cardExit = (CardView) findViewById(R.id.cardLogout);

        cardExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SignIn.class));
            }
        });


        cardProfile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), UserProfile.class));
            }
        });

        cardBook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CalendarActivity.class));
            }
        });
    }
}
