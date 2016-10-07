package com.superdevdad.simplelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView vList = (ListView) findViewById(R.id.list);

        ArrayList<String> data = new ArrayList<>();
        data.add("Android");
        data.add("iOS");
        data.add("Windows Mobile");
        data.add("Symbian");
        data.add("Tizen");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                data
        );

        vList.setAdapter(adapter);
    }
}
