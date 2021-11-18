package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Layout_LapHoaDon extends JFrame implements MouseListener,ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtKhachHang;
	private JTextField txtSanPham;
	private JTextField txtSoLuong;
	private JButton btnTaoMoiHoaDon;
	
	private JTable tableMathang;
	private DefaultTableModel modelMatHang;
	private JButton btnXoaSanPham;
	private JButton btnXoaTatCa;
	private JButton btnLuuHoaDon;
	private JButton btnInHoaDon;
	private JButton btnAddHoaDon;
	private JButton btnLocXe;
	private JButton btnAddKhachHang;
	private JButton btnXemKH;
	private JButton btnLocKH;
	private JComboBox cbbMau;
	private JComboBox cbbTTSanPham;
	private JComboBox cbbTTKhachHang;
	public Layout_LapHoaDon() {
		// TODO Auto-generated constructor stub
		setLocation(0, -17);
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().setBackground(Color.WHITE);
		try {
		     UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");  // This line gives Windows Theme
		 
		    } 
		catch (Exception e) 
		{
		      e.printStackTrace();
		    }
	
		setSize(1000,600);
		setResizable(true);
		//setUndecorated(true);
		setAlwaysOnTop(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblTieuDe = new JLabel("Lập Hóa Đơn");
		lblTieuDe.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTieuDe.setBounds(337, 22, 296, 42);
		getContentPane().add(lblTieuDe);
		txtKhachHang = new JTextField();
		txtKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtKhachHang.setBounds(22, 84, 267, 20);
		getContentPane().add(txtKhachHang);
		txtKhachHang.setColumns(10);
		
		cbbTTKhachHang = new JComboBox();
		cbbTTKhachHang.setMaximumRowCount(100);
		cbbTTKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbbTTKhachHang.setBackground(Color.WHITE);
		cbbTTKhachHang.setBounds(22, 121, 267, 76);
		getContentPane().add(cbbTTKhachHang);
		
		txtSanPham = new JTextField();
		txtSanPham.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtSanPham.setColumns(10);
		txtSanPham.setBounds(22, 238, 267, 20);
		getContentPane().add(txtSanPham);
		
		cbbTTSanPham = new JComboBox();
		cbbTTSanPham.setMaximumRowCount(100);
		cbbTTSanPham.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbbTTSanPham.setBackground(Color.WHITE);
		cbbTTSanPham.setBounds(22, 278, 267, 76);
		getContentPane().add(cbbTTSanPham);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtSoLuong.setColumns(10);
		txtSoLuong.setBounds(22, 364, 267, 20);
		getContentPane().add(txtSoLuong);
		
		btnLocKH = new JButton("Tìm");
		btnLocKH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLocKH.setBounds(312, 82, 155, 25);
		getContentPane().add(btnLocKH);
		
		btnXemKH = new JButton("Xem thông tin");
		btnXemKH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnXemKH.setBounds(312, 126, 155, 25);
		getContentPane().add(btnXemKH);
		
		btnAddKhachHang = new JButton("thêm khách hàng mới");
		btnAddKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAddKhachHang.setBounds(312, 176, 155, 25);
		getContentPane().add(btnAddKhachHang);
		
		btnLocXe = new JButton("Tìm xe");
		btnLocXe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLocXe.setBounds(312, 239, 155, 25);
		getContentPane().add(btnLocXe);
		
		cbbMau = new JComboBox();
		cbbMau.setMaximumRowCount(100);
		cbbMau.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbbMau.setBackground(Color.WHITE);
		cbbMau.setBounds(312, 278, 155, 21);
		getContentPane().add(cbbMau);
		
		btnAddHoaDon = new JButton("thêm vào hóa đơn");
		btnAddHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAddHoaDon.setBounds(312, 362, 155, 25);
		getContentPane().add(btnAddHoaDon);
		
		btnInHoaDon = new JButton("In Hóa Đơn");
		btnInHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnInHoaDon.setBounds(22, 494, 120, 25);
		getContentPane().add(btnInHoaDon);
		
		btnLuuHoaDon = new JButton("Lưu Hóa Đơn");
		btnLuuHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLuuHoaDon.setBounds(185, 494, 120, 25);
		getContentPane().add(btnLuuHoaDon);
		
		btnTaoMoiHoaDon = new JButton("Hóa Đơn Mới");
		btnTaoMoiHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTaoMoiHoaDon.setBounds(347, 494, 120, 25);
		getContentPane().add(btnTaoMoiHoaDon);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(520, 74, 441, 410);
		getContentPane().add(scrollPane);
		String[] colHeader = { "STT", "Mã SP", "Số lượng", "Đơn Giá", "Thành Tiền"};
		modelMatHang = new DefaultTableModel(colHeader, 0);
		tableMathang = new JTable(modelMatHang);
		tableMathang.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tableMathang.getColumnModel().getColumn(0).setPreferredWidth(41);
		tableMathang.getColumnModel().getColumn(1).setPreferredWidth(76);
		tableMathang.getColumnModel().getColumn(2).setPreferredWidth(101);
		tableMathang.getColumnModel().getColumn(3).setPreferredWidth(60);
		tableMathang.getColumnModel().getColumn(4).setPreferredWidth(85);
		scrollPane.setViewportView(tableMathang);
		
		btnXoaTatCa = new JButton("Xóa tất cả");
		btnXoaTatCa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnXoaTatCa.setBounds(520, 495, 155, 25);
		getContentPane().add(btnXoaTatCa);
		
		btnXoaSanPham = new JButton("Xóa sản phẩm");
		btnXoaSanPham.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnXoaSanPham.setBounds(806, 495, 155, 25);
		getContentPane().add(btnXoaSanPham);
	}
	public static void main(String[] args) {
		new Layout_LapHoaDon().setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
