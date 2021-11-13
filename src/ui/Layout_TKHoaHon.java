package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class Layout_TKHoaHon extends JFrame implements ActionListener, MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNgayBD;
	private JTextField txtNgayKT;
	private JTextField txtLocKH;
	private JTextField txtMaHD;
	private JTextField txtNguoiLapHD;
	private JTable tableHoaDon;
	private DefaultTableModel modelHoaDon;
	private JButton btnLoc;
	private JButton btnXoaTrang;
	private JButton btnAllHoaDon;
	private JComboBox<String> cbbLoc;
	private String[] s= {"Tên","Số Điện Thoại","CMND"};
	public Layout_TKHoaHon() {
		// TODO Auto-generated constructor stub
		setLocation(0, -17);
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().setBackground(Color.WHITE);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); // This line gives Windows
																							// Theme

		} catch (Exception e) {
			e.printStackTrace();
		}

		setSize(1000, 600);
		setResizable(true);
		// setUndecorated(true);
		setAlwaysOnTop(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel lblTieuDe = new JLabel("Thống Kê Hóa Đơn");
		lblTieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTieuDe.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTieuDe.setBounds(315, 7, 290, 37);
		getContentPane().add(lblTieuDe);

		JLabel lblNgayLapHoaDon = new JLabel("Ngày Lập HD :   Từ");
		lblNgayLapHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNgayLapHoaDon.setBounds(64, 75, 132, 20);
		getContentPane().add(lblNgayLapHoaDon);

		JLabel lblDen = new JLabel("Đến : ");
		lblDen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDen.setBounds(482, 75, 45, 20);
		getContentPane().add(lblDen);

		txtNgayBD = new JTextField();
		txtNgayBD.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNgayBD.setBounds(226, 76, 209, 19);
		getContentPane().add(txtNgayBD);
		txtNgayBD.setColumns(10);

		txtNgayKT = new JTextField();
		txtNgayKT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNgayKT.setBounds(596, 75, 224, 19);
		getContentPane().add(txtNgayKT);
		txtNgayKT.setColumns(10);

		JLabel lblLKhachHang = new JLabel("Lọc thông tin khách hàng :");
		lblLKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLKhachHang.setBounds(64, 120, 152, 20);
		getContentPane().add(lblLKhachHang);

		txtLocKH = new JTextField();
		txtLocKH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtLocKH.setBounds(226, 121, 209, 19);
		getContentPane().add(txtLocKH);
		txtLocKH.setColumns(10);

		JLabel lblMaHD = new JLabel("Mã HD :");
		lblMaHD.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMaHD.setBounds(482, 120, 58, 20);
		getContentPane().add(lblMaHD);

		txtMaHD = new JTextField();
		txtMaHD.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtMaHD.setBounds(596, 120, 224, 19);
		getContentPane().add(txtMaHD);
		txtMaHD.setColumns(10);

		JLabel lblNLapHD = new JLabel("Người Lập HD :");
		lblNLapHD.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNLapHD.setBounds(483, 164, 91, 20);
		getContentPane().add(lblNLapHD);

		txtNguoiLapHD = new JTextField();
		txtNguoiLapHD.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNguoiLapHD.setBounds(596, 164, 224, 19);
		getContentPane().add(txtNguoiLapHD);
		txtNguoiLapHD.setColumns(10);

		btnLoc = new JButton("Lọc");
		btnLoc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLoc.setBounds(855, 65, 90, 40);
		getContentPane().add(btnLoc);

		btnXoaTrang = new JButton("Xóa Trắng");
		btnXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnXoaTrang.setBounds(855, 120, 90, 40);
		getContentPane().add(btnXoaTrang);

		btnAllHoaDon = new JButton("Tất Cả");
		btnAllHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAllHoaDon.setBounds(855, 176, 90, 40);
		getContentPane().add(btnAllHoaDon);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 226, 966, 301);
		getContentPane().add(scrollPane);

		String[] colHeader = { "Mã hoá đơn", "Họ KH", "Tên KH", "Số CMND", "Địa chỉ", "Tên mặt hàng", "Số lượng",
				"Người lập HĐ", "Thành tiền", "Ngày lập HĐ", "SĐT Khách hàng" };
		modelHoaDon = new DefaultTableModel(colHeader, 0);
		tableHoaDon = new JTable(modelHoaDon);
		tableHoaDon.getColumnModel().getColumn(0).setPreferredWidth(45);
		tableHoaDon.getColumnModel().getColumn(1).setPreferredWidth(74);
		tableHoaDon.getColumnModel().getColumn(2).setPreferredWidth(87);
		tableHoaDon.getColumnModel().getColumn(3).setPreferredWidth(96);
		tableHoaDon.getColumnModel().getColumn(4).setPreferredWidth(84);
		tableHoaDon.getColumnModel().getColumn(5).setPreferredWidth(98);
		tableHoaDon.getColumnModel().getColumn(6).setPreferredWidth(94);
		tableHoaDon.getColumnModel().getColumn(7).setPreferredWidth(65);
		tableHoaDon.getColumnModel().getColumn(8).setPreferredWidth(5);
		tableHoaDon.getColumnModel().getColumn(9).setPreferredWidth(5);
		tableHoaDon.getColumnModel().getColumn(10).setPreferredWidth(5);
		tableHoaDon.getColumnModel().getColumn(11).setPreferredWidth(5);
		scrollPane.setViewportView(tableHoaDon);
		
		cbbLoc = new JComboBox(s);
		cbbLoc.setMaximumRowCount(100);
		cbbLoc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbbLoc.setBackground(Color.WHITE);
		cbbLoc.setBounds(315, 147, 120, 21);
		getContentPane().add(cbbLoc);
		btnLoc.addActionListener(this);
		btnAllHoaDon.addActionListener(this);
		btnXoaTrang.addActionListener(this);

	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
