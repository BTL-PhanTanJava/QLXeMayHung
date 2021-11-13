package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;


public class LayoutNhapXe extends JFrame implements ActionListener, MouseListener {
	private static final long serialVersionUID = 1L;
	private JTextField txtMaSanPham;
	private JTextField txtGiaBan;
	private JTextField txtGiaNhap;
	private JTextField txtSoLuongTon;
	private JTextField txtLoaiXe;
	private JTextField txtDongXe;
	private JTextField txtMauXe;
	private JTextField txtTenSP;
	private JTextField txtNamSanXuat;
	private JTextField txtDungTichXiLanh;
	private JTextField txtDungTichBinhXang;
	private JTextField txtKichThuoc;
	private JTextField txtTim;
	private JButton btnThem;
	private JButton btnTim;
	private JButton btnXoa;
	private JButton btnXoaTrang;
	private JButton btnSua;
	//private ImageIcon IconTimKiem = new ImageIcon("Img/search.png");
	//private ImageIcon IconADD = new ImageIcon("Img/file-add.png") ;
	//private ImageIcon IconXoa = new ImageIcon("Img/trash.png");
	//private ImageIcon IconHome = new ImageIcon("Img/home.png");
	private JTable table_Xe;
	private DefaultTableModel modelXe;
	
	public LayoutNhapXe() {
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
		JLabel lbltieude = new JLabel("QUẢN LÝ XE MÁY");
		lbltieude.setHorizontalAlignment(SwingConstants.CENTER);
		lbltieude.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbltieude.setBounds(238, 0, 540, 55);
		getContentPane().add(lbltieude);
		
		JLabel lblmaSP = new JLabel("Mã SP :");
		lblmaSP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblmaSP.setBounds(80, 61, 100, 20);
		getContentPane().add(lblmaSP);
		
		txtMaSanPham = new JTextField();
		txtMaSanPham.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtMaSanPham.setHorizontalAlignment(SwingConstants.LEFT);
		txtMaSanPham.setBounds(215, 61, 270, 20);
		getContentPane().add(txtMaSanPham);
		txtMaSanPham.setColumns(10);
		
		JLabel lblTen = new JLabel("Tên Mặt Hàng : ");
		lblTen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTen.setBounds(551, 61, 154, 20);
		getContentPane().add(lblTen);
		
		txtTenSP = new JTextField();
		txtTenSP.setHorizontalAlignment(SwingConstants.LEFT);
		txtTenSP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtTenSP.setBounds(713, 61, 220, 20);
		getContentPane().add(txtTenSP);
		txtTenSP.setColumns(10);
		
		JLabel lbltienNhap = new JLabel("Giá Nhập : ");
		lbltienNhap.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbltienNhap.setBounds(80, 141, 87, 20);
		getContentPane().add(lbltienNhap);
		txtGiaNhap = new JTextField();
		txtGiaNhap.setHorizontalAlignment(SwingConstants.LEFT);
		txtGiaNhap.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtGiaNhap.setBounds(215, 141, 270, 20);
		getContentPane().add(txtGiaNhap);
		txtGiaNhap.setColumns(10);
		
		JLabel lblSoLuong = new JLabel("Dòng Xe :");
		lblSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSoLuong.setBounds(551, 101, 154, 20);
		getContentPane().add(lblSoLuong);
		
		txtSoLuongTon = new JTextField();
		txtSoLuongTon.setHorizontalAlignment(SwingConstants.LEFT);
		txtSoLuongTon.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtSoLuongTon.setBounds(713, 101, 220, 19);
		getContentPane().add(txtSoLuongTon);
		txtSoLuongTon.setColumns(10);
		
		JLabel lblGiaBan = new JLabel("Giá bán ra : ");
		lblGiaBan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGiaBan.setBounds(80, 181, 100, 20);
		getContentPane().add(lblGiaBan);

		txtGiaBan = new JTextField();
		txtGiaBan.setHorizontalAlignment(SwingConstants.LEFT);
		txtGiaBan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtGiaBan.setBounds(215, 101, 270, 20);
		getContentPane().add(txtGiaBan);
		txtGiaBan.setColumns(10);
		
		JLabel lblMau = new JLabel("Màu");
		lblMau.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMau.setBounds(80, 221, 130, 20);
		getContentPane().add(lblMau);

		txtMauXe = new JTextField();
		txtMauXe.setHorizontalAlignment(SwingConstants.LEFT);
		txtMauXe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtMauXe.setBounds(215, 221, 270, 20);
		getContentPane().add(txtMauXe);
		txtMauXe.setColumns(10);
		
		JLabel lblDongCo = new JLabel("Dung Tich Xi Lanh :");
		lblDongCo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDongCo.setBounds(551, 221, 130, 20);
		getContentPane().add(lblDongCo);

		txtDungTichXiLanh = new JTextField();
		txtDungTichXiLanh.setHorizontalAlignment(SwingConstants.LEFT);
		txtDungTichXiLanh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDungTichXiLanh.setBounds(713, 221, 220, 20);
		getContentPane().add(txtDungTichXiLanh);
		txtDungTichXiLanh.setColumns(10);
		
		JLabel tlblKichThuoc = new JLabel("Kích Thước :");
		tlblKichThuoc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tlblKichThuoc.setBounds(80, 266, 100, 20);
		getContentPane().add(tlblKichThuoc);

		txtKichThuoc = new JTextField();
		txtKichThuoc.setHorizontalAlignment(SwingConstants.LEFT);
		txtKichThuoc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtKichThuoc.setBounds(215, 266, 271, 20);
		getContentPane().add(txtKichThuoc);
		txtKichThuoc.setColumns(10);
		
		JLabel lblNamSanXuat = new JLabel("Năm Sản Xuất :");
		lblNamSanXuat.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNamSanXuat.setBounds(551, 266, 130, 20);
		getContentPane().add(lblNamSanXuat);

		txtNamSanXuat = new JTextField();
		txtNamSanXuat.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNamSanXuat.setBounds(713, 266, 220, 20);
		getContentPane().add(txtNamSanXuat);
		txtNamSanXuat.setColumns(10);
		
		JLabel lblBaoHanh = new JLabel("Dung Tích Bình Xăng :");
		lblBaoHanh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBaoHanh.setBounds(551, 181, 130, 20);
		getContentPane().add(lblBaoHanh);

		txtDungTichBinhXang = new JTextField();
		txtDungTichBinhXang.setHorizontalAlignment(SwingConstants.LEFT);
		txtDungTichBinhXang.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDungTichBinhXang.setBounds(713, 181, 220, 20);
		getContentPane().add(txtDungTichBinhXang);
		txtDungTichBinhXang.setColumns(10);

		JLabel lblLoaiXe = new JLabel("Loại Xe : ");
		lblLoaiXe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLoaiXe.setBounds(80, 101, 100, 20);
		getContentPane().add(lblLoaiXe);

		txtLoaiXe = new JTextField();
		txtLoaiXe.setHorizontalAlignment(SwingConstants.LEFT);
		txtLoaiXe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtLoaiXe.setBounds(215, 181, 270, 20);
		getContentPane().add(txtLoaiXe);
		txtLoaiXe.setColumns(10);
		
		JLabel lblDongXe = new JLabel("Số Lượng :");
		lblDongXe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDongXe.setBounds(551, 141, 154, 20);
		getContentPane().add(lblDongXe);
		
		txtDongXe = new JTextField();
		txtDongXe.setHorizontalAlignment(SwingConstants.LEFT);
		txtDongXe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDongXe.setBounds(713, 141, 220, 19);
		getContentPane().add(txtDongXe);
		txtSoLuongTon.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(80, 302, 853, 204);
		getContentPane().add(scrollPane);

		String[] colHeader = { "Mã SP", "Tên SP", "Dòng Xe", "Loại Xe", "Số lượng", "Năm Sản Xuất", "Màu", "Dung Tích Xi Lanh", "Dung Tích Bình Xăng", "Giá Nhập", "Giá Bán", "Kích Thước" };
		modelXe = new DefaultTableModel(colHeader, 0);
		table_Xe = new JTable(modelXe);
		table_Xe.setFont(new Font("Tahoma", Font.PLAIN, 10));

		table_Xe.getColumnModel().getColumn(0).setPreferredWidth(41);
		table_Xe.getColumnModel().getColumn(1).setPreferredWidth(76);
		table_Xe.getColumnModel().getColumn(2).setPreferredWidth(101);
		table_Xe.getColumnModel().getColumn(3).setPreferredWidth(60);
		table_Xe.getColumnModel().getColumn(4).setPreferredWidth(85);
		table_Xe.getColumnModel().getColumn(5).setPreferredWidth(98);
		table_Xe.getColumnModel().getColumn(6).setPreferredWidth(88);
		table_Xe.getColumnModel().getColumn(7).setPreferredWidth(65);
		table_Xe.getColumnModel().getColumn(8).setPreferredWidth(5);
		table_Xe.getColumnModel().getColumn(9).setPreferredWidth(5);
		table_Xe.getColumnModel().getColumn(10).setPreferredWidth(5);
		table_Xe.getColumnModel().getColumn(11).setPreferredWidth(5);
		scrollPane.setViewportView(table_Xe);
		
		btnThem = new JButton("Thêm");
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnThem.setBounds(543, 516, 90, 40);
		getContentPane().add(btnThem);

		btnXoa = new JButton("Xóa");
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnXoa.setBounds(643, 516, 90, 40);
		getContentPane().add(btnXoa);

		btnXoaTrang = new JButton("Xóa Trắng");
		btnXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnXoaTrang.setBounds(743, 516, 90, 40);
		getContentPane().add(btnXoaTrang);
		
		txtTim = new JTextField();
		txtTim.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtTim.setBounds(80, 524, 313, 25);
		getContentPane().add(txtTim);
		txtTim.setColumns(10);
		
		btnTim = new JButton("Tìm");
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTim.setBounds(416, 516, 90, 40);
		getContentPane().add(btnTim);
		
		btnSua = new JButton("Lưu");
		btnSua.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSua.setBounds(843, 516, 90, 40);
		getContentPane().add(btnSua);
		btnTim.addActionListener(this);
		btnXoaTrang.addActionListener(this);
		btnXoa.addActionListener(this);
		btnThem.addActionListener(this);
		table_Xe.addMouseListener(this);

	}

	/**
	 * Initialize the contents of the frame.
	 */

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

