package com.example.fullstack.myapplication.Presenter.KhuyenMai;


import com.example.fullstack.myapplication.Model.KhuyenMai.ModelKhuyenMai;
import com.example.fullstack.myapplication.Model.ObjectClass.KhuyenMai;
import com.example.fullstack.myapplication.View.TrangChu.ViewKhuyenMai;

import java.util.List;

/**
 * Created by Lenovo S410p on 9/13/2016.
 */
public class PresenterLogicKhuyenMai implements IPresenterKhuyenMai {

    ViewKhuyenMai viewKhuyenMai;
    ModelKhuyenMai modelKhuyenMai;

    public PresenterLogicKhuyenMai(ViewKhuyenMai viewKhuyenMai){
        this.viewKhuyenMai = viewKhuyenMai;
        modelKhuyenMai = new ModelKhuyenMai();
    }

    @Override
    public void LayDanhSachKhuyenMai() {
        List<KhuyenMai> khuyenMaiList = modelKhuyenMai.LayDanhSachSanPhamTheoMaLoai("LayDanhSachKhuyenMai","DANHSACHKHUYENMAI");
        if(khuyenMaiList.size() > 0){
            viewKhuyenMai.HienThiDanhSachKhuyenMai(khuyenMaiList);
        }
    }
}
