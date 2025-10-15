package Hai_Dang_BT_Tuan_5;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            QuanLySach ql = new QuanLySach();
            int chon;

            do {
                System.out.println("\n=== MENY QUAN LY SACH ===");
                System.out.println("1. Them sach");
                System.out.println("2. Hien thi danh sach");
                System.out.println("3. Tim kiem theo ma");
                System.out.println("4. Cap nhat so luong");
                System.out.println("5. Xoa sach");
                System.out.println("0. Thoat");
                System.out.print("Chon chuc nang: ");
                chon = Integer.parseInt(sc.nextLine());

                switch (chon) {
                    case 1 -> ql.nhapSach();
                    case 2 -> ql.xuatDanhSach();
                    case 3 -> ql.timSach();
                    case 4 -> ql.capNhatSach();
                    case 5 -> ql.xoaSach();
                    case 0 -> System.out.println("Ket thuc chuong trinh!");
                    default -> System.out.println("Lua chon khong hop le!");
                }
            } while (chon != 0);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
