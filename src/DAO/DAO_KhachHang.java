package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.KhachHang;

import entity.MonAn;

public class DAO_KhachHang {
	List<KhachHang> dsKhachHang = new ArrayList<>();
	public List<KhachHang> getAllKhachHang() {
		List<KhachHang> khachHang = new ArrayList<>();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		Statement stmt1= null;
		try {
			String sql= "Select * from KhachHang";
			stmt1= con.createStatement();
			ResultSet rs= stmt1.executeQuery(sql);
			while(rs.next()) {
				khachHang.add(new KhachHang(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return khachHang;
	}
	public boolean themKH(KhachHang kh) {	
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt =null;
		int n=0;
		try {
			stmt = con.prepareStatement("insert into KhachHang values(?,?,?,?,?,?)");
			stmt.setString(1, kh.getMaKH());
			stmt.setString(2, kh.getHoTen());
			stmt.setString(3, kh.getNamSinh());
			stmt.setString(4, kh.getsDT());
			stmt.setString(5, kh.getGioiTinh());
			stmt.setString(6, kh.getDiaChi());
			n = stmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n>0;
	}
	
	public boolean delete (String MaKH) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("delete from KhachHang where MaKH = ?");
			stmt.setString(1, MaKH);
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return n >0;
	}
	
	public boolean update( KhachHang kh) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt2= null;
		int n = 0;
		
			try {
				stmt2 = con.prepareStatement("update KhachHang set MaKH=?, TenKH=?, NamSinh=?, SoDienThoai=?, GioiTinh=?, DiaChi=? where MaKH=?");
				stmt2.setString(1, kh.getMaKH());
				stmt2.setString(2, kh.getHoTen());
				stmt2.setString(3, kh.getNamSinh());
				stmt2.setString(4, kh.getsDT());
				stmt2.setString(5, kh.getGioiTinh());
				stmt2.setString(6, kh.getDiaChi());
				stmt2.setString(7, kh.getMaKH());
				n = stmt2.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
	return n>0;
	}
	
	public ArrayList<KhachHang> timTheoSoDienThoai(String sdt) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from KhachHang where SoDienThoai like ?";
			stmt= con.prepareStatement(sql);
			stmt.setString(1,"%"+sdt+"%");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maKH= rs.getString(1);
				String tenKH= rs.getString(2);
				String namSinh = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String gioiTinh = rs.getString(5);
				String diaChi = rs.getString(6);
				
				dsKhachHang.add(new KhachHang(maKH,tenKH,namSinh,soDienThoai,gioiTinh,diaChi));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<KhachHang>) dsKhachHang;
	}
	
	public ArrayList<KhachHang> timTheoTen(String ten) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from KhachHang where TenKH like ?";
			stmt= con.prepareStatement(sql);
			stmt.setString(1,"%"+ten+"%");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maKhachHang= rs.getString(1);
				String tenKhachHang= rs.getString(2);
				String namSinh = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String gioiTinh = rs.getString(5);
				String diaChi = rs.getString(6);
				dsKhachHang.add(new KhachHang(maKhachHang,tenKhachHang,namSinh, soDienThoai, gioiTinh, diaChi));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<KhachHang>) dsKhachHang;
	}
	
