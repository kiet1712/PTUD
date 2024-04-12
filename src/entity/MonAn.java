package entity;

public class MonAn {
	private String maMonAn;
	private String tenMonAn;
	private String loaiMonAn;
	private int soLuong;
	private double gia;
	
	public MonAn() {
		super();
	}

	public MonAn(String maMonAn) {
		this.maMonAn = maMonAn;
	}
	
	public MonAn(String maMonAn, String tenMonAn, String loaiMonAn, int soLuong, double gia) {
		super();
		this.maMonAn = maMonAn;
		this.tenMonAn = tenMonAn;
		this.loaiMonAn = loaiMonAn;
		this.soLuong = soLuong;
		this.gia = gia;
	}

	public MonAn(String maMonAn, String tenMonAn) {
		this.maMonAn = maMonAn;
		this.tenMonAn = tenMonAn;
	}

	@Override
	public String toString() {
		return "MonAn [maMonAn=" + maMonAn + ", tenMonAn=" + tenMonAn + ", loaiMonAn=" + loaiMonAn + ", soLuong=" + soLuong + ", gia=" + gia + "]";
	}

	public String getMaMonAn() {
		return maMonAn;
	}

	public void setMaMonAn(String maMonAn) {
		this.maMonAn = maMonAn;
	}

	public String getTenMonAn() {
		return tenMonAn;
	}

	public void setTenMonAn(String tenMonAn) {
		this.tenMonAn = tenMonAn;
	}

	public String getLoaiMonAn() {
		return loaiMonAn;
	}

	public void setLoaiMonAn(String loaiMonAn) {
		this.loaiMonAn = loaiMonAn;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}
}
