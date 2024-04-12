package entity;

import java.util.Objects;

public class KhachHang {
	private String maKH;
	private String hoTen;
	private String namSinh;
	private String sDT;
	private String gioiTinh;
	private String diaChi;
	
	
	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", sDT=" + sDT + ", gioiTinh="
				+ gioiTinh + ", diaChi=" + diaChi + "]";
	}
	public KhachHang(String maKH, String hoTen, String namSinh, String sDT, String gioiTinh, String diaChi) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.sDT = sDT;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	public KhachHang(String maKH) {
		super();
		this.maKH = maKH;
		
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}
	public String getsDT() {
		return sDT;
	}
	public void setsDT(String sDT) {
		this.sDT = sDT;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	@Override
	public int hashCode() {
		return Objects.hash(gioiTinh, hoTen, maKH, namSinh, sDT);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return Objects.equals(gioiTinh, other.gioiTinh) && Objects.equals(hoTen, other.hoTen)
				&& Objects.equals(maKH, other.maKH) && Objects.equals(namSinh, other.namSinh)
				&& Objects.equals(sDT, other.sDT);
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}	
