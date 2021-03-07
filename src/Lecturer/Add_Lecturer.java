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

import Session.Add_Session;
import Student.Add_StudentGroup;
import Subject.Add_Subjects;

import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.border.EmptyBorder;

public class Add_Lecturer {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	
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
					Add_Lecturer window = new Add_Lecturer();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBackground(Color.YELLOW);
		frame.setResizable(false);
		frame.setTitle("Lecturers");
		frame.setSize(1400, 860);
		frame.setBounds(0, 0, 1350, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(51, 153, 153));
		frame.getContentPane().add(panel);
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
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton btnManageGroups = new JButton("Home");
		btnManageGroups.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageGroups.setIcon(new ImageIcon(home_logo));
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				frame.dispose();
				
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
				frame.dispose();
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
				frame.dispose();
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
		
		/*
		 * JLabel lbli = new JLabel("New label"); lbli.setBounds(0, 13, 264, 256);
		 * ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png/"));
		 * lbli.setIcon(image); panel_1.add(lbli);
		 */
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(47, 79, 79));
		tabbedPane.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		tabbedPane.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(32, 178, 170)));
		tabbedPane.setBounds(262, 63, 1082, 593);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("          Manage Lecturers          ", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 49, 1055, 153);
		panel_2.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		
		table = new JTable();
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table.setBackground(new Color(245, 245, 245));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Emp ID", "Emp Name", "Level", "Rank", "Faculty", "Department", "Campus/Center", "Building", "Active days", "hours", "minutes"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_6.setBackground(new Color(245, 245, 245));
		panel_6.setBounds(10, 213, 1055, 320);
		panel_2.add(panel_6);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(127, 19, 134, 23);
		panel_6.add(textField_3);
		
		JLabel label = new JLabel("Employee ID");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(42, 18, 108, 23);
		panel_6.add(label);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(127, 53, 134, 23);
		panel_6.add(comboBox_5);
		
		JLabel label_1 = new JLabel("Level");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(42, 53, 108, 23);
		panel_6.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setForeground(SystemColor.controlDkShadow);
		textField_4.setColumns(10);
		textField_4.setBounds(127, 87, 134, 23);
		panel_6.add(textField_4);
		
		JLabel label_2 = new JLabel("Rank");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setBounds(42, 87, 108, 23);
		panel_6.add(label_2);
		
		JButton button = new JButton("GENERATE RANK");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(new Color(119, 136, 153));
		button.setBounds(59, 148, 185, 36);
		panel_6.add(button);
		
		JButton button_1 = new JButton("CLEAR");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setEnabled(true);
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(630, 289, 141, 31);
		panel_6.add(button_1);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setEnabled(true);
		btnDelete.setBackground(new Color(0, 128, 128));
		btnDelete.setBounds(451, 289, 141, 31);
		panel_6.add(btnDelete);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEdit.setEnabled(true);
		btnEdit.setBackground(new Color(0, 128, 128));
		btnEdit.setBounds(269, 289, 141, 31);
		panel_6.add(btnEdit);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(487, 20, 161, 23);
		panel_6.add(textField_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(487, 53, 161, 23);
		panel_6.add(comboBox_6);
		
		JLabel label_3 = new JLabel("Employee Name");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3.setBounds(372, 19, 96, 23);
		panel_6.add(label_3);
		
		JLabel label_4 = new JLabel("Faculty");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_4.setBounds(372, 52, 87, 23);
		panel_6.add(label_4);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(487, 88, 161, 23);
		panel_6.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(487, 123, 161, 23);
		panel_6.add(comboBox_8);
		
		JLabel label_5 = new JLabel("Department");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_5.setBounds(372, 87, 87, 23);
		panel_6.add(label_5);
		
		JLabel label_6 = new JLabel("Campus/Center");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_6.setBounds(372, 122, 87, 23);
		panel_6.add(label_6);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(487, 158, 161, 23);
		panel_6.add(comboBox_9);
		
		JLabel label_7 = new JLabel("Building");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_7.setBounds(372, 157, 87, 23);
		panel_6.add(label_7);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(838, 158, 73, 22);
		panel_6.add(spinner_1);
		
		JLabel label_8 = new JLabel("Active time per day");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_8.setBounds(713, 157, 108, 23);
		panel_6.add(label_8);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(949, 159, 73, 22);
		panel_6.add(spinner_3);
		
		JLabel label_9 = new JLabel("mins");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_9.setBounds(1022, 158, 33, 23);
		panel_6.add(label_9);
		
		JLabel label_10 = new JLabel("Active days");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_10.setBounds(713, 19, 108, 23);
		panel_6.add(label_10);
		
		JCheckBox checkBox = new JCheckBox("Monday");
		checkBox.setBounds(838, 20, 101, 23);
		panel_6.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Tuesday");
		checkBox_1.setBounds(838, 45, 101, 23);
		panel_6.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("Wednesday");
		checkBox_2.setBounds(838, 72, 101, 23);
		panel_6.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Thursday");
		checkBox_3.setBounds(838, 97, 101, 23);
		panel_6.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("Friday");
		checkBox_4.setBounds(838, 123, 101, 23);
		panel_6.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Saturday");
		checkBox_5.setBounds(949, 19, 87, 23);
		panel_6.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("Sunday");
		checkBox_6.setBounds(949, 45, 87, 23);
		panel_6.add(checkBox_6);
		
		JLabel label_11 = new JLabel("hrs");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_11.setBounds(915, 157, 24, 23);
		panel_6.add(label_11);
		
		JLabel lblNewLabel_1 = new JLabel(" Manage Lecturers");
		lblNewLabel_1.setBounds(0, 3, 1082, 29);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(32, 178, 170));
		lblNewLabel_1.setBackground(new Color(32, 178, 170));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 35, 1082, 4);
		panel_2.add(separator);
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("          Add New Lecturer          ", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(10, 54, 1055, 104);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(127, 19, 161, 23);
		panel_4.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Employee ID");
		lblNewLabel.setBounds(42, 18, 108, 23);
		panel_4.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(456, 19, 191, 23);
		panel_4.add(comboBox);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setBounds(398, 18, 108, 23);
		panel_4.add(lblLevel);
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		textField_1 = new JTextField();
		textField_1.setBounds(824, 19, 191, 23);
		panel_4.add(textField_1);
		textField_1.setForeground(new Color(105, 105, 105));
		textField_1.setColumns(10);
		
		JLabel lblRank = new JLabel("Rank");
		lblRank.setBounds(764, 18, 108, 23);
		panel_4.add(lblRank);
		lblRank.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton_1 = new JButton("GENERATE RANK");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(398, 64, 249, 33);
		panel_4.add(btnNewButton_1);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(119, 136, 153));
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBackground(SystemColor.menu);
		panel_5.setBounds(10, 169, 1055, 364);
		panel_3.add(panel_5);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmployeeName.setBounds(110, 38, 96, 23);
		panel_5.add(lblEmployeeName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(225, 39, 161, 23);
		panel_5.add(textField_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(225, 92, 161, 23);
		panel_5.add(comboBox_1);
		
		JLabel lblFaculty = new JLabel("Faculty");
		lblFaculty.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFaculty.setBounds(110, 91, 87, 23);
		panel_5.add(lblFaculty);
		
		JLabel lblBuilding = new JLabel("Department");
		lblBuilding.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBuilding.setBounds(110, 148, 87, 23);
		panel_5.add(lblBuilding);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(225, 149, 161, 23);
		panel_5.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(225, 209, 161, 23);
		panel_5.add(comboBox_3);
		
		JLabel lblCampuscenter = new JLabel("Campus/Center");
		lblCampuscenter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCampuscenter.setBounds(110, 208, 87, 23);
		panel_5.add(lblCampuscenter);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(225, 268, 161, 23);
		panel_5.add(comboBox_4);
		
		JLabel lblBuilding_1 = new JLabel("Building");
		lblBuilding_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBuilding_1.setBounds(110, 267, 87, 23);
		panel_5.add(lblBuilding_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Monday");
		chckbxNewCheckBox.setBounds(787, 39, 96, 23);
		panel_5.add(chckbxNewCheckBox);
		
		JCheckBox chckbxSaturday = new JCheckBox("Saturday");
		chckbxSaturday.setBounds(898, 38, 87, 23);
		panel_5.add(chckbxSaturday);
		
		JCheckBox chckbxTuesday = new JCheckBox("Tuesday");
		chckbxTuesday.setBounds(787, 64, 96, 23);
		panel_5.add(chckbxTuesday);
		
		JCheckBox chckbxWednesday = new JCheckBox("Wednesday");
		chckbxWednesday.setBounds(787, 91, 96, 23);
		panel_5.add(chckbxWednesday);
		
		JCheckBox chckbxThursday = new JCheckBox("Thursday");
		chckbxThursday.setBounds(787, 116, 96, 23);
		panel_5.add(chckbxThursday);
		
		JCheckBox chckbxFriday = new JCheckBox("Friday");
		chckbxFriday.setBounds(787, 142, 96, 23);
		panel_5.add(chckbxFriday);
		
		JCheckBox chckbxSunday = new JCheckBox("Sunday");
		chckbxSunday.setBounds(898, 64, 87, 23);
		panel_5.add(chckbxSunday);
		
		JLabel lblActiveDays = new JLabel("Active days");
		lblActiveDays.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblActiveDays.setBounds(662, 38, 108, 23);
		panel_5.add(lblActiveDays);
		
		JLabel lblActiveHours = new JLabel("Active time per day");
		lblActiveHours.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblActiveHours.setBounds(662, 208, 108, 23);
		panel_5.add(lblActiveHours);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(787, 210, 73, 22);
		panel_5.add(spinner);
		
		JLabel lblHrs = new JLabel("hrs");
		lblHrs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHrs.setBounds(866, 208, 33, 23);
		panel_5.add(lblHrs);
		
		JLabel lblMins = new JLabel("mins");
		lblMins.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMins.setBounds(971, 208, 33, 23);
		panel_5.add(lblMins);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(898, 209, 73, 22);
		panel_5.add(spinner_2);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBounds(327, 333, 141, 31);
		panel_5.add(btnNewButton);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(0, 128, 128));
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(608, 333, 141, 31);
		panel_5.add(btnClear);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setEnabled(true);
		btnClear.setBackground(new Color(0, 128, 128));
		
		JLabel lblAddlecturer = new JLabel(" Add New  Lecturer");
		lblAddlecturer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddlecturer.setForeground(new Color(32, 178, 170));
		lblAddlecturer.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblAddlecturer.setBackground(new Color(32, 178, 170));
		lblAddlecturer.setBounds(10, 3, 1082, 29);
		panel_3.add(lblAddlecturer);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(32, 178, 170));
		separator_1.setBackground(new Color(0, 139, 139));
		separator_1.setBounds(0, 37, 1075, 10);
		panel_3.add(separator_1);
	}
}
