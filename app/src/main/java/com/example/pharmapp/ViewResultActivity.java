package com.example.pharmapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewResultActivity extends AppCompatActivity {

    private ListView list;
    private String[] result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_result);
        list = (ListView)findViewById(R.id.listView);

        showResult();
    }

    private void showResult()
    {

        ArrayList<String> results = ScanActivity.getScanResults();
        results.add(0, "Results:");
        if (results != null) {
            result = ScanActivity.getScanResults().toArray(new String[0]);
            list.setAdapter(new ArrayAdapter<String>(this, R.layout.result, result));
        }

    }
}
