package com.reynaldiwijaya.a10ofthemostfamousentrepreneursintheworld;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AdapterPengusaha extends RecyclerView.Adapter<AdapterPengusaha.ViewHolder> {

    Context context;
    String [] namaPengusaha, perusahaan,detailPengusaha;
    int [] gambarPengusaha;

    public AdapterPengusaha(Context context, String[] namaPengusaha, String[] perusahaan, String[] detailPengusaha, int[] gambarPengusaha) {
        this.context = context;
        this.namaPengusaha = namaPengusaha;
        this.perusahaan = perusahaan;
        this.detailPengusaha = detailPengusaha;
        this.gambarPengusaha = gambarPengusaha;
    }

    @NonNull
    @Override
    public AdapterPengusaha.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_pengusaha,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPengusaha.ViewHolder viewHolder, final int i) {
        viewHolder.namaPengusaha.setText(namaPengusaha[i]);
        viewHolder.perusahaan.setText(perusahaan[i]);
        Glide.with(context).load(gambarPengusaha[i]).into(viewHolder.gambarPengusaha);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context, DetailPengusaha.class);
                pindah.putExtra("np",namaPengusaha[i]);
                pindah.putExtra("p", perusahaan[i]);
                pindah.putExtra("dp",detailPengusaha[i]);
                pindah.putExtra("gp",gambarPengusaha[i]);
                context.startActivity(pindah);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gambarPengusaha.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namaPengusaha, perusahaan;
        ImageView gambarPengusaha;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaPengusaha = itemView.findViewById(R.id.txtNamaPengusaha);
            perusahaan = itemView.findViewById(R.id.txtPerusahaan);
            gambarPengusaha = itemView.findViewById(R.id.imgPhoto);
        }
    }
}
