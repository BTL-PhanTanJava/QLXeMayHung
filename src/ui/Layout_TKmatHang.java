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
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


import javax.swing.JScrollPane;

public class Layout_TKmatHang extends JFrame implements MouseListener, ActionListener {
	private JTextField txtMaSPTenSP;
	private JTextField txtSoLuong;
	private JFormattedTextField txtGia;
	private JTable tableMathang;
	private DefaultTableModel modelMatHang;
	private JButton btnLoc;
	private JCheckBox cbLonHon;
	private JCheckBox cbGia;
	private JCheckBox cbMaSVTenSV;
	private JCheckBox cbNamSanXuat;
	private JCheckBox cbLoaiXe;
	private JButton btnHoanTac;
	private ImageIcon IconTimKiem = new ImageIcon("Img/search.png");
	private ImageIcon IconUndo = new ImageIcon("Img/undo.png");
	private JCheckBox cbHetHang;
	
	public Layout_TKmatHang() {
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
		
		JLabel lblTieuDe = new JLabel("Thống Kê Mặt Hàng");
		lblTieuDe.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTieuDe.setBounds(337, 22, 296, 42);
		getContentPane().add(lblTieuDe);
		
		JLabel lblLocSP = new JLabel("Lọc Theo :");
		lblLocSP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLocSP.setBounds(46, 81, 72, 20);
		getContentPane().add(lblLocSP);
		
		JLabel lblSoLuong = new JLabel("Số Lượng :");
		lblSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSoLuong.setBounds(485, 81, 72, 20);
		getContentPane().add(lblSoLuong);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(127, 252, -3, 0);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblGia = new JLabel("Giá :");
		lblGia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGia.setBackground(Color.WHITE);
		lblGia.setBounds(485, 156, 45, 13);
		getContentPane().add(lblGia);
		
		txtMaSPTenSP = new JTextField();
		txtMaSPTenSP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtMaSPTenSP.setBounds(128, 83, 267, 20);
		getContentPane().add(txtMaSPTenSP);
		txtMaSPTenSP.setColumns(10);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtSoLuong.setBounds(567, 82, 211, 19);
		getContentPane().add(txtSoLuong);
		txtSoLuong.setColumns(10);
		
		txtGia = (JFormattedTextField) new JTextField();
		txtGia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtGia.setBounds(567, 152, 211, 19);
		getContentPane().add(txtGia);
		txtGia.setColumns(10);
		
		btnLoc = new JButton("Lọc");
		btnLoc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLoc.setBounds(833, 71, 90, 40);
		getContentPane().add(btnLoc);
		
		 cbMaSVTenSV = new JCheckBox("Tên SP");
		cbMaSVTenSV.setBackground(Color.WHITE);
		cbMaSVTenSV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbMaSVTenSV.setBounds(128, 107, 119, 21);
		getContentPane().add(cbMaSVTenSV);
		
		 cbLonHon = new JCheckBox("Lớn hơn");
		cbLonHon.setBackground(Color.WHITE);
		cbLonHon.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbLonHon.setBounds(567, 107, 78, 21);
		getContentPane().add(cbLonHon);
		
		 cbNamSanXuat = new JCheckBox("Năm Sản Xuất");
		cbNamSanXuat.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbNamSanXuat.setBackground(Color.WHITE);
		cbNamSanXuat.setBounds(128, 156, 202, 28);
		getContentPane().add(cbNamSanXuat);
		
		 cbGia = new JCheckBox("Lớn hơn");
		cbGia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbGia.setBackground(Color.WHITE);
		cbGia.setBounds(567, 177, 168, 30);
		getContentPane().add(cbGia);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(65, 228, 858, 274);
		getContentPane().add(scrollPane);
		
		

		String[] colHeader = { "Mã SP", "Tên SP", "Dòng Xe", "Loại Xe", "Số lượng", "Năm Sản Xuất", "Màu", "Dung Tích Xi Lanh", "Dung Tích Bình Xăng", "Giá Nhập", "Giá Bán", "Kích Thước" };
		modelMatHang = new DefaultTableModel(colHeader, 0);
		tableMathang = new JTable(modelMatHang);
		tableMathang.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tableMathang.getColumnModel().getColumn(0).setPreferredWidth(41);
		tableMathang.getColumnModel().getColumn(1).setPreferredWidth(76);
		tableMathang.getColumnModel().getColumn(2).setPreferredWidth(101);
		tableMathang.getColumnModel().getColumn(3).setPreferredWidth(60);
		tableMathang.getColumnModel().getColumn(4).setPreferredWidth(85);
		tableMathang.getColumnModel().getColumn(5).setPreferredWidth(98);
		tableMathang.getColumnModel().getColumn(6).setPreferredWidth(88);
		tableMathang.getColumnModel().getColumn(7).setPreferredWidth(65);
		tableMathang.getColumnModel().getColumn(8).setPreferredWidth(5);
		tableMathang.getColumnModel().getColumn(9).setPreferredWidth(5);
		tableMathang.getColumnModel().getColumn(10).setPreferredWidth(5);
		tableMathang.getColumnModel().getColumn(11).setPreferredWidth(5);
		scrollPane.setViewportView(tableMathang);
		
		 btnHoanTac = new JButton("Hoàn tác");
		btnHoanTac.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnHoanTac.setBounds(833, 156, 90, 40);
		getContentPane().add(btnHoanTac);
		
		cbLoaiXe = new JCheckBox("Loại Xe");
		cbLoaiXe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbLoaiXe.setBackground(Color.WHITE);
		cbLoaiXe.setBounds(128, 130, 202, 28);
		getContentPane().add(cbLoaiXe);
		
		cbHetHang = new JCheckBox("Hết Hàng");
		cbHetHang.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbHetHang.setBackground(Color.WHITE);
		cbHetHang.setBounds(652, 107, 78, 21);
		getContentPane().add(cbHetHang);
		btnLoc.addActionListener(this);
		btnHoanTac.addActionListener(this);
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
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
}
