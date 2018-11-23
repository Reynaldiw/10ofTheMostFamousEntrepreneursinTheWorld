package com.reynaldiwijaya.a10ofthemostfamousentrepreneursintheworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    String [] namaPengusaha, perusahaan,detailPengusaha;
    int [] gambarPengusaha;

    @BindView(R.id.myRecyclerView)
    RecyclerView myRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        namaPengusaha = getResources().getStringArray(R.array.namaPengusaha);
        perusahaan = getResources().getStringArray(R.array.perusahaan);
        gambarPengusaha = new int[]{R.drawable.donald,R.drawable.mark,R.drawable.richard,R.drawable.steve,R.drawable.anita,R.drawable.bill,R.drawable.chanel,R.drawable.sergey,R.drawable.larry,R.drawable.duncan};
        detailPengusaha = getResources().getStringArray(R.array.detailPengusaha);

        AdapterPengusaha adapterPengusaha = new AdapterPengusaha(this, namaPengusaha,perusahaan,detailPengusaha,gambarPengusaha);

        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myRecyclerView.setAdapter(adapterPengusaha);
    }
}
