package com.iamnotgod.foodmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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
        this.listMenu = new ArrayList<>();
        listMenu.add(new Culinary("Adeptus' Temptation", "A complex, famous type of Liyue cuisine, in which specially selected ingredients are submerged and slowly bowled into soup stock.", 50000, R.drawable.item_adeptus_temptation));
        listMenu.add(new Culinary("Jade Parcels", "An exquisite-looking dish.", 30000, R.drawable.item_jade_parcels));
        listMenu.add(new Culinary("Golden Crab", "A crab dish cooked in the ancient ways.", 25000, R.drawable.item_golden_crab));
        listMenu.add(new Culinary("Butter Crab", "A grilled crab dish. ", 20000, R.drawable.item_butter_crab));
    }
}