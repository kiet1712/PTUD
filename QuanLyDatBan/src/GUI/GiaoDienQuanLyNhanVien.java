package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.List;
import java.awt.Choice;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaoDienQuanLyNhanVien extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDienQuanLyNhanVien frame = new GiaoDienQuanLyNhanVien();
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
	public GiaoDienQuanLyNhanVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1380, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("QUẢN LÝ NHÂN VIÊN");
		lblNewJgoodiesTitle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewJgoodiesTitle.setBounds(550, 10, 210, 25);
		contentPane.add(lblNewJgoodiesTitle);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Tìm kiếm:");
		lblNewJgoodiesLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewJgoodiesLabel.setBounds(924, 92, 75, 25);
		contentPane.add(lblNewJgoodiesLabel);
		
		textField = new JTextField();
		textField.setBounds(1009, 93, 234, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(1245, 92, 100, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("Mã NV:");
		lblNewJgoodiesLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewJgoodiesLabel_1.setBounds(924, 127, 61, 25);
		contentPane.add(lblNewJgoodiesLabel_1);
		
		JLabel lblNewJgoodiesLabel_2 = DefaultComponentFactory.getInstance().createLabel("Tên NV:");
		lblNewJgoodiesLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewJgoodiesLabel_2.setBounds(924, 162, 61, 25);
		contentPane.add(lblNewJgoodiesLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(1009, 127, 234, 25);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(1009, 162, 234, 25);
		contentPane.add(textField_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Nữ");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(1192, 195, 51, 25);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Nam");
		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		chckbxNewCheckBox_1.setBounds(1103, 195, 61, 25);
		contentPane.add(chckbxNewCheckBox_1);
		
		JLabel lblNewJgoodiesLabel_3 = DefaultComponentFactory.getInstance().createLabel("Giới tính:");
		lblNewJgoodiesLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewJgoodiesLabel_3.setBounds(924, 195, 61, 24);
		contentPane.add(lblNewJgoodiesLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(1009, 226, 234, 25);
		contentPane.add(textField_3);
		
		JLabel lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("SĐT:");
		lblNewJgoodiesTitle_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewJgoodiesTitle_1.setBounds(924, 225, 61, 25);
		contentPane.add(lblNewJgoodiesTitle_1);
		
		JButton btnThm = new JButton("Thêm");
		btnThm.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnThm.setBounds(924, 282, 91, 25);
		contentPane.add(btnThm);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnXa.setBounds(1038, 282, 91, 25);
		contentPane.add(btnXa);
		
		JButton btnNewButton_2_1 = new JButton("Sửa");
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2_1.setBounds(1152, 282, 91, 25);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2 = new JButton("Lưu");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.setBounds(1038, 317, 91, 25);
		contentPane.add(btnNewButton_2);
		
		table_1 = new JTable();
		table_1.setBounds(39, 127, 1, 1);
		contentPane.add(table_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 92, 850, 467);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.BOLD, 12));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"STT", "M\u00E3 NV", "T\u00EAn NV", "Gi\u1EDBi T\u00EDnh", "S\u1ED1 \u0110i\u1EC7n tho\u1EA1i"
			}
		));
	}
}
