package Lecturer;

import java.awt.EventQueue;

import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Advanced.Consecutive_sessions;
import DB.DbConnection;
import Home.Home;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import WorkingDays.AddWorkingdays;

import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Add_Lecturer {

	private JFrame addLecframe;
	
	
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
	private JTextField EmpidTxt;
	private JTextField RankTxt;
	private JTextField EmpNameTxt;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Lecturer window = new Add_Lecturer();
					window.addLecframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_Lecturer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addLecframe = new JFrame();
		
	
		addLecframe.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		addLecframe.setBackground(Color.YELLOW);
		addLecframe.setTitle("Lecturers");
		addLecframe.setSize(1400, 860);
		addLecframe.setBounds(0, 0, 1350, 700);
		addLecframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addLecframe.getContentPane().setLayout(null);
		addLecframe.setLocationRelativeTo(null);
		addLecframe.setVisible(true);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(51, 153, 153));
		addLecframe.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Lecturers");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(739, 25, 148, 29);
		panel.add(lblNewLabel_2);
		/*
		 * //JLabel lblNewLabel = new JLabel("Time Table Management System");
		 * lblNewLabel.setBounds(261, 5, 822, 61); panel.add(lblNewLabel);
		 * lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		 * lblNewLabel.setForeground(Color.WHITE);
		 */
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 62, 262, 609);
		panel_1.setBackground(new Color(230, 230, 250));
		addLecframe.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton btnManageGroups = new JButton("Home");
		btnManageGroups.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageGroups.setIcon(new ImageIcon(home_logo));
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				addLecframe.dispose();
				new Home();
			}
		});
		btnManageGroups.setForeground(new Color(255, 255, 255));
		btnManageGroups.setBackground(new Color(0, 139, 139));
		btnManageGroups.setBounds(0, 10, 264, 38);
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_1.add(btnManageGroups);
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setBounds(12, 724, 238, 50);
		btnViewGroups_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		
		JButton button_7 = new JButton("Lecturers");
		button_7.setHorizontalAlignment(SwingConstants.LEFT);
		button_7.setIcon(new ImageIcon(lec_logo));
        button_7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				addLecframe.dispose();
				new Add_Lecturer();
				
			}
		});
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_7.setBackground(new Color(0, 139, 139));
		button_7.setBounds(0, 59, 264, 38);
		panel_1.add(button_7);
		
		JButton btnStudents = new JButton("Students");
		btnStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				addLecframe.dispose();
				new Add_StudentGroup();
			}
		});
		btnStudents.setHorizontalAlignment(SwingConstants.LEFT);
		btnStudents.setIcon(new ImageIcon(stu_logo));
		btnStudents.setForeground(Color.WHITE);
		btnStudents.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStudents.setBackground(new Color(0, 139, 139));
		btnStudents.setBounds(0, 108, 264, 38);
		panel_1.add(btnStudents);
		
		JButton btnSubjects = new JButton("Subjects");
		btnSubjects.setHorizontalAlignment(SwingConstants.LEFT);
		btnSubjects.setIcon(new ImageIcon(sub_logo));
		btnSubjects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				addLecframe.dispose();
				new Add_Subjects();
			}
		});
		btnSubjects.setForeground(Color.WHITE);
		btnSubjects.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSubjects.setBackground(new Color(0, 139, 139));
		btnSubjects.setBounds(0, 157, 264, 38);
		panel_1.add(btnSubjects);
		
		JButton btnSessions = new JButton("Sessions");
		btnSessions.setHorizontalAlignment(SwingConstants.LEFT);
		btnSessions.setIcon(new ImageIcon(session_logo));
		btnSessions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				addLecframe.dispose();
				new Add_Session();
			}
		});
		btnSessions.setForeground(Color.WHITE);
		btnSessions.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSessions.setBackground(new Color(0, 139, 139));
		btnSessions.setBounds(0, 206, 264, 38);
		panel_1.add(btnSessions);
		
		JButton btnTags = new JButton("Tags");
		btnTags.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				addLecframe.dispose();
				new Add_Tags();
			}
		});
		btnTags.setHorizontalAlignment(SwingConstants.LEFT);
		btnTags.setIcon(new ImageIcon(tag_logo));
		btnTags.setForeground(Color.WHITE);
		btnTags.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTags.setBackground(new Color(0, 139, 139));
		btnTags.setBounds(0, 255, 264, 38);
		panel_1.add(btnTags);
		
		JButton btnRooms = new JButton("Rooms");
		btnRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addLecframe.dispose();
				new  ManageSessionsRooms();
			}
		});
		btnRooms.setHorizontalAlignment(SwingConstants.LEFT);
		btnRooms.setIcon(new ImageIcon(room_logo));
		btnRooms.setForeground(Color.WHITE);
		btnRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnRooms.setBackground(new Color(0, 139, 139));
		btnRooms.setBounds(0, 304, 264, 38);
		panel_1.add(btnRooms);
		
		JButton btnWorkingDays = new JButton("Working days & Hours");
		btnWorkingDays.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addLecframe.dispose();
				AddWorkingdays w_days= new 	AddWorkingdays();
				w_days.main(null);
			}
		});
		btnWorkingDays.setHorizontalAlignment(SwingConstants.LEFT);
		btnWorkingDays.setIcon(new ImageIcon(days_logo));
		btnWorkingDays.setForeground(Color.WHITE);
		btnWorkingDays.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnWorkingDays.setBackground(new Color(0, 139, 139));
		btnWorkingDays.setBounds(0, 353, 264, 38);
		panel_1.add(btnWorkingDays);
		
		JButton btnLocations = new JButton("Locations");
