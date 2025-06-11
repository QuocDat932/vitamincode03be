package com.vitamincode03.entity;

public final class SinhVienDesign extends SinhVien {
    private String paint;

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    public SinhVienDesign(String id, String fullName, String gender, String major, String paint) {
        super.setId(id);
        super.setFullName(fullName);
        super.setGender(gender);
        super.setMajor(major);
        this.paint = paint;
    }

    @Override
    public void outputData(){
        super.outputData();
        System.out.println("Kỹ thuật vẽ = "+ this.paint);
        System.out.println("---------------------------------------------- ");
    }
}
