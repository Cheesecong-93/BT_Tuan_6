/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sach;

/**
 *
 * @author ASUS
 */
public class sachtieuthuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public sachtieuthuyet(String maSach, String tenSach, String tacGia, double gia, int namXuatBan,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tenSach, tacGia, gia, namXuatBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Thể loại: " + theLoai +
                ", Là series: " + (laSachSeries ? "Có" : "Không");
    }
}

