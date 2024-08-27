package com.example.udemy_volumeareaapp;

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

//This class will be responsible for creating the view for each item and binding data for it
public class MyCustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapesArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Shape> shapesArrayList, Context context) {
        super(context, R.layout.grid_item_layout, shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context;
    }
    //View Holder: Used to cache references to the views within an item layout
    private static class MyViewHolder{
        TextView shapeName;
        ImageView shapeImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //1-Get the shape object for the current position
        Shape shape = getItem(position);
        //2-Inflating Layout
        MyViewHolder myViewHolder;
        if(convertView == null){
            //No view went-off screen --> Create a new view
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.grid_item_layout,
                    parent, false
            );
                    //Finding the View
            myViewHolder.shapeName = (TextView) convertView.findViewById(R.id.textView);
            myViewHolder.shapeImg = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(myViewHolder);
        }
        else{
            //A view went-off screen --> re-use it
            myViewHolder = (MyViewHolder) convertView.getTag();

        }
        //Getting the data from the Model Class
        myViewHolder.shapeName.setText(shape.getShapeName());
        myViewHolder.shapeImg.setImageResource(shape.getShapeImg());

        return convertView;
    }
}
