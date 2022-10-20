package com.iamnotgod.foodmenu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CulinaryAdapter extends RecyclerView.Adapter<CulinaryAdapter.ViewHolder> {

    private ArrayList<Culinary> listCulinary;
    private Context context;

    public CulinaryAdapter(ArrayList<Culinary> listCulinary) {
        this.listCulinary = listCulinary;
    }

    @NonNull
    @Override
    public CulinaryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
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

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ItemDisplay.class);
                intent.putExtra("img", culinary.getId_gambar());
                intent.putExtra("nama", culinary.getNama());
                intent.putExtra("deskripsi", culinary.getDeskripsi());
                intent.putExtra("harga", culinary.getHarga()+" Mora");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCulinary.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtNama, txtHarga;
        public ImageView imgFoto;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txtNama);
            txtHarga = (TextView) itemView.findViewById(R.id.txtHarga);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.mainLayout);
        }
    }
}
