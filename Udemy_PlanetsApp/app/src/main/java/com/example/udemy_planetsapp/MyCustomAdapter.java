package com.example.udemy_planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planet> {

    //Using Custom Layout --> MyCustomAdapter
    //Using Custom Object --> extends ArrayAdapter<Planet>
    private ArrayList<Planet> planetsArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Planet> planetsArrayList, Context context) {
        super(context, R.layout.item_list_layout, planetsArrayList);
        this.planetsArrayList = planetsArrayList;
        this.context = context;
    }
    //Tac dung cua viewHolder la chi anh xa ID 1 lan, giup tiet kiem tai nguyen
    private static class MyViewHolder{
        TextView planet_name;
        TextView planet_count;
        ImageView imageview;

    }
    //getView: used to create and return a view for a specific item in the list

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //1- Get the planet object for the current position
        Planet planet = getItem(position);
        //2- Inflate layout
        MyViewHolder myViewHolder;
        final View result;

        if(convertView == null){
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.item_list_layout,
                    parent,
                    false
            );
            //Finding View
            myViewHolder.planet_name = (TextView) convertView.findViewById(R.id.planet_name);
            myViewHolder.planet_count = (TextView) convertView.findViewById(R.id.planet_count);
            myViewHolder.imageview = (ImageView) convertView.findViewById(R.id.imageview);

            result = convertView;
            convertView.setTag(myViewHolder);
        }else{
            //The view is recycled
            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;

        }
        //Getting data from the Model Class (Planet)
        myViewHolder.planet_name.setText(planet.getPlanetName());
        myViewHolder.planet_count.setText(planet.getMoonCount());
        myViewHolder.imageview.setImageResource(planet.getPlanetImage());

        return result;

    }
}
