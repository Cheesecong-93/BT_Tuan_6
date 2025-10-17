/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sach;

/**
 *
 * @author ASUS
 */
public class test {
    public static void main(String[] args) {
        QLsach ql = new QLsach();

        // Tạo sách giáo trình
        sachgiaotrinh s1 = new sachgiaotrinh("GT01", "Giáo trình Java", "Nguyễn Văn A", 85000, 2023, "Lập trình Java", "Đại học");

        // Tạo sách tiểu thuyết
        sachtieuthuyet s2 = new sachtieuthuyet("TT01", "Doraemon", "Fujiko F. Fujio", 120000, 2020, "Thiếu nhi", true);
        sachtieuthuyet s3 = new sachtieuthuyet("TT02", "Không gia đình", "Hector Malot", 90000, 2019, "Văn học", false);

        // Thêm vào danh sách
        ql.themSach(s1);
        ql.themSach(s2);
        ql.themSach(s3);

        System.out.println("=== Danh sách ban đầu ===");
        ql.hienThiDanhSach();

        // Tìm sách
        System.out.println("\n=== Tìm sách có mã TT01 ===");
        Sach tim = ql.timSach("TT01");
        System.out.println(tim != null ? tim : "Không tìm thấy!");

        // Cập nhật giá
        ql.capNhatGia("GT01", 95000);
        System.out.println("\n=== Sau khi cập nhật giá GT01 ===");
        ql.hienThiDanhSach();

        // Xóa sách
        ql.xoaSach("TT02");
        System.out.println("\n=== Sau khi xóa TT02 ===");
        ql.hienThiDanhSach();
    }

    private static class sach {

        public sach() {
        }
    }
}


