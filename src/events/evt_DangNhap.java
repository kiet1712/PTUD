package events;
import GUI.GUI_DangNhap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class evt_DangNhap implements ActionListener {
    private GUI_DangNhap guiDangNhap;

    public evt_DangNhap(GUI_DangNhap gui) {
        this.guiDangNhap = gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Xử lý sự kiện đăng nhập
        // ...
    }
}