public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;
    
    public SachGiaoTrinh() {
        super();
    }
    public SachGiaoTrinh(String monHoc, String capDo, String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }
    public String getMonHoc() {
        return monHoc;
    }
    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }
    public String getCapDo() {
        return capDo;
    }

    @Override
    public double GiaBan() {
        return this.getGiaCoBan() + ((2025 - this.getNamXuatBan()) * 5000);
    }

    @Override
    public String toString() {
        return super.toString() + 
            "\nMon hoc: " + monHoc + 
            "\nCap do: " + capDo +
            "\nGia ban: " + GiaBan();
    }
}
