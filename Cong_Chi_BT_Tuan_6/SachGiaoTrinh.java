public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;
    
    public SachGiaoTrinh() {
        super();
    }
    public SachGiaoTrinh(String monHoc, String capDo, String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
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
    public String toString() {
        return super.toString() + 
            "\nMon hoc: " + monHoc + 
            "\nCap do: " + capDo;
    }
}
