package events;

import javax.swing.*;
import GUI.GUI_DangNhap;
import GUI.GUI_Tong;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class evt_Tong {
    private GUI_Tong guiTong;

    public evt_Tong(GUI_Tong gui) {
        this.guiTong = gui;
    }

    public JMenu createMenu(String title, JPanel panel) {
        JMenu menu = new JMenu(title);
        menu.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (panel != null) {
                    guiTong.switchPanel(panel);
                } else {
                    // Xử lý cho các sự kiện đặc biệt như đăng xuất hoặc thoát chương trình
                    handleSpecialEvents(title);
                }
            }
        });
        return menu;
    }

    private void handleSpecialEvents(String title) {
        switch (title) {
            case "Đăng xuất":
                int logoutResponse = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất không?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (logoutResponse == JOptionPane.YES_OPTION) {
                    // Đóng cửa sổ hiện tại
                    guiTong.dispose();
                    // Mở cửa sổ đăng nhập
                    new GUI_DangNhap().setVisible(true);
                }
                break;
            case "Thoát chương trình":
                int exitResponse = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình không?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (exitResponse == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
                break;
            default:
                break;
        }
    }
}
