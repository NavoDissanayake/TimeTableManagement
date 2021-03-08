package Locations;

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
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.tools.DocumentationTool.Location;

import Lecturer.Add_Lecturer;
import Student.Add_StudentGroup;

public class ManageLocations {
	
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

	private JFrame frmMangeLocationsGroup;
	private JTable ltable;
	private JTextField ltextField_2;
	private JTextField ltextField_3;
	private JTable ltable_1;
	private JTextField ltextField;
	private JTextField ltextField_1;
	private JTextField ltextField_5;
	private JTable ltable_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageLocations window = new ManageLocations();
					window.frmMangeLocationsGroup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManageLocations() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMangeLocationsGroup = new JFrame();
		frmMangeLocationsGroup.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmMangeLocationsGroup.setBackground(Color.YELLOW);
		frmMangeLocationsGroup.setResizable(false);
		frmMangeLocationsGroup.setTitle("Add Student Group");
		frmMangeLocationsGroup.setSize(1400, 860);
		frmMangeLocationsGroup.setBounds(0, 0, 1350, 700);
		frmMangeLocationsGroup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMangeLocationsGroup.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		frmMangeLocationsGroup.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Locations");
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
		frmMangeLocationsGroup.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
	
		JButton btnLecturers = new JButton("Lecturers");
		btnLecturers.setHorizontalAlignment(SwingConstants.LEFT);
		btnLecturers.setIcon(new ImageIcon(lec_logo));
		btnLecturers.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					Add_Lecturer add_lecture = new Add_Lecturer();
					add_lecture.main(null);
					frmMangeLocationsGroup.dispose();
					
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
				frmMangeLocationsGroup.dispose();
				
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
		btnSubjects.setForeground(Color.WHITE);
		btnSubjects.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSubjects.setBackground(new Color(0, 139, 139));
		btnSubjects.setBounds(0, 157, 264, 38);
		panel_1.add(btnSubjects);
		
		JButton btnSessions = new JButton("Sessions");
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
		btnLocations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageLocations manage_lo = new ManageLocations();
				manage_lo.main(null);
				frmMangeLocationsGroup.dispose();
				
				
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
		
		
		JButton btnManageGroups = new JButton("Home");
		btnManageGroups.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageGroups.setIcon(new ImageIcon(home_logo));
		btnManageGroups.setBounds(0, 13, 262, 33);
		panel_1.add(btnManageGroups);
		
		btnManageGroups.setForeground(new Color(255, 255, 255));
		btnManageGroups.setBackground(new Color(0, 139, 139));
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 108, 1082, 14);
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		frmMangeLocationsGroup.getContentPane().add(separator);
		
		JPanel lpanel_2 = new JPanel();
		lpanel_2.setBackground(new Color(230, 230, 250));
		lpanel_2.setBounds(262, 115, 1082, 556);
		frmMangeLocationsGroup.getContentPane().add(lpanel_2);
		lpanel_2.setLayout(null);
		
		
		JPanel lpanel_3 = new JPanel();
		lpanel_3.setBounds(115, 59, 882, 464);
		lpanel_2.add(lpanel_3);
		lpanel_3.setLayout(null);
		
		JLabel loclblNewLabel = new JLabel("Building Name");
		loclblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		loclblNewLabel.setBounds(41, 83, 85, 16);
		lpanel_3.add(loclblNewLabel);
		
		JLabel loclblNewLabel_2 = new JLabel("Room Name");
		loclblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		loclblNewLabel_2.setBounds(41, 136, 74, 16);
		lpanel_3.add(loclblNewLabel_2);
		
		JLabel loclblNewLabel_3 = new JLabel("Room Type");
		loclblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		loclblNewLabel_3.setBounds(41, 197, 85, 16);
		lpanel_3.add(loclblNewLabel_3);
		
		JLabel loclblNewLabel_4 = new JLabel("Capacity");
		loclblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		loclblNewLabel_4.setBounds(41, 259, 59, 13);
		lpanel_3.add(loclblNewLabel_4);
		
		JButton lbtnAddButton = new JButton("ADD");
		lbtnAddButton.setForeground(new Color(255, 255, 255));
		lbtnAddButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbtnAddButton.setBackground(new Color(0, 139, 139));
		lbtnAddButton.setBounds(41, 322, 105, 31);
		lpanel_3.add(lbtnAddButton);
		
		JButton lbtnEditButton_1 = new JButton("EDIT");
		lbtnEditButton_1.setForeground(new Color(255, 255, 255));
		lbtnEditButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbtnEditButton_1.setBackground(new Color(0, 139, 139));
		lbtnEditButton_1.setBounds(195, 322, 105, 31);
		lpanel_3.add(lbtnEditButton_1);
		
		JButton lbtnDelButton_2 = new JButton("DELETE");
		lbtnDelButton_2.setForeground(new Color(255, 255, 255));
		lbtnDelButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbtnDelButton_2.setBackground(new Color(0, 139, 139));
		lbtnDelButton_2.setBounds(41, 382, 105, 31);
		lpanel_3.add(lbtnDelButton_2);
		
		JButton lbtnclrButton_3 = new JButton("CLEAR");
		lbtnclrButton_3.setForeground(new Color(255, 255, 255));
		lbtnclrButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbtnclrButton_3.setBackground(new Color(0, 139, 139));
		lbtnclrButton_3.setBounds(195, 382, 105, 31);
		lpanel_3.add(lbtnclrButton_3);
		
		ltextField = new JTextField();
		ltextField.setBounds(139, 134, 161, 23);
		lpanel_3.add(ltextField);
		ltextField.setColumns(10);
		
		ltextField_1 = new JTextField();
		ltextField_1.setBounds(139, 81, 161, 23);
		lpanel_3.add(ltextField_1);
		ltextField_1.setColumns(10);
		
		ltextField_5 = new JTextField();
		ltextField_5.setBounds(139, 255, 161, 23);
		lpanel_3.add(ltextField_5);
		ltextField_5.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(139, 195, 161, 23);
		lpanel_3.add(comboBox);
		
		JPanel lpanel_4 = new JPanel();
		lpanel_4.setBounds(379, 115, 460, 298);
		lpanel_3.add(lpanel_4);
		lpanel_4.setLayout(null);
		
		JScrollPane lscrollPane_1 = new JScrollPane();
		lscrollPane_1.setBounds(25, 22, 385, 252);
		lpanel_4.add(lscrollPane_1);
		
		JScrollPane lscrollPane = new JScrollPane();
		lscrollPane_1.setViewportView(lscrollPane);
		
		ltable_2 = new JTable();
		ltable_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Location ID", "Building Name", "Room Name", "Room Type", "Capacity"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		lscrollPane.setViewportView(ltable_2);
		
		JComboBox lcomboBox_1 = new JComboBox();
		lcomboBox_1.setBounds(589, 77, 200, 31);
		lpanel_3.add(lcomboBox_1);
		
		JPanel lpanel_6 = new JPanel();
		lpanel_6.setBounds(0, 0, 1082, 49);
		lpanel_2.add(lpanel_6);
		lpanel_6.setLayout(null);
		
		
		JLabel lollblNewLabel_1 = new JLabel("Manage Locations");
		lollblNewLabel_1.setForeground(new Color(0, 128, 128));
		lollblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lollblNewLabel_1.setBounds(406, 13, 278, 31);
		lpanel_6.add(lollblNewLabel_1);
		
	}
}
