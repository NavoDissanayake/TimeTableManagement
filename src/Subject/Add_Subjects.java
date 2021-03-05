package Subject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
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
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;

public class Add_Subjects {

	private JFrame frame;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Subjects window = new Add_Subjects();
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
	public Add_Subjects() {
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
		frame.setTitle("Subjects");
		frame.setSize(1400, 860);
		frame.setBounds(0, 0, 1350, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(51, 153, 153));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
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
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnManageGroups.setForeground(new Color(255, 255, 255));
		btnManageGroups.setBackground(new Color(0, 139, 139));
		btnManageGroups.setBounds(0, 10, 264, 38);
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel_1.add(btnManageGroups);
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setBounds(12, 724, 238, 50);
		btnViewGroups_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		
		JButton button_7 = new JButton("Lecturers");
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_7.setBackground(new Color(0, 139, 139));
		button_7.setBounds(0, 59, 264, 38);
		panel_1.add(button_7);
		
		JButton btnStudents = new JButton("Students");
		btnStudents.setForeground(Color.WHITE);
		btnStudents.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnStudents.setBackground(new Color(0, 139, 139));
		btnStudents.setBounds(0, 108, 264, 38);
		panel_1.add(btnStudents);
		
		JButton btnSubjects = new JButton("Subjects");
		btnSubjects.setForeground(Color.WHITE);
		btnSubjects.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnSubjects.setBackground(new Color(0, 139, 139));
		btnSubjects.setBounds(0, 157, 264, 38);
		panel_1.add(btnSubjects);
		
		JButton btnSessions = new JButton("Sessions");
		btnSessions.setForeground(Color.WHITE);
		btnSessions.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnSessions.setBackground(new Color(0, 139, 139));
		btnSessions.setBounds(0, 206, 264, 38);
		panel_1.add(btnSessions);
		
		JButton btnTags = new JButton("Tags");
		btnTags.setForeground(Color.WHITE);
		btnTags.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnTags.setBackground(new Color(0, 139, 139));
		btnTags.setBounds(0, 255, 264, 38);
		panel_1.add(btnTags);
		
		JButton btnRooms = new JButton("Rooms");
		btnRooms.setForeground(Color.WHITE);
		btnRooms.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnRooms.setBackground(new Color(0, 139, 139));
		btnRooms.setBounds(0, 304, 264, 38);
		panel_1.add(btnRooms);
		
		JButton btnWorkingDays = new JButton("Working days & Hours");
		btnWorkingDays.setForeground(Color.WHITE);
		btnWorkingDays.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnWorkingDays.setBackground(new Color(0, 139, 139));
		btnWorkingDays.setBounds(0, 353, 264, 38);
		panel_1.add(btnWorkingDays);
		
		JButton btnLocations = new JButton("Locations");
		btnLocations.setForeground(Color.WHITE);
		btnLocations.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnLocations.setBackground(new Color(0, 139, 139));
		btnLocations.setBounds(0, 402, 264, 38);
		panel_1.add(btnLocations);
		
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.setForeground(Color.WHITE);
		btnStatistics.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnStatistics.setBackground(new Color(0, 139, 139));
		btnStatistics.setBounds(0, 451, 264, 38);
		panel_1.add(btnStatistics);
		
		JButton btnAdvanced = new JButton("Advanced");
		btnAdvanced.setForeground(Color.WHITE);
		btnAdvanced.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnAdvanced.setBackground(new Color(0, 139, 139));
		btnAdvanced.setBounds(0, 500, 264, 38);
		panel_1.add(btnAdvanced);
		
		JButton btnTimetableGenerate = new JButton("Timetable Generate");
		btnTimetableGenerate.setForeground(Color.WHITE);
		btnTimetableGenerate.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnTimetableGenerate.setBackground(new Color(0, 139, 139));
		btnTimetableGenerate.setBounds(0, 549, 264, 38);
		panel_1.add(btnTimetableGenerate);
		
		/*
		 * JLabel lbli = new JLabel("New label"); lbli.setBounds(0, 13, 264, 256);
		 * ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png/"));
		 * lbli.setIcon(image); panel_1.add(lbli);
		 */
		
		JLabel lblNewLabel_1 = new JLabel(" Subjects");
		lblNewLabel_1.setForeground(new Color(32, 178, 170));
		lblNewLabel_1.setBackground(new Color(32, 178, 170));
		lblNewLabel_1.setBounds(262, 69, 1082, 36);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 108, 1082, 14);
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		frame.getContentPane().add(separator);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(47, 79, 79));
		tabbedPane.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		tabbedPane.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(32, 178, 170)));
		tabbedPane.setBounds(262, 108, 1082, 540);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("          Manage Subjects          ", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 1055, 140);
		panel_2.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		
		table = new JTable();
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table.setBackground(new Color(245, 245, 245));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Subject Code", "Subject Name", "Year", "Semester", "Lec Hours", "Tute Hours", "Lab Hours", "Evaluation Hours"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(35);
		table.getColumnModel().getColumn(1).setPreferredWidth(78);
		table.getColumnModel().getColumn(2).setPreferredWidth(86);
		scrollPane.setViewportView(table);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_6.setBackground(new Color(245, 245, 245));
		panel_6.setBounds(10, 167, 1055, 325);
		panel_2.add(panel_6);
		
		JButton button_1 = new JButton("CLEAR");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setEnabled(true);
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(632, 294, 141, 31);
		panel_6.add(button_1);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setEnabled(true);
		btnDelete.setBackground(new Color(0, 128, 128));
		btnDelete.setBounds(453, 294, 141, 31);
		panel_6.add(btnDelete);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEdit.setEnabled(true);
		btnEdit.setBackground(new Color(0, 128, 128));
		btnEdit.setBounds(271, 294, 141, 31);
		panel_6.add(btnEdit);
		
		JLabel label = new JLabel("Subject Code");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(123, 11, 96, 23);
		panel_6.add(label);
		
		JLabel label_1 = new JLabel("Subject Name");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(123, 70, 96, 23);
		panel_6.add(label_1);
		
		JLabel label_2 = new JLabel("Offered Year");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(123, 133, 87, 23);
		panel_6.add(label_2);
		
		JLabel label_3 = new JLabel("Offered Semester");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(123, 196, 122, 23);
		panel_6.add(label_3);
		
		JRadioButton radioButton = new JRadioButton("1st");
		radioButton.setHorizontalAlignment(SwingConstants.LEFT);
		radioButton.setForeground(new Color(0, 139, 139));
		radioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		radioButton.setBounds(251, 197, 67, 23);
		panel_6.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2nd");
		radioButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		radioButton_1.setForeground(new Color(0, 139, 139));
		radioButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		radioButton_1.setBounds(361, 197, 51, 23);
		panel_6.add(radioButton_1);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(251, 134, 161, 23);
		panel_6.add(comboBox_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(251, 71, 161, 23);
		panel_6.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(251, 12, 161, 23);
		panel_6.add(textField_3);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(792, 197, 161, 23);
		panel_6.add(comboBox_6);
		
		JLabel label_4 = new JLabel("No Of Evaluation Hours");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(632, 196, 150, 23);
		panel_6.add(label_4);
		
		JLabel label_5 = new JLabel("No Of Lab Hours");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(632, 133, 150, 23);
		panel_6.add(label_5);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(792, 134, 161, 23);
		panel_6.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(792, 71, 161, 23);
		panel_6.add(comboBox_8);
		
		JLabel label_6 = new JLabel("No Of Tutorial Hours");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(632, 70, 150, 23);
		panel_6.add(label_6);
		
		JLabel label_7 = new JLabel("No Of Lecture  Hours");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(632, 11, 150, 23);
		panel_6.add(label_7);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(792, 12, 161, 23);
		panel_6.add(comboBox_9);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("          Add New Subject          ", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setBounds(339, 472, 141, 31);
		panel_3.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setEnabled(true);
		btnClear.setBackground(new Color(0, 128, 128));
		btnClear.setBounds(620, 472, 141, 31);
		panel_3.add(btnClear);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBackground(SystemColor.menu);
		panel_5.setBounds(0, 11, 1065, 457);
		panel_3.add(panel_5);
		
		JLabel lblEmployeeName = new JLabel("Subject Code");
		lblEmployeeName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmployeeName.setBounds(129, 50, 96, 23);
		panel_5.add(lblEmployeeName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(257, 51, 161, 23);
		panel_5.add(textField_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(257, 220, 161, 23);
		panel_5.add(comboBox_1);
		
		JLabel lblFaculty = new JLabel("Offered Year");
		lblFaculty.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFaculty.setBounds(129, 219, 87, 23);
		panel_5.add(lblFaculty);
		
		JLabel lblBuilding = new JLabel("No Of Lecture  Hours");
		lblBuilding.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBuilding.setBounds(650, 50, 150, 23);
		panel_5.add(lblBuilding);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(810, 51, 161, 23);
		panel_5.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(810, 132, 161, 23);
		panel_5.add(comboBox_3);
		
		JLabel lblCampuscenter = new JLabel("No Of Tutorial Hours");
		lblCampuscenter.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCampuscenter.setBounds(650, 131, 150, 23);
		panel_5.add(lblCampuscenter);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(810, 310, 161, 23);
		panel_5.add(comboBox_4);
		
		JLabel lblBuilding_1 = new JLabel("No Of Lab Hours");
		lblBuilding_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBuilding_1.setBounds(650, 219, 150, 23);
		panel_5.add(lblBuilding_1);
		
		JLabel lblSubjectName = new JLabel("Subject Name");
		lblSubjectName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubjectName.setBounds(129, 131, 96, 23);
		panel_5.add(lblSubjectName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(257, 132, 161, 23);
		panel_5.add(textField);
		
		JLabel lblOfferedSemester = new JLabel("Offered Semester");
		lblOfferedSemester.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOfferedSemester.setBounds(129, 309, 122, 23);
		panel_5.add(lblOfferedSemester);
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1st");
		rdbtnNewRadioButton.setForeground(new Color(0, 139, 139));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNewRadioButton.setBounds(257, 310, 67, 23);
		panel_5.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnnd = new JRadioButton("2nd");
		rdbtnnd.setForeground(new Color(0, 139, 139));
		rdbtnnd.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnnd.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnnd.setBounds(367, 310, 51, 23);
		panel_5.add(rdbtnnd);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnnd);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(810, 220, 161, 23);
		panel_5.add(comboBox);
		
		JLabel lblNoOfEvaluation = new JLabel("No Of Evaluation Hours");
		lblNoOfEvaluation.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNoOfEvaluation.setBounds(650, 309, 150, 23);
		panel_5.add(lblNoOfEvaluation);
		

	}
}
