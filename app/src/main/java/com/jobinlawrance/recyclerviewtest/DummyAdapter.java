package com.jobinlawrance.recyclerviewtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.lzyzsd.randomcolor.RandomColor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jobin Lawrance on 05/07/18.
 */
public class DummyAdapter extends RecyclerView.Adapter<DummyAdapter.DummyViewHolder> {

    List<Integer> integers = new ArrayList<>();
    RandomColor randomColor = new RandomColor();

    @NonNull
    @Override
    public DummyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_dummy, parent, false);
        return new DummyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DummyViewHolder dummyViewHolder, int position) {
        dummyViewHolder.onBindViewHolder(integers.get(position), randomColor);
    }

    @Override
    public int getItemCount() {
        return integers.size();
    }

    public void setIntegers(ArrayList<Integer> arrayList) {
        integers = arrayList;
        notifyDataSetChanged();
    }

    static class DummyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        View rootView;

        DummyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_dummy);
            rootView = itemView.findViewById(R.id.root_layout);
        }

        void onBindViewHolder(Integer number, RandomColor randomColor) {
            if(textView.getText() != null && textView.getText().toString().isEmpty()) {
                textView.setText("View #"+number);
                rootView.setBackgroundColor(randomColor.randomColor());
            }
        }
    }
}
