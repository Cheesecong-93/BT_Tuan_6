/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sach;

/**
 *
 * @author ASUS
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private double gia;
    private int namXuatBan;

    public Sach(String maSach, String tenSach, String tacGia, double gia, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
        this.namXuatBan = namXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    @Override
    public String toString() {
        return "Mã sách: " + maSach + ", Tên sách: " + tenSach + ", Tác giả: " + tacGia +
                ", Giá: " + gia + ", Năm XB: " + namXuatBan;
    }
}
