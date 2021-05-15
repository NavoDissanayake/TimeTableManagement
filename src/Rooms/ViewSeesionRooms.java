/**
 * IT19207582
 * R.M.S.J Rathnayake
 * 
 */
package Rooms;

import java.awt.Color;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import Advanced.Consecutive_sessions;
import DB.DbConnection;
import Home.Home;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Session.Add_Session;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import Timetable.Lecturer;
import WorkingDays.AddWorkingdays;
import net.proteanit.sql.DbUtils;

public class ViewSeesionRooms {
	
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

	private JFrame vsrframe;
	private JTable vsrtable;
	private JTable vsrtable_1;
	private JTable vsrtable_2;
	private JTextField vsrtextField;
	private JTextField vsrtextField_1;
	private JTable sessionRoomtable;
	
	public void refreshSessionTable() {
		
		try {
			Connection con = DbConnection.connect();
			String query="select sessionRoomID AS SessionRoomID,sessionRoomCode AS SessionRoomCode from roomSession";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			sessionRoomtable.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void theader() {
		JTableHeader thead = sessionRoomtable.getTableHeader();
		thead.setForeground(Color.WHITE);
		thead.setFont(new Font("Tahoma", Font.BOLD,14));
		thead.setBackground(new Color(32, 178, 170));
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSeesionRooms window = new ViewSeesionRooms();
					window.vsrframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewSeesionRooms() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		vsrframe = new JFrame();
		vsrframe.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		vsrframe.setBackground(Color.YELLOW);
		vsrframe.setResizable(false);
		vsrframe.setTitle("Sessions");
		vsrframe.setSize(1400, 860);
		vsrframe.setBounds(0, 0, 1350, 700);
		vsrframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vsrframe.getContentPane().setLayout(null);
		
		vsrframe.setLocationRelativeTo(null);
		vsrframe.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		vsrframe.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Manage Session Rooms");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setBounds(723, 13, 279, 29);
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
		vsrframe.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		//Lectures
		JButton btnLecturers = new JButton("Lecturers");
		btnLecturers.setHorizontalAlignment(SwingConstants.LEFT);
		btnLecturers.setIcon(new ImageIcon(lec_logo));
		btnLecturers.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					//Add_Lecturer add_lecture = new Add_Lecturer();
					//add_lecture.main(null);
					vsrframe.dispose();
					new Add_Lecturer();
					
				}
			});
		btnLecturers.setForeground(Color.WHITE);
		btnLecturers.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLecturers.setBackground(new Color(0, 139, 139));
		btnLecturers.setBounds(0, 59, 264, 38);
		panel_1.add(btnLecturers);
		
