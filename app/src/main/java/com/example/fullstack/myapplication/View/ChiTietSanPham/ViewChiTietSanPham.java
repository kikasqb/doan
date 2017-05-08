package com.example.fullstack.myapplication.View.ChiTietSanPham;


import com.example.fullstack.myapplication.Model.ObjectClass.DanhGia;
import com.example.fullstack.myapplication.Model.ObjectClass.SanPham;

import java.util.List;

/**
 * Created by Lenovo S410p on 8/10/2016.
 */
public interface ViewChiTietSanPham {
    void HienChiTietSanPham(SanPham sanPham);
    void HienSliderSanPham(String[] linkhinhsanpham);
    void HienThiDanhGia(List<DanhGia> danhGiaList);
    void ThemGioHangThanhCong();
    void ThemGiohangThatBai();
}
