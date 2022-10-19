package com.iamnotgod.foodmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CulinaryAdapter extends RecyclerView.Adapter<CulinaryAdapter.ViewHolder> {

    private ArrayList<Culinary> listCulinary;

    public CulinaryAdapter(ArrayList<Culinary> listCulinary) {
        this.listCulinary = listCulinary;
    }

    @NonNull
    @Override
    public CulinaryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_menu, parent, false));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CulinaryAdapter.ViewHolder holder, int position) {
        Culinary culinary = listCulinary.get(position);
        holder.txtNama.setText(culinary.getNama());
        holder.txtHarga.setText(culinary.getHarga()+" Mora");
        holder.imgFoto.setImageResource(culinary.getId_gambar());
    }

    @Override
    public int getItemCount() {
        return listCulinary.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtNama, txtHarga;
        public ImageView imgFoto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txtNama);
            txtHarga = (TextView) itemView.findViewById(R.id.txtHarga);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
        }
    }
}