		//Students
		JButton btnStudents = new JButton("Students");
		btnStudents.setHorizontalAlignment(SwingConstants.LEFT);
		btnStudents.setIcon(new ImageIcon(stu_logo));
		btnLecturers.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Add_StudentGroup add_st = new Add_StudentGroup();
				//add_st.main(null);
				vsrframe.dispose();
				new Add_StudentGroup();
				
			}
		});
		btnStudents.setForeground(Color.WHITE);
		btnStudents.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStudents.setBackground(new Color(0, 139, 139));
		btnStudents.setBounds(0, 108, 264, 38);
		panel_1.add(btnStudents);
		
		//Subjects
		JButton btnSubjects = new JButton("Subjects");
		btnSubjects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Add_Subjects add_sub= new Add_Subjects();
				//add_sub.main(null);
				vsrframe.dispose();
				new Add_Subjects();
			}
		});
		btnSubjects.setHorizontalAlignment(SwingConstants.LEFT);
		btnSubjects.setIcon(new ImageIcon(sub_logo));
		btnSubjects.setForeground(Color.WHITE);
		btnSubjects.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSubjects.setBackground(new Color(0, 139, 139));
		btnSubjects.setBounds(0, 157, 264, 38);
		panel_1.add(btnSubjects);
		
		//Sessions
		JButton btnSessions = new JButton("Sessions");
		btnSessions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Add_Session add_session= new Add_Session();
				//add_session.main(null);
				vsrframe.dispose();
				new Add_Session();
			}
		});
		btnSessions.setHorizontalAlignment(SwingConstants.LEFT);
		btnSessions.setIcon(new ImageIcon(session_logo));
		btnSessions.setForeground(Color.WHITE);
		btnSessions.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSessions.setBackground(new Color(0, 139, 139));
		btnSessions.setBounds(0, 206, 264, 38);
		panel_1.add(btnSessions);
		
		//tags
		JButton btnTags = new JButton("Tags");
		btnTags.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Add_Tags add_tag= new Add_Tags();
				//add_tag.main(null);
				vsrframe.dispose();
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
		
		//rooms
		JButton btnRooms = new JButton("Rooms");
		btnRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//ManageSessionsRooms m_rooms= new ManageSessionsRooms ();
				//m_rooms.main(null);
				vsrframe.dispose();
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
		
		//working
		JButton btnWorkingDays = new JButton("Working days & Hours");
		btnWorkingDays.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AddWorkingdays w_days= new 	AddWorkingdays();
				//w_days.main(null);
				vsrframe.dispose();
				new AddWorkingdays();
			}
		});
		btnWorkingDays.setHorizontalAlignment(SwingConstants.LEFT);
		btnWorkingDays.setIcon(new ImageIcon(days_logo));
		btnWorkingDays.setForeground(Color.WHITE);
		btnWorkingDays.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnWorkingDays.setBackground(new Color(0, 139, 139));
		btnWorkingDays.setBounds(0, 353, 264, 38);
		panel_1.add(btnWorkingDays);
		
		//lcations
		JButton btnLocations = new JButton("Locations");
		btnLocations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ManageLocations m_locations= new ManageLocations();
				//m_locations.main(null);
				vsrframe.dispose();
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
		
		//statistics
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				///Statistics stat= new Statistics ();
				//stat.main(null);
				vsrframe.dispose();
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
		
		//Advanced
		JButton btnAdvanced = new JButton("Advanced");
		btnAdvanced.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Consecutive_sessions a_session= new Consecutive_sessions ();
				//a_session.main(null);
				vsrframe.dispose();
				new Consecutive_sessions();

			}
		});
		btnAdvanced.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdvanced.setIcon(new ImageIcon(adv_logo));
		btnAdvanced.setForeground(Color.WHITE);
		btnAdvanced.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdvanced.setBackground(new Color(0, 139, 139));
		btnAdvanced.setBounds(0, 500, 264, 38);
		panel_1.add(btnAdvanced);
		
		JButton btnTimetableGenerate = new JButton("Timetable Generate");
		btnTimetableGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vsrframe.dispose();
				new Lecturer();
			}
		});
		btnTimetableGenerate.setHorizontalAlignment(SwingConstants.LEFT);
		btnTimetableGenerate.setIcon(new ImageIcon(time_logo));
		btnTimetableGenerate.setForeground(Color.WHITE);
		btnTimetableGenerate.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTimetableGenerate.setBackground(new Color(0, 139, 139));
		btnTimetableGenerate.setBounds(0, 549, 264, 38);
		panel_1.add(btnTimetableGenerate);
		
		//Home
		JButton btnManageGroups = new JButton("Home");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Home home = new Home();
				//home.main(null);
				vsrframe.dispose();
				new Home();
			}
		});
		btnManageGroups.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageGroups.setIcon(new ImageIcon(home_logo));
		btnManageGroups.setBounds(0, 13, 262, 33);
		panel_1.add(btnManageGroups);
		
		btnManageGroups.setForeground(new Color(255, 255, 255));
		btnManageGroups.setBackground(new Color(0, 139, 139));
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 17));
		

		JSeparator separator = new JSeparator();
		separator.setBounds(262, 108, 1082, 12);
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		vsrframe.getContentPane().add(separator);
		
		JPanel vsrpanel_2 = new JPanel();
		vsrpanel_2.setBackground(new Color(230, 230, 250));
		vsrpanel_2.setBounds(272, 118, 1064, 544);
		vsrframe.getContentPane().add(vsrpanel_2);
		vsrpanel_2.setLayout(null);
		
		JPanel srpanel_6 = new JPanel();
		srpanel_6.setBounds(0, 0, 1082, 49);
		vsrpanel_2.add(srpanel_6);
		srpanel_6.setLayout(null);
		
		
		JLabel lollblNewLabel_1 = new JLabel("View Session Rooms");
		lollblNewLabel_1.setForeground(new Color(0, 128, 128));
		lollblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lollblNewLabel_1.setBounds(406, 13, 278, 31);
		srpanel_6.add(lollblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(49, 93, 962, 441);
		vsrpanel_2.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("ADD ROOM");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageSessionsRooms manageSessionsRooms = new ManageSessionsRooms();
				manageSessionsRooms.main(null);
				vsrframe.dispose();
				
			}
		});
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setBackground(new Color(0, 139, 139));
		btnNewButton_4.setBounds(263, 308, 105, 32);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("REFRESH");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refreshSessionTable();
			}
		});
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_5.setBackground(new Color(0, 139, 139));
		btnNewButton_5.setBounds(587, 308, 105, 32);
		panel_2.add(btnNewButton_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(205, 87, 548, 175);
		panel_2.add(scrollPane);
		
		sessionRoomtable = new JTable();
		scrollPane.setViewportView(sessionRoomtable);
		
		try {
			
			
			Connection con = DbConnection.connect();
			 
			 
			String query="select sessionRoomID AS SessionRoomID,sessionRoomCode AS SessionRoomCode from roomSession ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			sessionRoomtable.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			theader();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		panel_2.add(btnNewButton_5);
		
		
		
		
		
	
		//addsessionroom button
		JButton btnNewButton = new JButton("Add SessionRooms");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ManageSessionsRooms manage_ro = new ManageSessionsRooms();
				//manage_ro.main(null);
				vsrframe.dispose();
				new ManageSessionsRooms();
			}
		});
		btnNewButton.setBounds(262, 75, 179, 33);
		vsrframe.getContentPane().add(btnNewButton);
		
		//viewsession button
		JButton btnNewButton_1 = new JButton("View Session Rooms");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ViewSeesionRooms view_ses = new ViewSeesionRooms();
				//view_ses.main(null);
				vsrframe.dispose();
				new ViewSeesionRooms();
			}
		});
		btnNewButton_1.setBounds(440, 75, 237, 33);
		vsrframe.getContentPane().add(btnNewButton_1);
		
		//add consession button
		JButton btnNewButton_2 = new JButton("Add ConsecutiveSessionsRooms");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ConsecutiveSessionRooms add_con = new ConsecutiveSessionRooms();
				//add_con.main(null);
				vsrframe.dispose();
				new ConsecutiveSessionRooms();
			}
		});
		btnNewButton_2.setBounds(677, 75, 251, 33);
		vsrframe.getContentPane().add(btnNewButton_2);
		
		//view consessionroom
		JButton btnNewButton_3 = new JButton("View ConsecutiveSessionsRooms");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ViewConsecutiveRooms view_con = new ViewConsecutiveRooms();
				//view_con.main(null);
				vsrframe.dispose();
				new ViewConsecutiveRooms();
			}
		});
		btnNewButton_3.setBounds(927, 75, 246, 33);
		vsrframe.getContentPane().add(btnNewButton_3);
		
		
		
		

	}
}
