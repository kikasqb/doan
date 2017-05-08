package com.example.fullstack.myapplication.Presenter.ChiTietSanPham;

import android.content.Context;

import com.example.fullstack.myapplication.Model.ObjectClass.SanPham;


/**
 * Created by Lenovo S410p on 8/10/2016.
 */
public interface IPresenterChiTietSanPham {
    void LayChiTietSanPham(int masp);
    void LayDanhSachDanhGiaTheoCuaSanPham(int masp, int limit);
    void ThemGioHang(SanPham sanPham, Context context);
}
