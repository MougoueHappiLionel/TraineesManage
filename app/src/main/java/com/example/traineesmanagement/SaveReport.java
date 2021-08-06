package com.example.traineesmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SaveReport extends Activity {

    TextView view;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_rapports);

        view = (TextView) findViewById(R.id.view_date);

        findViewById(R.id.home_report).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SaveReport.this, HomePage.class));
            }
        });

        findViewById(R.id.btnsave_report).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SaveReport.this, HomePage.class));
            }
        });
    }
}

