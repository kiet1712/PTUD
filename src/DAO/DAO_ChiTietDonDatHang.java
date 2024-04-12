package DAO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.ChiTietDonDatMon;
import entity.MonAn;
import entity.DonDatMon;

public class DAO_ChiTietDonDatHang {

	public List<ChiTietDonDatMon> getAllChiTietDonDatHang(String maDatTruoc) {
		Connection con = ConnectDB.getInstance().getConnection();
		List<ChiTietDonDatMon> dsCTDDH = new ArrayList<ChiTietDonDatMon>();
		String sql = "select ddh.MaDonHang, qa.MaMonAn, qa.TenMonAn, SoLuong,GiaBan,ThanhTien \r\n"
				+ "from ChiTietDatHangTruoc ctdh join MonAn qa on ctdh.MaMonAn = qa.MaMonAn\r\n"
				+ "ChiTietDatHangTruoc ctdh join DonDatHang ddh on ctdh.MaDonHang = ddh.MaDonHang"
				+ "where ct.MaDonHang = '"+maDatTruoc+"'";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				ChiTietDonDatMon chiTietHoaDon = new ChiTietDonDatMon();
				MonAn qa = new MonAn();
				
				qa.setMaMonAn(rs.getString("MaMonAn"));
				qa.setTenMonAn(rs.getString("TenMonAn"));
				chiTietHoaDon.setSoLuong(rs.getInt("SoLuong"));			
				chiTietHoaDon.setGiaBan(rs.getFloat("GiaBan"));
				chiTietHoaDon.setThanhTien(rs.getFloat("ThanhTien"));
				chiTietHoaDon.setMonAn(qa);
				dsCTDDH.add(chiTietHoaDon);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsCTDDH;
	}

	
	public void create(ChiTietDonDatMon ctddh) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n=0;
		System.out.println(ctddh);
		try {
			stmt = con.prepareStatement("insert into ChiTietPhieuDatHangTruoc values(?,?,?,?,?,?)");
			stmt.setString(1, ctddh.getMaDatMon().getMaDonHang());
			stmt.setString(2,ctddh.getMonAn().getMaMonAn());
			stmt.setString(3,ctddh.getMonAn().getTenMonAn());
			stmt.setInt(4, ctddh.getSoLuong());
			stmt.setDouble(5, ctddh.getGiaBan());
			stmt.setBigDecimal(6, BigDecimal.valueOf(ctddh.getThanhTien()));
			n= stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	public void createDetail(maDH, ngayMua, maNV, maKH, tongTien) {
//		Connection con = ConnectDB.getInstance().getConnection();
//		PreparedStatement stmt = null;
//		int n=0;
//		try {
//			stmt = con.prepareStatement("insert into ChiTietDatHangTruoc values(?,?,?,?,?,?)");
//			stmt.setString(1, ctddh.getMaDatHang().getMaDonHang());
//			stmt.setString(2,ctddh.getMonAn().getMaMonAn());
//			stmt.setString(3,ctddh.getMonAn().getTenMonAn());
//			stmt.setInt(4, ctddh.getSoLuong());
//			stmt.setDouble(5, ctddh.getGiaBan());
//			stmt.setBigDecimal(6, BigDecimal.valueOf(ctddh.getThanhTien()));
//			n= stmt.executeUpdate();
//		} catch (SQLException e) {
//			// TODO: handle exception
//		}
//	}

}
