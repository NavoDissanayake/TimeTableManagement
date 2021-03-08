package Lecturer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Advanced.Advanced_sessions;
import Home.Home;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import WorkingDays.AddWorkingdays;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Manage_Lecturer {

	private JFrame ManageLecfrm;
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
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage_Lecturer window = new Manage_Lecturer();
					window.ManageLecfrm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Manage_Lecturer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ManageLecfrm = new JFrame();
		ManageLecfrm.setBounds(350, 90, 1350, 700);
		ManageLecfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ManageLecfrm.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		ManageLecfrm.setBackground(Color.YELLOW);
		ManageLecfrm.setTitle("Lecturer");
		ManageLecfrm.setSize(1350, 715);
		ManageLecfrm.getContentPane().setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(51, 153, 153));
		ManageLecfrm.getContentPane().add(panel);
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
		panel_1.setBounds(0, 62, 262, 616);
		panel_1.setBackground(new Color(230, 230, 250));
		ManageLecfrm.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton btnManageGroups = new JButton("Home");
		btnManageGroups.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageGroups.setIcon(new ImageIcon(home_logo));
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Home home = new Home();
				home.main(null);
				ManageLecfrm.dispose();
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
				
				Add_Lecturer add_Lecturer = new Add_Lecturer();
				add_Lecturer.main(null);
				ManageLecfrm.dispose();
				
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
				
				Add_StudentGroup add_StudentGroup = new Add_StudentGroup();
				add_StudentGroup.main(null);
				ManageLecfrm.dispose();
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
				
				Add_Subjects add_Subjects = new Add_Subjects();
				add_Subjects.main(null);
				ManageLecfrm.dispose();
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
				
				Add_Session add_Session = new Add_Session();
				add_Session.main(null);
				ManageLecfrm.dispose();
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
				Add_Tags add_Tags = new Add_Tags();
				add_Tags.main(null);
				ManageLecfrm.dispose();
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
				ManageSessionsRooms manageSessionsRooms = new ManageSessionsRooms();
				manageSessionsRooms.main(null);
				ManageLecfrm.dispose();
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
				AddWorkingdays addWorkingdays = new AddWorkingdays();
				addWorkingdays.main(null);
				ManageLecfrm.dispose();
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
				ManageLecfrm.dispose();
				
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
				Statistics statistics = new Statistics();
				statistics.main(null);
				ManageLecfrm.dispose();
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
				Advanced_sessions advanced_sessions = new Advanced_sessions();
				advanced_sessions.main(null);
				ManageLecfrm.dispose();
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
		panel_2.setBounds(263, 110, 1071, 568);
		ManageLecfrm.getContentPane().add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(Color.LIGHT_GRAY));
		scrollPane.setBounds(10, 56, 1055, 175);
		panel_2.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setViewportView(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane_1.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_3.setBackground(new Color(245, 245, 245));
		panel_3.setBounds(10, 240, 1055, 310);
		panel_2.add(panel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(127, 19, 134, 23);
		panel_3.add(textField);
		
		JLabel label = new JLabel("Employee ID");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(42, 18, 108, 23);
		panel_3.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(127, 53, 134, 23);
		panel_3.add(comboBox);
		
		JLabel label_1 = new JLabel("Level");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(42, 53, 108, 23);
		panel_3.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(SystemColor.controlDkShadow);
		textField_1.setColumns(10);
		textField_1.setBounds(127, 87, 134, 23);
		panel_3.add(textField_1);
		
		JLabel label_2 = new JLabel("Rank");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setBounds(42, 87, 108, 23);
		panel_3.add(label_2);
		
		JButton btnGenRankM = new JButton("GENERATE RANK");
		btnGenRankM.setForeground(Color.WHITE);
		btnGenRankM.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGenRankM.setBackground(new Color(119, 136, 153));
		btnGenRankM.setBounds(59, 148, 185, 36);
		panel_3.add(btnGenRankM);
		
		JButton button_1 = new JButton("CLEAR");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setEnabled(true);
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(628, 268, 141, 31);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("DELETE");
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setEnabled(true);
		button_2.setBackground(new Color(0, 128, 128));
		button_2.setBounds(449, 268, 141, 31);
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("EDIT");
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setEnabled(true);
		button_3.setBackground(new Color(0, 128, 128));
		button_3.setBounds(267, 268, 141, 31);
		panel_3.add(button_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(487, 20, 161, 23);
		panel_3.add(textField_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(487, 53, 161, 23);
		panel_3.add(comboBox_1);
		
		JLabel label_3 = new JLabel("Employee Name");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3.setBounds(372, 19, 96, 23);
		panel_3.add(label_3);
		
		JLabel label_4 = new JLabel("Faculty");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_4.setBounds(372, 52, 87, 23);
		panel_3.add(label_4);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(487, 88, 161, 23);
		panel_3.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(487, 123, 161, 23);
		panel_3.add(comboBox_3);
		
		JLabel label_5 = new JLabel("Department");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_5.setBounds(372, 87, 87, 23);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("Campus/Center");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_6.setBounds(372, 122, 87, 23);
		panel_3.add(label_6);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(487, 158, 161, 23);
		panel_3.add(comboBox_4);
		
		JLabel label_7 = new JLabel("Building");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_7.setBounds(372, 157, 87, 23);
		panel_3.add(label_7);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(838, 158, 73, 22);
		panel_3.add(spinner);
		
		JLabel label_8 = new JLabel("Active time per day");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_8.setBounds(713, 157, 108, 23);
		panel_3.add(label_8);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(949, 159, 73, 22);
		panel_3.add(spinner_1);
		
		JLabel label_9 = new JLabel("mins");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_9.setBounds(1022, 158, 33, 23);
		panel_3.add(label_9);
		
		JLabel label_10 = new JLabel("Active days");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_10.setBounds(713, 19, 108, 23);
		panel_3.add(label_10);
		
		JCheckBox checkBox = new JCheckBox("Monday");
		checkBox.setBounds(838, 20, 101, 23);
		panel_3.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Tuesday");
		checkBox_1.setBounds(838, 45, 101, 23);
		panel_3.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("Wednesday");
		checkBox_2.setBounds(838, 72, 101, 23);
		panel_3.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Thursday");
		checkBox_3.setBounds(838, 97, 101, 23);
		panel_3.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("Friday");
		checkBox_4.setBounds(838, 123, 101, 23);
		panel_3.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Saturday");
		checkBox_5.setBounds(949, 19, 87, 23);
		panel_3.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("Sunday");
		checkBox_6.setBounds(949, 45, 87, 23);
		panel_3.add(checkBox_6);
		
		JLabel label_11 = new JLabel("hrs");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_11.setBounds(915, 157, 24, 23);
		panel_3.add(label_11);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 1082, 43);
		panel_2.add(panel_4);
		
		JLabel lblManageLecturers = new JLabel("Manage Lecturers");
		lblManageLecturers.setHorizontalAlignment(SwingConstants.CENTER);
		lblManageLecturers.setForeground(new Color(0, 128, 128));
		lblManageLecturers.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblManageLecturers.setBounds(406, 13, 278, 31);
		panel_4.add(lblManageLecturers);
		
		JButton btnAddNewLecturer = new JButton("Add New Lecturer");
		btnAddNewLecturer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Lecturer add_Lecturer = new Add_Lecturer();
				add_Lecturer.main(null);
			ManageLecfrm.dispose();
			}
		});
		btnAddNewLecturer.setBounds(262, 67, 258, 37);
		ManageLecfrm.getContentPane().add(btnAddNewLecturer);
		
		JButton btnManageLecturers = new JButton("Manage Lecturers");
		btnManageLecturers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manage_Lecturer manage_Lecturer = new Manage_Lecturer();
						manage_Lecturer.main(null);
				ManageLecfrm.dispose();
				
			}
		});
		btnManageLecturers.setBounds(517, 67, 258, 37);
		ManageLecfrm.getContentPane().add(btnManageLecturers);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(263, 105, 1082, 4);
		ManageLecfrm.getContentPane().add(separator);
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
	}
}
