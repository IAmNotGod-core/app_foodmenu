package com.iamnotgod.foodmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMenu;
    private ArrayList<Culinary> listMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMenu = findViewById(R.id.recMenu);
        initData();

        recMenu.setAdapter(new CulinaryAdapter(listMenu));
        recMenu.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        try {
            InputStream inputStream = getAssets().open("foods.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();

            String json;
            int length, price;
            String name, desc, img;

            json = new String(buffer, StandardCharsets.UTF_8);
            JSONArray jsonArray = new JSONArray(json);
            length = jsonArray.length();

            this.listMenu = new ArrayList<>();
            for (int i = 0; i < length; i++)
            {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                name = jsonObject.getString("name");
                desc = jsonObject.getString("desc");
                price = jsonObject.getInt("price");
                img = jsonObject.getString("img");
                listMenu.add(new Culinary(name, desc, price, img));
            }
        } catch (Exception e) {
            Log.e("", "load json : error " + e);
        }
    }
}