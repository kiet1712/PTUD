package Entity;

public class NhanVien {
	private  String ma;
	private String ten;
	
	
	public NhanVien(String ma) {
		super();
		this.ma = ma;
	}
	public NhanVien(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	
}
