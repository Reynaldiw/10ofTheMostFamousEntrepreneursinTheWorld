package com.reynaldiwijaya.a10ofthemostfamousentrepreneursintheworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class DetailPengusaha extends AppCompatActivity {

    @BindView(R.id.imgPhoto)
    CircleImageView imgPhoto;
    @BindView(R.id.txtNamaPengusaha)
    TextView txtNamaPengusaha;
    @BindView(R.id.txtPerusahaan)
    TextView txtPerusahaan;
    @BindView(R.id.txtDetailPengusaha)
    TextView txtDetailPengusaha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pengusaha);
        ButterKnife.bind(this);

        txtNamaPengusaha.setText(getIntent().getStringExtra("np"));
        txtPerusahaan.setText(getIntent().getStringExtra("p"));
        txtDetailPengusaha.setText(getIntent().getStringExtra("dp"));
        Glide.with(this).load(getIntent().getIntExtra("gp", 0)).into(imgPhoto);



    }
}
