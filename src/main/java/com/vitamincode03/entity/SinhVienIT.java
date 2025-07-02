package com.vitamincode03.entity;

public final class SinhVienIT extends SinhVien{
    private String technical;

    public String getTechnical() {
        return technical;
    }

    public void setTechnical(String technical) {
        this.technical = technical;
    }
    @Override
    public void outputData(){
        super.outputData();
        System.out.println("Kỹ thuật = "+ this.technical);
        System.out.println("---------------------------------------------- ");
    }
}
