package com.vitamincode03;

import com.vitamincode03.entity.SinhVien;
import com.vitamincode03.entity.SinhVienDesign;
import com.vitamincode03.entity.SinhVienIT;
import com.vitamincode03.service.SinhVienService;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        SinhVienService sinhVienService = new SinhVienService();
        sinhVienService.inputListSinhVien();
        sinhVienService.outputDataSinhVien();

//      Polymorphism
/*
//      SinhVienIT sinhVienIT = new SinhVienIT();
        // Mãng là tập hợp hữu hạn các phần tử có cùng kiểu dữ liệu
        SinhVienIT sinhVienIT = new SinhVienIT();
        SinhVienDesign sinhVienDesign = new SinhVienDesign();
        List<SinhVien> listSinhVien = new ArrayList<>();
        listSinhVien.add(sinhVienIT);
        listSinhVien.add(sinhVienDesign);
 */
    }
}
