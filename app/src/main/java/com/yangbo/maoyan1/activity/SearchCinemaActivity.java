package com.yangbo.maoyan1.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.yangbo.maoyan1.R;

public class SearchCinemaActivity extends AppCompatActivity {
    EditText et_seach_cinema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_cinema);

        et_seach_cinema = (EditText)findViewById(R.id.et_seach_cinema);
    }
}
