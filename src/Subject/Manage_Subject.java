package Subject;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;


import Advanced.Consecutive_sessions;
import DB.DbConnection;
import Home.Home;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Tags.Add_Tags;
import WorkingDays.AddWorkingdays;
import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.TabExpander;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;

public class Manage_Subject {

	private JFrame MngSubFrm;
	private Image home_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/home.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image lec_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/lecturer.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image stu_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/student.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image sub_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/subject.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image session_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/session.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image tag_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/tags.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image location_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/location.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image st_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/statics.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image days_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/Wdays.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image time_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/time.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image adv_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/adv1.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image room_logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/room.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textFieldID;


	public void refreshtable() {

		try {

			Connection con = DbConnection.connect();

			String query="select subID As SubID,year As Year,semester As Semester,subName As SubjectName,subCode As SubjectCode ,lectureHours As LectureHours,tuteHours As TuteHours,labHours As LabHours,evaluationHours As EvaluationHours from subjects ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));



		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage_Subject window = new Manage_Subject();
					window.MngSubFrm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Manage_Subject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		MngSubFrm = new JFrame();

		MngSubFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MngSubFrm.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		MngSubFrm.setBackground(Color.YELLOW);
		MngSubFrm.setTitle("Subjects");
		MngSubFrm.setSize(1350, 728);
		MngSubFrm.setBounds(0, 0, 1350, 700);
		MngSubFrm.setVisible(true);
		//ManageSesFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MngSubFrm.getContentPane().setLayout(null);
		MngSubFrm.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(0, 62, 262, 609);
		MngSubFrm.getContentPane().add(panel);

		JButton button = new JButton("Home");
		button.setIcon(new ImageIcon(home_logo));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MngSubFrm.dispose();
				new Home();

			}
		});
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 17));
		button.setBackground(new Color(0, 139, 139));
		button.setBounds(0, 10, 264, 38);
		panel.add(button);

		JButton button_1 = new JButton("<<Back");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(12, 724, 238, 50);
		panel.add(button_1);

		JButton button_2 = new JButton("Lecturers");
		button_2.setIcon(new ImageIcon(lec_logo));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MngSubFrm.dispose();
				new Add_Lecturer();
			}
		});
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_2.setBackground(new Color(0, 139, 139));
		button_2.setBounds(0, 59, 264, 38);
		panel.add(button_2);

		JButton button_3 = new JButton("Students");
		button_3.setIcon(new ImageIcon(stu_logo));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {


				MngSubFrm.dispose();
				new Add_StudentGroup();
			}
		});
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_3.setBackground(new Color(0, 139, 139));
		button_3.setBounds(0, 108, 264, 38);
		panel.add(button_3);

		JButton button_4 = new JButton("Subjects");
		button_4.setIcon(new ImageIcon(sub_logo));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				MngSubFrm.dispose();
				new Add_Subjects();
			}
		});
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_4.setBackground(new Color(0, 139, 139));
		button_4.setBounds(0, 157, 264, 38);
		panel.add(button_4);

		JButton button_5 = new JButton("Sessions");
		button_5.setIcon(new ImageIcon(session_logo));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				MngSubFrm.dispose();
				new Add_Session();
			}
		});
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_5.setBackground(new Color(0, 139, 139));
		button_5.setBounds(0, 206, 264, 38);
		panel.add(button_5);

		JButton button_6 = new JButton("Tags");
		button_6.setIcon(new ImageIcon(tag_logo));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				MngSubFrm.dispose();
				new Add_Tags();
			}
		});
		button_6.setHorizontalAlignment(SwingConstants.LEFT);
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_6.setBackground(new Color(0, 139, 139));
		button_6.setBounds(0, 255, 264, 38);
		panel.add(button_6);

		JButton button_7 = new JButton("Rooms");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MngSubFrm.dispose();
				new  ManageSessionsRooms();
			}
		});
		button_7.setIcon(new ImageIcon(room_logo));
		button_7.setHorizontalAlignment(SwingConstants.LEFT);
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_7.setBackground(new Color(0, 139, 139));
		button_7.setBounds(0, 304, 264, 38);
		panel.add(button_7);

		JButton button_8 = new JButton("Working days & Hours");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MngSubFrm.dispose();
				AddWorkingdays w_days= new 	AddWorkingdays();
				w_days.main(null);
			}
		});
		button_8.setIcon(new ImageIcon(days_logo));
		button_8.setHorizontalAlignment(SwingConstants.LEFT);
		button_8.setForeground(Color.WHITE);
		button_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_8.setBackground(new Color(0, 139, 139));
		button_8.setBounds(0, 353, 264, 38);
		panel.add(button_8);

		JButton button_9 = new JButton("Locations");
		button_9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				MngSubFrm.dispose();
				new ManageLocations();


			}
		});
		button_9.setIcon(new ImageIcon(location_logo));
		button_9.setHorizontalAlignment(SwingConstants.LEFT);
		button_9.setForeground(Color.WHITE);
		button_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_9.setBackground(new Color(0, 139, 139));
		button_9.setBounds(0, 402, 264, 38);
		panel.add(button_9);

		JButton button_10 = new JButton("Statistics");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MngSubFrm.dispose();
				new   Statistics();
			}
		});
		button_10.setIcon(new ImageIcon(st_logo));
		button_10.setHorizontalAlignment(SwingConstants.LEFT);
		button_10.setForeground(Color.WHITE);
		button_10.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_10.setBackground(new Color(0, 139, 139));
		button_10.setBounds(0, 451, 264, 38);
		panel.add(button_10);

		JButton button_11 = new JButton("Advanced");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MngSubFrm.dispose();
				new Consecutive_sessions();
			}

		});
		button_11.setIcon(new ImageIcon(adv_logo));
		button_11.setHorizontalAlignment(SwingConstants.LEFT);
		button_11.setForeground(Color.WHITE);
		button_11.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_11.setBackground(new Color(0, 139, 139));
		button_11.setBounds(0, 500, 264, 38);
		panel.add(button_11);

		JButton button_12 = new JButton("Timetable Generate");
		button_12.setIcon(new ImageIcon(time_logo));
		button_12.setHorizontalAlignment(SwingConstants.LEFT);
		button_12.setForeground(Color.WHITE);
		button_12.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_12.setBackground(new Color(0, 139, 139));
		button_12.setBounds(0, 549, 264, 38);
		panel.add(button_12);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(51, 153, 153));
		panel_1.setBounds(0, 0, 1344, 65);
		MngSubFrm.getContentPane().add(panel_1);

		JLabel label = new JLabel(" Subjects");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		label.setBackground(new Color(32, 178, 170));
		label.setBounds(262, 18, 1082, 36);
		panel_1.add(label);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(262, 102, 1082, 9);
		MngSubFrm.getContentPane().add(separator);

		JButton btnManageSubjects = new JButton("Manage Subjects");
		btnManageSubjects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MngSubFrm.dispose();
				new Manage_Subject();




			}
		});
		btnManageSubjects.setBounds(517, 66, 258, 37);
		MngSubFrm.getContentPane().add(btnManageSubjects);

		JButton btnAddNewSubject = new JButton("Add New Subject");
		btnAddNewSubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				MngSubFrm.dispose();
				new Add_Subjects();
			}
		});
		btnAddNewSubject.setBounds(262, 66, 258, 37);
		MngSubFrm.getContentPane().add(btnAddNewSubject);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(262, 89, 1075, 572);
		MngSubFrm.getContentPane().add(panel_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 52, 1055, 172);
		panel_2.add(scrollPane);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4"}));
		comboBox.setBounds(211, 136, 232, 23);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2"}));
		comboBox_5.setBounds(215, 200, 228, 23);


		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_4.setBounds(752, 14, 228, 23);


		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_3.setBounds(752, 73, 228, 23);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_2.setBounds(752, 136, 228, 23);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_1.setBounds(752, 199, 228, 23);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setViewportView(scrollPane_1);

		//Display selected row
		table = new JTable();

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				int i = table.getSelectedRow();
				TableModel model = table.getModel();


				textField_1.setText(model.getValueAt(i, 4).toString());
				textField.setText(model.getValueAt(i, 3).toString());
				textFieldID.setText(model.getValueAt(i, 0).toString());
				//String yr = model.getValueAt(i, 1).toString();

				String combolevel1 = table.getValueAt(i, 1).toString();
				for(int j=0 ;j<comboBox.getItemCount();j++) {

					if(comboBox.getItemAt(j).toString().equalsIgnoreCase(combolevel1)) {
						comboBox.setSelectedIndex(j);
					}
				}

				String combolevel2 = table.getValueAt(i, 2).toString();
				for(int j=0 ;j<comboBox_5.getItemCount();j++) {

					if(comboBox_5.getItemAt(j).toString().equalsIgnoreCase(combolevel2)) {
						comboBox_5.setSelectedIndex(j);
					}
				}
				String combolevel3 = table.getValueAt(i, 5).toString();
				for(int j=0 ;j<comboBox_4.getItemCount();j++) {

					if(comboBox_4.getItemAt(j).toString().equalsIgnoreCase(combolevel3)) {
						comboBox_4.setSelectedIndex(j);
					}
				}
				String combolevel4 = table.getValueAt(i, 6).toString();
				for(int j=0 ;j<comboBox_3.getItemCount();j++) {

					if(comboBox_3.getItemAt(j).toString().equalsIgnoreCase(combolevel4)) {
						comboBox_3.setSelectedIndex(j);
					}
				}
				String combolevel5 = table.getValueAt(i, 7).toString();
				for(int j=0 ;j<comboBox_2.getItemCount();j++) {

					if(comboBox_2.getItemAt(j).toString().equalsIgnoreCase(combolevel5)) {
						comboBox_2.setSelectedIndex(j);
					}
				}
				String combolevel6 = table.getValueAt(i, 8).toString();
				for(int j=0 ;j<comboBox_1.getItemCount();j++) {

					if(comboBox_1.getItemAt(j).toString().equalsIgnoreCase(combolevel6)) {
						comboBox_1.setSelectedIndex(j);
					}
				}


			}
		});
		//display details in a table
		scrollPane_1.setViewportView(table);

		try {
			Connection con = DbConnection.connect();

			String query="select subID As SubID,year As Year,semester As Semester,subName As SubjectName,subCode As SubjectCode ,lectureHours As LectureHours,tuteHours As TuteHours,labHours As LabHours,evaluationHours As EvaluationHours from subjects ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));

		}
		catch(Exception e) {
			e.printStackTrace();
		}

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_3.setBackground(new Color(245, 245, 245));
		panel_3.setBounds(10, 235, 1055, 326);
		panel_2.add(panel_3);



		panel_3.add(comboBox_5);

		JButton button_13 = new JButton("CLEAR");

		button_13.setForeground(Color.WHITE);
		button_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_13.setEnabled(true);
		button_13.setBackground(new Color(0, 128, 128));
		button_13.setBounds(632, 294, 141, 31);
		panel_3.add(button_13);

		JButton button_14 = new JButton("DELETE");

		button_14.setForeground(Color.WHITE);
		button_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_14.setEnabled(true);
		button_14.setBackground(new Color(0, 128, 128));
		button_14.setBounds(453, 294, 141, 31);
		panel_3.add(button_14);

		JButton button_15 = new JButton("EDIT");

		button_15.setForeground(Color.WHITE);
		button_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_15.setEnabled(true);
		button_15.setBackground(new Color(0, 128, 128));
		button_15.setBounds(271, 294, 141, 31);
		panel_3.add(button_15);

		JLabel label_1 = new JLabel("Subject Code");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(83, 13, 96, 23);
		panel_3.add(label_1);

		JLabel label_2 = new JLabel("Subject Name");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(83, 72, 96, 23);
		panel_3.add(label_2);

		JLabel label_3 = new JLabel("Offered Year");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(83, 135, 87, 23);
		panel_3.add(label_3);

		JLabel label_4 = new JLabel("Offered Semester");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(83, 198, 122, 23);
		panel_3.add(label_4);


		panel_3.add(comboBox);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(211, 73, 232, 23);
		panel_3.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(211, 14, 232, 23);
		panel_3.add(textField_1);


		panel_3.add(comboBox_1);

		JLabel label_5 = new JLabel("No Of Evaluation Hours");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(592, 198, 150, 23);
		panel_3.add(label_5);

		JLabel label_6 = new JLabel("No Of Lab Hours");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(592, 135, 150, 23);
		panel_3.add(label_6);


		panel_3.add(comboBox_2);


		panel_3.add(comboBox_3);

		JLabel label_7 = new JLabel("No Of Tutorial Hours");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(592, 72, 150, 23);
		panel_3.add(label_7);

		JLabel label_8 = new JLabel("No Of Lecture  Hours");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBounds(592, 13, 150, 23);
		panel_3.add(label_8);



		panel_3.add(comboBox_4);

		textFieldID = new JTextField();
		textFieldID.setBackground(SystemColor.controlHighlight);
		textFieldID.setEditable(false);
		textFieldID.setEnabled(false);
		textFieldID.setFont(new Font("Tahoma", Font.PLAIN, 5));
		textFieldID.setBounds(10, 13, 2, 3);
		panel_3.add(textFieldID);
		textFieldID.setColumns(10);



		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		panel_4.setBounds(0, 11, 1082, 38);
		panel_2.add(panel_4);

		JLabel lblManageSubbjects = new JLabel("Manage Subjects");
		lblManageSubbjects.setHorizontalAlignment(SwingConstants.CENTER);
		lblManageSubbjects.setForeground(new Color(0, 128, 128));
		lblManageSubbjects.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblManageSubbjects.setBounds(405, 0, 278, 38);
		panel_4.add(lblManageSubbjects);


		//Update Subject
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				 * DefaultTableModel defaultTableModel =(DefaultTableModel) table.getModel();
				 * defaultTableModel.fireTableChanged(e);
				 */

				try {

					Connection con = DbConnection.connect();
					String query="Update subjects set subCode='"+textField_1.getText()+"',subName='"+ textField.getText()+"',year='"+comboBox.getSelectedItem()+"',semester='"+ comboBox_5.getSelectedItem()+"',lectureHours='"+comboBox_4.getSelectedItem()+"',labHours='"+comboBox_3.getSelectedItem()+"',tuteHours='"+comboBox_2. getSelectedItem()+"',evaluationHours='"+comboBox_1.getSelectedItem() +"' where subID= '"+textFieldID.getText()+"'"; 
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					refreshtable();
					JLabel label = new JLabel("Data Updated Successfully");
					label.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label);
					pst.close();

				} catch(Exception ea)
				{ ea.printStackTrace(); }

			}
		});


		//delete subject
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {




				try {
					Connection con = DbConnection.connect();
					String query="Delete from subjects where subID='"+textFieldID.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();
					
					
					//JOptionPane.showMessageDialog(null, "","Alert",JOptionPane.WARNING_MESSAGE);
					JLabel label9 = new JLabel("Data Deleted Successfully");
					refreshtable();

					textField.setText("");
					textField_1.setText("");
					comboBox_1.setSelectedIndex(0);
					comboBox.setSelectedIndex(0);
					comboBox_2.setSelectedIndex(0);
					comboBox_3.setSelectedIndex(0);
					comboBox_4.setSelectedIndex(0);
					comboBox_5.setSelectedIndex(0);
					label9.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label9);
					pst.close();
					//table.revalidate();

				}
				catch(Exception en) {
					en.printStackTrace();

				}

			}
		});


		//clear button

		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {


				textField.setText("");
				textField_1.setText("");
				comboBox_1.setSelectedIndex(0);
				comboBox.setSelectedIndex(0);
				comboBox_2.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				comboBox_4.setSelectedIndex(0);
				comboBox_5.setSelectedIndex(0);

			}
		});
	}
}
