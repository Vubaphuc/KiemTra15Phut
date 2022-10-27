import model.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();
        while (true){
            System.out.println("1. Thêm thông tin nhân viên");
            System.out.println("2. Hiển thị thông tin nhân viên");
            int menu = Integer.parseInt(sc.nextLine());
            if (menu == 0 || menu >2){
                break;
            }
            switch (menu){
                case 1:
                    service.nhap(sc);
                    break;
                case 2:
                    service.xuat();
                    break;
            }
        }
    }
}