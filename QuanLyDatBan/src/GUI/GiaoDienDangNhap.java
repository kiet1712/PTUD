package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JPasswordField;
import javax.swing.JList;

public class GiaoDienDangNhap extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDienDangNhap frame = new GiaoDienDangNhap();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GiaoDienDangNhap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Đăng Nhập");
		btnNewButton.setBackground(new Color(128, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(36, 197, 132, 37);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(163, 80, 239, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("ĐĂNG NHẬP");
		lblNewJgoodiesTitle.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewJgoodiesTitle.setBounds(169, 10, 143, 25);
		contentPane.add(lblNewJgoodiesTitle);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(163, 130, 239, 31);
		contentPane.add(passwordField);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Tên tài khoản:");
		lblNewJgoodiesLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewJgoodiesLabel.setBounds(36, 80, 88, 31);
		contentPane.add(lblNewJgoodiesLabel);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("Mật khẩu:");
		lblNewJgoodiesLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewJgoodiesLabel_1.setBounds(36, 130, 93, 31);
		contentPane.add(lblNewJgoodiesLabel_1);
		
		JButton btnThot = new JButton("Thoát");
		btnThot.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnThot.setBackground(new Color(128, 255, 255));
		btnThot.setBounds(270, 197, 132, 37);
		contentPane.add(btnThot);
	}
}
