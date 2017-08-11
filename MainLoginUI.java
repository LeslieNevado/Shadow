package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class MainLoginUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JFrame frmLoginSystem;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainLoginUI frame = new MainLoginUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MainLoginUI() {
		initializeComponents();
		createEvents();
		
		
	}


	private void createEvents() {
		
	}


	private void initializeComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewEraUniversity = new JLabel("New Era University");
		lblNewEraUniversity.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewEraUniversity.setBounds(238, 32, 149, 14);
		contentPane.add(lblNewEraUniversity);
		
		JLabel lblLibraryManagementSystem = new JLabel("Library Management System");
		lblLibraryManagementSystem.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblLibraryManagementSystem.setBounds(199, 57, 225, 19);
		contentPane.add(lblLibraryManagementSystem);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdmin.setBounds(24, 111, 89, 23);
		contentPane.add(btnAdmin);
		
		JButton btnLibrarian = new JButton("Librarian");
		btnLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLibrarian.setBounds(24, 145, 89, 23);
		contentPane.add(btnLibrarian);
		
		JButton btnStudent = new JButton("Student ");
		btnStudent.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnStudent.setBounds(24, 179, 89, 23);
		contentPane.add(btnStudent);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(0, 204, 255));
		panel.setBounds(136, 99, 425, 219);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblLogin.setBounds(201, 23, 54, 20);
		panel.add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblUsername.setBounds(114, 72, 81, 19);
		panel.add(lblUsername);
		
		JLabel lblPasswird = new JLabel("Password:");
		lblPasswird.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblPasswird.setBounds(114, 103, 71, 19);
		panel.add(lblPasswird);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(201, 73, 122, 20);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setBounds(142, 160, 80, 23);
		panel.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.setBounds(232, 160, 80, 23);
		panel.add(btnCancel);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(201, 104, 122, 19);
		panel.add(txtPassword);
		
	}
}
