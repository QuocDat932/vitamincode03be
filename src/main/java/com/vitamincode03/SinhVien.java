package com.vitamincode03;

public class SinhVien {
    String id;
    String fullName;
    String gender;
    String major;
    // OOP = Properties + Methods
    // Constructor():
    //  + Hàm tạo là hàm để khởi tạo ra 1 đối tượng
    //  + Tên hàm giống tên class
    SinhVien(){}
    SinhVien(String id, String fullName, String gender, String major) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.major = major;
    }
    void outputData(){
        System.out.println("---------------------------------------------- ");
        System.out.println("Id = "+ this.id);
        System.out.println("Tên Sinh Viên = "+ this.fullName);
        System.out.println("Giới Tính = "+ this.gender);
        System.out.println("Chuyên Ngành = "+ this.major);
        System.out.println("---------------------------------------------- ");
    }
}
