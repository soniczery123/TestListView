package com.example.testlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.testlistview.adapter.AnimalListAdapter;
import com.example.testlistview.model.Animal;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Animal> Data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        getSupportActionBar().setTitle("Animals World");
        Data = new ArrayList<>();
        Data.add(new Animal("Cat", "แมว", R.drawable.cat, R.string.details_cat));
        Data.add(new Animal("Dog", "สุนัข", R.drawable.dog, R.string.details_dog));
        Data.add(new Animal("Dolphin", "โลมา", R.drawable.dolphin, R.string.details_dolphin));
        Data.add(new Animal("Koala", "โคอาลา", R.drawable.koala, R.string.details_koala));
        Data.add(new Animal("Lion", "สิงโต", R.drawable.lion, R.string.details_lion));
        Data.add(new Animal("Owl", "นกฮูก", R.drawable.owl, R.string.details_owl));
        Data.add(new Animal("Penguin", "แพนกวิน", R.drawable.penguin, R.string.details_penguin));
        Data.add(new Animal("Pig", "หมู", R.drawable.pig, R.string.details_pig));
        Data.add(new Animal("Rabbit", "กระต่าย", R.drawable.rabbit, R.string.details_rabbit));
        Data.add(new Animal("Tiger", "เสือ", R.drawable.tiger, R.string.details_tiger));

        AnimalListAdapter adapter = new AnimalListAdapter(
                this, R.layout.item, Data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Animal animal = Data.get(i);
                String name = animal.nameThai + " (" + animal.nameEng + ")";
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                String s = getString(animal.desc);
                intent.putExtra("Name", name);
                intent.putExtra("Desc", s);
                intent.putExtra("Pic", animal.pic);
                startActivity(intent);
            }
        });
    }
}
