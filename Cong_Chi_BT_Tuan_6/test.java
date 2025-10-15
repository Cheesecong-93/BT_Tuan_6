
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach qlSach = null;

        int chon;
        do {
            System.out.println("\n====== MENU QUAN LY SACH ======");
            System.out.println("1. Nhap danh sach sach");
            System.out.println("2. Xuat danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("5. Thong ke so luong tung loai");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong sach: ");
                    int n = Integer.parseInt(sc.nextLine());
                    qlSach = new QuanLySach(n);
                    qlSach.Nhap();
                    break;

                case 2:
                    if (qlSach != null)
                        qlSach.Xuat();
                    else
                        System.out.println("Chua co danh sach sach!");
                    break;

                case 3:
                    if (qlSach != null) {
                        System.out.print("Nhap ma sach can tim: ");
                        String maTim = sc.nextLine();
                        Sach s = qlSach.timSachTheoMa(maTim);
                        if (s != null)
                            System.out.println("Da tim thay sach:\n" + s);
                        else
                            System.out.println("Khong tim thay sach co ma nay!");
                    } else {
                        System.out.println("Chua co danh sach sach!");
                    }
                    break;

                case 4:
                    if (qlSach != null) {
                        System.out.print("Nhap ma sach can xoa: ");
                        String maXoa = sc.nextLine();
                        qlSach.xoaSach(maXoa);
                    } else {
                        System.out.println("Chua co danh sach sach!");
                    }
                    break;

                case 5:
                    if (qlSach != null)
                        qlSach.thongKeLoaiSach();
                    else
                        System.out.println("Chua co danh sach sach!");
                    break;

                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }
}
