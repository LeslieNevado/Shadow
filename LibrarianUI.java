package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class LibrarianUI extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton btnProfile;
	private JButton btnAddBook;
	private JButton btnEditBook;
	private JButton btnIssueBook;
	private JButton btnViewIssuedBooks;
	private JButton btnReturnBook;
	private JButton btnViewReturnedBooks;
	private JLabel lblIdNo;
	private JLabel lblName;
	private JLabel lblContactNo;
	private JLabel lblAddress;
	private JLabel lblProfile;
	private JTextArea txtrlibrariansName;
	private JPanel panel;
	private JPanel panel_1;
	private JTable table;

	

	public LibrarianUI() {
		
		initializeComponents();
		createEvents();
			
	}

	private void createEvents() {
		// TODO Auto-generated method stub
		
	}

	private void initializeComponents() {
		setTitle("Library Management System");
		setBounds(100, 100, 811, 406);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 204, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		panel = new JPanel();
		panel.setBackground(new Color(51, 153, 204));
		
		btnProfile = new JButton("Profile");
		
		btnAddBook = new JButton("Add Book");
		
		btnEditBook = new JButton("Edit Book");
		
		btnIssueBook = new JButton("Issue Book");
		
		btnViewIssuedBooks = new JButton("View Issued Books");
		
		btnReturnBook = new JButton("Return Book");
		
		btnViewReturnedBooks = new JButton("View Returned Books");
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 255, 204));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnReturnBook, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnViewIssuedBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnIssueBook, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnEditBook, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAddBook, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnProfile, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnViewReturnedBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(btnProfile)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAddBook)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnEditBook)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnIssueBook)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnViewIssuedBooks)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnReturnBook)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnViewReturnedBooks))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		txtrlibrariansName = new JTextArea();
		txtrlibrariansName.setEditable(false);
		txtrlibrariansName.setBackground(new Color(51, 153, 204));
		txtrlibrariansName.setFont(new Font("Monospaced", Font.BOLD, 17));
		txtrlibrariansName.setText("(Librarian's Name)");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrlibrariansName, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(454, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrlibrariansName, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		lblIdNo = new JLabel("ID No.:");
		lblIdNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblContactNo = new JLabel("Contact No.:");
		lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblProfile = new JLabel("Profile");
		lblProfile.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAddress)
								.addComponent(lblContactNo)
								.addComponent(lblName)
								.addComponent(lblIdNo)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(284)
							.addComponent(lblProfile))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(lblProfile)
					.addGap(18)
					.addComponent(lblIdNo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblName)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblContactNo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAddress)
					.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Activity", "Date"
			}
		));
		scrollPane.setViewportView(table);
		panel_1.setLayout(gl_panel_1);
		contentPanel.setLayout(gl_contentPanel);
		
	}
	
	public static void main(String[] args) {
		try {
			LibrarianUI dialog = new LibrarianUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


