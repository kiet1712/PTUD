package entity;

import java.util.Objects;

public class ChiTietDonDatMon {
	private DonDatMon maDatMon;
	private MonAn MonAn;
	private int soLuong;
	private float giaBan;
	private float thanhTien;
	public ChiTietDonDatMon(DonDatMon maDatMon, MonAn MonAn, int soLuong, float giaBan, float thanhTien) {
		super();
		this.maDatMon = maDatMon;
		this.MonAn = MonAn;
		this.soLuong = soLuong;
		this.giaBan = giaBan;
		this.thanhTien = thanhTien;
	}
	public DonDatMon getMaDatMon() {
		return maDatMon;
	}
	public void setMaDatMon(DonDatMon maDatMon) {
		this.maDatMon = maDatMon;
	}
	public MonAn getMonAn() {
		return MonAn;
	}
	public void setMonAn(MonAn MonAn) {
		this.MonAn = MonAn;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public float getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}
	public float getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(float thanhTien) {
		this.thanhTien = thanhTien;
	}
	@Override
	public int hashCode() {
		return Objects.hash(giaBan, maDatMon, MonAn, soLuong, thanhTien);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietDonDatMon other = (ChiTietDonDatMon) obj;
		return Float.floatToIntBits(giaBan) == Float.floatToIntBits(other.giaBan)
				&& Objects.equals(maDatMon, other.maDatMon) && Objects.equals(MonAn, other.MonAn)
				&& soLuong == other.soLuong && Float.floatToIntBits(thanhTien) == Float.floatToIntBits(other.thanhTien);
	}
	@Override
	public String toString() {
		return "ChiTietDonDatMon [maDatMon=" + maDatMon + ", MonAn=" + MonAn + ", soLuong=" + soLuong + ", giaBan="
				+ giaBan + ", thanhTien=" + thanhTien + "]";
	}
	public ChiTietDonDatMon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
