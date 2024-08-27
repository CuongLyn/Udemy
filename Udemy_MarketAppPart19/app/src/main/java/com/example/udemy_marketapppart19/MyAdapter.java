package com.example.udemy_marketapppart19;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Item> itemList;

    public MyAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Responsible for creating new view holders for your items
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //Binds the data from the dataset to the view within the view holder
        Item item = itemList.get(position);

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        //Holdes references to the view within the item layout
        ImageView imageView;
        TextView title;
        TextView description;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            title = itemView.findViewById(R.id.title_txt);
            description = itemView.findViewById(R.id.description_txt);
        }
    }
}
