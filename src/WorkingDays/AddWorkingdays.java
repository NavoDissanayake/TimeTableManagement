/** 
 * IT19207346
 * N.H.N.N.Dissanayake
 */


package WorkingDays;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import Advanced.Consecutive_sessions;
import DB.DbConnection;
import Home.Home;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ConsecutiveSessionRooms;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Student.Manage_studentGroup;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import net.proteanit.sql.DbUtils;

import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;

public class AddWorkingdays {

	private Image home_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/home.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image lec_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/lecturer.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image stu_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/student.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image sub_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/subject.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image session_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/session.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image tag_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/tags.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image location_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/location.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image st_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/statics.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image days_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/Wdays.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image time_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/time.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image adv_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/adv1.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image room_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/room.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/pp.png")).getImage().getScaledInstance(1000,1000,Image.SCALE_SMOOTH);

	
	public JFrame frame;
	private JTable table;

	public void refreshtable() {	
	try {
		Connection con = DbConnection.connect();
		
		String query="SELECT WID as WID, NoOfDays as Days, monday as Monday, tuesday as Tuesday, wednesday as Wednesday, thursday as Thursday, friday as Friday, saturday as Saturday, sunday as Sunday, hours as Hours,minutes as Minutes FROM WorkingDays ";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		table.setModel(DbUtils.resultSetToTableModel(rs));
		TableColumnModel columnModel = table.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(1);
		columnModel.getColumn(1).setPreferredWidth(1);
		columnModel.getColumn(2).setPreferredWidth(50);
		columnModel.getColumn(3).setPreferredWidth(50);
		columnModel.getColumn(4).setPreferredWidth(40);
		columnModel.getColumn(5).setPreferredWidth(20);
		columnModel.getColumn(6).setPreferredWidth(50);
		columnModel.getColumn(7).setPreferredWidth(1);
		columnModel.getColumn(8).setPreferredWidth(1);
		columnModel.getColumn(9).setPreferredWidth(1);
		columnModel.getColumn(10).setPreferredWidth(1);
		
		
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
					AddWorkingdays window = new AddWorkingdays();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddWorkingdays() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBackground(Color.YELLOW);
		frame.setResizable(false);
		frame.setTitle("Time Table Management System");
		frame.setSize(1350, 728);
		frame.setBounds(0, 0, 1350, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(logo);
		frame.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Working Days And Hours");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setBounds(723, 13, 419, 29);
		panel.add(lblNewLabel_10);
		/*
		 * //JLabel lblNewLabel = new JLabel("Time Table Management System");
		 * lblNewLabel.setBounds(261, 5, 822, 61); panel.add(lblNewLabel);
		 * lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		 * lblNewLabel.setForeground(Color.WHITE);
		 */
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 62, 262, 609);
		panel_1.setBackground(new Color(230, 230, 250));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
	
		JButton btnLecturers = new JButton("Lecturers");
		btnLecturers.setHorizontalAlignment(SwingConstants.LEFT);
		btnLecturers.setIcon(new ImageIcon(lec_logo));
		btnLecturers.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					Add_Lecturer add_lecture = new Add_Lecturer();
					add_lecture.main(null);
					frame.dispose();
					
				}
			});
		btnLecturers.setForeground(Color.WHITE);
		btnLecturers.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLecturers.setBackground(new Color(0, 139, 139));
		btnLecturers.setBounds(0, 59, 264, 38);
		panel_1.add(btnLecturers);
		
		JButton btnStudents = new JButton("Students");
		btnStudents.setHorizontalAlignment(SwingConstants.LEFT);
		btnStudents.setIcon(new ImageIcon(stu_logo));
		btnLecturers.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				new Add_StudentGroup();
				
			}
		});
		btnStudents.setForeground(Color.WHITE);
		btnStudents.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStudents.setBackground(new Color(0, 139, 139));
		btnStudents.setBounds(0, 108, 264, 38);
		panel_1.add(btnStudents);
		
		//subject button
		JButton btnSubjects = new JButton("Subjects");
		btnSubjects.setHorizontalAlignment(SwingConstants.LEFT);
		btnSubjects.setIcon(new ImageIcon(sub_logo));
	btnSubjects.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				new Add_Subjects();
				
			}
		});
		btnSubjects.setForeground(Color.WHITE);
		btnSubjects.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSubjects.setBackground(new Color(0, 139, 139));
		btnSubjects.setBounds(0, 157, 264, 38);
		panel_1.add(btnSubjects);
		
		//session Button
		JButton btnSessions = new JButton("Sessions");
		btnSessions.setHorizontalAlignment(SwingConstants.LEFT);
		btnSessions.setIcon(new ImageIcon(session_logo));
	btnSessions.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				new Add_Session();
				
			}
		});
		btnSessions.setForeground(Color.WHITE);
		btnSessions.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSessions.setBackground(new Color(0, 139, 139));
		btnSessions.setBounds(0, 206, 264, 38);
		panel_1.add(btnSessions);
		
		//Tags Button
		JButton btnTags = new JButton("Tags");
		btnTags.setHorizontalAlignment(SwingConstants.LEFT);
		btnTags.setIcon(new ImageIcon(tag_logo));
		btnTags.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				new Add_Tags();
				
			}
		});
		btnTags.setForeground(Color.WHITE);
		btnTags.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTags.setBackground(new Color(0, 139, 139));
		btnTags.setBounds(0, 255, 264, 38);
		panel_1.add(btnTags);
		
		
		//Rooms Button
		JButton btnRooms = new JButton("Rooms");
		btnRooms.setHorizontalAlignment(SwingConstants.LEFT);
		btnRooms.setIcon(new ImageIcon(room_logo));
	btnRooms.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				new ConsecutiveSessionRooms();
				
			}
		});
		btnRooms.setForeground(Color.WHITE);
		btnRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnRooms.setBackground(new Color(0, 139, 139));
		btnRooms.setBounds(0, 304, 264, 38);
		panel_1.add(btnRooms);
		
		//working Days and hours button
		JButton btnWorkingDays = new JButton("Working days & Hours");
		btnWorkingDays.setHorizontalAlignment(SwingConstants.LEFT);
		btnWorkingDays.setIcon(new ImageIcon(days_logo));
		btnWorkingDays.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				


				frame.dispose();
				new AddWorkingdays();
				
			}
		});
		btnWorkingDays.setForeground(Color.WHITE);
		btnWorkingDays.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnWorkingDays.setBackground(new Color(0, 139, 139));
		btnWorkingDays.setBounds(0, 353, 264, 38);
		panel_1.add(btnWorkingDays);
		
		//Location button
		JButton btnLocations = new JButton("Locations");
		btnLocations.setHorizontalAlignment(SwingConstants.LEFT);
		btnLocations.setIcon(new ImageIcon(location_logo));
	btnLocations.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				new ManageLocations();
				
			}
		});
		btnLocations.setForeground(Color.WHITE);
		btnLocations.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLocations.setBackground(new Color(0, 139, 139));
		btnLocations.setBounds(0, 402, 264, 38);
		panel_1.add(btnLocations);
		
		//statistcs button
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.setHorizontalAlignment(SwingConstants.LEFT);
		btnStatistics.setIcon(new ImageIcon(st_logo));
		btnStatistics.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				new Statistics();
				
			}
		});
		btnStatistics.setForeground(Color.WHITE);
		btnStatistics.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStatistics.setBackground(new Color(0, 139, 139));
		btnStatistics.setBounds(0, 451, 264, 38);
		panel_1.add(btnStatistics);
		
		//advanced button
		JButton btnAdvanced = new JButton("Advanced");
		btnAdvanced.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdvanced.setIcon(new ImageIcon(adv_logo));
		btnAdvanced.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Consecutive_sessions a_session= new Consecutive_sessions ();
				//a_session.main(null);
				frame.dispose();
				new Consecutive_sessions();
				
				
			}
		});
		btnAdvanced.setForeground(Color.WHITE);
		btnAdvanced.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdvanced.setBackground(new Color(0, 139, 139));
		btnAdvanced.setBounds(0, 500, 264, 38);
		panel_1.add(btnAdvanced);
		
		//Time table genereate button
		JButton btnTimetableGenerate = new JButton("Timetable Generate");
		btnTimetableGenerate.setHorizontalAlignment(SwingConstants.LEFT);
		btnTimetableGenerate.setIcon(new ImageIcon(time_logo));
		btnTimetableGenerate.setForeground(Color.WHITE);
		btnTimetableGenerate.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTimetableGenerate.setBackground(new Color(0, 139, 139));
		btnTimetableGenerate.setBounds(0, 549, 264, 38);
		panel_1.add(btnTimetableGenerate);
		
		//home button
		JButton btnManageGroups = new JButton("Home");
		btnManageGroups.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageGroups.setIcon(new ImageIcon(home_logo));
		btnManageGroups.setBounds(0, 13, 262, 33);
		panel_1.add(btnManageGroups);
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				frame.dispose();
				new Home();
			}
		});
		btnManageGroups.setForeground(new Color(255, 255, 255));
		btnManageGroups.setBackground(new Color(0, 139, 139));
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(230, 230, 250));
		panel_3.setBounds(263, 62, 1081, 628);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(10, 50, 1082, 49);
		panel_3.add(panel_6);
		
		
		JLabel lblNewLabel_11 = new JLabel("Add Working Days");
		lblNewLabel_11.setForeground(new Color(0, 128, 128));
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_11.setBounds(406, 13, 436, 31);
		panel_6.add(lblNewLabel_11);
		
		JButton btnNewButton_2 = new JButton("Add Working Days");
		btnNewButton_2.setBounds(0, 2, 554, 37);
		panel_3.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				new AddWorkingdays();
				
			}
		});
		
		
		JButton btnNewButton_2_1 = new JButton("Manage Working Days");
		btnNewButton_2_1.setBounds(554, 2, 528, 37);
		panel_3.add(btnNewButton_2_1);
	btnNewButton_2_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				new ManageWorkingDays();
				
			}
		});
		
		
	//process
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBounds(92, 129, 853, 310);
		panel_3.add(panel_4);
		

		
		JLabel lblNewLabel = new JLabel("Working Hours");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(35, 276, 108, 23);
		panel_4.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Number Of Working Days");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(35, 11, 185, 23);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Select Days");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(35, 57, 108, 23);
		panel_4.add(lblNewLabel_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setBounds(153, 277, 73, 23);
		panel_4.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 30, 30));
		spinner_1.setBounds(282, 277, 67, 23);
		panel_4.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 7, 1));
		spinner_2.setBounds(219, 12, 161, 23);
		panel_4.add(spinner_2);

		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Monday");
		chckbxNewCheckBox.setBounds(219, 58, 97, 23);
		panel_4.add(chckbxNewCheckBox);
		
		JCheckBox chckbxTeusday = new JCheckBox("Tuesday");
		chckbxTeusday.setBounds(219, 84, 97, 23);
		panel_4.add(chckbxTeusday);
		
		JCheckBox chckbxWednesday = new JCheckBox("Wednesday");
		chckbxWednesday.setBounds(219, 110, 97, 23);
		panel_4.add(chckbxWednesday);
		
		JCheckBox chckbxThursday = new JCheckBox("Thursday");
		chckbxThursday.setBounds(219, 136, 80, 23);
		panel_4.add(chckbxThursday);
				
		JCheckBox chckbxFriday = new JCheckBox("Friday");
		chckbxFriday.setBounds(219, 162, 97, 23);
		panel_4.add(chckbxFriday);
		
		JCheckBox chckbxSaturday = new JCheckBox("Saturday");
		chckbxSaturday.setBounds(219, 186, 97, 23);
		panel_4.add(chckbxSaturday);
		
		JCheckBox chckbxSunday = new JCheckBox("Sunday");
		chckbxSunday.setBounds(219, 212, 97, 23);
		panel_4.add(chckbxSunday);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHours.setBounds(232, 276, 42, 23);
		panel_4.add(lblHours);
		
		JLabel lblMinutes = new JLabel("Minutes");
		lblMinutes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMinutes.setBounds(354, 276, 55, 23);
		panel_4.add(lblMinutes);
		
		//Add Working Days
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String NoOfWorkingDays= spinner_2.getValue().toString();
				
				
				String monday="-";
				String tuesday="-";
				String wednesday="-";
				String thursday="-";
				String friday="-";
				String saturday="-";
				String sunday="-";
				String hours= spinner.getValue().toString();
				String minutes=spinner_1.getValue().toString();
				
				
				if(chckbxNewCheckBox .isSelected()) 
				{
					monday="Monday";
				}
				if( chckbxTeusday.isSelected())
				{
					tuesday="Tuesday";
				}
				if(chckbxWednesday.isSelected()) 
				{
					wednesday="Wednesday";
				}
				if( chckbxThursday.isSelected())
				{
					thursday="Thursday";
				}
				if(chckbxFriday.isSelected()) 
				{
					friday="Friday";
				}
				if(chckbxSaturday.isSelected()) 
				{
					saturday="Saturday";
				}
				if(chckbxSunday.isSelected())
				{
					sunday="Sunday";
				}
				 if(spinner_2.getValue().equals(0)&& spinner.getValue().equals(0)&& spinner_1.getValue().equals(0)) {
						JOptionPane.showMessageDialog(null, "Please Select Number of working Hours and Days!!!");
					}
					 else if(spinner_2.getValue().equals(0)) {
							JOptionPane.showMessageDialog(null, "Please Select Number of working days!!!");
						}
					 
					 else if(spinner.getValue().equals(0)&& spinner_1.getValue().equals(0)) {
							JOptionPane.showMessageDialog(null, "Please Select Number of working hours and minutes!!!");
						}
				
				else {
					try {
					 Connection con = DbConnection.connect();

	                    String query = "INSERT INTO WorkingDays values(null, '" + NoOfWorkingDays + "','" + monday + "','" + tuesday + "','" +
	                    		wednesday + "','" + thursday + "','" + friday + "','"+ saturday +"','"+ sunday +"','"+ hours +"','"+ minutes +"')";

	                    Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) 
	                    {
	                    	JLabel label = new JLabel("This is alredy exist");
	    					label.setHorizontalAlignment(SwingConstants.CENTER);
	    					JOptionPane.showMessageDialog(null, label);
	                    } 
	                    else
	                    {
	                    	JLabel label = new JLabel("Working Days Details Inserted Successfully");
	    					label.setHorizontalAlignment(SwingConstants.CENTER);
	    					JOptionPane.showMessageDialog(null, label);
	                    } 
	                    con.close();
	                }
					catch (Exception exception) 
					{
	                	 System.out.println("Error!!");
	                }
				}
			}
		});
		refreshtable() ;

		btnAdd.setEnabled(true);
		btnAdd.setBackground(new Color(0, 153, 153));
		btnAdd.setBounds(671, 57, 141, 31);
		panel_4.add(btnAdd);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		//CLEAR 
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				spinner_2.setValue(0);
				spinner.setValue(0);
				spinner_1.setValue(0);
				chckbxNewCheckBox.setSelected(false);
				chckbxTeusday.setSelected(false);
				chckbxWednesday.setSelected(false);
				chckbxThursday.setSelected(false);
				chckbxFriday.setSelected(false);
				chckbxSaturday.setSelected(false);
				chckbxSunday.setSelected(false);
				
			
			}
		});
		
		btnClear.setBounds(671, 130, 141, 31);
		panel_4.add(btnClear);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setEnabled(true);
		btnClear.setBackground(new Color(0, 153, 153));
		

		//Table View
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(92, 439, 853, 114);
		panel_3.add(scrollPane);
		
		 table = new JTable();
		 

		//table header
		JTableHeader h = table.getTableHeader();
		h.setBackground(new Color(153,153,153));
		h.setForeground(Color.WHITE);
		h.setFont(new Font("Times New Roman", Font.BOLD, 17));
			
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int selectedRow=table.getSelectedRow();
				 
					spinner_2.setValue(table.getValueAt(selectedRow, 2).toString());
					spinner.setValue(table.getValueAt(selectedRow, 9).toString());
					spinner.setValue(table.getValueAt(selectedRow, 10).toString());
					
					 
				
			}
		});
		scrollPane.setViewportView(table);
		
		try {
			Connection con = DbConnection.connect();
			
			String query="SELECT WID as WID, NoOfDays as Days, monday as Monday, tuesday as Tuesday, wednesday as Wednesday, thursday as Thursday, friday as Friday, saturday as Saturday, sunday as Sunday, hours as Hours,minutes as Minutes FROM WorkingDays ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			TableColumnModel columnModel = table.getColumnModel();
			columnModel.getColumn(0).setPreferredWidth(1);
			columnModel.getColumn(1).setPreferredWidth(1);
			columnModel.getColumn(2).setPreferredWidth(50);
			columnModel.getColumn(3).setPreferredWidth(50);
			columnModel.getColumn(4).setPreferredWidth(40);
			columnModel.getColumn(5).setPreferredWidth(20);
			columnModel.getColumn(6).setPreferredWidth(50);
			columnModel.getColumn(7).setPreferredWidth(1);
			columnModel.getColumn(8).setPreferredWidth(1);
			columnModel.getColumn(9).setPreferredWidth(1);
			columnModel.getColumn(10).setPreferredWidth(1);
			refreshtable() ;
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

		//refresh button
		JButton btnRefresh = new JButton("REFRESH");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con = DbConnection.connect();
					
					String query="select * from WorkingDays ";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnRefresh.setForeground(Color.WHITE);
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRefresh.setEnabled(true);
		btnRefresh.setBackground(new Color(0, 153, 153));
		btnRefresh.setBounds(611, 564, 141, 31);
		panel_3.add(btnRefresh);	

		
		//Manage button redirect to the manage working days 
		JButton btnNewButton = new JButton("MANAGE");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setEnabled(true);
		btnNewButton.setBackground(new Color(0, 153, 153));
		btnNewButton.setBounds(766, 564, 141, 31);
		panel_3.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ManageWorkingDays m_stgroup = new ManageWorkingDays ();
				m_stgroup.main(null);
				frame.dispose();
				
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(0, 40, 1082, 31);
		panel_3.add(separator);
		



		
		
		
		


		
	}
}
