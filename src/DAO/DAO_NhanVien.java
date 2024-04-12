package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.NhanVien;

public class DAO_NhanVien {
    // Lấy tất cả nhân viên từ cơ sở dữ liệu
    public List<NhanVien> getAllNV() {
        List<NhanVien> nv = new ArrayList<NhanVien>();
        Connection con = ConnectDB.getConnection();
        Statement stmt = null;
        try {
            String sql = "SELECT * FROM NhanVien";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String ma = rs.getString("maNV");
                String hoTen = rs.getString("tenNV");
                String namSinh = rs.getString("namSinh");
                String gioiTinh = rs.getString("gioiTinh");
                Date ngayVaoLam = rs.getDate("ngayVaolam");
                String sDT = rs.getString("sDT");
                
                nv.add(new NhanVien(ma, hoTen, namSinh, gioiTinh, ngayVaoLam, sDT));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nv;
    }

    // Thêm một nhân viên mới vào cơ sở dữ liệu
    public boolean create(NhanVien nv) {
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("INSERT INTO NhanVien VALUES(?,?,?,?,?,?)");
            stmt.setString(1, nv.getMaNV());
            stmt.setString(2, nv.getTenNV());
            stmt.setString(3, nv.getNamSinh());
            stmt.setString(4, nv.getGioiTinh());
            stmt.setDate(5, new Date(nv.getNgayVaolam().getTime()));
            stmt.setString(6, nv.getsDT());
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    public boolean delete(String maNV) {
        Connection con = ConnectDB.getConnection();
        if (con == null) {
            // Không thể kết nối đến cơ sở dữ liệu
            return false;
        }
        PreparedStatement stmt = null;
        try {
            // Xóa các bản ghi liên quan trong bảng TaiKhoan
            stmt = con.prepareStatement("DELETE FROM TaiKhoan WHERE MaNV = ?");
            stmt.setString(1, maNV);
            stmt.executeUpdate();

            // Xóa nhân viên từ bảng NhanVien
            stmt = con.prepareStatement("DELETE FROM NhanVien WHERE MaNV = ?");
            stmt.setString(1, maNV);
            int n = stmt.executeUpdate();
            return n > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    // Cập nhật thông tin của một nhân viên
    public boolean update(NhanVien nv) {
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("UPDATE NhanVien SET TenNV=?, NamSinh=?, GioiTinh=?, NgayVaoLam=?, Sdt=? WHERE MaNV=?");
            stmt.setString(1, nv.getTenNV());
            stmt.setString(2, nv.getNamSinh());
            stmt.setString(3, nv.getGioiTinh());
            stmt.setDate(4, new java.sql.Date(nv.getNgayVaolam().getTime()));
            stmt.setString(5, nv.getsDT());
            stmt.setString(6, nv.getMaNV());
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    
	}
    // Tìm kiếm nhân viên theo mã
    public NhanVien searchByMaNV(String maNV) {
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        NhanVien nv = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM NhanVien WHERE MaNV = ?");
            stmt.setString(1, maNV);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String ma = rs.getString("maNV");
                String hoTen = rs.getString("tenNV");
                String namSinh = rs.getString("namSinh");
                String gioiTinh = rs.getString("gioiTinh");
                Date ngayVaoLam = rs.getDate("ngayVaolam");
                String sDT = rs.getString("sDT");
                
                nv = new NhanVien(ma, hoTen, namSinh, gioiTinh, ngayVaoLam, sDT);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nv;
    }

    // Tìm kiếm nhân viên theo tên
    public List<NhanVien> searchByTenNV(String tenNV) {
        List<NhanVien> nvList = new ArrayList<NhanVien>();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM NhanVien WHERE TenNV LIKE ?");
            stmt.setString(1, "%" + tenNV + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String ma = rs.getString("maNV");
                String hoTen = rs.getString("tenNV");
                String namSinh = rs.getString("namSinh");
                String gioiTinh = rs.getString("gioiTinh");
                Date ngayVaoLam = rs.getDate("ngayVaolam");
                String sDT = rs.getString("sDT");
                
                nvList.add(new NhanVien(ma, hoTen, namSinh, gioiTinh, ngayVaoLam, sDT));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nvList;
    }}

	

