package com.example.fullstack.myapplication.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.fullstack.myapplication.Model.ObjectClass.ThuongHieu;
import com.example.fullstack.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Lenovo S410p on 7/29/2016.
 */
public class AdapterThuongHieuLonDienTu extends RecyclerView.Adapter<AdapterThuongHieuLonDienTu.ViewHolderThuongHieuLon> {

    Context context;
    List<ThuongHieu> thuongHieus;

    public AdapterThuongHieuLonDienTu(Context context, List<ThuongHieu> thuongHieus){
        this.context = context;
        this.thuongHieus = thuongHieus;
    }

    public class ViewHolderThuongHieuLon extends RecyclerView.ViewHolder {
        ImageView imLogoThuongHieuLon;

        public ViewHolderThuongHieuLon(View itemView) {
            super(itemView);

            imLogoThuongHieuLon = (ImageView) itemView.findViewById(R.id.imLogoTopThuongHieuLon);

        }
    }

    @Override
    public ViewHolderThuongHieuLon onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout_recycler_topthuonghieulon_dientu,parent,false);

        ViewHolderThuongHieuLon viewHolderThuongHieuLon = new ViewHolderThuongHieuLon(view);
        return viewHolderThuongHieuLon;
    }

    @Override
    public void onBindViewHolder(ViewHolderThuongHieuLon holder, int position) {
        ThuongHieu thuongHieu = thuongHieus.get(position);

        Picasso.with(context).load(thuongHieu.getHINHTHUONGHIEU()).resize(180,90).centerInside().into(holder.imLogoThuongHieuLon);

    }

    @Override
    public int getItemCount() {
        return thuongHieus.size();
    }




}
