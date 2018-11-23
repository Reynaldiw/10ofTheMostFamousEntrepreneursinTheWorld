package com.reynaldiwijaya.a10ofthemostfamousentrepreneursintheworld;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    android.support.v7.widget.Toolbar myToolbar = findViewById(R.id.my_toolbar);
    setSupportActionBar(myToolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    Intent pindah;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.profile:
                pindah = new Intent(this,Profile.class);
                startActivity(pindah);
                break;
            case R.id.about:
                pindah = new Intent(this, About.class);
                startActivity(pindah);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void btnMulai(View view) {
        Intent pindah1 = new Intent(this, RecycleActivity.class);
        startActivity(pindah1);
    }
}
