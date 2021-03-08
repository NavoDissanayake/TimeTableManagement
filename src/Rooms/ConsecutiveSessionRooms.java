package Rooms;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Advanced.Advanced_sessions;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Session.Add_Session;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import WorkingDays.AddWorkingdays;

public class ConsecutiveSessionRooms {
	
	

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

	private JFrame crframe;
	private JTable crtable;
	private JTable crtable_1;
	private JTable crtable_2;
	private JTextField crtextField;
	private JTextField crtextField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsecutiveSessionRooms window = new ConsecutiveSessionRooms();
					window.crframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsecutiveSessionRooms() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		crframe = new JFrame();
		crframe.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		crframe.setBackground(Color.YELLOW);
		crframe.setResizable(false);
		crframe.setTitle("Sessions");
		crframe.setSize(1400, 860);
		crframe.setBounds(0, 0, 1350, 700);
		crframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		crframe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		crframe.getContentPane().add(panel);
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
		crframe.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
	
		JButton btnLecturers = new JButton("Lecturers");
		btnLecturers.setHorizontalAlignment(SwingConstants.LEFT);
		btnLecturers.setIcon(new ImageIcon(lec_logo));
		btnLecturers.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					Add_Lecturer add_lecture = new Add_Lecturer();
					add_lecture.main(null);
					crframe.dispose();
					
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
				
