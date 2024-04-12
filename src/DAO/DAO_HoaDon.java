package DAO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import connect.ConnectDB;
import entity.HoaDon;

public class DAO_HoaDon {
    private static final Logger LOGGER = Logger.getLogger(DAO_HoaDon.class.getName());

    public List<HoaDon> getAllHoaDon() {
        List<HoaDon> hoaDonList = new ArrayList<>();
        try (Connection con = ConnectDB.getInstance().getConnection();
             PreparedStatement stmt = con.prepareStatement("SELECT MaHD, TenKH, SoDienThoai, TenNV, TongTien " +
                     "FROM HoaDon hd " +
                     "JOIN KhachHang kh ON hd.MaKH = kh.MaKH " +
                     "JOIN NhanVien nv ON hd.MaNV = nv.MaNV")) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                HoaDon hd = new HoaDon(
                        rs.getString("MaHD"),
                        rs.getString("TenKH"),
                        rs.getString("SoDienThoai"),
                        rs.getString("TenNV"),
                        null, rs.getFloat("TongTien")
                );
                hoaDonList.add(hd);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error while getting all HoaDon", e);
        }
        return hoaDonList;
    }

    // Các phương thức khác như create và search sẽ được cập nhật tương tự dựa trên cấu trúc mới của HoaDon
}
