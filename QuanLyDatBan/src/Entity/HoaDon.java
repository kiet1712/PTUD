package Entity;

import java.time.LocalDate;

public class HoaDon {
	private String mahoadon;
	private LocalDate ngaylaphoadon;
	private NhanVien nvlap;
	private KhachHang kh;
	private double tongtien;
	public double getTongtien() {
		return tongtien;
	}
	public void setTongtien(double tongtien) {
		this.tongtien = tongtien;
	}
	public KhachHang getKh() {
		return kh;
	}
	public void setKh(KhachHang kh) {
		this.kh = kh;
	}
	
	
	public HoaDon(String mahoadon, LocalDate ngaylaphoadon, NhanVien nvlap, KhachHang kh, double tongtien) {
		super();
		this.mahoadon = mahoadon;
		this.ngaylaphoadon = ngaylaphoadon;
		this.nvlap = nvlap;
		this.kh = kh;
		this.tongtien = tongtien;
	}
	public HoaDon(String mahoadon, LocalDate ngaylaphoadon, NhanVien nvlap, KhachHang kh) {
		super();
		this.mahoadon = mahoadon;
		this.ngaylaphoadon = ngaylaphoadon;
		this.nvlap = nvlap;
		this.kh = kh;
	}
	public HoaDon(String mahoadon, LocalDate ngaylaphoadon, NhanVien nvlap) {
		super();
		this.mahoadon = mahoadon;
		this.ngaylaphoadon = ngaylaphoadon;
		this.nvlap = nvlap;
	}
	public String getMahoadon() {
		return mahoadon;
	}
	public void setMahoadon(String mahoadon) {
		this.mahoadon = mahoadon;
	}
	public LocalDate getNgaylaphoadon() {
		return ngaylaphoadon;
	}
	public void setNgaylaphoadon(LocalDate ngaylaphoadon) {
		this.ngaylaphoadon = ngaylaphoadon;
	}
	public NhanVien getNvlap() {
		return nvlap;
	}
	public void setNvlap(NhanVien nvlap) {
		this.nvlap = nvlap;
	}
	
	
}
