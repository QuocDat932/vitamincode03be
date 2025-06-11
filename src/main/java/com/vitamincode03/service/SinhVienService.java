package com.vitamincode03.service;

import com.vitamincode03.entity.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienService {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> listStudent = new ArrayList<>();
    public void inputListSinhVien(){
        do {
            SinhVien sv = inputDataSinhVien();
            listStudent.add(sv);
            System.out.print("Nhập tiếp hông (y/n) >> ");
            String answer = sc.nextLine();
            if (!answer.equals("y")) {
                break;
            }
        } while (true);
    }
    SinhVien inputDataSinhVien() {
// Cách 01
//        System.out.println("------ ");
//        System.out.print("Mã Sinh Viên = ");
//        String id = sc.nextLine();
//        System.out.print("Tên Sinh Viên = ");
//        String fullName = sc.nextLine();
//        System.out.print("Giới Tính = ");
//        String gender = sc.nextLine();
//        System.out.print("Chuyên Ngành = ");
//        String major = sc.nextLine();
//        System.out.println("------ ");
//        return new SinhVien(id, fullName, gender, major);
// Cách 02
            System.out.println("------ ");
            SinhVien sv = new SinhVien();
            System.out.print("Mã Sinh Viên = ");
            String id = sc.nextLine();
            sv.setId(id);
            System.out.print("Tên Sinh Viên = ");
            String fullName = sc.nextLine();
            sv.setFullName(fullName);
            System.out.print("Giới Tính = ");
            String gender = sc.nextLine();
            sv.setGender(gender);
            System.out.print("Chuyên Ngành = ");
            String major = sc.nextLine();
            sv.setMajor(major);
            System.out.println("------ ");
            return sv;
    }
    public void outputDataSinhVien() {
        listStudent.forEach(e ->{
            e.outputData();
        });
    }
}
