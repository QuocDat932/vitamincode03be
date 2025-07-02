package com.vitamincode03.entity;

public final class SinhVienDesign extends SinhVien {
    private String paint;
    private double diemPhotoshop;
    private double diemThietKeAnh;

    public double getDiemPhotoshop() {
        return diemPhotoshop;
    }

    public void setDiemPhotoshop(double diemPhotoshop) {
        this.diemPhotoshop = diemPhotoshop;
    }

    public double getDiemThietKeAnh() {
        return diemThietKeAnh;
    }

    public void setDiemThietKeAnh(double diemThietKeAnh) {
        this.diemThietKeAnh = diemThietKeAnh;
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    public SinhVienDesign(){}

    public SinhVienDesign(String id, String fullName, String gender, String major, String paint, double diemPhotoshop, double diemThietKeAnh) {
        super(id, fullName, gender, major);
        this.paint = paint;
        this.setDiemPhotoshop(diemPhotoshop);
        this.setDiemThietKeAnh(diemThietKeAnh);
        this.tinhDTB();
    }

    @Override
    public void outputData(){
        super.outputData();
        System.out.println("Điểm Photoshop = "+ this.diemPhotoshop);
        System.out.println("Điểm Thiết kế ảnh = "+ this.diemThietKeAnh);
        System.out.println("Kỹ thuật vẽ = "+ this.paint);
        System.out.println("---------------------------------------------- ");
    }

    @Override
    public void tinhDTB(){
        super.setDTB((this.diemPhotoshop+this.diemThietKeAnh)/2);
    };
}
