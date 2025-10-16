public abstract class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;

    public Sach(){}
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan){
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }
    
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getMaSach() {
        return maSach;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
    public String getTieuDe() {
        return tieuDe;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public String getTacGia() {
        return tacGia;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public int getSoLuong() {
        return soLuong;
    }

    public double getGiaCoBan() {
        return giaCoBan;
    }
    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }

    @Override
    public String toString() {
        return "Ma sach: " + maSach +
            "\nTieu de: " + tieuDe +
            "\nTac gia: " + tacGia +
            "\nNam xuat ban: " + namXuatBan +
            "\nSo luong: " + soLuong + 
            "\nGia co ban: " + giaCoBan;
    }

    public abstract double GiaBan();
}