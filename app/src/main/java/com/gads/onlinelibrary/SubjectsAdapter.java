package com.gads.onlinelibrary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SubjectsAdapter extends RecyclerView.Adapter<SubjectsAdapter.ViewHolder> {
    List<String> mstring;

    public SubjectsAdapter(List<String> mstring) {
        this.mstring = mstring;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listitem = layoutInflater.inflate(R.layout.list,parent,false);
        ViewHolder viewHolder = new ViewHolder(listitem);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String string = mstring.get(position);
        holder.textView.setText(string);
    }

    @Override
    public int getItemCount() {
        return mstring.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView = (TextView)itemView.findViewById(R.id.textView);
        }
    }
}
