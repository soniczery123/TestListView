package com.example.testlistview.adapter;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.testlistview.R;
import com.example.testlistview.model.Animal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MSI-GL62 on 29/10/2560.
 */

public class AnimalListAdapter extends ArrayAdapter<Animal>{
    private Context context;
    private ArrayList<Animal> animalList;
    private int LayoutResId;

    public AnimalListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Animal> objects) {
        super(context, resource, objects);
        this.context = context;
        this.animalList = objects;
        this.LayoutResId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(LayoutResId,null);
        ImageView imgv = view.findViewById(R.id.imageView);
        TextView txtv = view.findViewById(R.id.textView);
        Animal animal = animalList.get(position);
        imgv.setImageResource(animal.pic);
        txtv.setText(animal.nameThai + " (" + animal.nameEng + ")");
        return view;
    }
}
