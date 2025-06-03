package com.vitamincode03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Mãng động - ArrayList
//      ArrayList<Integer> arr3 = new ArrayList<Integer>();
        List<Integer> arr3 = new ArrayList<Integer>();
        do {
            System.out.print("Giá trị của phần tử = ");
            int numberVal = sc.nextInt();
            arr3.add(numberVal);
            System.out.print("Nhập tiếp hông (y/n) >> ");
            String answer = sc.next();
            if (!answer.equals("y")) {
                break;
            }
        } while (true);
        // foreach | lambda
        arr3.forEach((e) -> {
            System.out.println("arr >> "+e);
        });
    }
}