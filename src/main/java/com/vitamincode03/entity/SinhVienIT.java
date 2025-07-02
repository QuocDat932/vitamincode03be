package com.vitamincode03.entity;

public final class SinhVienIT extends SinhVien{
    private String technical;
    private double diemLTCB;
    private double diemLTNC;

    public double getDiemLTNC() {
        return diemLTNC;
    }

    public void setDiemLTNC(double diemLTNC) {
        this.diemLTNC = diemLTNC;
    }

    public double getDiemLTCB() {
        return diemLTCB;
    }

    public void setDiemLTCB(double diemLTCB) {
        this.diemLTCB = diemLTCB;
    }

    public String getTechnical() {
        return technical;
    }

    public SinhVienIT() {}
    public SinhVienIT(String id, String fullName, String gender, String major, String technical, double diemLTCB, double diemLTNC) {
        super(id, fullName, gender, major);
        this.technical = technical;
        this.diemLTCB = diemLTCB;
        this.diemLTNC = diemLTNC;
        this.tinhDTB();
    }

    public void setTechnical(String technical) {
        this.technical = technical;
    }
    @Override
    public void outputData(){
        super.outputData();
        System.out.println("Điểm Lập Trình Cơ Bản = "+ this.diemLTCB);
        System.out.println("Điểm Lập Trình Nâng Cao = "+ this.diemLTNC);
        System.out.println("Kỹ thuật = "+ this.technical);
        System.out.println("---------------------------------------------- ");
    };

    @Override
    public void tinhDTB(){
        super.setDTB((this.diemLTCB + this.diemLTNC*2)/3);
    };
}
