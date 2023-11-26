package com.iamnotgod.foodmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ItemDisplay extends AppCompatActivity {

    TextView nama, deskripsi, harga;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_display);

        img = (ImageView) findViewById(R.id.infoFoto);
        nama = (TextView) findViewById(R.id.infoNama);
        deskripsi = (TextView) findViewById(R.id.infoDeskripsi);
        harga = (TextView) findViewById(R.id.infoHarga);

        Picasso.get().load(getIntent().getStringExtra("img")).into(img);
        nama.setText(getIntent().getStringExtra("nama"));
        deskripsi.setText(getIntent().getStringExtra("deskripsi"));
        harga.setText(getIntent().getStringExtra("harga"));
    }
}