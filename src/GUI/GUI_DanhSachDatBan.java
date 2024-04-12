package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_DanhSachDatBan extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtMaHoaDon;
	private DefaultTableModel modelHoaDon;
	private DefaultTableModel modelChiTietHoaDon;
	private JTable tblHoaDon;
	private JTextField txtTenKhachHang;
	private JTextField txtSoDienThoai;
	private JTable tblChiTietHoaDon;
	private JTextField txtTongTien;
	

	/**
	 * Create the panel.
	 */
	public GUI_DanhSachDatBan() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setLayout(null);
		
		JLabel lblDanhSachHoaDon = new JLabel("Danh sách hóa đơn");
		lblDanhSachHoaDon.setBackground(new Color(255, 255, 255));
		lblDanhSachHoaDon.setBounds(10, 5, 1080, 46);
		lblDanhSachHoaDon.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanhSachHoaDon.setForeground(Color.BLACK);
		lblDanhSachHoaDon.setFont(new Font("Times New Roman", Font.BOLD, 50));
		add(lblDanhSachHoaDon);
		
		JPanel pnlThongTinHoaDon = new JPanel();
		pnlThongTinHoaDon.setLayout(null);
		pnlThongTinHoaDon.setBackground(SystemColor.inactiveCaption);
		pnlThongTinHoaDon.setBounds(10, 50, 1080, 117);
		add(pnlThongTinHoaDon);
		
		JLabel lblMaHoaDon = new JLabel("Mã hóa đơn:");
		lblMaHoaDon.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMaHoaDon.setBounds(9, 11, 118, 24);
		pnlThongTinHoaDon.add(lblMaHoaDon);
		
		JLabel lblNVLapDon = new JLabel("Nhân viên lập:");
		lblNVLapDon.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNVLapDon.setBounds(438, 45, 130, 24);
		pnlThongTinHoaDon.add(lblNVLapDon);
		
		JLabel lblSoDienThoai = new JLabel("Số Điện Thoại :");
		lblSoDienThoai.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSoDienThoai.setBounds(438, 11, 136, 24);
		pnlThongTinHoaDon.add(lblSoDienThoai);
		
		JComboBox cboNhanVienLap = new JComboBox();
		cboNhanVienLap.setBounds(578, 47, 180, 24);
		pnlThongTinHoaDon.add(cboNhanVienLap);
		
		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTimKiem.setForeground(Color.BLACK);
		btnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTimKiem.setBackground(new Color(255, 255, 255));
		btnTimKiem.setBounds(704, 84, 105, 33);
		pnlThongTinHoaDon.add(btnTimKiem);
		
		JButton btnInHoaDon = new JButton("In Hóa Đơn");
		btnInHoaDon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInHoaDon.setBackground(new Color(255, 255, 255));
		btnInHoaDon.setForeground(Color.BLACK);
		btnInHoaDon.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnInHoaDon.setBounds(961, 84, 109, 33);
		pnlThongTinHoaDon.add(btnInHoaDon);
		
		txtMaHoaDon = new JTextField();
		txtMaHoaDon.setColumns(10);
		txtMaHoaDon.setBounds(164, 13, 194, 25);
		pnlThongTinHoaDon.add(txtMaHoaDon);
		
		JLabel lblTenKhachHang = new JLabel("Tên khách hàng:");
		lblTenKhachHang.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTenKhachHang.setBounds(9, 45, 143, 24);
		pnlThongTinHoaDon.add(lblTenKhachHang);
		
		txtTenKhachHang = new JTextField();
		txtTenKhachHang.setColumns(10);
		txtTenKhachHang.setBounds(164, 42, 194, 25);
		pnlThongTinHoaDon.add(txtTenKhachHang);
		
		txtSoDienThoai = new JTextField();
		txtSoDienThoai.setColumns(10);
		txtSoDienThoai.setBounds(578, 13, 180, 25);
		pnlThongTinHoaDon.add(txtSoDienThoai);
		
		JButton btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.setForeground(SystemColor.desktop);
		btnLamMoi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnLamMoi.setBackground(new Color(255, 255, 255));
		btnLamMoi.setBounds(829, 84, 105, 33);
		pnlThongTinHoaDon.add(btnLamMoi);
		
		JLabel lblTongTien = new JLabel("Tổng Tiền :");
		lblTongTien.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTongTien.setBounds(782, 11, 136, 24);
		pnlThongTinHoaDon.add(lblTongTien);
		
		txtTongTien = new JTextField();
		txtTongTien.setColumns(10);
		txtTongTien.setBounds(890, 11, 180, 25);
		pnlThongTinHoaDon.add(txtTongTien);
		
		JPanel pnlHoaDon = new JPanel();
		pnlHoaDon.setLayout(null);
		pnlHoaDon.setBackground(SystemColor.inactiveCaption);
		pnlHoaDon.setBounds(10, 177, 1080, 196);
		add(pnlHoaDon);
		
		JScrollPane scrHoaDon = new JScrollPane();
		scrHoaDon.setBounds(10, 49, 1052, 137);
		pnlHoaDon.add(scrHoaDon);
		
		tblHoaDon = new JTable();
		 String[] tieude = {
				"Mã hóa đơn", "Tên khách hàng", "Số Điện Thoại", "Nhân viên lập đơn ", "Tổng Tiền"
			};
		modelHoaDon = new DefaultTableModel(tieude,0);

		scrHoaDon.setViewportView(tblHoaDon= new JTable(modelHoaDon));
		tblHoaDon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  int row = tblHoaDon.getSelectedRow();
				  txtMaHoaDon.setText(tblHoaDon.getValueAt(row, 0).toString());
				  txtTenKhachHang.setText(tblHoaDon.getValueAt(row, 1).toString());
				  txtSoDienThoai. setText(tblHoaDon.getValueAt(row, 2).toString());
				  cboNhanVienLap.setSelectedItem(tblHoaDon.getValueAt(row, 3).toString());
				  txtTongTien.setText(tblHoaDon.getValueAt(row, 4).toString());
			}
		});
		scrHoaDon.setViewportView(tblHoaDon);
		
		
		
		tblHoaDon = new JTable();
		tblHoaDon.setShowHorizontalLines(false);
		tblHoaDon.setShowVerticalLines(false);
		tblHoaDon.setShowGrid(false);
		tblHoaDon.setRowSelectionAllowed(false);
		scrHoaDon.setViewportView(tblHoaDon);
		tblHoaDon.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 h\u00F3a \u0111\u01A1n", "T\u00EAn kh\u00E1ch h\u00E0ng", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Nh\u00E2n vi\u00EAn l\u1EADp \u0111\u01A1n", "T\u1ED5ng ti\u1EC1n"
			}
		));
		
		JLabel lblHoaDon = new JLabel("Hóa đơn");
		lblHoaDon.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoaDon.setForeground(Color.BLACK);
		lblHoaDon.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblHoaDon.setBounds(442, 10, 163, 29);
		pnlHoaDon.add(lblHoaDon);
		
		JPanel pnlChiTietHoaDon = new JPanel();
		pnlChiTietHoaDon.setLayout(null);
		pnlChiTietHoaDon.setBackground(SystemColor.inactiveCaption);
		pnlChiTietHoaDon.setBounds(10, 383, 1080, 186);
		add(pnlChiTietHoaDon);
		
		JLabel lblChiTietHoaDon = new JLabel("Chi tiết hóa đơn");
		lblChiTietHoaDon.setHorizontalAlignment(SwingConstants.CENTER);
		lblChiTietHoaDon.setForeground(Color.BLACK);
		lblChiTietHoaDon.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblChiTietHoaDon.setBounds(10, 10, 1049, 41);
		pnlChiTietHoaDon.add(lblChiTietHoaDon);
		
		JScrollPane scrChiTietHoaDon = new JScrollPane();
		scrChiTietHoaDon.setBounds(10, 61, 1049, 115);
		pnlChiTietHoaDon.add(scrChiTietHoaDon);
		
		tblChiTietHoaDon = new JTable();
		tblChiTietHoaDon.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		tblChiTietHoaDon.setShowVerticalLines(false);
		tblChiTietHoaDon.setShowHorizontalLines(false);
		tblChiTietHoaDon.setShowGrid(false);
		scrChiTietHoaDon.setViewportView(tblChiTietHoaDon);
		tblChiTietHoaDon.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 m\u00F3n", "T\u00EAn m\u00F3n", "Gi\u00E1 b\u00E1n", "S\u1ED1 l\u01B0\u1EE3ng", "Th\u00E0nh Ti\u1EC1n"
			}
		));

	}
}
