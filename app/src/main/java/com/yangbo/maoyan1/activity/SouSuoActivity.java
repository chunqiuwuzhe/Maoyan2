package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.yangbo.maoyan1.R;

public class SouSuoActivity extends Activity {
    private TextView tv_bace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_sou_suo);
        tv_bace = (TextView)findViewById(R.id.tv_bace);
        tv_bace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
