package entity;

import java.util.Date;
import java.util.Objects;


public class DonDatMon {
	private String maDonHang;
	private Date ngayMua;
	private NhanVien NV;
	private KhachHang KH;
	private float tongTien;
	public DonDatMon(String maDonHang, Date ngayMua, NhanVien nV, KhachHang kH, float tongTien) {
		super();
		this.maDonHang = maDonHang;
		this.ngayMua = ngayMua;
		NV = nV;
		KH = kH;
		this.tongTien = tongTien;
	}
	
	public DonDatMon(String maDonHang) {
		super();
		this.maDonHang = maDonHang;
	}
	
	
	public String getMaDonHang() {
		return maDonHang;
	}
	public void setMaDonHang(String maDonHang) {
		this.maDonHang = maDonHang;
	}
	public Date getNgayMua() {
		return ngayMua;
	}
	public void setNgayMua(Date ngayMua) {
		this.ngayMua = ngayMua;
	}
	public NhanVien getNV() {
		return NV;
	}
	public void setNV(NhanVien nV) {
		NV = nV;
	}
	public KhachHang getKH() {
		return KH;
	}
	public void setKH(KhachHang kH) {
		KH = kH;
	}
	public float getTongTien() {
		return tongTien;
	}
	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}
	@Override
	public int hashCode() {
		return Objects.hash(KH, NV, maDonHang, ngayMua, tongTien);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonDatMon other = (DonDatMon) obj;
		return Objects.equals(KH, other.KH) && Objects.equals(NV, other.NV)
				&& Objects.equals(maDonHang, other.maDonHang) && Objects.equals(ngayMua, other.ngayMua)
				&& Float.floatToIntBits(tongTien) == Float.floatToIntBits(other.tongTien);
	}
	@Override
	public String toString() {
		return "DonDatHang [maDonHang=" + maDonHang + ", ngayMua=" + ngayMua + ", NV=" + NV + ", KH=" + KH
				+ ", tongTien=" + tongTien + "]";
	}
	public DonDatMon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
	
