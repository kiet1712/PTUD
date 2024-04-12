
package GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import DAO.DAO_DangNhap;
import DAO.DAO_NhanVien;
import DAO.DAO_MonAn;
import connect.ConnectDB;
import entity.NhanVien;
import entity.TaiKhoan;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class GUI_QuanLyNhanSu extends JPanel {
	private JTextField txtMaNhanVien;
	private JTextField txtHoTen;
	private JTextField txtSoDienThoai;
	private JTextField txtNamSinh;
	private JTextField txtNgayVaoLam;
	private DefaultTableModel model;
	private JTable tblThongTinNhanVien;
	private JComboBox cboGioiTinh;
	private String ma;
	private List<NhanVien> list;
	private JTextField textField;

	public GUI_QuanLyNhanSu() {

		try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBackground(SystemColor.inactiveCaptionBorder);
		setLayout(null);

		JLabel lblTieuDe_QuanLyNhanSu = new JLabel("QUẢN LÝ NHÂN SỰ");
		lblTieuDe_QuanLyNhanSu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTieuDe_QuanLyNhanSu.setBounds(10, 10, 1199, 70);
		lblTieuDe_QuanLyNhanSu.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblTieuDe_QuanLyNhanSu.setForeground(SystemColor.windowText);
		add(lblTieuDe_QuanLyNhanSu);

		JPanel pnlNhapThongTin = new JPanel();
		pnlNhapThongTin.setBackground(SystemColor.inactiveCaption);
		pnlNhapThongTin.setBounds(10, 100, 1187, 150);
		add(pnlNhapThongTin);
		pnlNhapThongTin.setLayout(null);

		JLabel lblMaNhanVien = new JLabel("Mã nhân viên:");
		lblMaNhanVien.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMaNhanVien.setBounds(10, 17, 136, 24);
		pnlNhapThongTin.add(lblMaNhanVien);

		JLabel lblHoTen = new JLabel("Họ tên :");
		lblHoTen.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblHoTen.setBounds(10, 68, 136, 24);
		pnlNhapThongTin.add(lblHoTen);

		JLabel lblSoDienThoai = new JLabel("Số điện thoại:");
		lblSoDienThoai.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSoDienThoai.setBounds(10, 108, 136, 38);
		pnlNhapThongTin.add(lblSoDienThoai);

		txtMaNhanVien = new JTextField();
		txtMaNhanVien.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtMaNhanVien.setBounds(161, 16, 254, 24);
		txtMaNhanVien.setEditable(false);
		txtMaNhanVien.setText(taoMa());
		pnlNhapThongTin.add(txtMaNhanVien);
		txtMaNhanVien.setColumns(10);

		txtHoTen = new JTextField();
		txtHoTen.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtHoTen.setColumns(10);
		txtHoTen.setBounds(161, 68, 254, 24);
		pnlNhapThongTin.add(txtHoTen);

		txtSoDienThoai = new JTextField();
		txtSoDienThoai.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtSoDienThoai.setColumns(10);
		txtSoDienThoai.setBounds(161, 115, 254, 24);
		pnlNhapThongTin.add(txtSoDienThoai);

		JLabel lblNamSinh = new JLabel("Năm sinh:");
		lblNamSinh.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNamSinh.setBounds(637, 17, 136, 24);
		pnlNhapThongTin.add(lblNamSinh);

		JLabel lblGioiTinh = new JLabel("Giới tính:");
		lblGioiTinh.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblGioiTinh.setBounds(637, 62, 136, 24);
		pnlNhapThongTin.add(lblGioiTinh);

		JLabel lblNgayVaoLam = new JLabel("Ngày vào làm:");
		lblNgayVaoLam.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNgayVaoLam.setBounds(637, 108, 136, 24);
		pnlNhapThongTin.add(lblNgayVaoLam);

		txtNamSinh = new JTextField();
		txtNamSinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtNamSinh.setColumns(10);
		txtNamSinh.setBounds(792, 17, 161, 24);
		pnlNhapThongTin.add(txtNamSinh);

		txtNgayVaoLam = new JTextField();
		txtNgayVaoLam.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtNgayVaoLam.setColumns(10);
		txtNgayVaoLam.setBounds(792, 108, 161, 24);
		pnlNhapThongTin.add(txtNgayVaoLam);

		cboGioiTinh = new JComboBox();
		cboGioiTinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cboGioiTinh.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ"}));
		cboGioiTinh.setBounds(792, 62, 161, 21);
		pnlNhapThongTin.add(cboGioiTinh);

		String[] tieude = { "Mã nhân viên", "Họ tên", "Năm sinh", "Giới tính", "Ngày vào làm", "Số điện thoại" };
		model = new DefaultTableModel(tieude, 0);

		JScrollPane scrThongTinNhanVien = new JScrollPane();
		scrThongTinNhanVien.setBounds(10, 358, 1187, 285);
		add(scrThongTinNhanVien);
		scrThongTinNhanVien.setViewportView(tblThongTinNhanVien = new JTable(model));
		tblThongTinNhanVien.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = tblThongTinNhanVien.getSelectedRow();
				txtMaNhanVien.setText(tblThongTinNhanVien.getValueAt(row, 0).toString());
				txtHoTen.setText(tblThongTinNhanVien.getValueAt(row, 1).toString());
				txtNamSinh.setText(tblThongTinNhanVien.getValueAt(row, 2).toString());
				cboGioiTinh.setSelectedItem(tblThongTinNhanVien.getValueAt(row, 3).toString());
				txtNgayVaoLam.setText(tblThongTinNhanVien.getValueAt(row, 4).toString());
				txtSoDienThoai.setText(tblThongTinNhanVien.getValueAt(row, 5).toString());

			}
		});
		scrThongTinNhanVien.setViewportView(tblThongTinNhanVien);

		JButton btnThem = new JButton("THÊM");
		btnThem.setBackground(new Color(255, 255, 255));
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (validData()) {
					txtMaNhanVien.setText(taoMa());
					them();

				}

			}
		});
		 // Thêm sự kiện cho nút Thêm
        btnThem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validData()) {
                    txtMaNhanVien.setText(taoMa());
                    them();
                }
            }
        });
		btnThem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnThem.setBounds(709, 285, 127, 33);
		add(btnThem);

		JButton btnXoa = new JButton("XÓA");
		btnXoa.setBackground(new Color(255, 255, 255));
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xoa();
			}
		});
		btnXoa.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnXoa.setBounds(1070, 285, 127, 33);
		add(btnXoa);

		JButton btnSua = new JButton("SỬA");
		btnSua.setBackground(new Color(255, 255, 255));
		btnSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = tblThongTinNhanVien.getSelectedRow();
				if (row >= 0) {
					if (validData()) {
						sua();
					}
				}

			}
		});
		btnSua.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSua.setBounds(887, 285, 127, 33);
		add(btnSua);

		JLabel lblDanhSachNhanVien = new JLabel("Danh sách nhân viên");
		lblDanhSachNhanVien.setForeground(SystemColor.windowText);
		lblDanhSachNhanVien.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDanhSachNhanVien.setBounds(10, 317, 222, 49);
		add(lblDanhSachNhanVien);
		
		JButton btnLamMoi = new JButton("LÀM MỚI");
		btnLamMoi.setBackground(new Color(255, 255, 255));
		btnLamMoi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnLamMoi.setBounds(522, 285, 127, 33);
		add(btnLamMoi);
		
		JButton btnTimKiem = new JButton("TÌM KIẾM");
		btnTimKiem.setBackground(new Color(255, 255, 255));
		btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTimKiem.setBounds(317, 285, 120, 33);
		add(btnTimKiem);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 288, 297, 33);
		add(textField);

		setVisible(true);
		updateData();

	}

	public void them() {

		DAO_NhanVien dao_nv = new DAO_NhanVien();
		String ma = txtMaNhanVien.getText().trim();
		String hoTen = txtHoTen.getText().trim();
		String sdt = txtSoDienThoai.getText().trim();
		String gt = cboGioiTinh.getSelectedItem().toString();
		String namSinh = txtNamSinh.getText().trim();
		java.util.Date ngayVaoLam = null;

		String ngayVaoLamText = txtNgayVaoLam.getText().trim();

		if (!ngayVaoLamText.isEmpty()) {
			try {

				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				ngayVaoLam = dateFormat.parse(ngayVaoLamText);
			} catch (ParseException e) {

				e.printStackTrace();

			}
		}
		NhanVien nv = new NhanVien(ma, hoTen, namSinh, gt, ngayVaoLam, sdt);
		if (dao_nv.create(nv)) {
			String[] data = { ma, hoTen, namSinh, gt, txtNgayVaoLam.getText(), sdt };
			model.addRow(data);
		}

	}

	public void sua() {

		DAO_NhanVien dao = new DAO_NhanVien();
		String maNhanVien = txtMaNhanVien.getText().trim();
		String hoTen = txtHoTen.getText().trim();
		String sdt = txtSoDienThoai.getText().trim();
		String namSinh = txtNamSinh.getText().trim();
		String gioiTinh = cboGioiTinh.getSelectedItem().toString();

		String ngayVaoLam = txtNgayVaoLam.getText().trim();

		NhanVien NV = new NhanVien(maNhanVien, hoTen, namSinh, gioiTinh, Date.valueOf(ngayVaoLam), sdt);
		if (dao.update(NV)) {
			JOptionPane.showMessageDialog(this, "Sửa thành công");
			String[] data = { maNhanVien, hoTen, namSinh, gioiTinh, Date.valueOf(ngayVaoLam).toString(), sdt };
			model.addRow(data);
			int row = tblThongTinNhanVien.getSelectedRow();
			model.removeRow(row);
		}

	}

	public void updateData() {
		DAO_NhanVien da = new DAO_NhanVien();
		List<NhanVien> list = da.getAllNV();
		for (NhanVien nv : list) {
			Object[] data = { nv.getMaNV(), nv.getTenNV(), nv.getNamSinh(), nv.getGioiTinh(), nv.getNgayVaolam(),
					nv.getsDT() };
			model.addRow(data);
		}

	}

	public void xoa() {
		DAO_NhanVien dao = new DAO_NhanVien();
		int row = tblThongTinNhanVien.getSelectedRow();
		String malop = (String) tblThongTinNhanVien.getValueAt(row, 0);
		if ((dao).delete(malop)) {
			model.removeRow(row);
		}

	}

	   // Phương thức kiểm tra dữ liệu hợp lệ
    private boolean validData() {
        // Lấy dữ liệu từ các trường nhập liệu
        String hoTen = txtHoTen.getText().trim();
        String sdt = txtSoDienThoai.getText().trim();
        String namSinh = txtNamSinh.getText().trim();

        // Kiểm tra họ tên không được rỗng và không chứa số
        if (hoTen.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Họ tên nhân viên không được rỗng!");
            txtHoTen.requestFocus();
            return false;
        } else if (!hoTen.matches("[\\p{L} ]+")) {
            JOptionPane.showMessageDialog(this, "Họ tên không chứa kí tự số và kí tự đặc biệt!");
            txtHoTen.requestFocus();
            return false;
        }

        // Kiểm tra số điện thoại hợp lệ
        if (sdt.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được rỗng!");
            txtSoDienThoai.requestFocus();
            return false;
        } else if (!sdt.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại phải gồm 10 chữ số!");
            txtSoDienThoai.requestFocus();
            return false;
        }

        // Kiểm tra năm sinh hợp lệ
        if (namSinh.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Năm sinh không được rỗng!");
            txtNamSinh.requestFocus();
            return false;
        } else if (!namSinh.matches("\\d{4}")) {
            JOptionPane.showMessageDialog(this, "Năm sinh phải gồm 4 chữ số!");
            txtNamSinh.requestFocus();
            return false;
        }return true;}
	

	public boolean kiemTraTrungSoDienThoai(String sdt) {
		DAO_NhanVien dao = new DAO_NhanVien();
		List<NhanVien> list = dao.getAllNV();

		for (NhanVien nv : list) {
			if (nv.getsDT().equals(sdt)) {
				return true;
			}
		}

		return false;
	}

	public String taoMa() {

		DAO_NhanVien dao = new DAO_NhanVien();

		int n = dao.getAllNV().size();
		if (n < 9) {
			do {
				n = n + 1;

				ma = "NV00" + String.valueOf(n);
				list = dao.getAllNV();
			} while (list.contains(ma));

		} else if (n < 99) {
			do {
				n = n + 1;

				ma = "NV0" + String.valueOf(n);
				list = dao.getAllNV();
			} while (list.contains(ma));
		} else if (n < 999) {
			do {
				n = n + 1;

				ma = "NV" + String.valueOf(n);
				list = dao.getAllNV();
			} while (list.contains(ma));
		}
		return ma;
	}
}
