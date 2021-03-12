package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoogle;
    CustomGoogleAdapter customGoogleAdapter;
    ArrayList<Google> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoogle =(ListView) findViewById(R.id.lvGoogleID);
        arrayList = new ArrayList<>();
        arrayList.add(new Google(R.drawable.xanh_co_ban_b,"Google","80$"));
        arrayList.add(new Google(R.drawable.xanh_co_ban_b,"Google","80$"));
        arrayList.add(new Google(R.drawable.xanh_co_ban_b,"Google","80$"));
        customGoogleAdapter = new CustomGoogleAdapter(MainActivity.this
                ,R.layout.layout_google,arrayList);
        lvGoogle.setAdapter(customGoogleAdapter);
    }
}