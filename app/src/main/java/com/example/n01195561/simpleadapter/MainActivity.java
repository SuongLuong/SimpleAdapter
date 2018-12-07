// Suong Luong N01195561
// Assignment 3 - Simple Adapter
// 12/7/2018
package com.example.n01195561.simpleadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.AdapterView;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    // create a string for a list of fruit
    String [] fruitsname = {"Mango","Strawberry","Avocado","Orange","Kiwi","Apple","Banana","Papaya"};

    //get the drawable images
    int [] fruitsImages = {R.drawable.mango,R.drawable.strawberry,R.drawable.avocado,R.drawable.orange,R.drawable.kiwi,R.drawable.apple,R.drawable.banana,R.drawable.papaya};
    ListView simple_listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    simple_listview = findViewById(R.id.simplelist);

        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
        for (int i = 0;i<fruitsname.length;i++) {

            // Create this Hashmap to store fruit data in key-value pair
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("name",fruitsname[i]);
            hashMap.put("image",fruitsImages[i]+"");

            // to add the hashmap into arraylist
            arrayList.add(hashMap);
        }


        // create a string array to hold the pair above
        String [] from = {"name","image"};

        // create int array of views id
        int [] to = {R.id.textview,R.id.imageview};

        // create a simple adapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,arrayList,R.layout.design_file,from,to);
        simple_listview.setAdapter(simpleAdapter);

        // display item information when click event
        simple_listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "You select " + fruitsname[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}