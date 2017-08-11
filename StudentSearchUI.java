package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JLayeredPane;

public class StudentSearchUI extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JPanel panel_1;
	private JTextArea textArea;

	
	public static void main(String[] args) {
		try {
			StudentSearchUI dialog = new StudentSearchUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public StudentSearchUI() {
		setResizable(false);
		setTitle("Library Management System");
		
		initializeComponents();
		createEvents();
		
	}


	private void createEvents() {
		// TODO Auto-generated method stub
		
	}


	private void initializeComponents() {
		setBounds(100, 100, 572, 386);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 566, 357);
		contentPanel.setBackground(new Color(255, 0, 51));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		
		btnNewButton = new JButton("Profile");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnNewButton_1 = new JButton("Search Book");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnNewButton_2 = new JButton("Borrowed Books");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		btnNewButton_3 = new JButton("Logout");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 51, 0));
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 102, 102));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnNewButton_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel_1.setLayout(null);
		
		JLabel lblIdNo = new JLabel("Search:");
		lblIdNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdNo.setBounds(20, 21, 72, 17);
		panel_1.add(lblIdNo);
		
		JLabel lblNewLabel = new JLabel("Borrow: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(20, 63, 107, 23);
		panel_1.add(lblNewLabel);
		
		textArea = new JTextArea();
		textArea.setBounds(102, 20, 200, 22);
		panel_1.add(textArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(89, 63, 308, 193);
		panel_1.add(panel_2);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(308, 21, 89, 23);
		panel_1.add(btnOk);
		panel.setLayout(null);
		
		JLabel lblStudentsName = new JLabel("Student's Name ");
		lblStudentsName.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblStudentsName.setBounds(10, 0, 211, 67);
		panel.add(lblStudentsName);
		contentPanel.setLayout(gl_contentPanel);
		
	}
}