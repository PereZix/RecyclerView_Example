package com.a2p.recyclerview_example.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.a2p.recyclerview_example.R;

import java.util.List;

/**
 * Created by alvaro.perez on 23/07/2018.
 */

public class AdapterMain extends RecyclerView.Adapter<AdapterMain.ViewHolder> {
    private List<String> values;

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txvTitulo;
        public View layout;

        public ViewHolder(View itemView) {
            super(itemView);
            layout = itemView;
            txvTitulo = itemView.findViewById(R.id.txvTitulo);
        }
    }

    public AdapterMain(List<String> values){
        this.values = values;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_pelicula, parent, false);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.txvTitulo.setText(values.get(position));
    }

    @Override
    public int getItemCount() {
        return values.size();
    }
}
