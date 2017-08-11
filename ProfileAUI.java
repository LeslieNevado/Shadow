package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ProfileAUI extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileAUI frame = new ProfileAUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProfileAUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBounds(0, 0, 539, 81);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAdminsName = new JLabel("Admin's Name");
		lblAdminsName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 33));
		lblAdminsName.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminsName.setBounds(10, 11, 253, 59);
		panel.add(lblAdminsName);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 0, 255));
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(131, 92, 398, 291);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID Number");
		lblNewLabel.setBounds(21, 21, 78, 20);
		panel_1.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(21, 52, 78, 20);
		panel_1.add(lblName);
		
		JLabel lblContactNumber = new JLabel("Contact Number");
		lblContactNumber.setBounds(21, 83, 78, 20);
		panel_1.add(lblContactNumber);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(21, 113, 78, 20);
		panel_1.add(lblAddress);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(76, 192, 247, 88);
		panel_1.add(scrollPane);
		
		DefaultTableModel logs = new DefaultTableModel();
		table = new JTable(logs);
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Activity", "Date"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(119, 21, 148, 20);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0,0,0),2));
		panel_1.add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBorder(new LineBorder(new Color(0,0,0),2));
		label.setBounds(119, 49, 148, 20);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBorder(new LineBorder(new Color(0,0,0),2));
		label_1.setBounds(119, 80, 148, 20);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBorder(new LineBorder(new Color(0,0,0),2));
		label_2.setBounds(119, 113, 148, 20);
		panel_1.add(label_2);
		
		JLabel lblLogs = new JLabel("LOGS");
		lblLogs.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblLogs.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogs.setBounds(76, 176, 247, 14);
		panel_1.add(lblLogs);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 128, 111, 23);
		contentPane.add(btnNewButton);
		
		JButton btnStudent = new JButton("Librarian");
		btnStudent.setBounds(10, 178, 111, 23);
		contentPane.add(btnStudent);
		
		JButton btnStudent_1 = new JButton("Student");
		btnStudent_1.setBounds(10, 227, 111, 23);
		contentPane.add(btnStudent_1);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setBounds(10, 281, 111, 23);
		contentPane.add(btnAbout);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(10, 327, 111, 23);
		contentPane.add(btnLogout);
	}
}
