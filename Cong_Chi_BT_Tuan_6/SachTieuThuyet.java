public class SachTieuThuyet  extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet() {
        super();
    }
    public SachTieuThuyet(String theLoai, boolean laSachSeries, String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    public String getTheLoai() {
        return theLoai;
    }
    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }
    public boolean isLaSachSeries() {
        return laSachSeries;
    }
    
    @Override
    public double GiaBan() {
        return this.getGiaCoBan() + (isLaSachSeries() ? 15000 : 0);
    }
    
    @Override
    public String toString() {
        return super.toString() + 
            "\nThe loai: " + theLoai +
            "\nLa sach series: " + (laSachSeries ? "co" : "khong") + 
            "\nGia ban: " + GiaBan();
    }
}
