package com.example.testlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent =  getIntent();
        String name = intent.getStringExtra("Name");
        String desc = intent.getStringExtra("Desc");
        int pic = intent.getIntExtra("Pic",0);
        getSupportActionBar().setTitle(name);
        ImageView img = (ImageView) findViewById(R.id.imageView2);
        TextView text = (TextView) findViewById(R.id.textView2);
        img.setImageResource(pic);
        text.setText(desc);
    }
}
