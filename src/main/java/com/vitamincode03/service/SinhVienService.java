package com.vitamincode03.service;

import com.vitamincode03.entity.SinhVien;
import com.vitamincode03.entity.SinhVienDesign;
import com.vitamincode03.entity.SinhVienIT;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienService {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> listStudent = new ArrayList<>();
    public void inputListSinhVien(){
        do {
            System.out.print("Chuyên Ngành IT/Desgin >> ");
            String major = sc.nextLine();
            SinhVien sv;
            if(major.equalsIgnoreCase("IT")){
                sv = inputDataSinhVienIT();
            } else{
                sv = inputDataSinhVienDesign();
            }
            listStudent.add(sv);
            System.out.print("Nhập tiếp hông (y/n) >> ");
            String answer = sc.nextLine();
            if (!answer.equals("y")) {
                break;
            }
        } while (true);
    }
    SinhVien inputDataSinhVienIT() {
            System.out.println("------ ");
            SinhVienIT sv = new SinhVienIT();
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
            System.out.print("Kỹ Thuật = ");
            String technical = sc.nextLine();
            sv.setTechnical(technical);
            System.out.println("------ ");
            return sv;
    }

    SinhVien inputDataSinhVienDesign() {
        System.out.println("------ ");
        System.out.print("Mã Sinh Viên = ");
        String id = sc.nextLine();
        System.out.print("Tên Sinh Viên = ");
        String fullName = sc.nextLine();
        System.out.print("Giới Tính = ");
        String gender = sc.nextLine();
        System.out.print("Chuyên Ngành = ");
        String major = sc.nextLine();
        System.out.print("kỹ thuật vẽ = ");
        String paint = sc.nextLine();
        System.out.println("------ ");
        return new SinhVienDesign(id, fullName, gender, major, paint);
    }
    public void outputDataSinhVien() {
        listStudent.forEach(e ->{
            e.outputData();
        });
    }
}
