package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI_QuanLyMenu extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTenMonAn;
	private JTextField txtMaMonAn;
	private JTextField txtSoLuong;
	private JTextField txtGia;
	private JTable table;
	private JTextField txtTimKiem;

	/**
	 * Create the panel.
	 */
	public GUI_QuanLyMenu() {
		setLayout(null);
		
		JPanel pnlQuanLyMenu = new JPanel();
		pnlQuanLyMenu.setLayout(null);
		pnlQuanLyMenu.setBackground(SystemColor.inactiveCaption);
		pnlQuanLyMenu.setBounds(10, 105, 1316, 143);
		add(pnlQuanLyMenu);
		
		JLabel lblMaMonAn = new JLabel("Mã món ăn:");
		lblMaMonAn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMaMonAn.setBounds(10, 30, 118, 24);
		pnlQuanLyMenu.add(lblMaMonAn);
		
		txtTenMonAn = new JTextField();
		txtTenMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTenMonAn.setColumns(10);
		txtTenMonAn.setBounds(397, 30, 135, 24);
		pnlQuanLyMenu.add(txtTenMonAn);
		
		JLabel lblLoaiMon = new JLabel("Loại món:");
		lblLoaiMon.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblLoaiMon.setBounds(1048, 30, 98, 24);
		pnlQuanLyMenu.add(lblLoaiMon);
		
		JComboBox cboLoaiMonAn = new JComboBox();
		cboLoaiMonAn.setBounds(1144, 30, 135, 24);
		pnlQuanLyMenu.add(cboLoaiMonAn);
		
		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTimKiem.setBackground(Color.WHITE);
		btnTimKiem.setBounds(1028, 92, 108, 24);
		pnlQuanLyMenu.add(btnTimKiem);
		
		JButton btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.setBackground(new Color(255, 255, 255));
		btnLamMoi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnLamMoi.setBounds(799, 92, 98, 24);
		pnlQuanLyMenu.add(btnLamMoi);
		
		JLabel lblTenMonAn = new JLabel("Tên món ăn:");
		lblTenMonAn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTenMonAn.setBounds(284, 30, 122, 24);
		pnlQuanLyMenu.add(lblTenMonAn);
		
		txtMaMonAn = new JTextField();
		txtMaMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtMaMonAn.setColumns(10);
		txtMaMonAn.setBounds(121, 30, 135, 24);
		pnlQuanLyMenu.add(txtMaMonAn);
		
		JLabel lblSoLuong = new JLabel("Số lượng:");
		lblSoLuong.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSoLuong.setBounds(575, 30, 98, 24);
		pnlQuanLyMenu.add(lblSoLuong);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtSoLuong.setColumns(10);
		txtSoLuong.setBounds(660, 30, 135, 25);
		pnlQuanLyMenu.add(txtSoLuong);
		
		txtGia = new JTextField();
		txtGia.setColumns(10);
		txtGia.setBounds(893, 32, 135, 25);
		pnlQuanLyMenu.add(txtGia);
		
		JLabel lblGia = new JLabel("Giá bán:");
		lblGia.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblGia.setBounds(816, 32, 81, 24);
		pnlQuanLyMenu.add(lblGia);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnXoa.setBackground(Color.WHITE);
		btnXoa.setBounds(282, 92, 98, 24);
		pnlQuanLyMenu.add(btnXoa);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnThem.setBackground(Color.WHITE);
		btnThem.setBounds(46, 92, 98, 24);
		pnlQuanLyMenu.add(btnThem);
		
		JButton btnSua = new JButton("Sửa");
		btnSua.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSua.setBackground(new Color(255, 255, 255));
		btnSua.setBounds(533, 92, 98, 24);
		pnlQuanLyMenu.add(btnSua);
		
		txtTimKiem = new JTextField();
		txtTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTimKiem.setColumns(10);
		txtTimKiem.setBounds(1144, 92, 135, 24);
		pnlQuanLyMenu.add(txtTimKiem);
		
		JLabel lblQuanLyMenu = new JLabel("Quản lý Menu");
		lblQuanLyMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuanLyMenu.setForeground(Color.BLACK);
		lblQuanLyMenu.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblQuanLyMenu.setBounds(108, 36, 1154, 35);
		add(lblQuanLyMenu);
		
		JLabel lblDanhSachMenu = new JLabel("Danh sách Menu");
		lblDanhSachMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanhSachMenu.setForeground(Color.BLACK);
		lblDanhSachMenu.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblDanhSachMenu.setBounds(204, 258, 971, 24);
		add(lblDanhSachMenu);
		
		JPanel pnlDanhSachMenu = new JPanel();
		pnlDanhSachMenu.setLayout(null);
		pnlDanhSachMenu.setBackground(SystemColor.inactiveCaption);
		pnlDanhSachMenu.setBounds(10, 319, 1316, 352);
		add(pnlDanhSachMenu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 20, 1296, 311);
		pnlDanhSachMenu.add(scrollPane);
		
		
		
		
//		
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 m\u00F3n \u0103n", "T\u00EAn m\u00F3n \u0103n", "S\u1ED1 l\u01B0\u1EE3ng", "Gi\u00E1", "Lo\u1EA1i m\u00F3n"
			}
		));

	}
}
