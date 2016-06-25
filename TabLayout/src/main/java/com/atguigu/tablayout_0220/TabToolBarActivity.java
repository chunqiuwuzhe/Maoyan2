package com.atguigu.tablayout_0220;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class TabToolBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_tool_bar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("林志玲来了");
        TabLayout tb = (TabLayout) findViewById(R.id.tb);
        tb.addTab(tb.newTab().setText("林心如"));
        tb.addTab(tb.newTab().setText("林心如"));
        tb.addTab(tb.newTab().setText("林心如"));
    }
}
