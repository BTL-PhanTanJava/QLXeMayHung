package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
public class Layout_Login extends JFrame implements ActionListener, MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtTenDangNhap;
	private JPasswordField txtMatKhau;
	private JButton btnExit = new JButton("THOÁT");
	private JButton btnLogin = new JButton("ĐĂNG NHẬP");
	private JLabel lblngNhpVo;
	public Layout_Login() {
		// TODO Auto-generated constructor stub
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
		btnLogin.setBounds(391, 348, 90, 21);
		getContentPane().add(btnLogin);
		btnExit.setBounds(518, 348, 90, 21);
		getContentPane().add(btnExit);
		
		JLabel lblTnngNhp = new JLabel("Mã số nhân viên:");
		lblTnngNhp.setBounds(256, 245, 125, 16);
		lblTnngNhp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTnngNhp.setForeground(Color.WHITE);
		getContentPane().add(lblTnngNhp);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setBounds(391, 245, 217, 19);
		getContentPane().add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);
		
		JLabel lblMtKhu = new JLabel("Mật Khẩu:");
		lblMtKhu.setBounds(256, 300, 125, 13);
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMtKhu.setForeground(Color.WHITE);
		getContentPane().add(lblMtKhu);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setBounds(391, 297, 217, 19);
		getContentPane().add(txtMatKhau);
		txtMatKhau.setColumns(10);
		
		lblngNhpVo = new JLabel("ĐĂNG NHẬP VÀO HỆ THỐNG DUNG VINH");
		lblngNhpVo.setBounds(224, 69, 561, 117);
		lblngNhpVo.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblngNhpVo.setForeground(Color.WHITE);
		getContentPane().add(lblngNhpVo);
		  
		//
		btnExit.addActionListener(this);
		btnLogin.addActionListener(this);
		txtMatKhau.addActionListener(this);
		txtTenDangNhap.addActionListener(this);
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
