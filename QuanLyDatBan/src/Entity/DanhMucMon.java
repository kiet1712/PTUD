package Entity;

public class DanhMucMon {
	private String loaimon;
	private String mamon;
	
	
	
	
	public DanhMucMon(String mamon) {
		super();
		this.mamon = mamon;
	}


	public String getMamon() {
		return mamon;
	}


	public void setMamon(String mamon) {
		this.mamon = mamon;
	}


	public DanhMucMon(String loaimon, String mamon) {
		super();
		this.loaimon = loaimon;
		this.mamon = mamon;
	}


	public String getLoaimon() {
		return loaimon;
	}

	public void setLoaimon(String loaimon) {
		this.loaimon = loaimon;
	}
	
	
}