btnLocations.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				addLecframe.dispose();
				new ManageLocations();
				
			}
		});
		btnLocations.setHorizontalAlignment(SwingConstants.LEFT);
		btnLocations.setIcon(new ImageIcon(location_logo));
		btnLocations.setForeground(Color.WHITE);
		btnLocations.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLocations.setBackground(new Color(0, 139, 139));
		btnLocations.setBounds(0, 402, 264, 38);
		panel_1.add(btnLocations);
		
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addLecframe.dispose();
				new   Statistics();
			}
		});
		btnStatistics.setHorizontalAlignment(SwingConstants.LEFT);
		btnStatistics.setIcon(new ImageIcon(st_logo));
		btnStatistics.setForeground(Color.WHITE);
		btnStatistics.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStatistics.setBackground(new Color(0, 139, 139));
		btnStatistics.setBounds(0, 451, 264, 38);
		panel_1.add(btnStatistics);
		
		JButton btnAdvanced = new JButton("Advanced");
		btnAdvanced.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addLecframe.dispose();
				new Consecutive_sessions();
			}
			
		});
		btnAdvanced.setIcon(new ImageIcon(adv_logo));
		btnAdvanced.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdvanced.setForeground(Color.WHITE);
		btnAdvanced.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdvanced.setBackground(new Color(0, 139, 139));
		btnAdvanced.setBounds(0, 500, 264, 38);
		panel_1.add(btnAdvanced);
		
		JButton btnTimetableGenerate = new JButton("Timetable Generate");
		btnTimetableGenerate.setIcon(new ImageIcon(time_logo));
		btnTimetableGenerate.setHorizontalAlignment(SwingConstants.LEFT);
		btnTimetableGenerate.setForeground(Color.WHITE);
		btnTimetableGenerate.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTimetableGenerate.setBackground(new Color(0, 139, 139));
		btnTimetableGenerate.setBounds(0, 549, 264, 38);
		panel_1.add(btnTimetableGenerate);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(269, 104, 1075, 556);
		addLecframe.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBounds(10, 52, 1044, 113);
		panel_2.add(panel_3);
		
		EmpidTxt = new JTextField();
		EmpidTxt.setColumns(10);
		EmpidTxt.setBounds(127, 19, 161, 23);
		panel_3.add(EmpidTxt);
		
		JLabel label = new JLabel("Employee ID");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(42, 18, 108, 23);
		panel_3.add(label);
		
		JComboBox levelCmb = new JComboBox();
		levelCmb.setModel(new DefaultComboBoxModel(new String[] {"", "Professor", "Assistant Professor", "Senior Lecturer(HG)", "Senior Lecturer", "Lecturer", "Assistant Lecturer"}));
		levelCmb.setBounds(456, 19, 191, 23);
		panel_3.add(levelCmb);
		
		JLabel label_1 = new JLabel("Level");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(398, 18, 108, 23);
		panel_3.add(label_1);
		
		RankTxt = new JTextField();
		RankTxt.setForeground(SystemColor.controlDkShadow);
		RankTxt.setColumns(10);
		RankTxt.setBounds(824, 19, 191, 23);
		panel_3.add(RankTxt);
		
		JLabel label_2 = new JLabel("Rank");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setBounds(764, 18, 108, 23);
		panel_3.add(label_2);
		
		
		//Generate Rank
		JButton btnGenRankAdd = new JButton("GENERATE RANK");
		btnGenRankAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String levelNum ;
				
				
				 if(EmpidTxt.getText().equals("") || levelCmb.getSelectedItem().equals("")) {
		            	//JLabel label9 = new JLabel("Please Enter Values");
						//label9.setHorizontalAlignment(SwingConstants.CENTER);
						JOptionPane.showMessageDialog(null, "Please Enter Values","Alert",JOptionPane.WARNING_MESSAGE);
						

					}else {
				
				if(levelCmb.getSelectedItem().toString() == "Professor")
				{
					levelNum = "1";
				}
				else if(levelCmb.getSelectedItem().toString() == "Assistant Professor")
				{
					levelNum = "2" ;
				}
				else if(levelCmb.getSelectedItem().toString() == "Senior Lecturer(HG)")
				{
					levelNum = "3" ;
				}
				else if(levelCmb.getSelectedItem().toString() == "Senior Lecturer")
				{
					levelNum = "4" ;
				}
				else if(levelCmb.getSelectedItem().toString() == "Lecturer")
				{
					levelNum = "5" ;
				}
				else if(levelCmb.getSelectedItem().toString() == "Assistant Lecturer")
				{
					levelNum = "6" ;
				}
				else
				{
					levelNum = " ";
				}
				
				RankTxt.setText(levelNum + "." + EmpidTxt.getText());
				
				JLabel label8 = new JLabel("Rank Generated Successfully");
				label8.setHorizontalAlignment(SwingConstants.CENTER);
				JOptionPane.showMessageDialog(null, label8);
				
				 
					}
				
			}
		});
		btnGenRankAdd.setForeground(Color.WHITE);
		btnGenRankAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGenRankAdd.setBackground(new Color(119, 136, 153));
		btnGenRankAdd.setBounds(398, 64, 249, 33);
		panel_3.add(btnGenRankAdd);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBounds(10, 169, 1044, 376);
		panel_2.add(panel_4);
		
		JLabel label_3 = new JLabel("Employee Name");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3.setBounds(110, 38, 96, 23);
		panel_4.add(label_3);
		
		EmpNameTxt = new JTextField();
		EmpNameTxt.setColumns(10);
		EmpNameTxt.setBounds(225, 39, 161, 23);
		panel_4.add(EmpNameTxt);
		
		JComboBox Fac = new JComboBox();
		Fac.setModel(new DefaultComboBoxModel(new String[] {"", "Computing", "Engineering", "Buisness Management", "Humanities and Science"}));
		Fac.setBounds(225, 92, 161, 23);
		panel_4.add(Fac);
		
		JLabel label_4 = new JLabel("Faculty");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_4.setBounds(110, 91, 87, 23);
		panel_4.add(label_4);
		
		JLabel label_5 = new JLabel("Department");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_5.setBounds(110, 148, 87, 23);
		panel_4.add(label_5);
		
		JComboBox Dept = new JComboBox();
		Dept.setModel(new DefaultComboBoxModel(new String[] {"", "IT", "SE", "DS", "CS", "IM", "CSNE", "----", "HCM", "AF", "BA", "MM", "----", "EEE", "ME", "QS", "----", "MU", "ELT"}));
		Dept.setBounds(225, 149, 161, 23);
		panel_4.add(Dept);
		
		JComboBox Campus = new JComboBox();
		Campus.setModel(new DefaultComboBoxModel(new String[] {"", "Malabe", "Metro", "Kandy", "Jaffna", "Matara", "Kurunegala"}));
		Campus.setBounds(225, 209, 161, 23);
		panel_4.add(Campus);
		
		JLabel label_6 = new JLabel("Campus/Center");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_6.setBounds(110, 208, 87, 23);
		panel_4.add(label_6);
		
		JComboBox build = new JComboBox();
		build.setModel(new DefaultComboBoxModel(new String[] {"", "Main Building", "New Building", "Engineering Building", "Buisness Building", "D-block"}));
		build.setBounds(225, 268, 161, 23);
		panel_4.add(build);
		
		JLabel label_7 = new JLabel("Building");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_7.setBounds(110, 267, 87, 23);
		panel_4.add(label_7);
		
		JLabel label_8 = new JLabel("Active days");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_8.setBounds(662, 38, 108, 23);
		panel_4.add(label_8);
		
		JLabel label_9 = new JLabel("Active time per day");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_9.setBounds(662, 208, 108, 23);
		panel_4.add(label_9);
		
		JSpinner hourAdd = new JSpinner();
		hourAdd.setBounds(787, 210, 73, 22);
		panel_4.add(hourAdd);
		
		JLabel label_10 = new JLabel("hrs");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_10.setBounds(866, 208, 33, 23);
		panel_4.add(label_10);
		
		JLabel label_11 = new JLabel("mins");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_11.setBounds(971, 208, 33, 23);
		panel_4.add(label_11);
		
		JSpinner minsAdd = new JSpinner();
		minsAdd.setBounds(898, 209, 73, 22);
		panel_4.add(minsAdd);
		
		
		JCheckBox checkBox = new JCheckBox("Wednesday");
		checkBox.setBounds(787, 91, 101, 23);
		panel_4.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Thursday");
		checkBox_1.setBounds(787, 116, 101, 23);
		panel_4.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("Friday");
		checkBox_2.setBounds(787, 142, 101, 23);
		panel_4.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Tuesday");
		checkBox_3.setBounds(787, 64, 101, 23);
		panel_4.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("Monday");
		checkBox_4.setBounds(787, 39, 101, 23);
		
		//Add lecturer
		JButton button_1 = new JButton("ADD");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String Empid= EmpidTxt.getText();
				String lvl= levelCmb.getSelectedItem().toString();
				String monday="-";
				String tuesday="- ";
				String wednesday="- ";
				String thursday="- ";
				String friday=" -";
				String rank = RankTxt.getText();
				String name= EmpNameTxt.getText();
				String faculty= Fac.getSelectedItem().toString();
				String dept = Dept.getSelectedItem().toString();
				String campus = Campus.getSelectedItem().toString();
				String building = build.getSelectedItem().toString();
				String hr = hourAdd.getValue().toString();
				String min = minsAdd.getValue().toString();
				
				
				  if(checkBox_4.isSelected()) { monday="Monday"; }
				  if(checkBox_3.isSelected()) { tuesday="Tuesday"; }
				  if(checkBox.isSelected()) { wednesday="Wednesday"; }
				  if(checkBox_1.isSelected()) { thursday="Thursday"; }
				  if(checkBox_2.isSelected()) { friday="Friday"; }
				 
				 
				
	            if(RankTxt.getText().equals("")) {
	            	JLabel label3 = new JLabel("Please Generate Rank First!");
					label3.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label3);
					

				}else {
				
				try {
					
					 Connection con = DbConnection.connect();

	                    String query = "INSERT INTO lecturers values(null, '" + name + "','" + Empid + "','" + faculty + "', '" + dept + "', '" + campus + "', '" + building + "','"+lvl+"','"+rank+"','"+hr+"','"+min+"','"+monday+"' , '"+tuesday+"','"+wednesday+"','"+thursday+"','"+friday+"')";

	                    Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                    	
	                    	
	                    	JLabel label = new JLabel("This is alredy exist");
	    					label.setHorizontalAlignment(SwingConstants.CENTER);
	    					JOptionPane.showMessageDialog(null, label);
	    					
	                       
	                       // JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
	                    } else {
	                        //JOptionPane.showMessageDialog(btnNewButton,"Welcome, Student Group details successfully inserted!");
	                    	
	                    	JLabel label = new JLabel("Lecturer Details Inserted Successfully");
	    					label.setHorizontalAlignment(SwingConstants.CENTER);
	    					JOptionPane.showMessageDialog(null, label);
	    					
	                 	
	                	
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                    System.out.println("Error!!");
	                	
	                }
				
				}
				
				
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(326, 345, 141, 31);
		panel_4.add(button_1);
		
		JButton button_2 = new JButton("CLEAR");
		
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setEnabled(true);
		button_2.setBackground(new Color(0, 128, 128));
		button_2.setBounds(607, 345, 141, 31);
		panel_4.add(button_2);
		
		
		panel_4.add(checkBox_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(192, 192, 192)));
		panel_5.setBounds(0, 3, 1092, 42);
		panel_2.add(panel_5);
		
		JLabel lblAddNewLecturer = new JLabel("Add New Lecturer");
		lblAddNewLecturer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddNewLecturer.setForeground(new Color(0, 128, 128));
		lblAddNewLecturer.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAddNewLecturer.setBounds(406, 13, 278, 31);
		panel_5.add(lblAddNewLecturer);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(0, 0, 1082, 4);
		panel_2.add(separator);
		
		JButton button_3 = new JButton("Add New Lecturer");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				addLecframe.dispose();
				new Add_Lecturer();
			}
		});
		button_3.setBounds(269, 67, 258, 37);
		addLecframe.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("Manage Lecturers");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addLecframe.dispose();
				new Manage_Lecturer();
				
			}
		});
		button_4.setBounds(524, 67, 258, 37);
		addLecframe.getContentPane().add(button_4);
		
		
		//clear button
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EmpidTxt.setText("");
				EmpNameTxt.setText("");
				RankTxt.setText("");
				levelCmb.setSelectedIndex(0);
				Fac.setSelectedIndex(0);
				Dept.setSelectedIndex(0);
				Campus.setSelectedIndex(0);
				build.setSelectedIndex(0);
				hourAdd.setValue(0);
				minsAdd.setValue(0);
				checkBox.setSelected(false);
				checkBox_1.setSelected(false);
				checkBox_2.setSelected(false);
				checkBox_3.setSelected(false);
				checkBox_4.setSelected(false);
				
				
			}
		});
	}
}
