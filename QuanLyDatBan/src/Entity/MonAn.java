package Entity;
import java.time.LocalDate;

public class MonAn {
	private String Ma;
	private String Donvi;
	private String TenMon;
	private DanhMucMon dmm ;
	private double Dongia;
	
	public MonAn(String ma, String donvi, String TenMon, DanhMucMon dmm, double dongia) {
		super();
		Ma = ma;
		Donvi = donvi;
		TenMon = TenMon;
		this.dmm = dmm;
		Dongia = dongia;
	}
	public MonAn(String ma, String donvi, String TenMon, DanhMucMon dmt, double dongia) {
		super();
		Ma = ma;
		Donvi = donvi;
		TenMon = TenMon;
		this.dmm = dmm;
		Dongia = dongia;
	}
	public String getMa() {
		return Ma;
	}
	public void setMa(String ma) {
		Ma = ma;
	}
	public String getDonvi() {
		return Donvi;
	}
	public void setDonvi(String donvi) {
		Donvi = donvi;
	}
	public DanhMucMon getDmm() {
		return dmm;
	}
	public void setDmm(DanhMucMon dmt) {
		this.dmm = dmm;
	}
	public String getTenMon() {
		return TenMon;
	}
	public void setTenMon(String TenMon) {
		TenMon = TenMon;
	}
	public double getDongia() {
		return Dongia;
	}
	public void setDongia(double dongia) {
		Dongia = dongia;
	}
	@Override
	public String toString() {
		return "Mon [Ma=" + Ma + ", Donvi=" + Donvi + ", TenMon=" + TenMon + ", dmm=" + dmm + ", Dongia=" + Dongia + "]";
	}
	
	
	
	
}
