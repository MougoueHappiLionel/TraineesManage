package com.example.traineesmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Date;

public class CalendarActivity extends Activity {

    CalendarView calendar;
    String date;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_view);

        calendar = (CalendarView) findViewById(R.id.calendar);

        findViewById(R.id.btncreate_report).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CalendarActivity.this, SaveReport.class);
                startActivity(intent);
            }
        });

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int day) {
                String  curDate = String.valueOf(day);
                String  Year = String.valueOf(year);
                String  Month = String.valueOf(month);

                date = curDate + "/" + month + "/" +year;
            }
        });
    }
}
