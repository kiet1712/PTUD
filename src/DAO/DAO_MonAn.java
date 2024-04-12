package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import connect.ConnectDB;
import entity.MonAn;

public class DAO_MonAn {
    // Lấy tất cả món ăn từ database
    public List<MonAn> getAllMonAn() {
        List<MonAn> dsMonAn = new ArrayList<>();
        Connection con = ConnectDB.getConnection();
        try (Statement stmt = con.createStatement()) {
            String sql = "SELECT * FROM MonAn";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String maMonAn = rs.getString("maMonAn");
                String tenMonAn = rs.getString("tenMonAn");
                String loaiMonAn = rs.getString("loaiMonAn");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                dsMonAn.add(new MonAn(maMonAn, tenMonAn, loaiMonAn, soLuong, gia));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsMonAn;
    }

    // Thêm món ăn mới vào database
    public boolean create(MonAn monAn) {
        Connection con = ConnectDB.getConnection();
        try (PreparedStatement stmt = con.prepareStatement("INSERT INTO MonAn(maMonAn, tenMonAn, loaiMonAn, soLuong, gia) VALUES(?, ?, ?, ?, ?)")) {
            stmt.setString(1, monAn.getMaMonAn());
            stmt.setString(2, monAn.getTenMonAn());
            stmt.setString(3, monAn.getLoaiMonAn());
            stmt.setInt(4, monAn.getSoLuong());
            stmt.setDouble(5, monAn.getGia());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Cập nhật thông tin món ăn trong database
    public boolean update(MonAn monAn) {
        Connection con = ConnectDB.getConnection();
        try (PreparedStatement stmt = con.prepareStatement("UPDATE MonAn SET tenMonAn=?, loaiMonAn=?, soLuong=?, gia=? WHERE maMonAn=?")) {
            stmt.setString(1, monAn.getTenMonAn());
            stmt.setString(2, monAn.getLoaiMonAn());
            stmt.setInt(3, monAn.getSoLuong());
            stmt.setDouble(4, monAn.getGia());
            stmt.setString(5, monAn.getMaMonAn());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Xóa món ăn khỏi database
    public boolean delete(String maMonAn) {
        Connection con = ConnectDB.getConnection();
        try (PreparedStatement stmt = con.prepareStatement("DELETE FROM MonAn WHERE maMonAn = ?")) {
            stmt.setString(1, maMonAn);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
