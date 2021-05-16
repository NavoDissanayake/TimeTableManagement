// IT19210452
// W.M.S.T Wijekoon

package Subject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

import Advanced.Consecutive_sessions;
import DB.DbConnection;
import Home.Home;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Tags.Add_Tags;
import Timetable.Lecturer;
import WorkingDays.AddWorkingdays;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;

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

	private JTextField CodeTxt;
	private JTextField SubnameTxt;



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
		//AddSubFrm.setAlwaysOnTop(true);
		AddSubFrm.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		AddSubFrm.setResizable(false);
		AddSubFrm.setBackground(Color.YELLOW);
		AddSubFrm.setTitle("Time Table Management System");
		AddSubFrm.setSize(1350, 728);
		AddSubFrm.setBounds(0, 0, 1350, 700);
		AddSubFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AddSubFrm.getContentPane().setLayout(null);
		AddSubFrm.setLocationRelativeTo(null);
		AddSubFrm.setVisible(true);
		AddSubFrm.setIconImage(logo);
		
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
				AddSubFrm.dispose();
				new Home();

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

				AddSubFrm.dispose();
				new Add_Lecturer();

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
				AddSubFrm.dispose();
				new Add_StudentGroup();

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
				AddSubFrm.dispose();
				new Add_Subjects();

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
				AddSubFrm.dispose();
				new Add_Session();

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

				AddSubFrm.dispose();
				new Add_Tags();
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

				AddSubFrm.dispose();
				new  ManageSessionsRooms();
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

				AddSubFrm.dispose();
				AddWorkingdays w_days= new 	AddWorkingdays();
				w_days.main(null);
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

				AddSubFrm.dispose();
				new ManageLocations();
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
				AddSubFrm.dispose();
				new   Statistics();
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

				AddSubFrm.dispose();
				new Consecutive_sessions();
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
		btnTimetableGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddSubFrm.dispose();
				new Lecturer();
			}
		});
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

		CodeTxt = new JTextField();
		CodeTxt.setColumns(10);
		CodeTxt.setBounds(257, 51, 230, 28);
		panel_3.add(CodeTxt);

		JComboBox year = new JComboBox();
		year.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4"}));
		year.setBounds(257, 220, 230, 28);
		panel_3.add(year);

		JLabel label_1 = new JLabel("Offered Year");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(129, 219, 87, 23);
		panel_3.add(label_1);

		JLabel label_2 = new JLabel("No Of Lecture  Hours");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(650, 50, 150, 23);
		panel_3.add(label_2);

		JComboBox lechr = new JComboBox();
		lechr.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		lechr.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		lechr.setBounds(810, 51, 195, 28);
		panel_3.add(lechr);

		JComboBox tutehr = new JComboBox();
		tutehr.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		tutehr.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		tutehr.setBounds(810, 132, 195, 28);
		panel_3.add(tutehr);

		JLabel label_3 = new JLabel("No Of Tutorial Hours");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(650, 131, 150, 23);
		panel_3.add(label_3);

		JComboBox Evahr = new JComboBox();
		Evahr.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		Evahr.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", ""}));
		Evahr.setBounds(810, 310, 195, 28);
		panel_3.add(Evahr);

		JLabel label_4 = new JLabel("No Of Lab Hours");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(650, 219, 150, 23);
		panel_3.add(label_4);

		JLabel label_5 = new JLabel("Subject Name");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(129, 131, 96, 23);
		panel_3.add(label_5);

		SubnameTxt = new JTextField();
		SubnameTxt.setColumns(10);
		SubnameTxt.setBounds(257, 132, 230, 28);
		panel_3.add(SubnameTxt);

		JLabel label_6 = new JLabel("Offered Semester");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(129, 309, 122, 23);
		panel_3.add(label_6);


		ButtonGroup group = new ButtonGroup();

		JComboBox labhr = new JComboBox();
		labhr.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		labhr.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		labhr.setBounds(810, 220, 195, 28);
		panel_3.add(labhr);

		JLabel label_7 = new JLabel("No Of Evaluation Hours");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(650, 309, 150, 23);
		panel_3.add(label_7);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2"}));
		comboBox.setBounds(257, 310, 230, 28);
		panel_3.add(comboBox);


		// add new subject
		JButton btnAddSub = new JButton("ADD");
		btnAddSub.setToolTipText("Click button to save details");
		btnAddSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String code= CodeTxt.getText();
					String SubName= SubnameTxt.getText();
					String Year= year.getSelectedItem().toString();
					String sem = comboBox.getSelectedItem().toString();
					String lecs = lechr.getSelectedItem().toString();
					String tute = tutehr.getSelectedItem().toString();
					String lab = labhr.getSelectedItem().toString();
					String Eval = Evahr.getSelectedItem().toString();



					if(CodeTxt.getText().equals("") || SubnameTxt.getText().equals("") || year.getSelectedItem().equals("") || comboBox.getSelectedItem().equals("")) {
						JOptionPane.showMessageDialog(null, "       Please Fill All the Fields","Failed",JOptionPane.WARNING_MESSAGE);

					}else {
						Connection con = DbConnection.connect();

						String query = "INSERT INTO subjects values(null, '" + Year + "','" + sem + "','" + SubName + "', '" + code + "', '" + lecs + "', '" + tute + "','"+lab+"','"+Eval+"')";

						Statement sta = con.createStatement();
						int x = sta.executeUpdate(query);
						if (x == 0) {

							JLabel label = new JLabel("This is alredy exist");
							label.setHorizontalAlignment(SwingConstants.CENTER);
							JOptionPane.showMessageDialog(null, label);
						} 
						else {

							JLabel label = new JLabel("Subject Added Successfully");
							label.setHorizontalAlignment(SwingConstants.CENTER);
							JOptionPane.showMessageDialog(null, label);

						}
						con.close();
					}} catch (Exception exception) {
						System.out.println("Failed!");

					}
			}

		}
				);
		btnAddSub.setForeground(Color.WHITE);
		btnAddSub.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAddSub.setBackground(new Color(0, 128, 128));
		btnAddSub.setBounds(323, 449, 141, 31);
		panel_3.add(btnAddSub);

		JButton btnAdSbClear = new JButton("CLEAR");
		btnAdSbClear.setToolTipText("Click button to clear");

		btnAdSbClear.setForeground(Color.WHITE);
		btnAdSbClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdSbClear.setEnabled(true);
		btnAdSbClear.setBackground(new Color(0, 128, 128));
		btnAdSbClear.setBounds(604, 449, 141, 31);
		panel_3.add(btnAdSbClear);



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

				AddSubFrm.dispose();
				new Add_Subjects();
			}
		});
		button_2.setBounds(268, 64, 258, 44);
		AddSubFrm.getContentPane().add(button_2);

		JButton button_3 = new JButton("Manage Subjects");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				AddSubFrm.dispose();
				new Manage_Subject();
			}
		});
		button_3.setBounds(524, 64, 258, 44);

		AddSubFrm.getContentPane().add(button_3);


		//clear button
		btnAdSbClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				CodeTxt.setText("");
				SubnameTxt.setText("");
				year.setSelectedIndex(0);
				comboBox.setSelectedIndex(0);
				lechr.setSelectedIndex(0);
				tutehr.setSelectedIndex(0);
				labhr.setSelectedIndex(0);
				Evahr.setSelectedIndex(0);
			}
		});

	}
}
