package Session;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;


import Home.Home;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import WorkingDays.AddWorkingdays;

import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.ScrollPane;
import javax.swing.UIManager;

public class Add_Session {

	private JFrame AddsessFrm;

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


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Session window = new Add_Session();
					window.AddsessFrm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_Session() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AddsessFrm = new JFrame();
		AddsessFrm.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		AddsessFrm.setBackground(Color.YELLOW);
		AddsessFrm.setResizable(false);
		AddsessFrm.setTitle("Sessions");
		AddsessFrm.setSize(1400, 860);
		AddsessFrm.setBounds(0, 0, 1350, 700);
		AddsessFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AddsessFrm.getContentPane().setLayout(null);
		AddsessFrm.setLocationRelativeTo(null);
		AddsessFrm.setVisible(true);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(51, 153, 153));
		AddsessFrm.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel(" Sessions");
		lblNewLabel_1.setBounds(262, 18, 1082, 36);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(32, 178, 170));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		/*
		 * //JLabel lblNewLabel = new JLabel("Time Table Management System");
		 * lblNewLabel.setBounds(261, 5, 822, 61); panel.add(lblNewLabel);
		 * lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		 * lblNewLabel.setForeground(Color.WHITE);
		 */

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 62, 262, 609);
		panel_1.setBackground(new Color(230, 230, 250));
		AddsessFrm.getContentPane().add(panel_1);
		panel_1.setLayout(null);


		JButton btnManageGroups = new JButton("Home");
		btnManageGroups.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageGroups.setIcon(new ImageIcon(home_logo));
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Home home = new Home();
				home.main(null);
				AddsessFrm.dispose();
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

				
				AddsessFrm.dispose();
				new Add_Lecturer();
			}
		});
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_7.setBackground(new Color(0, 139, 139));
		button_7.setBounds(0, 59, 264, 38);
		panel_1.add(button_7);

		JButton btnStudents = new JButton("Students");
		btnStudents.setHorizontalAlignment(SwingConstants.LEFT);
		btnStudents.setIcon(new ImageIcon(stu_logo));
		btnStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Add_StudentGroup add_StudentGroup = new Add_StudentGroup();
				add_StudentGroup.main(null);
				AddsessFrm.dispose();
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

			
				AddsessFrm.dispose();
				new Add_Subjects();
			}
		});
		btnSubjects.setForeground(Color.WHITE);
		btnSubjects.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSubjects.setBackground(new Color(0, 139, 139));
		btnSubjects.setBounds(0, 157, 264, 38);
		panel_1.add(btnSubjects);

		JButton btnSessions = new JButton("Sessions");
		btnSessions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AddsessFrm.dispose();
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

		JButton btnTags = new JButton("Tags");
		btnTags.setHorizontalAlignment(SwingConstants.LEFT);
		btnTags.setIcon(new ImageIcon(tag_logo));
		btnTags.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Add_Tags add_Tags = new Add_Tags();
				add_Tags.main(null);
				AddsessFrm.dispose();
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
				ManageSessionsRooms manageSessionsRooms = new ManageSessionsRooms();
				manageSessionsRooms.main(null);
				AddsessFrm.dispose();
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
				AddWorkingdays addWorkingdays = new AddWorkingdays();
				addWorkingdays.main(null);
				AddsessFrm.dispose();
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
				AddsessFrm.dispose();

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
		btnStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statistics statistics = new Statistics();
				statistics.main(null);
				AddsessFrm.dispose();
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
		btnAdvanced.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

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

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(260, 112, 1084, 559);
		AddsessFrm.getContentPane().add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBounds(10, 54, 1055, 491);
		panel_2.add(panel_3);

		JLabel lblLecturer = new JLabel("Lecturer 1");
		lblLecturer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLecturer.setBounds(110, 38, 96, 23);
		panel_3.add(lblLecturer);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(294, 39, 161, 23);
		panel_3.add(comboBox);

		JLabel label_1 = new JLabel("Tag");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(610, 38, 132, 23);
		panel_3.add(label_1);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(294, 202, 161, 23);
		panel_3.add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(770, 39, 161, 23);
		panel_3.add(comboBox_2);

		JLabel label_2 = new JLabel("Group/Sub Group ID");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(610, 117, 150, 23);
		panel_3.add(label_2);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(770, 118, 161, 23);
		panel_3.add(comboBox_3);

		JLabel lblLecturer_1 = new JLabel("Lecturer 2");
		lblLecturer_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLecturer_1.setBounds(110, 117, 149, 23);
		panel_3.add(lblLecturer_1);

		JLabel label_4 = new JLabel("Subject Name");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(110, 201, 149, 23);
		panel_3.add(label_4);

		JLabel label_5 = new JLabel("Selected Subject Code");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(110, 290, 149, 23);
		panel_3.add(label_5);

		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBackground(new Color(220, 220, 220));
		textArea.setBounds(294, 292, 161, 23);
		panel_3.add(textArea);

		JLabel label_6 = new JLabel("No Of Students");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(610, 202, 108, 23);
		panel_3.add(label_6);

		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner.setBounds(770, 202, 161, 22);
		panel_3.add(spinner);

		JLabel label_7 = new JLabel("Duration(hrs)");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(610, 290, 108, 23);
		panel_3.add(label_7);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner_1.setBounds(770, 290, 161, 22);
		panel_3.add(spinner_1);

		JButton button_1 = new JButton("ADD");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(330, 445, 141, 31);
		panel_3.add(button_1);

		JButton button_2 = new JButton("CLEAR");
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setEnabled(true);
		button_2.setBackground(new Color(0, 128, 128));
		button_2.setBounds(611, 445, 141, 31);
		panel_3.add(button_2);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(294, 119, 161, 23);
		panel_3.add(comboBox_4);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		panel_5.setBounds(0, 0, 1082, 33);
		panel_2.add(panel_5);

		JLabel lblAddNewSession = new JLabel("Add New Session");
		lblAddNewSession.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddNewSession.setForeground(new Color(0, 128, 128));
		lblAddNewSession.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAddNewSession.setBounds(405, 0, 278, 31);
		panel_5.add(lblAddNewSession);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(262, 103, 1082, 9);
		AddsessFrm.getContentPane().add(separator);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		panel_4.setBounds(262, 108, 1082, 33);
		AddsessFrm.getContentPane().add(panel_4);

		JButton button_3 = new JButton("Add New Session");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AddsessFrm.dispose();
				Add_Session add_Session = new Add_Session();
				add_Session.main(null);
			}

		});
		button_3.setBounds(262, 67, 258, 37);
		AddsessFrm.getContentPane().add(button_3);

		JButton button_4 = new JButton("Manage Sessions");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AddsessFrm.dispose();
				Manage_Session manage_Session = new Manage_Session();
				manage_Session.main(null);
			}

		});
		button_4.setBounds(517, 67, 258, 37);
		AddsessFrm.getContentPane().add(button_4);

		JButton button_5 = new JButton("Search Sessions");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				AddsessFrm.dispose();
				Search_Sessions search_Sessions = new Search_Sessions();
				search_Sessions.main(null);

			}
		});
		button_5.setBounds(774, 67, 258, 37);
		AddsessFrm.getContentPane().add(button_5);




	}
}