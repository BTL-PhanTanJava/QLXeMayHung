package ui;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
public class Layout_TKNhanVien  extends JFrame implements ActionListener, MouseListener {

	
	private JTextField txtNgayBD;
	private JTextField txtngayKT;
	private JTextField txtLuong;
	private JTable table;
	private JTextField txtMaNV;
	private String[] s= {"Tất cả","Nam","Nữ"};
	private String[] s2= {"Mã Nhân viên","tên nhân viên"};
	private JComboBox<String> cbbGioiTinh;
	private JComboBox<String> cbbTenorMa;
	private JCheckBox cbLonHon;
	private JButton btnLoc;
	private JButton btnLocNVNghi;
	private DefaultTableModel modelNhanVien;
	public Layout_TKNhanVien() {
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
		
		JLabel lblTNgy = new JLabel("Từ ngày:");
		lblTNgy.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTNgy.setBounds(88, 99, 70, 19);
		getContentPane().add(lblTNgy);
		
		txtNgayBD = new JTextField();
		txtNgayBD.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNgayBD.setBounds(180, 98, 162, 19);
		getContentPane().add(txtNgayBD);
		txtNgayBD.setColumns(10);
		
		JLabel lbln = new JLabel("Đến:");
		lbln.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbln.setBounds(371, 101, 45, 13);
		getContentPane().add(lbln);
		
		txtngayKT = new JTextField();
		txtngayKT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtngayKT.setColumns(10);
		txtngayKT.setBounds(444, 98, 162, 19);
		getContentPane().add(txtngayKT);
		
		cbbGioiTinh = new JComboBox<String>(s);
		cbbGioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbbGioiTinh.setMaximumRowCount(100);
		cbbGioiTinh.setBackground(Color.WHITE);
		cbbGioiTinh.setBounds(444, 142, 162, 21);
		getContentPane().add(cbbGioiTinh);
		
		JLabel lblGiiTnh = new JLabel("Giới tính:");
		lblGiiTnh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGiiTnh.setBounds(371, 146, 63, 13);
		getContentPane().add(lblGiiTnh);
		
		JLabel lblThngKNhn = new JLabel("Thống kê nhân viên");
		lblThngKNhn.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblThngKNhn.setBounds(409, 21, 209, 41);
		getContentPane().add(lblThngKNhn);
		
		JLabel lblLng = new JLabel("Lương:");
		lblLng.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLng.setBounds(88, 142, 70, 19);
		getContentPane().add(lblLng);
		
		txtLuong = new JTextField();
		txtLuong.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtLuong.setColumns(10);
		txtLuong.setBounds(180, 141, 162, 19);
		getContentPane().add(txtLuong);
		
		cbLonHon = new JCheckBox("Lớn hơn");
		cbLonHon.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbLonHon.setToolTipText("True: Lớn hơn - False: Bé hơn");
		cbLonHon.setBackground(Color.WHITE);
		cbLonHon.setBounds(180, 169, 162, 21);
		getContentPane().add(cbLonHon);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 270, 913, 283);
		getContentPane().add(scrollPane);
		
		String[] colHeader = { "Mã NV", "Số CMND", "Họ NV", "Tên NV", "Giới Tính", "Số Điện thoại","Chức vụ","Địa chỉ","Mật khẩu" };
		modelNhanVien = new DefaultTableModel(colHeader, 0);
		table = new JTable(modelNhanVien);
		table.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		
		 btnLoc = new JButton("Lọc");
		btnLoc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLoc.setToolTipText("Lọc theo các thuộc tính đã nhập");
		btnLoc.setBounds(699, 98, 104, 40);
		getContentPane().add(btnLoc);
		
		 btnLocNVNghi = new JButton("đã nghỉ làm");
		btnLocNVNghi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLocNVNghi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLocNVNghi.setBounds(699, 159, 104, 40);
		getContentPane().add(btnLocNVNghi);
		
		txtMaNV = new JTextField();
		txtMaNV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtMaNV.setBounds(180, 198, 236, 19);
		getContentPane().add(txtMaNV);
		txtMaNV.setColumns(10);
		
		JLabel lblLcTheo = new JLabel("Tên/Mã NV:");
		lblLcTheo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLcTheo.setBounds(88, 201, 85, 13);
		getContentPane().add(lblLcTheo);
		
		cbbTenorMa = new JComboBox<String>(s2);
		cbbTenorMa.setMaximumRowCount(100);
		cbbTenorMa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbbTenorMa.setBackground(Color.WHITE);
		cbbTenorMa.setBounds(444, 198, 162, 21);
		getContentPane().add(cbbTenorMa);
		

		btnLoc.addActionListener(this);
		btnLocNVNghi.addActionListener(this);
		table.addMouseListener(this);
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
