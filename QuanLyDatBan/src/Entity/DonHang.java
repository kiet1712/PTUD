package Entity;

import java.time.LocalDate;

public class DonHang {
	private String Ma;
	private LocalDate ngaytaodonhang;
	private int Soluong;
	private String ten;
	private double Tongtien;
	private double thanhtien;
	private KhachHang kh;
	
	
	public DonHang(String ma, LocalDate ngaytaodonhang, int soluong, String ten, double tongtien, double thanhtien,
			KhachHang kh) {
		super();
		Ma = ma;
		this.ngaytaodonhang = ngaytaodonhang;
		Soluong = soluong;
		this.ten = ten;
		Tongtien = tongtien;
		this.thanhtien = thanhtien;
		this.kh = kh;
	}
	public KhachHang getKh() {
		return kh;
	}
	public void setKh(KhachHang kh) {
		this.kh = kh;
	}
	public DonHang(String ma, LocalDate ngaytaodonhang, int soluong, String ten, double tongtien, double thanhtien) {
		super();
		Ma = ma;
		this.ngaytaodonhang = ngaytaodonhang;
		Soluong = soluong;
		this.ten = ten;
		Tongtien = tongtien;
		this.thanhtien = thanhtien;
	}
	public String getMa() {
		return Ma;
	}
	public void setMa(String ma) {
		Ma = ma;
	}
	public LocalDate getNgaytaodonhang() {
		return ngaytaodonhang;
	}
	public void setNgaytaodonhang(LocalDate ngaytaodonhang) {
		this.ngaytaodonhang = ngaytaodonhang;
	}
	public int getSoluong() {
		return Soluong;
	}
	public void setSoluong(int soluong) {
		Soluong = soluong;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getTongtien() {
		return Tongtien;
	}
	public void setTongtien(double tongtien) {
		Tongtien = tongtien;
	}
	public double getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(double thanhtien) {
		this.thanhtien = thanhtien;
	}
	
	
}

