package Lecturer;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import DB.DbConnection;

import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddWorkDays {

	private JFrame frmAddStudentGroups;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxTuesday;
	private JCheckBox chckbxWednesday;
	private JCheckBox chckbxThursday;
	private JCheckBox chckbxFriday;
	private JCheckBox chckbxSaturday;
	private JCheckBox chckbxSunday;
	private JSpinner spi1;
	private JSpinner spi2;
	private JSpinner spi3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddWorkDays window = new AddWorkDays();
					window.frmAddStudentGroups.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddWorkDays() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentGroups = new JFrame();
		frmAddStudentGroups.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmAddStudentGroups.setBackground(Color.YELLOW);
		frmAddStudentGroups.setResizable(false);
		frmAddStudentGroups.setTitle("Add Working Days And Hours");
		//frmAddStudentGroups.setSize(1400, 860);
		frmAddStudentGroups.setBounds(350, 90, 1350, 900);
		frmAddStudentGroups.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentGroups.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frmAddStudentGroups.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setForeground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 787);
		panel_1.setBackground(Color.BLACK);
		frmAddStudentGroups.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Working Days");
		btnNewButton.setBounds(12, 320, 252, 50);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnManageGroups = new JButton("Manage Working Days");
		btnManageGroups.setBounds(12, 383, 238, 50);
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnManageGroups);
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setBounds(12, 724, 238, 50);
		btnViewGroups_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png/"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JLabel lblNewLabel_1 = new JLabel("Add Working Days And Hours");
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frmAddStudentGroups.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("No. of Working Days");
		lblNewLabel_2.setBounds(274, 268, 252, 25);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Working Days");
		lblNewLabel_2_1.setBounds(274, 354, 252, 25);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Working Time Per Day");
		lblNewLabel_2_1_2.setBounds(274, 554, 281, 25);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_2);
		
		spi1 = new JSpinner();
		spi1.setBounds(536, 262, 262, 38);
		spi1.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spi1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(spi1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 658, 1082, 124);
		panel_3.setBackground(Color.LIGHT_GRAY);
		frmAddStudentGroups.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(268, 42, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnSave = new JButton("Submit");
		btnSave.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				String NoOfWorkingDays= spi1.getValue().toString();
				String hours= spi2.getValue().toString();
				String minutes= spi3.getValue().toString();
				
				String monday="-";
				String tuesday="-";
				String wednesday="-";
				String thursday="-";
				String friday="-";
				String saturday="-";
				String sunday="-";
				
				
				if(chckbxNewCheckBox.isSelected()) {
					monday="Monday";
				}
				if(chckbxTuesday.isSelected()) {
					tuesday="Tuesday";
				}
				if(chckbxWednesday.isSelected()) {
					wednesday="Wednesday";
				}
				if(chckbxThursday.isSelected()) {
					thursday="Thursday";
				}
				if(chckbxFriday.isSelected()) {
					friday="Friday";
				}
				if(chckbxSaturday.isSelected()) {
					saturday="Saturday";
				}
				if(chckbxSunday.isSelected()) {
					sunday="Sunday";
				}
				 try {
					 Connection con = DbConnection.connect();

	                    String query = "INSERT INTO main values(1, '" + NoOfWorkingDays + "','" + monday + "','" + tuesday + "','" +
	                    		wednesday + "','" + thursday + "','" + friday + "','"+ saturday +"','"+ sunday +"','"+ hours +"','"+ minutes +"')";

	                    Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                        JOptionPane.showMessageDialog(btnSave, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(btnSave,
	                            "Welcome, Your account is sucessfully created");
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                    //exception.printStackTrace();
	                	JOptionPane.showMessageDialog(btnSave, "This is alredy exist");
	                }
			}
		});
		btnSave.setBounds(518, 42, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		chckbxNewCheckBox = new JCheckBox("Monday");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox.setBounds(536, 354, 125, 25);
		frmAddStudentGroups.getContentPane().add(chckbxNewCheckBox);
		
		chckbxTuesday = new JCheckBox("Tuesday");
		chckbxTuesday.setSelected(true);
		chckbxTuesday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxTuesday.setBounds(701, 354, 125, 25);
		frmAddStudentGroups.getContentPane().add(chckbxTuesday);
		
		 chckbxWednesday = new JCheckBox("Wednesday");
		chckbxWednesday.setSelected(true);
		chckbxWednesday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxWednesday.setBounds(852, 354, 135, 25);
		frmAddStudentGroups.getContentPane().add(chckbxWednesday);
		
		 chckbxThursday = new JCheckBox("Thursday");
		chckbxThursday.setSelected(true);
		chckbxThursday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxThursday.setBounds(1032, 354, 125, 25);
		frmAddStudentGroups.getContentPane().add(chckbxThursday);
		
		 chckbxFriday = new JCheckBox("Friday");
		chckbxFriday.setSelected(true);
		chckbxFriday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxFriday.setBounds(1183, 354, 125, 25);
		frmAddStudentGroups.getContentPane().add(chckbxFriday);
		
		 chckbxSaturday = new JCheckBox("Saturday");
		chckbxSaturday.setSelected(true);
		chckbxSaturday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxSaturday.setBounds(536, 427, 125, 25);
		frmAddStudentGroups.getContentPane().add(chckbxSaturday);
		
		 chckbxSunday = new JCheckBox("Sunday");
		chckbxSunday.setSelected(true);
		chckbxSunday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxSunday.setBounds(701, 427, 125, 25);
		frmAddStudentGroups.getContentPane().add(chckbxSunday);
		
		spi2 = new JSpinner();
		spi2.setFont(new Font("Tahoma", Font.BOLD, 20));
		spi2.setBounds(536, 541, 135, 38);
		frmAddStudentGroups.getContentPane().add(spi2);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHours.setBounds(701, 554, 96, 25);
		frmAddStudentGroups.getContentPane().add(lblHours);
		
		spi3 = new JSpinner();
		spi3.setFont(new Font("Tahoma", Font.BOLD, 20));
		spi3.setBounds(849, 541, 135, 38);
		frmAddStudentGroups.getContentPane().add(spi3);
		
		JLabel lblMinutes = new JLabel("Minutes");
		lblMinutes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMinutes.setBounds(1014, 554, 96, 25);
		frmAddStudentGroups.getContentPane().add(lblMinutes);
	 
	    
	}
}