	public ArrayList<KhachHang> timTheoMa(String ma) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from KhachHang where MaKH like ?";
			stmt= con.prepareStatement(sql);
			stmt.setString(1,ma);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maKhachHang= rs.getString(1);
				String tenKhachHang= rs.getString(2);
				String namSinh = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String gioiTinh = rs.getString(5);
				String diaChi = rs.getString(6);
				dsKhachHang.add(new KhachHang(maKhachHang,tenKhachHang,namSinh, soDienThoai, gioiTinh, diaChi));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<KhachHang>) dsKhachHang;
	}
	
	public ArrayList<KhachHang> timTheoGioiTinh(String gioitinh) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		try {
			String sql = "select * from KhachHang where GioiTinh like ?";
			stmt= con.prepareStatement(sql);
			stmt.setString(1,"%"+gioitinh);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maKhachHang= rs.getString(1);
				String tenKhachHang= rs.getString(2);
				String namSinh = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String gioiTinh = rs.getString(5);
				String diaChi = rs.getString(6);
				dsKhachHang.add(new KhachHang(maKhachHang,tenKhachHang,namSinh, soDienThoai, gioiTinh, diaChi));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return (ArrayList<KhachHang>) dsKhachHang;
		}
	
	public ArrayList<KhachHang> timTheoTenvaGioiTinh(String ten, String gioitinh) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from KhachHang where TenKH like ? and GioiTinh like ?";
			stmt= con.prepareStatement(sql);
			stmt.setNString(1,"%"+ten);
			stmt.setNString(2,gioitinh);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maKhachHang= rs.getString(1);
				String tenKhachHang= rs.getString(2);
				String namSinh = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String gioiTinh = rs.getString(5);
				String diaChi = rs.getString(6);
				dsKhachHang.add(new KhachHang(maKhachHang,tenKhachHang,namSinh, soDienThoai, gioiTinh, diaChi));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<KhachHang>) dsKhachHang;
	}
	
	public ArrayList<KhachHang> timTheoTenvaMa(String ten, String ma) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from KhachHang where TenKH like ? and MaKH like ?";
			stmt= con.prepareStatement(sql);
			stmt.setNString(1,"%"+ten);
			stmt.setNString(2,ma);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maKhachHang= rs.getString(1);
				String tenKhachHang= rs.getString(2);
				String namSinh = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String gioiTinh = rs.getString(5);
				String diaChi = rs.getString(6);
				dsKhachHang.add(new KhachHang(maKhachHang,tenKhachHang,namSinh, soDienThoai, gioiTinh, diaChi));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<KhachHang>) dsKhachHang;
	}
	
	public ArrayList<KhachHang> timTheoTenvaSDT(String ten, String sdt) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from KhachHang where TenKH like ? and SoDienThoai like ?";
			stmt= con.prepareStatement(sql);
			stmt.setNString(1,"%"+ten+"%");
			stmt.setNString(2,"%"+sdt+"%");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maKhachHang= rs.getString(1);
				String tenKhachHang= rs.getString(2);
				String namSinh = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String gioiTinh = rs.getString(5);
				String diaChi = rs.getString(6);
				dsKhachHang.add(new KhachHang(maKhachHang,tenKhachHang,namSinh, soDienThoai, gioiTinh, diaChi));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<KhachHang>) dsKhachHang;
	}
	
	public ArrayList<KhachHang> timTheogioivaMa(String gioitinh, String ma) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from KhachHang where GioiTinh like ? and MaKH like ?";
			stmt= con.prepareStatement(sql);
			stmt.setNString(1,gioitinh);
			stmt.setNString(2,ma);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maKhachHang= rs.getString(1);
				String tenKhachHang= rs.getString(2);
				String namSinh = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String gioiTinh = rs.getString(5);
				String diaChi = rs.getString(6);
				dsKhachHang.add(new KhachHang(maKhachHang,tenKhachHang,namSinh, soDienThoai, gioiTinh, diaChi));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<KhachHang>) dsKhachHang;
	}
	public ArrayList<KhachHang> timTheoSDTvaMa(String sdt, String ma) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from KhachHang where SoDienThoai like ? and MaKH like ?";
			stmt= con.prepareStatement(sql);
			stmt.setNString(1,"%"+sdt);
			stmt.setNString(2,ma);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maKhachHang= rs.getString(1);
				String tenKhachHang= rs.getString(2);
				String namSinh = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String gioiTinh = rs.getString(5);
				String diaChi = rs.getString(6);
				dsKhachHang.add(new KhachHang(maKhachHang,tenKhachHang,namSinh, soDienThoai, gioiTinh, diaChi));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<KhachHang>) dsKhachHang;
	}
	
	public ArrayList<KhachHang> timTheoSDTvaGioiTinh(String sdt, String gioitinh) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from KhachHang where SoDienThoai like ? and GioiTinh like ?";
			stmt= con.prepareStatement(sql);
			stmt.setNString(1,"%"+sdt);
			stmt.setNString(2,gioitinh);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maKhachHang= rs.getString(1);
				String tenKhachHang= rs.getString(2);
				String namSinh = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String gioiTinh = rs.getString(5);
				String diaChi = rs.getString(6);
				dsKhachHang.add(new KhachHang(maKhachHang,tenKhachHang,namSinh, soDienThoai, gioiTinh, diaChi));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<KhachHang>) dsKhachHang;
	}
	
	public ArrayList<KhachHang> timTheoTenvaGioiTinhvaMa(String ten,String gioitinh,String ma) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from KhachHang where TenKH like ? and GioiTinh like ? and MaKH like ?";
			stmt= con.prepareStatement(sql);
			stmt.setNString(1,ten);
			stmt.setNString(2,gioitinh);
			stmt.setNString(3,ma);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maKhachHang= rs.getString(1);
				String tenKhachHang= rs.getString(2);
				String namSinh = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String gioiTinh = rs.getString(5);
				String diaChi = rs.getString(6);
				dsKhachHang.add(new KhachHang(maKhachHang,tenKhachHang,namSinh, soDienThoai, gioiTinh, diaChi));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<KhachHang>) dsKhachHang;
	}
	
	public ArrayList<KhachHang> timTheoTenvaSDTvaMa(String ten,String sdt,String ma) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from KhachHang where TenKH like ? and SoDienThoai like ? and MaKH like ?";
			stmt= con.prepareStatement(sql);
			stmt.setNString(1,ten);
			stmt.setNString(2,sdt);
			stmt.setNString(3,ma);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maKhachHang= rs.getString(1);
				String tenKhachHang= rs.getString(2);
				String namSinh = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String gioiTinh = rs.getString(5);
				String diaChi = rs.getString(6);
				dsKhachHang.add(new KhachHang(maKhachHang,tenKhachHang,namSinh, soDienThoai, gioiTinh, diaChi));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<KhachHang>) dsKhachHang;
	}
	
	public ArrayList<KhachHang> timTheoSDTvaMavaGioiTinh(String sdt,String ma,String gioitinh) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from KhachHang where SoDienThoai like ? and MaKH like ? and GioiTinh like ?";
			stmt= con.prepareStatement(sql);
			stmt.setNString(1,sdt);
			stmt.setNString(2,ma);
			stmt.setNString(3,gioitinh);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maKhachHang= rs.getString(1);
				String tenKhachHang= rs.getString(2);
				String namSinh = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String gioiTinh = rs.getString(5);
				String diaChi = rs.getString(6);
				dsKhachHang.add(new KhachHang(maKhachHang,tenKhachHang,namSinh, soDienThoai, gioiTinh, diaChi));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<KhachHang>) dsKhachHang;
	}
	public ArrayList<KhachHang> timTheoTenvaGioiTinhvaMavaSDT(String ten,String gioitinh,String ma,String sdt) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		
		try {
			String sql = "select * from KhachHang where TenKH like ? and GioiTinh like ? and MaKH like ? and SoDienThoai like ?";
			stmt= con.prepareStatement(sql);
			stmt.setNString(1,ten);
			stmt.setNString(2,gioitinh);
			stmt.setNString(3,ma);
			stmt.setNString(4, sdt);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String maKhachHang= rs.getString(1);
				String tenKhachHang= rs.getString(2);
				String namSinh = rs.getString(3);
				String soDienThoai = rs.getString(4);
				String gioiTinh = rs.getString(5);
				String diaChi = rs.getString(6);
				dsKhachHang.add(new KhachHang(maKhachHang,tenKhachHang,namSinh, soDienThoai, gioiTinh, diaChi));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	return (ArrayList<KhachHang>) dsKhachHang;
	}
}

	


