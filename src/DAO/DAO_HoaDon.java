package DAO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import connect.ConnectDB;
import entity.HoaDon;
import entity.KhachHang;
import entity.NhanVien;

public class DAO_HoaDon {
    private static final Logger LOGGER = Logger.getLogger(DAO_HoaDon.class.getName());

    public List<Map<String, Object>> getAllHoaDon() {
        List<Map<String, Object>> maps = new ArrayList<>();

        try (Connection con = ConnectDB.getInstance().getConnection();
                PreparedStatement stmt = con.prepareStatement("SELECT * " +
                        "FROM HoaDon hd " +
                        "JOIN KhachHang kh ON hd.MaKH = kh.MaKH " +
                        "JOIN NhanVien nv ON hd.MaNV = nv.MaNV")) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Map<String, Object> map = new HashMap<>(); // Tạo một Map mới trong mỗi vòng lặp

                HoaDon hd = new HoaDon(
                        rs.getString("MaHD"),
                        new KhachHang(rs.getString("maKH"), rs.getString("hoTen"), rs.getString("namSinh"),
                                rs.getString("sDT"), rs.getString("gioiTinh"), rs.getString("diaChi")),
                        rs.getString("SoDienThoai"),
                        new NhanVien(rs.getString("maNV"), rs.getString("tenNV"), rs.getString("namSinh"),
                                rs.getString("gioiTinh"), new Date(rs.getDate("ngayVaoLam").getTime()),
                                rs.getString("sDT")));
                map.put("hoaDon", hd);
                map.put("tongTien", rs.getFloat("TongTien"));

                maps.add(map);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error while getting all HoaDon", e);
        }
        return maps;
    }

    // Thêm hóa đơn vào cơ sở dữ liệu
    public boolean themHoaDon(Map<String, Object> hoaDonData) {
        String sql = "INSERT INTO HoaDon (MaHD, MaKH, SoDienThoai, MaNV, TongTien) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection con = ConnectDB.getInstance().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            HoaDon hoaDon = (HoaDon) hoaDonData.get("hoaDon");
            stmt.setString(1, hoaDon.getMaHoaDon());
            stmt.setString(2, hoaDon.getTenKhachHang().getMaKH());
            stmt.setString(3, hoaDon.getSoDienThoai());
            stmt.setString(4, hoaDon.getNhanVienLap().getMaNV());
            stmt.setFloat(5, (Float) hoaDonData.get("tongTien"));
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error while adding HoaDon", e);
            return false;
        }
    }

    // Sửa thông tin của hóa đơn trong cơ sở dữ liệu
    public boolean suaHoaDon(HoaDon hoaDon) {
        String sql = "UPDATE HoaDon SET MaKH = ?, SoDienThoai = ?, MaNV = ? WHERE MaHD = ?";
        try (Connection con = ConnectDB.getInstance().getConnection();
                PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, hoaDon.getTenKhachHang().getMaKH());
            stmt.setString(2, hoaDon.getSoDienThoai());
            stmt.setString(3, hoaDon.getNhanVienLap().getMaNV());
            stmt.setString(4, hoaDon.getMaHoaDon());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error while updating HoaDon", e);
            return false;
        }
    }

    // Xóa hóa đơn khỏi cơ sở dữ liệu
    public boolean xoaHoaDon(String maHD) {
        String sql = "DELETE FROM HoaDon WHERE MaHD = ?";
        try (Connection con = ConnectDB.getInstance().getConnection();
                PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, maHD);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error while deleting HoaDon", e);
            return false;
        }
    }

    // Kiểm tra xem mã hóa đơn có trùng lặp không
    public boolean kiemTraMaHoaDonTrung(String maHD) {
        String sql = "SELECT COUNT(*) AS count FROM HoaDon WHERE MaHD = ?";
        try (Connection con = ConnectDB.getInstance().getConnection();
                PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, maHD);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("count");
                return count > 0;
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error while checking duplicate HoaDon", e);
        }
        return false;
    }

    // Tìm kiếm hóa đơn theo mã hóa đơn
    public HoaDon timHoaDonTheoMa(String maHD) {
        String sql = "SELECT * FROM HoaDon WHERE MaHD = ?";
        try (Connection con = ConnectDB.getInstance().getConnection();
                PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, maHD);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                HoaDon hoaDon = new HoaDon(
                        rs.getString("MaHD"),
                        new KhachHang(rs.getString("maKH")), // Chú ý: cần cài đặt các hàm tạo cho KhachHang và NhanVien
                        rs.getString("SoDienThoai"),
                        new NhanVien(rs.getString("MaNV")),
                        rs.getFloat("TongTien"));
                return hoaDon;
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error while searching HoaDon by MaHD", e);
        }
        return null;
    }
}
