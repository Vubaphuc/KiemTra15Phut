package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    static List<Employee> list = new ArrayList<>();
    public void nhap(Scanner sc){
        System.out.println("Nhập Tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập Revenue: ");
        double revenue = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập Lương: ");
        double salaryA = Double.parseDouble(sc.nextLine());
        double salary = 0;
        if (revenue < 4000){
            salary = salaryA + ((5*revenue)/100);
        }
        if (revenue > 4000){
            salary = salaryA + ((10*revenue)/100);
        }
        Seller seller = new Seller(name,revenue,salary);
        list.add(seller);
    }

    public void xuat(){
        if (list.size() == 0 ){
            System.out.println("Không có nhân viên nào");
        }
        if (list.size() != 0){
            for (int i = 0; i < list.size();i++) {
                System.out.println(list.get(i).toString());
            }
        }
    }
}
