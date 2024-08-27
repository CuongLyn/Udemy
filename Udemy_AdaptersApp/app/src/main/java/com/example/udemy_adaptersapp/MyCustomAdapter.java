package com.example.udemy_adaptersapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {
    private Context context;
    private String[] items;

    public MyCustomAdapter(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }
    // i = position
    @Override
    public int getCount() {
        return items.length; //Return the number of items in your data source
    }

    @Override
    public Object getItem(int i) {
        return items[i]; //Return the data item at the given position
    }

    @Override
    public long getItemId(int i) {
        return i; // Return a unique Identifier for the item at the given position
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        //view == converView
        if(view == null){
            //convertView: is a recycled View that you can reuse to
                           //improve the performace of your list
            view = LayoutInflater.from(context).inflate(
                    R.layout.my_list_item, viewGroup, false
            );
            holder = new ViewHolder();
            holder.textView = view.findViewById(R.id.text1);
            view.setTag(holder);
        }
        else{
            //Reusing the view (that 's recycled)
            holder = (ViewHolder) view.getTag();
        }
        //Set the data to the view
        holder.textView.setText(items[i]);
        //Binding data to views within the convertview




        return view; //Display the data at a position in the data set
    }
    static class ViewHolder{
        //Holds references to the views within an item layout
        TextView textView;
    }
}
