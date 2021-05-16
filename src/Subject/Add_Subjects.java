package Subject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
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
import Session.Add_Session;
import Student.Add_StudentGroup;
import Tags.Add_Tags;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;

public class Add_Subjects {

	private JFrame AddSubFrm;
	
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
	private Image logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/pp.png")).getImage().getScaledInstance(1000,1000,Image.SCALE_SMOOTH);

	private JTextField textField;
	private JTextField textField_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Subjects window = new Add_Subjects();
					window.AddSubFrm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_Subjects() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AddSubFrm = new JFrame();
		AddSubFrm.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		AddSubFrm.setBackground(Color.YELLOW);
		AddSubFrm.setResizable(false);
		AddSubFrm.setTitle("Time Table Management System");
		AddSubFrm.setSize(1400, 860);
		AddSubFrm.setBounds(0, 0, 1350, 700);
		AddSubFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AddSubFrm.getContentPane().setLayout(null);
		AddSubFrm.setIconImage(logo);
		AddSubFrm.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
		AddSubFrm.setVisible(true);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(51, 153, 153));
		AddSubFrm.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label_8 = new JLabel(" Subjects");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(new Color(255, 255, 255));
		label_8.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_8.setBackground(new Color(32, 178, 170));
		label_8.setBounds(262, 18, 1082, 36);
		panel.add(label_8);
		/*
		 * //JLabel lblNewLabel = new JLabel("Time Table Management System");
		 * lblNewLabel.setBounds(261, 5, 822, 61); panel.add(lblNewLabel);
		 * lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		 * lblNewLabel.setForeground(Color.WHITE);
		 */
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 62, 262, 609);
		panel_1.setBackground(new Color(230, 230, 250));
		AddSubFrm.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton btnManageGroups = new JButton("Home");
		btnManageGroups.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageGroups.setIcon(new ImageIcon(home_logo));
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Home home = new Home();
				  home.main(null);
				  AddSubFrm.dispose();
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
				Add_Lecturer add_Lecturer =  new Add_Lecturer();
				add_Lecturer.main(null);
				AddSubFrm.dispose();
			}
		});
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_7.setBackground(new Color(0, 139, 139));
		button_7.setBounds(0, 59, 264, 38);
		panel_1.add(button_7);
		
		JButton btnStudents = new JButton("Students");
		btnStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Add_StudentGroup add_StudentGroup = new Add_StudentGroup();
				 add_StudentGroup.main(null);
				 AddSubFrm.dispose();
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
		btnSubjects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Add_Subjects add_Subjects = new Add_Subjects();
				 add_Subjects.main(null);
				 AddSubFrm.dispose();
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
		btnSessions.setHorizontalAlignment(SwingConstants.LEFT);
		btnSessions.setIcon(new ImageIcon(session_logo));
		btnSessions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Add_Session add_Session = new Add_Session();
				add_Session.main(null);
				AddSubFrm.dispose();
			}
		});
		btnSessions.setForeground(Color.WHITE);
		btnSessions.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSessions.setBackground(new Color(0, 139, 139));
		btnSessions.setBounds(0, 206, 264, 38);
		panel_1.add(btnSessions);
		
		JButton btnTags = new JButton("Tags");
		btnTags.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Tags add_Tags = new Add_Tags();
				add_Tags.main(null);
				AddSubFrm.dispose();
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
		btnRooms.setHorizontalAlignment(SwingConstants.LEFT);
		btnRooms.setIcon(new ImageIcon(room_logo));
		btnRooms.setForeground(Color.WHITE);
		btnRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnRooms.setBackground(new Color(0, 139, 139));
		btnRooms.setBounds(0, 304, 264, 38);
		panel_1.add(btnRooms);
		
		JButton btnWorkingDays = new JButton("Working days & Hours");
		btnWorkingDays.setHorizontalAlignment(SwingConstants.LEFT);
		btnWorkingDays.setIcon(new ImageIcon(days_logo));
		btnWorkingDays.setForeground(Color.WHITE);
		btnWorkingDays.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnWorkingDays.setBackground(new Color(0, 139, 139));
		btnWorkingDays.setBounds(0, 353, 264, 38);
		panel_1.add(btnWorkingDays);
		
		JButton btnLocations = new JButton("Locations");
		btnLocations.setHorizontalAlignment(SwingConstants.LEFT);
		btnLocations.setIcon(new ImageIcon(location_logo));
		btnLocations.setForeground(Color.WHITE);
		btnLocations.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLocations.setBackground(new Color(0, 139, 139));
		btnLocations.setBounds(0, 402, 264, 38);
		panel_1.add(btnLocations);
		
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.setHorizontalAlignment(SwingConstants.LEFT);
		btnStatistics.setIcon(new ImageIcon(st_logo));
		btnStatistics.setForeground(Color.WHITE);
		btnStatistics.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStatistics.setBackground(new Color(0, 139, 139));
		btnStatistics.setBounds(0, 451, 264, 38);
		panel_1.add(btnStatistics);
		
		JButton btnAdvanced = new JButton("Advanced");
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(268, 115, 1066, 556);
		AddSubFrm.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBounds(10, 58, 1055, 487);
		panel_2.add(panel_3);
		
		JLabel label = new JLabel("Subject Code");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(129, 50, 96, 23);
		panel_3.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(257, 51, 161, 23);
		panel_3.add(textField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(257, 220, 161, 23);
		panel_3.add(comboBox);
		
		JLabel label_1 = new JLabel("Offered Year");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(129, 219, 87, 23);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("No Of Lecture  Hours");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(650, 50, 150, 23);
		panel_3.add(label_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(810, 51, 161, 23);
		panel_3.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(810, 132, 161, 23);
		panel_3.add(comboBox_2);
		
		JLabel label_3 = new JLabel("No Of Tutorial Hours");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(650, 131, 150, 23);
		panel_3.add(label_3);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(810, 310, 161, 23);
		panel_3.add(comboBox_3);
		
		JLabel label_4 = new JLabel("No Of Lab Hours");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(650, 219, 150, 23);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("Subject Name");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(129, 131, 96, 23);
		panel_3.add(label_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(257, 132, 161, 23);
		panel_3.add(textField_1);
		
		JLabel label_6 = new JLabel("Offered Semester");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(129, 309, 122, 23);
		panel_3.add(label_6);
		
		JRadioButton radioButton = new JRadioButton("1st");
		radioButton.setHorizontalAlignment(SwingConstants.LEFT);
		radioButton.setForeground(new Color(0, 139, 139));
		radioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		radioButton.setBounds(257, 310, 67, 23);
		panel_3.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2nd");
		radioButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		radioButton_1.setForeground(new Color(0, 139, 139));
		radioButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		radioButton_1.setBounds(367, 310, 51, 23);
		panel_3.add(radioButton_1);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(810, 220, 161, 23);
		panel_3.add(comboBox_4);
		
		JLabel label_7 = new JLabel("No Of Evaluation Hours");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(650, 309, 150, 23);
		panel_3.add(label_7);
		
		JButton button = new JButton("ADD");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(new Color(0, 128, 128));
		button.setBounds(323, 449, 141, 31);
		panel_3.add(button);
		
		JButton button_1 = new JButton("CLEAR");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setEnabled(true);
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(604, 449, 141, 31);
		panel_3.add(button_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		panel_4.setBounds(0, -12, 1082, 51);
		panel_2.add(panel_4);
		
		JLabel label_9 = new JLabel("Add New Subject");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(new Color(0, 128, 128));
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_9.setBounds(407, 11, 278, 38);
		panel_4.add(label_9);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(268, 107, 1082, 9);
		AddSubFrm.getContentPane().add(separator);
		
		JButton button_2 = new JButton("Add New Subject");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Subjects add_Subjects = new Add_Subjects();
				 add_Subjects.main(null);
				 AddSubFrm.dispose();
			}
		});
		button_2.setBounds(268, 64, 258, 44);
		AddSubFrm.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Manage Subjects");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Manage_Subject manage_Subject = new Manage_Subject();
				manage_Subject.main(null);
				AddSubFrm.dispose();
			}
		});
		button_3.setBounds(524, 64, 258, 44);
		AddSubFrm.getContentPane().add(button_3);
		
		ButtonGroup group = new ButtonGroup();
		

	}
}
