package com.example.fullstack.myapplication.View.TrangChu;


import com.example.fullstack.myapplication.Model.ObjectClass.DienTu;
import com.example.fullstack.myapplication.Model.ObjectClass.SanPham;
import com.example.fullstack.myapplication.Model.ObjectClass.ThuongHieu;

import java.util.List;

/**
 * Created by Lenovo S410p on 7/21/2016.
 */
public interface ViewDienTu {
    void HienThiDanhSach(List<DienTu> dienTus);
    void HienThiLogoThuongHieu(List<ThuongHieu> thuongHieus);
    void LoiLayDuLieu();
    void HienThiSanPhamMoiVe(List<SanPham> sanPhams);
}
