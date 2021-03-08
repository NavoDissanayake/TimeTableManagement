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

import Advanced.Advanced_sessions;
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
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.JTable;

public class Manage_Session {

	private JFrame ManageSesFrm;
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
					Manage_Session window = new Manage_Session();
					window.ManageSesFrm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Manage_Session() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ManageSesFrm = new JFrame();
		ManageSesFrm.setAlwaysOnTop(true);

		ManageSesFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		ManageSesFrm.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		ManageSesFrm.setBackground(Color.YELLOW);
		ManageSesFrm.setTitle("Sessions");
		ManageSesFrm.setSize(1400, 860);
		ManageSesFrm.setBounds(0, 0, 1350, 700);
		//ManageSesFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ManageSesFrm.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 153, 153));
		panel.setBounds(0, 0, 1344, 65);
		ManageSesFrm.getContentPane().add(panel);
		
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
		ManageSesFrm.getContentPane().add(panel_1);
		
		JButton btnManageGroups = new JButton("Home");
		btnManageGroups.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageGroups.setIcon(new ImageIcon(home_logo));
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Home home = new Home();
				home.main(null);
				ManageSesFrm.dispose();
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
				ManageSesFrm.dispose();
				
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
				ManageSesFrm.dispose();
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
				ManageSesFrm.dispose();
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
				ManageSesFrm.dispose();
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
				ManageSesFrm.dispose();
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
				ManageSesFrm.dispose();
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
				ManageSesFrm.dispose();
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
				ManageSesFrm.dispose();
				
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
				ManageSesFrm.dispose();
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
				ManageSesFrm.dispose();
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
		
		JButton btnAddNewSession = new JButton("Add New Session");
		btnAddNewSession.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Add_Session add_Session = new Add_Session();
				add_Session.main(null);
				ManageSesFrm.dispose();
			}
		});
		btnAddNewSession.setBounds(264, 66, 258, 37);
		ManageSesFrm.getContentPane().add(btnAddNewSession);
		
		JButton btnManageSessions = new JButton("Manage Sessions");
		btnManageSessions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manage_Session manage_Session = new Manage_Session();
				manage_Session.main(null);
				ManageSesFrm.dispose();
			}
		});
		btnManageSessions.setBounds(519, 66, 258, 37);
		ManageSesFrm.getContentPane().add(btnManageSessions);
		
		JButton btnSearchSessions = new JButton("Search Sessions");
		btnSearchSessions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_Sessions search_Sessions = new Search_Sessions();
				 search_Sessions.main(null);
				 ManageSesFrm.dispose();
			}
		});
		btnSearchSessions.setBounds(776, 66, 258, 37);
		ManageSesFrm.getContentPane().add(btnSearchSessions);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(264, 102, 1075, 559);
		ManageSesFrm.getContentPane().add(panel_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 40, 1055, 165);
		panel_2.add(scrollPane_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_2.setViewportView(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_3.setBackground(new Color(245, 245, 245));
		panel_3.setBounds(10, 213, 1055, 335);
		panel_2.add(panel_3);
		
		JButton button = new JButton("CLEAR");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setEnabled(true);
		button.setBackground(new Color(0, 128, 128));
		button.setBounds(632, 296, 141, 31);
		panel_3.add(button);
		
		JButton button_1 = new JButton("DELETE");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setEnabled(true);
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(453, 296, 141, 31);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("EDIT");
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setEnabled(true);
		button_2.setBackground(new Color(0, 128, 128));
		button_2.setBounds(271, 296, 141, 31);
		panel_3.add(button_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(310, 56, 179, 60);
		panel_3.add(panel_4);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 179, 60);
		panel_4.add(scrollPane_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(310, 12, 179, 23);
		panel_3.add(comboBox);
		
		JLabel label_1 = new JLabel("Lecturer(s)");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(126, 11, 96, 23);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("Selected Lecturer(s) List");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(126, 56, 149, 23);
		panel_3.add(label_2);
		
		JButton button_3 = new JButton("Clear List");
		button_3.setForeground(Color.RED);
		button_3.setBackground(new Color(230, 230, 250));
		button_3.setBounds(393, 115, 96, 23);
		panel_3.add(button_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(310, 166, 179, 23);
		panel_3.add(comboBox_1);
		
		JLabel label_3 = new JLabel("Subject Name");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(126, 165, 149, 23);
		panel_3.add(label_3);
		
		JLabel label_4 = new JLabel("Selected Subject Code");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(126, 212, 149, 23);
		panel_3.add(label_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBackground(new Color(220, 220, 220));
		textArea.setBounds(310, 214, 179, 23);
		panel_3.add(textArea);
		
		JLabel label_5 = new JLabel("Tag");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(626, 11, 132, 23);
		panel_3.add(label_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(786, 12, 161, 23);
		panel_3.add(comboBox_2);
		
		JLabel label_6 = new JLabel("Group/Sub Group ID");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(626, 56, 150, 23);
		panel_3.add(label_6);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(786, 57, 161, 23);
		panel_3.add(comboBox_3);
		
		JLabel label_7 = new JLabel("No Of Students");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(626, 166, 108, 23);
		panel_3.add(label_7);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner.setBounds(786, 166, 161, 22);
		panel_3.add(spinner);
		
		JLabel label_8 = new JLabel("Duration(hrs)");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBounds(626, 212, 108, 23);
		panel_3.add(label_8);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner_1.setBounds(786, 212, 161, 22);
		panel_3.add(spinner_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		panel_5.setBounds(0, 5, 1082, 33);
		panel_2.add(panel_5);
		
		JLabel lblManageSessions = new JLabel("Manage Sessions");
		lblManageSessions.setHorizontalAlignment(SwingConstants.CENTER);
		lblManageSessions.setForeground(new Color(0, 128, 128));
		lblManageSessions.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblManageSessions.setBounds(405, 0, 278, 31);
		panel_5.add(lblManageSessions);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(0, 0, 1082, 9);
		panel_2.add(separator);
	}
}
