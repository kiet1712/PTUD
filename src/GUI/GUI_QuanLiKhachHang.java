package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

import DAO.DAO_KhachHang;


import DAO.DAO_MonAn;
import connect.ConnectDB;
import entity.KhachHang;


import entity.MonAn;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.*;
import javax.swing.DefaultComboBoxModel;

public class GUI_QuanLiKhachHang extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTable tblThongTinKhachHang;
	private DefaultTableModel modelKhachHang;
	private String ma;
	private List<KhachHang> kh;
	private JTextField txt_MaKhachHang;
	private JTextField txtHoVaTen;
	private JTextField txtSoDienThoai;
	private JTextField txtNgaySinh;
	private JTextField txtTimKiem;
	private JTextField txtDiaChi;
;
	private JComboBox cboGioiTinh = new JComboBox();


	public GUI_QuanLiKhachHang() {
		setLayout(null);
		setBackground(SystemColor.inactiveCaptionBorder);

		//ConnectDB
 		try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
 		String gioiTinh[]= {"Nam","Nữ"};
 		for(String item : gioiTinh){
 		    cboGioiTinh.addItem(item);
 		}

 		
 		tblThongTinKhachHang = new JTable();
		 String[] tieude = {
				"Mã hóa đơn", "Tên khách hàng", "Số Điện Thoại", "Nhân viên lập đơn ", "Tổng Tiền"
			};
		 modelKhachHang = new DefaultTableModel(tieude,0);
		
		
		
		
		
		modelKhachHang = new DefaultTableModel(tieude,0);
		JScrollPane scrThongTinKhachHang = new JScrollPane();
		scrThongTinKhachHang.setBounds(10, 402, 1187, 309);
		add(scrThongTinKhachHang);
			
		scrThongTinKhachHang.setViewportView(tblThongTinKhachHang = new  JTable(modelKhachHang));
		tblThongTinKhachHang.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  int row = tblThongTinKhachHang.getSelectedRow();
				  txt_MaKhachHang.setText(tblThongTinKhachHang.getValueAt(row, 0).toString());
				  txtHoVaTen.setText(tblThongTinKhachHang.getValueAt(row, 1).toString());
				  txtNgaySinh.setText(tblThongTinKhachHang.getValueAt(row, 2).toString());
				  txtSoDienThoai.setText(tblThongTinKhachHang.getValueAt(row, 3).toString());
				  cboGioiTinh.setSelectedItem(tblThongTinKhachHang.getValueAt(row, 4).toString());
				  txtDiaChi.setText(tblThongTinKhachHang.getValueAt(row, 5).toString());
				  
			}
		});
		scrThongTinKhachHang.setViewportView(tblThongTinKhachHang);
		
		JLabel lblDanhSachKhachHang = new JLabel("Danh sách khách hàng");
		lblDanhSachKhachHang.setForeground(SystemColor.windowText);
		lblDanhSachKhachHang.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblDanhSachKhachHang.setBounds(10, 340, 297, 55);
		add(lblDanhSachKhachHang);
		
		JPanel pnlNhapThongTin = new JPanel();
		pnlNhapThongTin.setBackground(SystemColor.inactiveCaption);
		pnlNhapThongTin.setLayout(null);
		pnlNhapThongTin.setBounds(10, 101, 1187, 186);
		add(pnlNhapThongTin);
		
		JLabel lblKhachHang = new JLabel("Mã Khách Hàng:");
		lblKhachHang.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblKhachHang.setBounds(10, 17, 147, 24);
		pnlNhapThongTin.add(lblKhachHang);
		
		JLabel lblHoTen = new JLabel("Họ tên:");
		lblHoTen.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblHoTen.setBounds(10, 68, 136, 24);
		pnlNhapThongTin.add(lblHoTen);
		
		JLabel lblSoDienThoai = new JLabel("Số điện thoại:");
		lblSoDienThoai.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSoDienThoai.setBounds(10, 108, 136, 38);
		pnlNhapThongTin.add(lblSoDienThoai);
		
		txt_MaKhachHang = new JTextField();
		txt_MaKhachHang.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_MaKhachHang.setText((String) null);
		txt_MaKhachHang.setEditable(false);
		txt_MaKhachHang.setColumns(10);
		txt_MaKhachHang.setBounds(198, 17, 254, 24);
		pnlNhapThongTin.add(txt_MaKhachHang);
		
		txtHoVaTen = new JTextField();
		txtHoVaTen.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtHoVaTen.setColumns(10);
		txtHoVaTen.setBounds(198, 72, 254, 24);
		pnlNhapThongTin.add(txtHoVaTen);
		
		txtSoDienThoai = new JTextField();
		txtSoDienThoai.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtSoDienThoai.setColumns(10);
		txtSoDienThoai.setBounds(198, 119, 254, 24);
		pnlNhapThongTin.add(txtSoDienThoai);
		
		JLabel lblNamSinh = new JLabel("Ngày sinh:");
		lblNamSinh.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNamSinh.setBounds(637, 17, 127, 24);
		pnlNhapThongTin.add(lblNamSinh);
		
		JLabel lblGioiTinh = new JLabel("Giới tính:");
		lblGioiTinh.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblGioiTinh.setBounds(637, 62, 127, 24);
		pnlNhapThongTin.add(lblGioiTinh);
		
		JLabel lblNgayVaoLam = new JLabel("Địa chỉ:");
		lblNgayVaoLam.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNgayVaoLam.setBounds(637, 115, 127, 24);
		pnlNhapThongTin.add(lblNgayVaoLam);
		
		txtNgaySinh = new JTextField();
		txtNgaySinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtNgaySinh.setColumns(10);
		txtNgaySinh.setBounds(780, 21, 161, 24);
		pnlNhapThongTin.add(txtNgaySinh);
		
		JComboBox cboGioiTinh = new JComboBox();
		cboGioiTinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cboGioiTinh.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ", ""}));
		cboGioiTinh.setBounds(780, 68, 161, 24);
		pnlNhapThongTin.add(cboGioiTinh);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(780, 118, 161, 24);
		pnlNhapThongTin.add(txtDiaChi);
		
		txtTimKiem = new JTextField();
		txtTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTimKiem.setColumns(10);
		txtTimKiem.setBounds(10, 297, 297, 30);
		add(txtTimKiem);
		
		JButton btnTimKiem = new JButton("TÌM KIẾM");
		btnTimKiem.setBackground(new Color(255, 255, 255));
		btnTimKiem.setForeground(SystemColor.menuText);
		btnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTimKiem.setBounds(317, 297, 116, 30);
		add(btnTimKiem);
		
		JButton btnLamMoi = new JButton("LÀM MỚI");
		btnLamMoi.setBackground(new Color(255, 255, 255));
		btnLamMoi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnLamMoi.setBounds(522, 297, 116, 27);
		add(btnLamMoi);
		
		JButton btnThem = new JButton("THÊM");
		btnThem.setBackground(new Color(255, 255, 255));
		btnThem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnThem.setBounds(709, 297, 116, 27);
		add(btnThem);
		
		JButton btnSua = new JButton("SỬA");
		btnSua.setBackground(new Color(255, 255, 255));
		btnSua.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSua.setBounds(887, 297, 116, 27);
		add(btnSua);
		
		JButton btnXoa = new JButton("XÓA");
		btnXoa.setBackground(new Color(255, 255, 255));
		btnXoa.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnXoa.setBounds(1079, 299, 116, 27);
		add(btnXoa);
		
		JLabel lblTieuDe_QuanLyNhanSu = new JLabel("QUẢN LÝ KHÁCH HÀNG");
		lblTieuDe_QuanLyNhanSu.setForeground(SystemColor.windowText);
		lblTieuDe_QuanLyNhanSu.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblTieuDe_QuanLyNhanSu.setBounds(317, 10, 630, 70);
		add(lblTieuDe_QuanLyNhanSu);
		
		updateData();
		
	}
	public void them() {
	    DAO_KhachHang dao = new DAO_KhachHang();
	    String ma = txt_MaKhachHang.getText().trim();
	    String ten = txtHoVaTen.getText().trim();
	    String diachi = txtDiaChi.getText().trim();
	    String sdt = txtSoDienThoai.getText().trim();
	    String gioitinh = cboGioiTinh.getSelectedItem().toString();
	    String namsinh = txtNgaySinh.getText().trim();
	    KhachHang kh = new KhachHang(ma, ten, namsinh, sdt, gioitinh, diachi);
	    
	    if (validData()) {
	        if (dao.themKH(kh)) {
	            JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công.");
	            String[] data = {ma, ten, namsinh, sdt, gioitinh, diachi};
	            modelKhachHang.addRow(data);
	        } else {
	            JOptionPane.showMessageDialog(this, "Không thể thêm khách hàng.");
	        }
	    }
	}

	public void updateData() {
		DAO_KhachHang dao= new DAO_KhachHang();
		List<KhachHang> list = dao.getAllKhachHang();
		for(KhachHang kh : list) {
			Object [] data = {kh.getMaKH(),kh.getHoTen(),kh.getNamSinh(),kh.getsDT(),kh.getGioiTinh(),kh.getDiaChi()};
			modelKhachHang.addRow(data);
		}
		
	}
	
	public void xoaTrang() {
		txtHoVaTen.setText("");
		txt_MaKhachHang.setText("");
		txtDiaChi.setText("");
		txtNgaySinh.setText("");
		txtSoDienThoai.setText("");
	
	}
	public void suaKhachHang() {
		DAO_KhachHang dao = new DAO_KhachHang();
		String ma = txt_MaKhachHang.getText().trim();
		String ten = txtHoVaTen.getText().trim();
		String diachi = txtDiaChi.getText().trim();
		String sdt = txtSoDienThoai.getText().trim();
		String gioitinh = cboGioiTinh.getSelectedItem().toString();
		String namsinh = txtNgaySinh.getText().trim();
		KhachHang kh = new KhachHang(ma,ten,namsinh,sdt,gioitinh,diachi);
		if(dao.update(kh)) {
			JOptionPane.showMessageDialog(this, "Sửa thành công");
			String [] data = {ma,ten,namsinh,sdt,gioitinh,diachi};
			modelKhachHang.addRow(data);
			int row = tblThongTinKhachHang.getSelectedRow();
			modelKhachHang.removeRow(row);
		}

	}
	private boolean validData() {
		String hoTen = txtHoVaTen.getText().trim();
		String sdt = txtSoDienThoai.getText().trim();
		String diaChi = txtDiaChi.getText().trim();
		String namSinh = txtNgaySinh.getText().trim();

		if (hoTen.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "Họ tên khách hàng trống!");
			txtHoVaTen.selectAll();
			txtHoVaTen.requestFocus();
			return false;
		} else {

			if ((hoTen.matches(
					"^[a-zA-Z ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂ ưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]"))) {
				JOptionPane.showMessageDialog(this, "Tên khách hàng gồm chữ cái, có thể chứa khoảng trắng");
				txtHoVaTen.requestFocus();
				txtHoVaTen.selectAll();
				return false;
			}
		}

		if (sdt.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "Số điện thoại khách hàng trống !");
			txtSoDienThoai.selectAll();
			txtSoDienThoai.requestFocus();
			return false;
		} else  {

			if (!(sdt.matches("^[0-9]{10}$"))) {
				JOptionPane.showMessageDialog(this, "Số điện thoại khách hàng gồm 10 số");
				txtSoDienThoai.requestFocus();
				txtSoDienThoai.selectAll();
				return false;
			}else if (kiemTraTrungSoDienThoai(sdt)) {
		        JOptionPane.showMessageDialog(this, "Số điện thoại đã tồn tại!");
		        txtSoDienThoai.requestFocus();
		        txtSoDienThoai.selectAll();
		        return false;
		    }
		}

		if (diaChi.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "Địa chỉ không được trống!");
			txtDiaChi.selectAll();
			txtDiaChi.requestFocus();
			return false;
		} else {

			if (diaChi.matches(
					"^[a-z0-9A-Z ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂ ưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]")) {
				JOptionPane.showMessageDialog(this, "Địa chỉ gồm chữ cái, số,...");
				txtDiaChi.requestFocus();
				txtDiaChi.selectAll();
				return false;

			}
		}
		if (namSinh.trim().equals("")) {
			JOptionPane.showMessageDialog(this, " Năm sinh khách hàng trống!");
			txtNgaySinh.selectAll();
			txtNgaySinh.requestFocus();
			return false;
		} else {

			if (!namSinh.matches("^[0-9]{4}$")) {
				JOptionPane.showMessageDialog(this, " Năm sinh khách hàng gồm 4 số");
				txtNgaySinh.requestFocus();
				txtNgaySinh.selectAll();
				return false;
			}
		}

		return true;
	}
	private boolean validDataSua() {
		String hoTen = txtHoVaTen.getText().trim();
		String sdt = txtSoDienThoai.getText().trim();
		String diaChi = txtDiaChi.getText().trim();
		String namSinh = txtNgaySinh.getText().trim();

		if (hoTen.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "Họ tên khách hàng trống!");
			txtHoVaTen.selectAll();
			txtHoVaTen.requestFocus();
			return false;
		} else {

			if ((hoTen.matches(
					"^[a-zA-Z ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂ ưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]"))) {
				JOptionPane.showMessageDialog(this, "Tên khách hàng gồm chữ cái, có thể chứa khoảng trắng");
				txtHoVaTen.requestFocus();
				txtHoVaTen.selectAll();
				return false;
			}
		}

		if (sdt.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "Số điện thoại khách hàng trống !");
			txtSoDienThoai.selectAll();
			txtSoDienThoai.requestFocus();
			return false;
		} else  {

			if (!(sdt.matches("^[0-9]{10}$"))) {
				JOptionPane.showMessageDialog(this, "Số điện thoại khách hàng gồm 10 số");
				txtSoDienThoai.requestFocus();
				txtSoDienThoai.selectAll();
				return false;
			}
		}

		if (diaChi.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "Địa chỉ không được trống!");
			txtDiaChi.selectAll();
			txtDiaChi.requestFocus();
			return false;
		} else {

			if (diaChi.matches(
					"^[a-z0-9A-Z ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂ ưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]")) {
				JOptionPane.showMessageDialog(this, "Địa chỉ gồm chữ cái, số,...");
				txtDiaChi.requestFocus();
				txtDiaChi.selectAll();
				return false;

			}
		}
		if (namSinh.trim().equals("")) {
			JOptionPane.showMessageDialog(this, " Năm sinh khách hàng trống!");
			txtNgaySinh.selectAll();
			txtNgaySinh.requestFocus();
			return false;
		} else {

			if (!namSinh.matches("^[0-9]{4}$")) {
				JOptionPane.showMessageDialog(this, " Năm sinh khách hàng gồm 4 số");
				txtNgaySinh.requestFocus();
				txtNgaySinh.selectAll();
				return false;
			}
		}

		return true;
	}
	
	public boolean kiemTraTrungSoDienThoai(String sdt) {
        DAO_KhachHang dao = new DAO_KhachHang();
        List<KhachHang> list = dao.getAllKhachHang();
        
        for (KhachHang kh : list) {
            if (kh.getsDT().equals(sdt)) {
                return true;
            }
        }
        
        return false; 
    }
	
	public String taoMa() {

		DAO_KhachHang dao = new DAO_KhachHang();
		
		int n = dao.getAllKhachHang().size();
		if(n<9) {
		do {
			 n=n+1;
			
			ma = "KH00" + String.valueOf(n);
			kh = dao.getAllKhachHang();
		} while (kh.contains(ma));
		
	}else if(n<99) {
		do {
			 n=n+1;
			
			ma = "KH0" + String.valueOf(n);
			kh = dao.getAllKhachHang();
		} while (kh.contains(ma));
	}
	else if(n<999) {
		do {
			 n=n+1;
			
			ma = "KH" + String.valueOf(n);
			kh = dao.getAllKhachHang();
		} while (kh.contains(ma));
	}
		return ma;
	}
}


