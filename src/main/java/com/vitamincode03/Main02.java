package com.vitamincode03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> listStudent = new ArrayList<>();
        do {
            System.out.println("------ ");
            SinhVien sv = new SinhVien();
            System.out.print("Tên Sinh Viên = ");
            sc.nextLine();
            sv.fullName = sc.nextLine();
            System.out.print("Giới Tính = ");
            sv.gender = sc.nextBoolean();
            sc.nextLine();
            System.out.print("Chuyên Ngành = ");
            sv.major = sc.nextLine();
            System.out.println("------ ");
            System.out.print("Nhập tiếp hông (y/n) >> ");
            String answer = sc.next();
            listStudent.add(sv);
            if (!answer.equals("y")) {
                break;
            }
        } while (true);

        listStudent.forEach(e ->{
            System.out.println("Tên Sinh Viên = "+ e.fullName);
            System.out.println("Giới Tính = "+ e.gender);
            System.out.println("Chuyên Ngành = "+ e.major);
            System.out.print("--------------------------- ");
        });
    }
}
