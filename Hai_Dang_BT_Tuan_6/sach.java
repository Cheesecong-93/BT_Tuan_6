package Hai_Dang_BT_Tuan_5;

public class sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public sach() {
}
public sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
public String getMaSach() {
        return maSach;
    }
public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

public String getTieuDe() {
        return tieuDe;
    }

public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

public String getTacGia() {
        return tacGia;
    }

public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

public int getNamXuatBan() {
        return namXuatBan;
    }

public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

public int getSoLuong() {
        return soLuong;
    }

public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
public void hienThiThongTin() {
        System.out.println("ma sach: " + maSach);
        System.out.println("tieu de: " + tieuDe);
        System.out.println("tac gia: " + tacGia);
        System.out.println("nam xuat ban: " + namXuatBan);
        System.out.println("so luong: " + soLuong);
        System.out.println("------------------------");
    }
}
