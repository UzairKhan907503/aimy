package com.example.mycardview;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ExampleViewHolder> {
    private ArrayList<RecyclerItem> recyclerList;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView textViewText;
        public  TextView buttonText;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            textViewText = itemView.findViewById(R.id.textViewText);
            buttonText = itemView.findViewById(R.id.buttonText);
        }

    }
    public RecyclerAdapter(ArrayList<RecyclerItem> recyclerList){
        this.recyclerList = recyclerList;
    }


    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_account_security,parent,false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        RecyclerItem currentItem = recyclerList.get(position);
        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.textViewText.setText(currentItem.getText1());
        holder.buttonText.setText(currentItem.getText2());

    }

    @Override
    public int getItemCount() {
        return recyclerList.size();
    }
}
