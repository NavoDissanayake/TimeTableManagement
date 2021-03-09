package Session;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;


import Home.Home;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import WorkingDays.AddWorkingdays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.UIManager;

public class Search_Sessions {

	private JFrame SrchSesFrm;
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
	private JTable table;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_Sessions window = new Search_Sessions();
					window.SrchSesFrm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Search_Sessions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		SrchSesFrm = new JFrame();
		SrchSesFrm.setResizable(false);
		SrchSesFrm.setAlwaysOnTop(true);
		SrchSesFrm.setSize(1400, 860);
		SrchSesFrm.setBounds(0, 0, 1350, 700);
		SrchSesFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SrchSesFrm.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		SrchSesFrm.setBackground(Color.YELLOW);
		SrchSesFrm.setTitle("Sessions");
		
		//ManageSesFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SrchSesFrm.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 153, 153));
		panel.setBounds(0, 0, 1344, 65);
		SrchSesFrm.getContentPane().add(panel);
		
		JLabel label = new JLabel(" Sessions");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		label.setBackground(new Color(32, 178, 170));
		label.setBounds(262, 18, 1082, 36);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(0, 62, 262, 609);
		SrchSesFrm.getContentPane().add(panel_1);
		
		JButton btnManageGroups = new JButton("Home");
		btnManageGroups.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageGroups.setIcon(new ImageIcon(home_logo));
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Home home = new Home();
				home.main(null);
				SrchSesFrm.dispose();
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
				SrchSesFrm.dispose();
				
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
				SrchSesFrm.dispose();
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
				SrchSesFrm.dispose();
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
				SrchSesFrm.dispose();
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
				SrchSesFrm.dispose();
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
				SrchSesFrm.dispose();
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
				SrchSesFrm.dispose();
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
				SrchSesFrm.dispose();
				
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
				SrchSesFrm.dispose();
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
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(262, 102, 1082, 9);
		SrchSesFrm.getContentPane().add(separator);
		
		JButton button = new JButton("Add New Session");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Add_Session add_Session = new Add_Session();
				add_Session.main(null);
				SrchSesFrm.dispose();
			}
		});
		button.setBounds(262, 66, 258, 37);
		SrchSesFrm.getContentPane().add(button);
		
		JButton button_1 = new JButton("Manage Sessions");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Manage_Session manage_Session = new Manage_Session();
				manage_Session.main(null);
				SrchSesFrm.dispose();
			}
		});
		button_1.setBounds(517, 66, 258, 37);
		SrchSesFrm.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Search Sessions");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_Sessions search_Sessions = new  Search_Sessions();
				Search_Sessions.main(null);
				SrchSesFrm.dispose();
			}
		});
		button_2.setBounds(774, 66, 258, 37);
		SrchSesFrm.getContentPane().add(button_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		panel_2.setBounds(262, 107, 1082, 37);
		SrchSesFrm.getContentPane().add(panel_2);
		
		JLabel lblSearchSessions = new JLabel("Search Sessions");
		lblSearchSessions.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchSessions.setForeground(new Color(0, 128, 128));
		lblSearchSessions.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSearchSessions.setBounds(405, 0, 278, 31);
		panel_2.add(lblSearchSessions);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(230, 230, 250));
		panel_3.setBounds(272, 144, 1065, 527);
		SrchSesFrm.getContentPane().add(panel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 201, 966, 302);
		panel_3.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setViewportView(scrollPane_1);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		table.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(table);
		
		JLabel label_1 = new JLabel("Search by Lecturer :");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(78, 61, 180, 37);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("Search by Group/Sub Group :");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(444, 61, 215, 37);
		panel_3.add(label_2);
		
		JLabel label_3 = new JLabel("Search by Subject :");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(850, 61, 215, 37);
		panel_3.add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(50, 109, 206, 27);
		panel_3.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(438, 109, 206, 26);
		panel_3.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(812, 109, 206, 27);
		panel_3.add(comboBox_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 21, 1045, 495);
		panel_3.add(panel_4);

	}

}
