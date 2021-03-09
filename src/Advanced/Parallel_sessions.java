package Advanced;

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

import Home.Home;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import WorkingDays.AddWorkingdays;

import javax.swing.border.LineBorder;
import java.awt.Panel;

public class Parallel_sessions {

	
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parallel_sessions window = new Parallel_sessions();
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
	public Parallel_sessions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentGroup = new JFrame();
		frmAddStudentGroup.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmAddStudentGroup.setBackground(Color.YELLOW);
		frmAddStudentGroup.setResizable(false);
		frmAddStudentGroup.setTitle(" Advanced ");
		frmAddStudentGroup.setSize(1400, 860);
		frmAddStudentGroup.setBounds(0, 0, 1350, 700);
		frmAddStudentGroup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentGroup.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		frmAddStudentGroup.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Advanced");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setBounds(753, 13, 179, 29);
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
		
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.setHorizontalAlignment(SwingConstants.LEFT);
		btnStatistics.setIcon(new ImageIcon(st_logo));
        btnRooms.addActionListener(new ActionListener() {
			
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
		
		JButton btnAdvanced = new JButton("Advanced");
		btnAdvanced.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdvanced.setIcon(new ImageIcon(adv_logo));
        btnRooms.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Parallel_sessions a_session= new Parallel_sessions ();
				a_session.main(null);
				frmAddStudentGroup.dispose();
				
			}
		});
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
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(230, 230, 250));
		panel_6.setBounds(263, 62, 1081, 599);
		frmAddStudentGroup.getContentPane().add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(88, 110, 350, 371);
		panel_6.add(panel_7);
		
		JLabel lblNewLabel_4 = new JLabel("Session 1");
		lblNewLabel_4.setBounds(24, 77, 80, 21);
		panel_7.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Session 2");
		lblNewLabel_5.setBounds(24, 144, 96, 16);
		panel_7.add(lblNewLabel_5);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(150, 76, 164, 22);
		panel_7.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(150, 141, 164, 21);
		panel_7.add(comboBox_5);
		
		JButton btnNewButton_2 = new JButton("ADD");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBackground(new Color(0, 139, 139));
		btnNewButton_2.setBounds(147, 202, 167, 40);
		panel_7.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CLEAR");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBackground(new Color(0, 139, 139));
		btnNewButton_3.setBounds(150, 262, 164, 40);
		panel_7.add(btnNewButton_3);
		
		JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBounds(0, 40, 1081, 38);
		panel_6.add(panel_6_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Parallel Sessions");
		lblNewLabel_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(494, 0, 278, 31);
		panel_6_1_1.add(lblNewLabel_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(32, 178, 170));
		separator_1.setBackground(new Color(0, 139, 139));
		separator_1.setBounds(0, 0, 1094, 19);
		panel_6_1_1.add(separator_1);
		
		JButton btnNewButton_2_1 = new JButton("Conseccutive Sessions");
		btnNewButton_2_1.setBounds(0, 0, 268, 37);
		panel_6.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Parallel Sessions");
		btnNewButton_2_1_1.setBounds(269, 0, 275, 37);
		panel_6.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_2 = new JButton("Non Overlapping Sessions");
		btnNewButton_2_1_2.setBounds(540, 0, 275, 37);
		panel_6.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_2_1_3 = new JButton("");
		btnNewButton_2_1_3.setBounds(813, 0, 268, 37);
		panel_6.add(btnNewButton_2_1_3);
	}
}
