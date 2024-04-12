package entity;

import java.sql.Date;
import java.util.Objects;

public class HoaDon {
    private String maHoaDon;
    private String tenKhachHang;
    private String soDienThoai;
    private String nhanVienLap;
    private float tongTien;

    // Constructor
    public HoaDon(String maHoaDon, String tenKhachHang, String soDienThoai, String nhanVienLap, Date ngayThanhToan, float tongTien) {
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.nhanVienLap = nhanVienLap;
        this.tongTien = tongTien;
    }

    // Getters and Setters
    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNhanVienLap() {
        return nhanVienLap;
    }

    public void setNhanVienLap(String nhanVienLap) {
        this.nhanVienLap = nhanVienLap;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
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
                + ", nhanVienLap=" + nhanVienLap + ", tongTien=" + tongTien + "]";
    }
}
