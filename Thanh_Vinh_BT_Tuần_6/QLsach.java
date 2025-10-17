/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sach;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class QLsach {
    private final ArrayList<Sach> danhSach;

    public QLsach() {
        danhSach = new ArrayList<>();
    }

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public boolean xoaSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.remove(s);
                return true;
            }
        }
        return false;
    }

    public boolean capNhatGia(String maSach, double giaMoi) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setGia(giaMoi);
                return true;
            }
        }
        return false;
    }

    public Sach timSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            for (Sach s : danhSach) {
                System.out.println(s.toString());
            }
        }
    }
}

