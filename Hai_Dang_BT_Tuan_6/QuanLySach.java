package Hai_Dang_BT_Tuan_5;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<sach> danhSach = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void nhapSach() {
        System.out.println("Nhap loai sach (1 - Giao trinh, 2 - Tieu thuyet): ");
        int loai = Integer.parseInt(sc.nextLine());

        System.out.print("Ma sach: ");
        String ma = sc.nextLine();
        System.out.print("Tieu de: ");
        String td = sc.nextLine();
        System.out.print("Tac gia ");
        String tg = sc.nextLine();
        System.out.print("Nam xuat ban: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.print("So luong: ");
        int sl = Integer.parseInt(sc.nextLine());

        if (loai == 1) {
            System.out.print("Mon hoc: ");
            String monHoc = sc.nextLine();
            System.out.print("Cap do: ");
            String capDo = sc.nextLine();
            danhSach.add(new Sachgiaotrinh(ma, td, tg, nam, sl, monHoc, capDo));
        } else if (loai == 2) {
            System.out.print("The loai: ");
            String theLoai = sc.nextLine();
            System.out.print("La sach series? (true/false): ");
            boolean series = Boolean.parseBoolean(sc.nextLine());
            danhSach.add(new Sachtieuthuyet(ma, td, tg, nam, sl, theLoai, series));
        } else {
            System.out.println("Loai sach khong hop le!");
        }
    }

    public void xuatDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            for (sach s : danhSach) {
                System.out.println(s);
            }
        }
    }

    public void timSach() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();
        for (sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                System.out.println("Tim thay: " + s);
                return;
            }
        }
        System.out.println("Khong tim thay sach!");
    }

    public void capNhatSach() {
        System.out.print("Nhap ma sach can nhap: ");
        String ma = sc.nextLine();
        for (sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                System.out.print("Nhap so luong moi: ");
                int sl = Integer.parseInt(sc.nextLine());
                s.setSoLuong(sl);
                System.out.println("Da cap nhat thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sach!");
    }

    public void xoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();
        boolean removed = danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(ma));
        if (removed) {
            System.out.println("Da xoa thanh cong!");
        } else {
            System.out.println("Khong tim thay danh sach de xoa!");
        }
    }
}
