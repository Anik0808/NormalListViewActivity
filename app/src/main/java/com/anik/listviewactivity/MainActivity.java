package com.anik.listviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static com.anik.listviewactivity.R.*;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    static final String[] names=new String[]{
            "A","B","C","D","E","F","G","H","I","J","K","L","M"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        ListView listView =(ListView)findViewById(R.id.l1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,names);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),((TextView)view).getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