				Add_StudentGroup add_st = new Add_StudentGroup();
				add_st.main(null);
				crframe.dispose();
				
			}
		});
		btnStudents.setForeground(Color.WHITE);
		btnStudents.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStudents.setBackground(new Color(0, 139, 139));
		btnStudents.setBounds(0, 108, 264, 38);
		panel_1.add(btnStudents);
		
		JButton btnSubjects = new JButton("Subjects");
		btnSubjects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Subjects add_sub= new Add_Subjects();
				add_sub.main(null);
				crframe.dispose();
			}
		});
		btnSubjects.setHorizontalAlignment(SwingConstants.LEFT);
		btnSubjects.setIcon(new ImageIcon(sub_logo));
		btnSubjects.setForeground(Color.WHITE);
		btnSubjects.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSubjects.setBackground(new Color(0, 139, 139));
		btnSubjects.setBounds(0, 157, 264, 38);
		panel_1.add(btnSubjects);
		
		JButton btnSessions = new JButton("Sessions");
		btnSessions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Session add_session= new Add_Session();
				add_session.main(null);
				crframe.dispose();
			}
		});
		btnSessions.setHorizontalAlignment(SwingConstants.LEFT);
		btnSessions.setIcon(new ImageIcon(session_logo));
		btnSessions.setForeground(Color.WHITE);
		btnSessions.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSessions.setBackground(new Color(0, 139, 139));
		btnSessions.setBounds(0, 206, 264, 38);
		panel_1.add(btnSessions);
		
		JButton btnTags = new JButton("Tags");
		btnTags.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Tags add_tag= new Add_Tags();
				add_tag.main(null);
				crframe.dispose();
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
				ManageSessionsRooms m_rooms= new ManageSessionsRooms ();
				m_rooms.main(null);
				crframe.dispose();
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
				AddWorkingdays w_days= new 	AddWorkingdays();
				w_days.main(null);
				crframe.dispose();
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

				ManageLocations m_locations= new ManageLocations();
				m_locations.main(null);
				crframe.dispose();
				
				
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
				Statistics stat= new Statistics ();
				stat.main(null);
				crframe.dispose();
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

				Advanced_sessions a_session= new Advanced_sessions ();
				a_session.main(null);
				crframe.dispose();
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
		btnTimetableGenerate.setHorizontalAlignment(SwingConstants.LEFT);
		btnTimetableGenerate.setIcon(new ImageIcon(time_logo));
		btnTimetableGenerate.setForeground(Color.WHITE);
		btnTimetableGenerate.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTimetableGenerate.setBackground(new Color(0, 139, 139));
		btnTimetableGenerate.setBounds(0, 549, 264, 38);
		panel_1.add(btnTimetableGenerate);
		
		
		JButton btnManageGroups = new JButton("Home");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnManageGroups.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageGroups.setIcon(new ImageIcon(home_logo));
		btnManageGroups.setBounds(0, 13, 262, 33);
		panel_1.add(btnManageGroups);
		
		btnManageGroups.setForeground(new Color(255, 255, 255));
		btnManageGroups.setBackground(new Color(0, 139, 139));
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		/*JLabel rlblNewLabel_1 = new JLabel(" Manage Sessions Rooms");
		rlblNewLabel_1.setForeground(new Color(32, 178, 170));
		rlblNewLabel_1.setBackground(new Color(32, 178, 170));
		rlblNewLabel_1.setBounds(262, 69, 1082, 36);
		rlblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		rlblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		rframe.getContentPane().add(rlblNewLabel_1);*/
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 108, 1082, 12);
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		crframe.getContentPane().add(separator);
		
		JPanel crpanel_2 = new JPanel();
		crpanel_2.setBackground(new Color(230, 230, 250));
		crpanel_2.setBounds(262, 108, 1082, 563);
		crframe.getContentPane().add(crpanel_2);
		crpanel_2.setLayout(null);
		
		JPanel crpanel_3 = new JPanel();
		crpanel_3.setBounds(138, 83, 756, 428);
		crpanel_2.add(crpanel_3);
		crpanel_3.setLayout(null);
		
		JLabel crlblNewLabel = new JLabel("Select Consecutive Session");
		crlblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		crlblNewLabel.setBounds(73, 79, 161, 13);
		crpanel_3.add(crlblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select Room");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(462, 79, 78, 13);
		crpanel_3.add(lblNewLabel_1);
		
		crtextField = new JTextField();
		crtextField.setBounds(550, 75, 161, 23);
		crpanel_3.add(crtextField);
		crtextField.setColumns(10);
		
		crtextField_1 = new JTextField();
		crtextField_1.setBounds(276, 75, 161, 23);
		crpanel_3.add(crtextField_1);
		crtextField_1.setColumns(10);
		
		JLabel crlblNewLabel_2 = new JLabel("Selected ConsecutiveSession Room");
		crlblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		crlblNewLabel_2.setBounds(73, 164, 200, 32);
		crpanel_3.add(crlblNewLabel_2);
		
		JTextArea crtextArea = new JTextArea();
		crtextArea.setBounds(276, 169, 246, 82);
		crpanel_3.add(crtextArea);
		
		JButton crbtnNewButton_4 = new JButton("SUBMIT");
		crbtnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		crbtnNewButton_4.setForeground(new Color(255, 255, 255));
		crbtnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		crbtnNewButton_4.setBackground(new Color(0, 139, 139));
		crbtnNewButton_4.setBounds(276, 291, 105, 32);
		crpanel_3.add(crbtnNewButton_4);
		
		JButton crbtnNewButton_5 = new JButton("CLEAR");
		crbtnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		crbtnNewButton_5.setForeground(new Color(255, 255, 255));
		crbtnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		crbtnNewButton_5.setBackground(new Color(0, 139, 139));
		crbtnNewButton_5.setBounds(417, 290, 105, 32);
		crpanel_3.add(crbtnNewButton_5);
		
	
		
		JPanel srpanel_6 = new JPanel();
		srpanel_6.setBounds(0, 0, 1082, 49);
		crpanel_2.add(srpanel_6);
		srpanel_6.setLayout(null);
		
		
		JLabel lollblNewLabel_1 = new JLabel("Add Consecutive Session Rooms");
		lollblNewLabel_1.setForeground(new Color(0, 128, 128));
		lollblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lollblNewLabel_1.setBounds(406, 13, 278, 31);
		srpanel_6.add(lollblNewLabel_1);
		
		JButton btnNewButton = new JButton("Add SessionRooms");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageSessionsRooms manage_ro = new ManageSessionsRooms();
				manage_ro.main(null);
				crframe.dispose();
			}
		});
		btnNewButton.setBounds(262, 69, 179, 39);
		crframe.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View Session Rooms");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewSeesionRooms view_ses = new ViewSeesionRooms();
				view_ses.main(null);
				crframe.dispose();
			}
		});
		btnNewButton_1.setBounds(440, 69, 237, 39);
		crframe.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add ConsecutiveSessionsRooms");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsecutiveSessionRooms add_con = new ConsecutiveSessionRooms();
				add_con.main(null);
				crframe.dispose();
			}
		});
		btnNewButton_2.setBounds(677, 69, 251, 39);
		crframe.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("View ConsecutiveSessionsRooms");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewConsecutiveRooms view_con = new ViewConsecutiveRooms();
				view_con.main(null);
				crframe.dispose();
			}
		});
		btnNewButton_3.setBounds(927, 69, 246, 39);
		crframe.getContentPane().add(btnNewButton_3);
		
	}
	
	

}
