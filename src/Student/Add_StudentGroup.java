package Student;

import java.awt.EventQueue;


import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import java.awt.List;
import java.awt.ScrollPane;
import java.awt.Button;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import Advanced.Consecutive_sessions;
import DB.DbConnection;
import Home.Home;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Statistics.Statistics;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import WorkingDays.AddWorkingdays;

import javax.swing.border.LineBorder;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;

public class Add_StudentGroup {

	
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
	
	
	private JFrame frmAddStudentGroup;
	private JTextField subGrpID;
	private JTextField GrpID;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_StudentGroup window = new Add_StudentGroup();
					window.frmAddStudentGroup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_StudentGroup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmAddStudentGroup = new JFrame();
		frmAddStudentGroup.setResizable(false);
		frmAddStudentGroup.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmAddStudentGroup.setBackground(Color.YELLOW);
		frmAddStudentGroup.setTitle("Student");
		frmAddStudentGroup.setSize(1350, 728);
		frmAddStudentGroup.setBounds(0,0, 1350, 700);
		frmAddStudentGroup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentGroup.getContentPane().setLayout(null);
		
		
		frmAddStudentGroup.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
		frmAddStudentGroup.setVisible(true);
		
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		frmAddStudentGroup.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JLabel lblNewLabel_10 = new JLabel("Student");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setBounds(723, 13, 179, 29);
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
		frmAddStudentGroup.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		
		//home button
		JButton btnHome = new JButton("Home");
		btnHome.setHorizontalAlignment(SwingConstants.LEFT);
		btnHome.setIcon(new ImageIcon(home_logo));
		btnHome.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Home home = new Home();
				home.main(null);
				frmAddStudentGroup.dispose();
				
			}
		});
		btnHome.setBounds(0, 13, 262, 33);
		panel_1.add(btnHome);
		btnHome.setForeground(new Color(255, 255, 255));
		btnHome.setBackground(new Color(0, 139, 139));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		
		//lecture button
		JButton btnLecturers = new JButton("Lecturers");
		btnLecturers.setHorizontalAlignment(SwingConstants.LEFT);
		btnLecturers.setIcon(new ImageIcon(lec_logo));
		btnLecturers.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					Add_Lecturer add_lecture = new Add_Lecturer();
					add_lecture.main(null);
					frmAddStudentGroup.dispose();
					
				}
			});
		
		btnLecturers.setForeground(Color.WHITE);
		btnLecturers.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLecturers.setBackground(new Color(0, 139, 139));
		btnLecturers.setBounds(0, 59, 264, 38);
		panel_1.add(btnLecturers);
		
		
		//student button
		JButton btnStudents = new JButton("Students");
		btnStudents.setHorizontalAlignment(SwingConstants.LEFT);
		btnStudents.setIcon(new ImageIcon(stu_logo));
		btnStudents.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Add_StudentGroup add_st= new Add_StudentGroup();
				add_st.main(null);
				frmAddStudentGroup.dispose();
				
			}
		});
	
		btnLecturers.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Home add_st = new Home();
				add_st.main(null);
				frmAddStudentGroup.dispose();
				
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
				
				Add_Subjects add_sub= new Add_Subjects();
				add_sub.main(null);
				frmAddStudentGroup.dispose();
				
			}
		});
		btnSubjects.setForeground(Color.WHITE);
		btnSubjects.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSubjects.setBackground(new Color(0, 139, 139));
		btnSubjects.setBounds(0, 157, 264, 38);
		panel_1.add(btnSubjects);
		
		//session button
		JButton btnSessions = new JButton("Sessions");
		btnSessions.setHorizontalAlignment(SwingConstants.LEFT);
		btnSessions.setIcon(new ImageIcon(session_logo));
		btnSessions.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Add_Session add_session= new Add_Session();
				add_session.main(null);
				frmAddStudentGroup.dispose();
				
			}
		});
		btnSessions.setForeground(Color.WHITE);
		btnSessions.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSessions.setBackground(new Color(0, 139, 139));
		btnSessions.setBounds(0, 206, 264, 38);
		panel_1.add(btnSessions);
		
		
		//Tags button
		JButton btnTags = new JButton("Tags");
		btnTags.setHorizontalAlignment(SwingConstants.LEFT);
		btnTags.setIcon(new ImageIcon(tag_logo));
		btnTags.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Add_Tags add_tag= new Add_Tags();
				add_tag.main(null);
				frmAddStudentGroup.dispose();
				
			}
		});
		btnTags.setForeground(Color.WHITE);
		btnTags.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTags.setBackground(new Color(0, 139, 139));
		btnTags.setBounds(0, 255, 264, 38);
		panel_1.add(btnTags);
		
		
		//room button
		JButton btnRooms = new JButton("Rooms");
		btnRooms.setHorizontalAlignment(SwingConstants.LEFT);
		btnRooms.setIcon(new ImageIcon(room_logo));
		btnRooms.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ManageSessionsRooms m_rooms= new ManageSessionsRooms ();
				m_rooms.main(null);
				frmAddStudentGroup.dispose();
				
			}
		});
		btnRooms.setForeground(Color.WHITE);
		btnRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnRooms.setBackground(new Color(0, 139, 139));
		btnRooms.setBounds(0, 304, 264, 38);
		panel_1.add(btnRooms);
		
		
		//working days and hours button
		JButton btnWorkingDays = new JButton("Working days & Hours");
		btnWorkingDays.setHorizontalAlignment(SwingConstants.LEFT);
		btnWorkingDays.setIcon(new ImageIcon(days_logo));
		btnWorkingDays.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				AddWorkingdays w_days= new 	AddWorkingdays();
				w_days.main(null);
				frmAddStudentGroup.dispose();
				
			}
		});
		btnWorkingDays.setForeground(Color.WHITE);
		btnWorkingDays.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnWorkingDays.setBackground(new Color(0, 139, 139));
		btnWorkingDays.setBounds(0, 353, 264, 38);
		panel_1.add(btnWorkingDays);
		
		//location button
		JButton btnLocations = new JButton("Locations");
		btnLocations.setHorizontalAlignment(SwingConstants.LEFT);
		btnLocations.setIcon(new ImageIcon(location_logo));
		btnLocations.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ManageLocations m_locations= new ManageLocations();
				m_locations.main(null);
				frmAddStudentGroup.dispose();
				
			}
		});
		btnLocations.setForeground(Color.WHITE);
		btnLocations.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLocations.setBackground(new Color(0, 139, 139));
		btnLocations.setBounds(0, 402, 264, 38);
		panel_1.add(btnLocations);
		
		//statics button
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.setHorizontalAlignment(SwingConstants.LEFT);
		btnStatistics.setIcon(new ImageIcon(st_logo));
		btnStatistics.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Statistics stat= new Statistics ();
				stat.main(null);
				frmAddStudentGroup.dispose();
				
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
				
				Consecutive_sessions a_session= new Consecutive_sessions ();
				a_session.main(null);
				frmAddStudentGroup.dispose();
				
			}
		});
		btnAdvanced.setForeground(Color.WHITE);
		btnAdvanced.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdvanced.setBackground(new Color(0, 139, 139));
		btnAdvanced.setBounds(0, 500, 264, 38);
		panel_1.add(btnAdvanced);
		
		//generate button
		JButton btnTimetableGenerate = new JButton("Timetable Generate");
		btnTimetableGenerate.setHorizontalAlignment(SwingConstants.LEFT);
		btnTimetableGenerate.setIcon(new ImageIcon(time_logo));
		btnTimetableGenerate.setForeground(Color.WHITE);
		btnTimetableGenerate.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTimetableGenerate.setBackground(new Color(0, 139, 139));
		btnTimetableGenerate.setBounds(0, 549, 264, 38);
		panel_1.add(btnTimetableGenerate);
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(230, 230, 250));
		panel_3.setBounds(263, 62, 1091, 603);
		frmAddStudentGroup.getContentPane().add(panel_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(0, 43, 1082, 49);
		panel_3.add(panel_6);
		
		
		JLabel lblNewLabel_1 = new JLabel("Add Student Group");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(406, 13, 278, 31);
		panel_6.add(lblNewLabel_1);
		
		
		
		
		
		//add student group button
		JButton btnNewButton_2 = new JButton("Add Student Group");
		btnNewButton_2.setBounds(0, 2, 258, 37);
		panel_3.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Add_StudentGroup add_stgroup = new Add_StudentGroup();
				//add_stgroup.main(null);
				frmAddStudentGroup.dispose();
				//frmAddStudentGroup.setVisible(true);
				new Add_StudentGroup();
			
				
			}

		});
		
		
		//manage student group button
		JButton btnNewButton_2_1 = new JButton("Manage Student Group");
		btnNewButton_2_1.setBounds(255, 2, 258, 37);
		panel_3.add(btnNewButton_2_1);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Manage_studentGroup m_stgroup = new Manage_studentGroup();
				//m_stgroup.main(null);
				frmAddStudentGroup.dispose();
				//frmAddStudentGroup.setVisible(true);
				new Manage_studentGroup();
				
				
			}
		});
		
		

		
		
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBounds(119, 113, 853, 400);
		panel_3.add(panel_4);
		

		
	
		
		JLabel Ys= new JLabel("Year Semester");
		Ys.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Ys.setBounds(35, 57, 108, 23);
		panel_4.add(Ys);
		
		JComboBox Ysem = new JComboBox();
		Ysem.setModel(new DefaultComboBoxModel(new String[] {"Y1.S1", "Y1.S2", "Y2.S1", "Y2.S2", "Y3.S1", "Y3.S2", "Y4.S1", "Y4.S2"}));
		Ysem.setBounds(146, 54, 161, 23);
		panel_4.add(Ysem);
		
		JLabel lblNewLabel_3 = new JLabel("Progrmme");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(35, 120, 108, 23);
		panel_4.add(lblNewLabel_3);
		

		JComboBox programme = new JComboBox();
		programme.setModel(new DefaultComboBoxModel(new String[] {"IT", "CSSE", "IM", "CSE"}));
		programme.setBounds(146, 120, 161, 23);
		panel_4.add(programme);
		
		
		JLabel lblNewLabel_4 = new JLabel("Group Number");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(35, 190, 108, 23);
		panel_4.add(lblNewLabel_4);
		
		JSpinner GrpNumber = new JSpinner();
		GrpNumber .setBounds(146, 251, 161, 23);
		panel_4.add( GrpNumber );
		
		
		JLabel lblNewLabel = new JLabel("Sub-Group Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(35, 251, 108, 23);
		panel_4.add(lblNewLabel);
		
		
		JSpinner subGrpNumber = new JSpinner();
		subGrpNumber.setBounds(146, 196, 161, 23);
		panel_4.add(subGrpNumber);
		
		
		JLabel lblSubgroupId = new JLabel("Sub-Group ID");
		lblSubgroupId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSubgroupId.setBounds(539, 120, 108, 23);
		panel_4.add(lblSubgroupId);
		
		
		subGrpID = new JTextField();
		subGrpID.setForeground(SystemColor.controlDkShadow);
		subGrpID.setColumns(10);
		subGrpID.setBounds(625, 120, 174, 23);
		panel_4.add(subGrpID);
		
		JLabel lblRank = new JLabel("Group ID");
		lblRank.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRank.setBounds(539, 57, 108, 23);
		panel_4.add(lblRank);
		
		
	
		GrpID = new JTextField();
		GrpID.setForeground(SystemColor.controlDkShadow);
		GrpID.setColumns(10);
		GrpID.setBounds(625, 57, 174, 23);
		panel_4.add(GrpID);
		
	
		

		//GENERATE ID  button
		JButton btnNewButton_1 = new JButton("GENERATE ID");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			
			
			
			
		GrpID.setText(Ysem.getSelectedItem().toString()+"."+programme.getSelectedItem().toString()+"."+ GrpNumber.getValue().toString());
		
		subGrpID.setText(Ysem.getSelectedItem().toString()+"."+programme.getSelectedItem().toString()+"."+ GrpNumber.getValue().toString()+"."+subGrpNumber.getValue().toString());
			
				
				
			}
		});
		
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(119, 136, 153));
		btnNewButton_1.setBounds(625, 196, 174, 38);
		panel_4.add(btnNewButton_1);
		
		
		
		//insert button
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				String ays= Ysem.getSelectedItem().toString();
				String program= programme.getSelectedItem().toString();
				String groupnumber= GrpNumber.getValue().toString();
				String subgroupnumber= subGrpNumber.getValue().toString();
				String groupid = GrpID.getText();
				String subgroupid = subGrpID.getText();
				
				
				
				
				if(GrpID.getText().equals("")||subGrpID.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please Genarate IDs First!");
				}else {
				
				try {
					
					 Connection con = DbConnection.connect();

	                    String query = "INSERT INTO StudentGroup values(null, '" + ays + "','" + program + "','" + groupnumber + "', '" + subgroupnumber + "', '" + groupid + "', '" + subgroupid + "')";

	                    Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                    	
	                    	
	                    	JLabel label = new JLabel("This is alredy exist");
	    					label.setHorizontalAlignment(SwingConstants.CENTER);
	    					JOptionPane.showMessageDialog(null, label);
	    					
	                       
	                       // JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
	                    } else {
	                        //JOptionPane.showMessageDialog(btnNewButton,"Welcome, Student Group details successfully inserted!");
	                    	
	                    	JLabel label = new JLabel("Inserted Group Details Sucessfully");
	    					label.setHorizontalAlignment(SwingConstants.CENTER);
	    					JOptionPane.showMessageDialog(null, label);
	    					
	                       
	                				
	                			
	                				
	                			
	                	
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
	                	
	                }
				
				}
				
				
				
				
			}
		});
		
		
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setEnabled(true);
		btnNewButton.setBackground(new Color(0, 153, 153));
		btnNewButton.setBounds(387, 547, 141, 31);
		panel_3.add(btnNewButton);
		
		
		
		//CLEAR button
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Ysem.setSelectedIndex(0);
				programme.setSelectedIndex(0);
				//grpNo.clear();
				//subGrpNo_1.
				//grpNo.getAdapter().remove((String)grpNo.getSelectedItem());groupID.setText("");
				GrpID .setText("");
				subGrpID.setText("");
				GrpNumber.setValue(0);
				subGrpNumber.setValue(0);
				    
				  
				
			}
		});
		
		
		
		
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setEnabled(true);
		btnClear.setBackground(new Color(0, 153, 153));
		btnClear.setBounds(619, 547, 141, 31);
		panel_3.add(btnClear);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(0, 40, 1082, 31);
		panel_3.add(separator);
		
		
		
		
	}

	
}
