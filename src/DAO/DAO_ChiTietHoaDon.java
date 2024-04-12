package DAO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.ChiTietHoaDon;
import entity.MonAn;

public class DAO_ChiTietHoaDon {
    
    public List<ChiTietHoaDon> getAllChiTietHoaDon(String maHD) {
        Connection con = ConnectDB.getInstance().getConnection();
        List<ChiTietHoaDon> dsCTHD = new ArrayList<>();
        String sql = "SELECT ct.MaMonAn, ct.TenMonAn, ct.SoLuong, ct.Gia, ct.ThanhTien "
                   + "FROM ChiTietHoaDon ct "
                   + "WHERE ct.MaHD = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, maHD);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
                
                chiTietHoaDon.setMaMonAn(rs.getString("MaMonAn"));
                chiTietHoaDon.setTenMonAn(rs.getString("TenMonAn"));
                chiTietHoaDon.setSoLuong(rs.getInt("SoLuong"));
                chiTietHoaDon.setGia(rs.getFloat("Gia"));
                chiTietHoaDon.setThanhTien(rs.getFloat("ThanhTien"));
                
                dsCTHD.add(chiTietHoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsCTHD;
    }
    
    public void create(ChiTietHoaDon cthd) {
        Connection con = ConnectDB.getInstance().getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO ChiTietHoaDon(MaMonAn, TenMonAn, SoLuong, Gia, ThanhTien) VALUES(?,?,?,?,?)");
            stmt.setString(1, cthd.getMaMonAn());
            stmt.setString(2, cthd.getTenMonAn());
            stmt.setInt(3, cthd.getSoLuong());
            stmt.setFloat(4, cthd.getGia());
            stmt.setBigDecimal(5, BigDecimal.valueOf(cthd.getThanhTien()));
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
