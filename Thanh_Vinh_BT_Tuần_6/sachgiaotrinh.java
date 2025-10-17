/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sach;

/**
 *
 * @author ASUS
 */
public class sachgiaotrinh extends Sach {
    private String monHoc;
    private String capDo;

    public sachgiaotrinh(String maSach, String tenSach, String tacGia, double gia, int namXuatBan,
                         String monHoc, String capDo) {
        super(maSach, tenSach, tacGia, gia, namXuatBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Môn học: " + monHoc +
                ", Cấp độ: " + capDo;
    }
}

