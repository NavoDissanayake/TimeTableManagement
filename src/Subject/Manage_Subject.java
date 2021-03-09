package Subject;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Tags.Add_Tags;
import WorkingDays.AddWorkingdays;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;

public class Manage_Subject {

	private JFrame MngSubFrm;
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
	private JTable table;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage_Subject window = new Manage_Subject();
					window.MngSubFrm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Manage_Subject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		MngSubFrm = new JFrame();
		MngSubFrm.setAlwaysOnTop(true);

		MngSubFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		MngSubFrm.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		MngSubFrm.setBackground(Color.YELLOW);
		MngSubFrm.setTitle("Sessions");
		MngSubFrm.setSize(1400, 860);
		MngSubFrm.setBounds(0, 0, 1350, 700);
		//ManageSesFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MngSubFrm.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(0, 62, 262, 609);
		MngSubFrm.getContentPane().add(panel);
		
		JButton button = new JButton("Home");
		button.setIcon(new ImageIcon(home_logo));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 17));
		button.setBackground(new Color(0, 139, 139));
		button.setBounds(0, 10, 264, 38);
		panel.add(button);
		
		JButton button_1 = new JButton("<<Back");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(12, 724, 238, 50);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Lecturers");
		button_2.setIcon(new ImageIcon(lec_logo));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Lecturer add_Lecturer =  new Add_Lecturer();
				add_Lecturer.main(null);
				MngSubFrm.dispose();
			}
		});
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_2.setBackground(new Color(0, 139, 139));
		button_2.setBounds(0, 59, 264, 38);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Students");
		button_3.setIcon(new ImageIcon(stu_logo));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Add_StudentGroup add_StudentGroup = new Add_StudentGroup();
				add_StudentGroup.main(null);
				MngSubFrm.dispose();
			}
		});
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_3.setBackground(new Color(0, 139, 139));
		button_3.setBounds(0, 108, 264, 38);
		panel.add(button_3);
		
		JButton button_4 = new JButton("Subjects");
		button_4.setIcon(new ImageIcon(sub_logo));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Add_Subjects add_Subjects = new Add_Subjects();
				add_Subjects.main(null);
				MngSubFrm.dispose();
			}
		});
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_4.setBackground(new Color(0, 139, 139));
		button_4.setBounds(0, 157, 264, 38);
		panel.add(button_4);
		
		JButton button_5 = new JButton("Sessions");
		button_5.setIcon(new ImageIcon(session_logo));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Add_Session add_Session = new Add_Session();
				add_Session.main(null);
				MngSubFrm.dispose();
			}
		});
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_5.setBackground(new Color(0, 139, 139));
		button_5.setBounds(0, 206, 264, 38);
		panel.add(button_5);
		
		JButton button_6 = new JButton("Tags");
		button_6.setIcon(new ImageIcon(tag_logo));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Add_Tags add_Tags = new Add_Tags();
				add_Tags.main(null);
				MngSubFrm.dispose();
			
			}
		});
		button_6.setHorizontalAlignment(SwingConstants.LEFT);
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_6.setBackground(new Color(0, 139, 139));
		button_6.setBounds(0, 255, 264, 38);
		panel.add(button_6);
		
		JButton button_7 = new JButton("Rooms");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageSessionsRooms manageSessionsRooms = new ManageSessionsRooms();
				manageSessionsRooms.main(null);
				MngSubFrm.dispose();
			}
		});
		button_7.setIcon(new ImageIcon(room_logo));
		button_7.setHorizontalAlignment(SwingConstants.LEFT);
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_7.setBackground(new Color(0, 139, 139));
		button_7.setBounds(0, 304, 264, 38);
		panel.add(button_7);
		
		JButton button_8 = new JButton("Working days & Hours");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddWorkingdays addWorkingdays = new AddWorkingdays();
				addWorkingdays.main(null);
				MngSubFrm.dispose();
			}
		});
		button_8.setIcon(new ImageIcon(days_logo));
		button_8.setHorizontalAlignment(SwingConstants.LEFT);
		button_8.setForeground(Color.WHITE);
		button_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_8.setBackground(new Color(0, 139, 139));
		button_8.setBounds(0, 353, 264, 38);
		panel.add(button_8);
		
		JButton button_9 = new JButton("Locations");
		button_9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ManageLocations m_locations= new ManageLocations();
				m_locations.main(null);
				MngSubFrm.dispose();
				
			}
		});
		button_9.setIcon(new ImageIcon(location_logo));
		button_9.setHorizontalAlignment(SwingConstants.LEFT);
		button_9.setForeground(Color.WHITE);
		button_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_9.setBackground(new Color(0, 139, 139));
		button_9.setBounds(0, 402, 264, 38);
		panel.add(button_9);
		
		JButton button_10 = new JButton("Statistics");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statistics statistics = new Statistics();
				statistics.main(null);
				MngSubFrm.dispose();
			}
		});
		button_10.setIcon(new ImageIcon(st_logo));
		button_10.setHorizontalAlignment(SwingConstants.LEFT);
		button_10.setForeground(Color.WHITE);
		button_10.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_10.setBackground(new Color(0, 139, 139));
		button_10.setBounds(0, 451, 264, 38);
		panel.add(button_10);
		
		JButton button_11 = new JButton("Advanced");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		button_11.setIcon(new ImageIcon(adv_logo));
		button_11.setHorizontalAlignment(SwingConstants.LEFT);
		button_11.setForeground(Color.WHITE);
		button_11.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_11.setBackground(new Color(0, 139, 139));
		button_11.setBounds(0, 500, 264, 38);
		panel.add(button_11);
		
		JButton button_12 = new JButton("Timetable Generate");
		button_12.setIcon(new ImageIcon(time_logo));
		button_12.setHorizontalAlignment(SwingConstants.LEFT);
		button_12.setForeground(Color.WHITE);
		button_12.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_12.setBackground(new Color(0, 139, 139));
		button_12.setBounds(0, 549, 264, 38);
		panel.add(button_12);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(51, 153, 153));
		panel_1.setBounds(0, 0, 1344, 65);
		MngSubFrm.getContentPane().add(panel_1);
		
		JLabel label = new JLabel(" Subjects");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		label.setBackground(new Color(32, 178, 170));
		label.setBounds(262, 18, 1082, 36);
		panel_1.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(262, 102, 1082, 9);
		MngSubFrm.getContentPane().add(separator);
		
		JButton btnManageSubjects = new JButton("Manage Subjects");
		btnManageSubjects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Manage_Subject manage_Subject = new Manage_Subject();
				manage_Subject.main(null);
				MngSubFrm.dispose();
			}
		});
		btnManageSubjects.setBounds(517, 66, 258, 37);
		MngSubFrm.getContentPane().add(btnManageSubjects);
		
		JButton btnAddNewSubject = new JButton("Add New Subject");
		btnAddNewSubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Subjects add_Subjects = new Add_Subjects();
				 add_Subjects.main(null);
				 MngSubFrm.dispose();
			}
		});
		btnAddNewSubject.setBounds(262, 66, 258, 37);
		MngSubFrm.getContentPane().add(btnAddNewSubject);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(262, 89, 1075, 572);
		MngSubFrm.getContentPane().add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 52, 1055, 172);
		panel_2.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setViewportView(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_3.setBackground(new Color(245, 245, 245));
		panel_3.setBounds(10, 235, 1055, 326);
		panel_2.add(panel_3);
		
		JButton button_13 = new JButton("CLEAR");
		button_13.setForeground(Color.WHITE);
		button_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_13.setEnabled(true);
		button_13.setBackground(new Color(0, 128, 128));
		button_13.setBounds(632, 294, 141, 31);
		panel_3.add(button_13);
		
		JButton button_14 = new JButton("DELETE");
		button_14.setForeground(Color.WHITE);
		button_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_14.setEnabled(true);
		button_14.setBackground(new Color(0, 128, 128));
		button_14.setBounds(453, 294, 141, 31);
		panel_3.add(button_14);
		
		JButton button_15 = new JButton("EDIT");
		button_15.setForeground(Color.WHITE);
		button_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_15.setEnabled(true);
		button_15.setBackground(new Color(0, 128, 128));
		button_15.setBounds(271, 294, 141, 31);
		panel_3.add(button_15);
		
		JLabel label_1 = new JLabel("Subject Code");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(123, 11, 96, 23);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("Subject Name");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(123, 70, 96, 23);
		panel_3.add(label_2);
		
		JLabel label_3 = new JLabel("Offered Year");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(123, 133, 87, 23);
		panel_3.add(label_3);
		
		JLabel label_4 = new JLabel("Offered Semester");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(123, 196, 122, 23);
		panel_3.add(label_4);
		
		JRadioButton radioButton = new JRadioButton("1st");
		radioButton.setHorizontalAlignment(SwingConstants.LEFT);
		radioButton.setForeground(new Color(0, 139, 139));
		radioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		radioButton.setBounds(251, 197, 67, 23);
		panel_3.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2nd");
		radioButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		radioButton_1.setForeground(new Color(0, 139, 139));
		radioButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		radioButton_1.setBounds(361, 197, 51, 23);
		panel_3.add(radioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(251, 134, 161, 23);
		panel_3.add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(251, 71, 161, 23);
		panel_3.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(251, 12, 161, 23);
		panel_3.add(textField_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(792, 197, 161, 23);
		panel_3.add(comboBox_1);
		
		JLabel label_5 = new JLabel("No Of Evaluation Hours");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(632, 196, 150, 23);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("No Of Lab Hours");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(632, 133, 150, 23);
		panel_3.add(label_6);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(792, 134, 161, 23);
		panel_3.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(792, 71, 161, 23);
		panel_3.add(comboBox_3);
		
		JLabel label_7 = new JLabel("No Of Tutorial Hours");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(632, 70, 150, 23);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("No Of Lecture  Hours");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBounds(632, 11, 150, 23);
		panel_3.add(label_8);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(792, 12, 161, 23);
		panel_3.add(comboBox_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		panel_4.setBounds(0, 11, 1082, 38);
		panel_2.add(panel_4);
		
		JLabel lblManageSubbjects = new JLabel("Manage Subjects");
		lblManageSubbjects.setHorizontalAlignment(SwingConstants.CENTER);
		lblManageSubbjects.setForeground(new Color(0, 128, 128));
		lblManageSubbjects.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblManageSubbjects.setBounds(405, 0, 278, 38);
		panel_4.add(lblManageSubbjects);
	}

}
