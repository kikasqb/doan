package com.example.fullstack.myapplication.View.ThanhToan;


import com.example.fullstack.myapplication.Model.ObjectClass.SanPham;

import java.util.List;

/**
 * Created by Lenovo S410p on 9/5/2016.
 */
public interface ViewThanhToan {
    void DatHangThanhCong();
    void DatHangThatBai();
    void LayDanhSachSanPhamTrongGioHang(List<SanPham> sanPhamList);
}
