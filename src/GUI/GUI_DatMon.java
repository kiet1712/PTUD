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
import javax.swing.JSpinner;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_DatMon extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTenMonAn;
	private JTextField txtMaMonAn;
	private JTable tblMonAn;
	private JTable tblSanPhamDaChon;
	private JTextField txtTongTien;

	/**
	 * Create the panel.
	 */
	public GUI_DatMon() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setLayout(null);
		
		JPanel pnlTimKiemMonAn = new JPanel();
		pnlTimKiemMonAn.setLayout(null);
		pnlTimKiemMonAn.setBackground(SystemColor.inactiveCaption);
		pnlTimKiemMonAn.setBounds(38, 47, 621, 150);
		add(pnlTimKiemMonAn);
		
		JLabel lblMaMonAn = new JLabel("Mã món ăn:");
		lblMaMonAn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMaMonAn.setBounds(9, 11, 118, 24);
		pnlTimKiemMonAn.add(lblMaMonAn);
		
		txtTenMonAn = new JTextField();
		txtTenMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTenMonAn.setColumns(10);
		txtTenMonAn.setBounds(127, 40, 135, 24);
		pnlTimKiemMonAn.add(txtTenMonAn);
		
		JLabel lblLoaiMonAn = new JLabel("Loại món:");
		lblLoaiMonAn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblLoaiMonAn.setBounds(346, 11, 98, 24);
		pnlTimKiemMonAn.add(lblLoaiMonAn);
		
		JComboBox cboLoaiMonAn = new JComboBox();
		cboLoaiMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cboLoaiMonAn.setBounds(482, 11, 124, 24);
		pnlTimKiemMonAn.add(cboLoaiMonAn);
		
		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTimKiem.setBackground(new Color(255, 255, 255));
		btnTimKiem.setBounds(337, 102, 107, 24);
		pnlTimKiemMonAn.add(btnTimKiem);
		
		JButton btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.setBackground(new Color(255, 255, 255));
		btnLamMoi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnLamMoi.setBounds(155, 102, 107, 24);
		pnlTimKiemMonAn.add(btnLamMoi);
		
		JLabel lblTenMonAn = new JLabel("Tên món ăn:");
		lblTenMonAn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTenMonAn.setBounds(5, 40, 122, 24);
		pnlTimKiemMonAn.add(lblTenMonAn);
		
		txtMaMonAn = new JTextField();
		txtMaMonAn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtMaMonAn.setColumns(10);
		txtMaMonAn.setBounds(127, 10, 135, 25);
		pnlTimKiemMonAn.add(txtMaMonAn);
		
		JLabel lblSLng = new JLabel("Số lượng:");
		lblSLng.setForeground(Color.BLACK);
		lblSLng.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSLng.setBackground(Color.WHITE);
		lblSLng.setBounds(346, 40, 98, 33);
		pnlTimKiemMonAn.add(lblSLng);
		
		JSpinner spSoLuong = new JSpinner();
		spSoLuong.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		spSoLuong.setBackground(Color.WHITE);
		spSoLuong.setBounds(482, 40, 124, 27);
		pnlTimKiemMonAn.add(spSoLuong);
		
		JLabel lblTimKiemMon = new JLabel("Tìm kiếm món ăn");
		lblTimKiemMon.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimKiemMon.setForeground(Color.BLACK);
		lblTimKiemMon.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTimKiemMon.setBounds(38, 10, 621, 27);
		add(lblTimKiemMon);
		
		JLabel lblDanhSachMon = new JLabel("Danh sách món ăn");
		lblDanhSachMon.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanhSachMon.setForeground(Color.BLACK);
		lblDanhSachMon.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblDanhSachMon.setBounds(38, 207, 621, 33);
		add(lblDanhSachMon);
		
		JPanel pnlDanhSachMonAn = new JPanel();
		pnlDanhSachMonAn.setLayout(null);
		pnlDanhSachMonAn.setBackground(SystemColor.inactiveCaption);
		pnlDanhSachMonAn.setBounds(38, 240, 621, 388);
		add(pnlDanhSachMonAn);
		
		JScrollPane scrDanhSachMonAn = new JScrollPane();
		scrDanhSachMonAn.setBounds(10, 23, 601, 355);
		pnlDanhSachMonAn.add(scrDanhSachMonAn);
		
		tblMonAn = new JTable();
		scrDanhSachMonAn.setViewportView(tblMonAn);
		tblMonAn.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 m\u00F3n \u0103n", "T\u00EAn m\u00F3n \u0103n", "Lo\u1EA1i", "S\u1ED1 l\u01B0\u1EE3ng", "Gi\u00E1"
			}
		));
		
		JLabel lblSanPhamDaChon = new JLabel("Sản phẩm đã chọn");
		lblSanPhamDaChon.setHorizontalAlignment(SwingConstants.CENTER);
		lblSanPhamDaChon.setForeground(Color.BLACK);
		lblSanPhamDaChon.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblSanPhamDaChon.setBounds(669, 3, 680, 41);
		add(lblSanPhamDaChon);
		
		JPanel pnlSanPhamDaChon = new JPanel();
		pnlSanPhamDaChon.setLayout(null);
		pnlSanPhamDaChon.setBackground(SystemColor.inactiveCaption);
		pnlSanPhamDaChon.setBounds(669, 47, 680, 483);
		add(pnlSanPhamDaChon);
		
		JScrollPane scrSanPhamDaChon = new JScrollPane();
		scrSanPhamDaChon.setBounds(10, 25, 660, 433);
		pnlSanPhamDaChon.add(scrSanPhamDaChon);
		
		tblSanPhamDaChon = new JTable();
		scrSanPhamDaChon.setViewportView(tblSanPhamDaChon);
		tblSanPhamDaChon.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 m\u00F3n \u0103n", "T\u00EAn m\u00F3n \u0103n", "S\u1ED1 l\u01B0\u1EE3ng", "G\u00EDa", "Th\u00E0nh ti\u1EC1n"
			}
		));
		
		JPanel pnlThanhToan = new JPanel();
		pnlThanhToan.setLayout(null);
		pnlThanhToan.setBackground(SystemColor.inactiveCaption);
		pnlThanhToan.setBounds(669, 555, 680, 176);
		add(pnlThanhToan);
		
		JButton btnHuyDatHang = new JButton("Hủy Đặt");
		btnHuyDatHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHuyDatHang.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnHuyDatHang.setBackground(new Color(255, 255, 255));
		btnHuyDatHang.setBounds(45, 107, 136, 56);
		pnlThanhToan.add(btnHuyDatHang);
		
		JButton btnThanhToan = new JButton("Thanh Toán");
		btnThanhToan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnThanhToan.setBackground(new Color(255, 255, 255));
		btnThanhToan.setBounds(505, 107, 136, 56);
		pnlThanhToan.add(btnThanhToan);
		
		txtTongTien = new JTextField();
		txtTongTien.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTongTien.setColumns(10);
		txtTongTien.setBounds(343, 38, 196, 33);
		pnlThanhToan.add(txtTongTien);
		
		JButton btnInDon = new JButton("In Đơn");
		btnInDon.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnInDon.setBackground(Color.WHITE);
		btnInDon.setBounds(277, 107, 136, 56);
		pnlThanhToan.add(btnInDon);
		
		JLabel lblTongTien = new JLabel("Tổng tiền:");
		lblTongTien.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTongTien.setBounds(190, 38, 122, 30);
		pnlThanhToan.add(lblTongTien);
		
		JPanel pnlCapNhat = new JPanel();
		pnlCapNhat.setLayout(null);
		pnlCapNhat.setBackground(SystemColor.inactiveCaption);
		pnlCapNhat.setBounds(38, 638, 621, 93);
		add(pnlCapNhat);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnThem.setBackground(Color.WHITE);
		btnThem.setBounds(57, 32, 80, 27);
		pnlCapNhat.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnXoa.setBackground(Color.WHITE);
		btnXoa.setBounds(260, 32, 80, 27);
		pnlCapNhat.add(btnXoa);
		
		JButton btnLamMoi_1 = new JButton("Làm Mới");
		btnLamMoi_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnLamMoi_1.setBackground(Color.WHITE);
		btnLamMoi_1.setBounds(465, 32, 98, 27);
		pnlCapNhat.add(btnLamMoi_1);

	}
}
