import java.util.Scanner;

public class QuanLySach {
    private int soLuongSach;
    private Sach[] danhSachSach;

    public QuanLySach() {}
    public QuanLySach(int soLuongSach) {
        this.soLuongSach = soLuongSach;
        this.danhSachSach = new Sach[soLuongSach];
    }

    public void setSoLuongSach(int soLuongSach) {
        this.soLuongSach = soLuongSach;
    }
    public int getSoLuongSach() {
        return soLuongSach;
    }

    public void Nhap() {
        @SuppressWarnings("resource") 
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < soLuongSach; i++) {
            System.out.println("\nNhap loai sach thu " + (i + 1) + " (G - Giao trinh, T - Tieu thuyet): ");
            char loai = sc.nextLine().toUpperCase().charAt(0);

            String maSach, tieuDe, tacGia;
            int namXuatBan, soLuong;
            double giaCoBan;

            System.out.print("Nhap ma sach: ");
            maSach = sc.nextLine();
            System.out.print("Nhap tieu de: ");
            tieuDe = sc.nextLine();
            System.out.print("Nhap tac gia: ");
            tacGia = sc.nextLine();
            System.out.print("Nhap nam xuat ban: ");
            namXuatBan = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap so luong: ");
            soLuong = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap gia co ban: ");
            giaCoBan = Double.parseDouble(sc.nextLine());

            switch (loai) {
                case 'G': {
                    System.out.print("Nhap mon hoc: ");
                    String monHoc = sc.nextLine();
                    System.out.print("Nhap cap do (VD: Dai hoc, Pho thong): ");
                    String capDo = sc.nextLine();

                    danhSachSach[i] = new SachGiaoTrinh(monHoc, capDo, maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
                    break;
                }
                case 'T': {
                    System.out.print("Nhap the loai: ");
                    String theLoai = sc.nextLine();
                    System.out.print("Sach thuoc series khong? (true/false): ");
                    boolean laSeries = Boolean.parseBoolean(sc.nextLine());

                    danhSachSach[i] = new SachTieuThuyet(theLoai, laSeries, maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
                    break;
                }
                default:
                    System.out.println("Loai sach khong hop le, vui long nhap lai!");
                    i--;
                    break;
            }
        }
    }

    public void Xuat() {
        System.out.println("\n===== DANH SACH SACH =====");
        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i] != null) {
                System.out.println(danhSachSach[i]);
                System.out.println("----------------------------");
            }
        }
    }

    public Sach timSachTheoMa(String maSach) {
        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i] != null &&
                danhSachSach[i].getMaSach().equalsIgnoreCase(maSach)) {
                return danhSachSach[i];
            }
        }
        return null;
    }

    public void xoaSach(String maSach) {
        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i] != null &&
                danhSachSach[i].getMaSach().equalsIgnoreCase(maSach)) {
                for (int j = i; j < soLuongSach - 1; j++) {
                    danhSachSach[j] = danhSachSach[j + 1];
                }
                danhSachSach[soLuongSach - 1] = null;
                soLuongSach--;
                System.out.println("Da xoa sach co ma: " + maSach);
                return;
            }
        }
        System.out.println("Khong tim thay sach can xoa!");
    }

    public void thongKeLoaiSach() {
        int demGiaoTrinh = 0, demTieuThuyet = 0;
        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i] instanceof SachGiaoTrinh)
                demGiaoTrinh++;
            else if (danhSachSach[i] instanceof SachTieuThuyet)
                demTieuThuyet++;
        }

        System.out.println("\nTHONG KE LOAI SACH:");
        System.out.println("Sach giao trinh: " + demGiaoTrinh);
        System.out.println("Sach tieu thuyet: " + demTieuThuyet);
    }
}
