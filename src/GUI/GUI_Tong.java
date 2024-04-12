package GUI;

import javax.swing.*;
import events.evt_Tong;
import java.awt.*;


public class GUI_Tong extends JFrame {
    private static final GUI_Tong String = null;
	private static final GUI_Tong JOptionPane = null;
	private static final GUI_Tong JPanel = null;
	private static final GUI_Tong JMenu = null;
	private JPanel rightPanel;
    private JMenuBar leftPanel;
    private JMenu[] menus;

    // Sub-GUIs
    private GUI_QuanLyDonHang guiQuanLyDonHang = new GUI_QuanLyDonHang();
    private GUI_DatMon guiDatMon = new GUI_DatMon();
    private GUI_DanhSachDatBan guiDanhSachDatBan = new GUI_DanhSachDatBan();
    private GUI_QuanLyNhanSu guiQuanLyNhanSu = new GUI_QuanLyNhanSu();
    private GUI_QuanLiKhachHang guiQuanLiKhachHang = new GUI_QuanLiKhachHang();
    private GUI_QuanLyMenu guiQuanLyMenu = new GUI_QuanLyMenu();
    private GUI_ThongKeDoanhThu guiThongKeDoanhThu = new GUI_ThongKeDoanhThu();
	private GUI_Tong switchPanel;

    public GUI_Tong() {
        initializeGUI();
    }

    private void initializeGUI() {
        setTitle("Quản lý nhà hàng");
        setSize(1361, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        leftPanel = new JMenuBar();
        leftPanel.setBackground(SystemColor.inactiveCaption);
        leftPanel.setLayout(new GridLayout(9, 1));

        rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());

        // Create menus and assign events from evt_Tong class
        evt_Tong eventHandler = new evt_Tong(this);
        menus = new JMenu[] {
            eventHandler.createMenu("Quản lý đơn hàng", guiQuanLyDonHang),
            eventHandler.createMenu("Đặt món", guiDatMon),
            eventHandler.createMenu("Danh sách đặt bàn", guiDanhSachDatBan),
            eventHandler.createMenu("Quản lý nhân sự", guiQuanLyNhanSu),
            eventHandler.createMenu("Quản lý Khách Hàng", guiQuanLiKhachHang),
            eventHandler.createMenu("Quản lý Menu", guiQuanLyMenu),
            eventHandler.createMenu("Thống kê doanh thu", guiThongKeDoanhThu),
            eventHandler.createMenu("Đăng xuất", null), // Logout event will be handled separately
            eventHandler.createMenu("Thoát chương trình", null) // Exit event will be handled separately
        };

        // Add menus to leftPanel
        for (JMenu menu : menus) {
            leftPanel.add(menu);
        }

        getContentPane().add(leftPanel, BorderLayout.WEST);
        getContentPane().add(rightPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void switchPanel(JPanel panel) {
        rightPanel.removeAll();
        rightPanel.add(panel, BorderLayout.CENTER);
        rightPanel.revalidate();
        rightPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUI_Tong().setVisible(true));
    }
}
