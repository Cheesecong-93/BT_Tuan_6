package Hai_Dang_BT_Tuan_5;

public class Sachgiaotrinh extends sach {
    private String monHoc;
    private String capDo;

    public Sachgiaotrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public String toString() {
        return super.toString() + 
               ", Mon hoc: " + monHoc + 
               ", Cap do: " + capDo;
    }
}
