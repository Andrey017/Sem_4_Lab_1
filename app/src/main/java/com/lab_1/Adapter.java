package com.lab_1;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Adapter extends android.support.v7.widget.RecyclerView.Adapter<Adapter.ViewHolder> {
    private Number convertNumber;

    public Adapter(){
        super();
        convertNumber = new Number();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_list_item, viewGroup, false);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String color = ((i + 1) % 2 == 0) ? "#cccccc" : "#ffffff";
        viewHolder.itemLayoutView.setBackgroundColor(Color.parseColor(color));
        TextView textView = (TextView) viewHolder.itemLayoutView.findViewById(R.id.text);
        textView.setText(convertNumber.getNumber(i + 1));
    }

    @Override
    public int getItemCount() {
        return 1000000;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public View itemLayoutView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemLayoutView = itemView;
        }
    }
}
