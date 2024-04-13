package entity;

import java.util.Objects;

public class HoaDon {
    private String maHoaDon;
    private KhachHang tenKhachHang;
    private String soDienThoai;
    private NhanVien nhanVienLap;

    // Constructor
    public HoaDon(String maHoaDon, KhachHang tenKhachHang, String soDienThoai, NhanVien nhanVienLap) {
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.nhanVienLap = nhanVienLap;
    }

    // Getters and Setters
    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public KhachHang getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(KhachHang tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public NhanVien getNhanVienLap() {
        return nhanVienLap;
    }

    public void setNhanVienLap(NhanVien nhanVienLap) {
        this.nhanVienLap = nhanVienLap;
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(maHoaDon, tenKhachHang, soDienThoai, nhanVienLap);
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HoaDon other = (HoaDon) obj;
        return Objects.equals(maHoaDon, other.maHoaDon) && Objects.equals(tenKhachHang, other.tenKhachHang)
                && Objects.equals(soDienThoai, other.soDienThoai) && Objects.equals(nhanVienLap, other.nhanVienLap);
    }

    // toString method
    @Override
    public String toString() {
        return "HoaDon [maHoaDon=" + maHoaDon + ", tenKhachHang=" + tenKhachHang + ", soDienThoai=" + soDienThoai
                + ", nhanVienLap=" + nhanVienLap;
    }
}
