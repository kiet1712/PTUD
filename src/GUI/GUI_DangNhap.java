package GUI;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import DAO.DAO_DangNhap;
import connect.ConnectDB;
import entity.KhachHang;
import entity.TaiKhoan;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import com.jgoodies.forms.factories.DefaultComponentFactory;

public class GUI_DangNhap extends JFrame {
    JPanel contentPane;
    Box b1,b2;
    public GUI_QuenMatKhau quenMatKhau;
    public GUI_DangKi dangKi;
    public static JTextField txtTaiKhoan;
    public JPasswordField txtMatKhau ;
    public GUI_DangNhap() {
        
        setTitle("NHÀ HÀNG KIỆT VÀ HÙNG");
        setBounds(100, 100, 990, 571);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        //ConnectDB
        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        JPanel PDangNhap = new JPanel();
        PDangNhap.setBackground(new Color(211, 211, 211));
        PDangNhap.setBounds(226, 115, 472, 300);	
        PDangNhap.setLayout(null);
        contentPane.add(PDangNhap);
        JLabel lbDangNhap = new JLabel("ĐĂNG NHẬP");
        lbDangNhap.setBounds(194, 38, 121, 45);
        lbDangNhap.setFont(new Font("Times New Roman", Font.BOLD, 16));
        PDangNhap.add(lbDangNhap);
    
        //Hình nền
        JLabel lbHinhNen = new JLabel();
        lbHinhNen.setBounds(0, 0, 1112, 534);
        contentPane.add(lbHinhNen);
    
        //Tên đăng nhập
        txtTaiKhoan= new JTextField(40);
        txtTaiKhoan.setFont(new Font("Times New Roman", Font.BOLD, 12));
        txtTaiKhoan.setBounds(141, 97, 320, 25);
        txtTaiKhoan.setBorder(null);
        txtTaiKhoan.setBackground(new Color(211, 211, 211));
        PDangNhap.add(txtTaiKhoan);
        
        //Đường kẻ 1
        Canvas canvas1 = new Canvas();
        canvas1.setBackground(new Color(130, 117, 123));
        canvas1.setBounds(30, 128, 410, 2);
        PDangNhap.add(canvas1);
        
        //Mật khẩu
        txtMatKhau= new JPasswordField(40);
        txtMatKhau.setBounds(141, 150, 299, 25);
        txtMatKhau.setBorder(null);
        txtMatKhau.setBackground(new Color(211, 211, 211));
        PDangNhap.add(txtMatKhau);
        txtMatKhau.setBorder(null);
        
        //Đường kẻ 2
        Canvas canvas2 = new Canvas();
        canvas2.setBackground(new Color(130, 117, 123));
        canvas2.setBounds(30, 178, 410, 2);
        PDangNhap.add(canvas2);
        
        //PlaceHolder Tên đăng nhập
        txtTaiKhoan.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(txtTaiKhoan.getText().equals("Tên đăng nhập")) {
                    txtTaiKhoan.setText("");
                    txtTaiKhoan.setForeground(new Color(153,153,153));
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(txtTaiKhoan.getText().equals("")) {
                    txtTaiKhoan.setText("Tên đăng nhập");
                    txtTaiKhoan.setForeground(new Color(130, 117, 123));
                    txtTaiKhoan.setFont(new Font("Serial", Font.ITALIC, 20));
                }
            }
        });
        
        //PlaceHolder Mật khẩu
        txtMatKhau.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(txtMatKhau.getText().equals("Mật khẩu")) {
                    txtMatKhau.setText("");
                    txtMatKhau.setForeground(new Color(153,153,153));
                    txtMatKhau.setEchoChar('*');
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(txtMatKhau.getText().length()==0) {
                    txtMatKhau.setEchoChar((char)0);
                    txtMatKhau.setText("Mật khẩu");
                    txtMatKhau.setForeground(new Color(130, 117, 123));
                    txtMatKhau.setFont(new Font("Serial", Font.ITALIC, 20));
                }
            }
        });
        
        //Quên mật khẩu
            
        JLabel lbQuenMatKhau = new JLabel("Quên mật khẩu ?");
        lbQuenMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lbQuenMatKhau.setForeground(new Color(255, 0, 128));
        lbQuenMatKhau.setBounds(30, 190, 95, 20);
        PDangNhap.add(lbQuenMatKhau);
        
        
        lbQuenMatKhau.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.blue);
                lbQuenMatKhau.setBorder(label_border);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Border label_border = BorderFactory.createMatteBorder(0, 0, 0,0,new Color(211, 211, 211));
                lbQuenMatKhau.setBorder(label_border);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                quenMatKhau = new GUI_QuenMatKhau();
                quenMatKhau.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                quenMatKhau.setVisible(true);
            }
            
        });
        
        
        JButton btnDangNhap = new JButton("Đăng nhập");
        btnDangNhap.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(validData()) {
                    DAO_DangNhap dao = new  DAO_DangNhap();
                    List<TaiKhoan> list = dao.dangNhap(txtTaiKhoan.getText(),txtMatKhau.getText());
                    if(!list.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                        GUI_Tong m = new GUI_Tong();
                        m.setVisible(true);
                        dispose();
                    }
                    else JOptionPane.showMessageDialog(null, "Sai tài khoản hoặc mật khẩu");
                }
            }
        });
        btnDangNhap.setForeground(new Color(0, 0, 0));
        btnDangNhap.setBackground(new Color(83, 83, 255));
        btnDangNhap.setIcon(new ImageIcon(GUI_DangNhap.class.getResource("/Image/icon_QuanLi.png")));
        btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnDangNhap.setBounds(0, 248, 219, 52);
        PDangNhap.add(btnDangNhap);
        
        //Nhân viên
        JButton btnDangKi = new JButton("Đăng kí");
        btnDangKi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dangKi = new GUI_DangKi();
                dangKi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                dangKi.setVisible(true);
            }
        });
        btnDangKi.setForeground(new Color(0, 0, 0));
        btnDangKi.setBackground(new Color(0, 255, 64));
        btnDangKi.setIcon(new ImageIcon(GUI_DangNhap.class.getResource("/Image/icon_NhanVien.png")));
        btnDangKi.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnDangKi.setBounds(234, 248, 238, 52);
        PDangNhap.add(btnDangKi);
        
        
//        txtTaiKhoan.setText("NV001");
//        txtMatKhau.setText("NV01");
        
        JLabel lblTenDangNhap = new JLabel("TÊN ĐĂNG NHẬP :");
        lblTenDangNhap.setFont(new Font("Times New Roman", Font.BOLD, 10));
        lblTenDangNhap.setBounds(36, 103, 95, 13);
        PDangNhap.add(lblTenDangNhap);
        
        JLabel lblMatKhau = new JLabel("MẬT KHẨU :");
        lblMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 10));
        lblMatKhau.setBounds(30, 156, 95, 13);
        PDangNhap.add(lblMatKhau);
        
        
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GUI_DangNhap dn = new GUI_DangNhap();
        dn.setVisible(true);
    }
    
    public boolean validData() {
        if(txtTaiKhoan.getText().equals("") && !txtMatKhau.getPassword().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập không được rỗng");
            return false;
        }else if(txtMatKhau.getPassword().equals("") && !txtTaiKhoan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được rỗng");
            return false;
        }else if(txtMatKhau.getPassword().equals("") && txtTaiKhoan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tài khoản và Mật khẩu không được rỗng");
            return false;
        }else return true;
        
    }
}
