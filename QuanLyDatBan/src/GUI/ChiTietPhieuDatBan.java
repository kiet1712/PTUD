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

public class ChiTietPhieuDatBan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;
	private JTable table;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table_2;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChiTietPhieuDatBan frame = new ChiTietPhieuDatBan();
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
	public ChiTietPhieuDatBan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1380, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("CHI TIẾT PHIẾU ĐẶT BÀN");
		lblNewJgoodiesTitle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewJgoodiesTitle.setBounds(579, 10, 263, 25);
		contentPane.add(lblNewJgoodiesTitle);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Mã PĐB:");
		lblNewJgoodiesLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewJgoodiesLabel.setBounds(234, 92, 75, 25);
		contentPane.add(lblNewJgoodiesLabel);
		
		textField = new JTextField();
		textField.setBounds(319, 93, 234, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("Ngày Đặt:");
		lblNewJgoodiesLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewJgoodiesLabel_1.setBounds(234, 127, 75, 25);
		contentPane.add(lblNewJgoodiesLabel_1);
		
		JLabel lblNewJgoodiesLabel_2 = DefaultComponentFactory.getInstance().createLabel("Số Người:");
		lblNewJgoodiesLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewJgoodiesLabel_2.setBounds(709, 127, 75, 25);
		contentPane.add(lblNewJgoodiesLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(817, 93, 234, 25);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(319, 128, 234, 25);
		contentPane.add(textField_2);
		
		JLabel lblNewJgoodiesLabel_3 = DefaultComponentFactory.getInstance().createLabel("Mã NV:");
		lblNewJgoodiesLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewJgoodiesLabel_3.setBounds(709, 92, 89, 24);
		contentPane.add(lblNewJgoodiesLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(817, 128, 234, 25);
		contentPane.add(textField_3);
		
		JLabel lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("");
		lblNewJgoodiesTitle_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewJgoodiesTitle_1.setBounds(593, 145, 61, 25);
		contentPane.add(lblNewJgoodiesTitle_1);
		
		JButton btnThm = new JButton("Thêm");
		btnThm.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnThm.setBounds(234, 278, 91, 25);
		contentPane.add(btnThm);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnXa.setBounds(407, 278, 91, 25);
		contentPane.add(btnXa);
		
		JButton btnNewButton_2_1 = new JButton("Hủy");
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2_1.setBounds(777, 278, 91, 25);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2 = new JButton("Lưu");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.setBounds(960, 278, 91, 25);
		contentPane.add(btnNewButton_2);
		
		table_1 = new JTable();
		table_1.setBounds(39, 127, 1, 1);
		contentPane.add(table_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 367, 615, 346);
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
				"M\u00E3 P\u0110B", "M\u00E3 NV", "M\u00E3 KH", "S\u1ED1 Ng\u01B0\u1EDDi", "Ng\u00E0y \u0110\u1EB7t"
			}
		));
		
		JButton btnThm_1 = new JButton("Sửa");
		btnThm_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnThm_1.setBounds(579, 278, 91, 25);
		contentPane.add(btnThm_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(319, 163, 234, 25);
		contentPane.add(textField_4);
		
		JLabel lblNewJgoodiesLabel_4 = DefaultComponentFactory.getInstance().createLabel("Mã KH:");
		lblNewJgoodiesLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewJgoodiesLabel_4.setBounds(234, 162, 83, 26);
		contentPane.add(lblNewJgoodiesLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(817, 163, 234, 25);
		contentPane.add(textField_5);
		
		JLabel lblNewJgoodiesLabel_5 = DefaultComponentFactory.getInstance().createLabel("Tên KH:");
		lblNewJgoodiesLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewJgoodiesLabel_5.setBounds(709, 162, 83, 25);
		contentPane.add(lblNewJgoodiesLabel_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(319, 198, 234, 25);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(817, 198, 234, 25);
		contentPane.add(textField_7);
		
		JLabel lblNewJgoodiesTitle_2 = DefaultComponentFactory.getInstance().createTitle("Tên Món:");
		lblNewJgoodiesTitle_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewJgoodiesTitle_2.setBounds(234, 197, 83, 25);
		contentPane.add(lblNewJgoodiesTitle_2);
		
		JLabel lblNewJgoodiesLabel_6 = DefaultComponentFactory.getInstance().createLabel("Mã Món:");
		lblNewJgoodiesLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewJgoodiesLabel_6.setBounds(709, 197, 83, 26);
		contentPane.add(lblNewJgoodiesLabel_6);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(680, 367, 641, 346);
		contentPane.add(scrollPane_1);
		
		table_2 = new JTable();
		scrollPane_1.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"M\u00E3 M\u00F3n", "T\u00EAn M\u00F3n", "S\u1ED1 L\u01B0\u1EE3ng"
			}
		));
		
		textField_8 = new JTextField();
		textField_8.setBounds(319, 233, 234, 26);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewJgoodiesLabel_7 = DefaultComponentFactory.getInstance().createLabel("Số Lượng:");
		lblNewJgoodiesLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewJgoodiesLabel_7.setBounds(234, 233, 88, 27);
		contentPane.add(lblNewJgoodiesLabel_7);
	}
}
