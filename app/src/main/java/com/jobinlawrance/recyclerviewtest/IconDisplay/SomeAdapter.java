package com.jobinlawrance.recyclerviewtest.IconDisplay;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jobinlawrance.recyclerviewtest.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jobin Lawrance on 07/07/18.
 */
public class SomeAdapter extends RecyclerView.Adapter<SomeAdapter.SomeViewHolder> {

    List<String> stringList = new ArrayList<>();

    @NonNull
    @Override
    public SomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_name, parent, false);
        return new SomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SomeViewHolder holder, int position) {
        holder.bind(stringList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }


    static class SomeViewHolder extends RecyclerView.ViewHolder {

        TextView nameTextView;

        SomeViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.tv_name);
        }

        void bind(String blah) {
            nameTextView.setText(blah);
        }
    }
}
