package WorkingDays;

import java.awt.EventQueue;
import java.awt.Font;
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
import java.awt.List;
import java.awt.ScrollPane;
import java.awt.Button;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;

public class AddWorkingdays{

	private JFrame frmAddStudentGroup;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddWorkingdays window = new AddWorkingdays();
					window.frmAddStudentGroup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddWorkingdays() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentGroup = new JFrame();
		frmAddStudentGroup.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmAddStudentGroup.setBackground(Color.YELLOW);
		frmAddStudentGroup.setResizable(false);
		frmAddStudentGroup.setTitle("Add Working Days And Hours");
		frmAddStudentGroup.setSize(1400, 860);
		frmAddStudentGroup.setBounds(0, 0, 1350, 700);
		frmAddStudentGroup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentGroup.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		frmAddStudentGroup.getContentPane().add(panel);
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
		frmAddStudentGroup.getContentPane().add(panel_1);
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
		
		JLabel lblNewLabel_1 = new JLabel("Working Days And Hours");
		lblNewLabel_1.setForeground(new Color(32, 178, 170));
		lblNewLabel_1.setBackground(new Color(32, 178, 170));
		lblNewLabel_1.setBounds(262, 69, 1082, 36);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		frmAddStudentGroup.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 108, 1082, 14);
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		frmAddStudentGroup.getContentPane().add(separator);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(47, 79, 79));
		tabbedPane.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		tabbedPane.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(32, 178, 170)));
		tabbedPane.setBounds(262, 108, 1082, 585);
		frmAddStudentGroup.getContentPane().add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("         Add Woking Days And Hours         ", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(102, 153, 255)));
		panel_5.setBounds(92, 11, 860, 331);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Number Of Working Days                         :");
		lblNewLabel_5.setBounds(48, 25, 221, 21);
		panel_5.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Select Days                                                  :");
		lblNewLabel_6.setBounds(48, 68, 221, 21);
		panel_5.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Hours");
		lblNewLabel_7.setBounds(443, 278, 39, 21);
		panel_5.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Minutes");
		lblNewLabel_7_1.setBounds(616, 278, 100, 21);
		panel_5.add(lblNewLabel_7_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 7, 1));
		spinner_2.setBounds(317, 25, 127, 21);
		panel_5.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_3.setBounds(317, 277, 120, 22);
		panel_5.add(spinner_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Monday");
		chckbxNewCheckBox.setBounds(317, 67, 97, 23);
		panel_5.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Tuesday");
		chckbxNewCheckBox_1.setBounds(317, 93, 97, 23);
		panel_5.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Wednesday");
		chckbxNewCheckBox_2.setBounds(317, 119, 97, 23);
		panel_5.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Thursday");
		chckbxNewCheckBox_3.setBounds(317, 145, 97, 23);
		panel_5.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Friday");
		chckbxNewCheckBox_4.setBounds(317, 171, 97, 23);
		panel_5.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Saturday");
		chckbxNewCheckBox_5.setBounds(317, 197, 97, 23);
		panel_5.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Sunday");
		chckbxNewCheckBox_6.setBounds(317, 226, 97, 23);
		panel_5.add(chckbxNewCheckBox_6);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 30, 30));
		spinner.setBounds(492, 278, 120, 22);
		panel_5.add(spinner);
		
		JLabel lblWorkingTime = new JLabel("Working Time                                               :");
		lblWorkingTime.setBounds(48, 281, 259, 21);
		panel_5.add(lblWorkingTime);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdd.setEnabled(true);
		btnAdd.setBackground(new Color(0, 153, 153));
		btnAdd.setBounds(689, 289, 141, 31);
		panel_5.add(btnAdd);
		
		JButton btnEdit_1 = new JButton("EDIT");
		btnEdit_1.setForeground(Color.WHITE);
		btnEdit_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEdit_1.setEnabled(true);
		btnEdit_1.setBackground(new Color(0, 153, 153));
		btnEdit_1.setBounds(92, 459, 141, 31);
		panel_2.add(btnEdit_1);
		
		JButton btnEdit = new JButton("UPDATE");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEdit.setEnabled(true);
		btnEdit.setBackground(new Color(0, 153, 153));
		btnEdit.setBounds(481, 459, 141, 31);
		panel_2.add(btnEdit);
		
		JButton btnClear_1 = new JButton("DELETE");
		btnClear_1.setForeground(Color.WHITE);
		btnClear_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear_1.setEnabled(true);
		btnClear_1.setBackground(new Color(0, 153, 153));
		btnClear_1.setBounds(811, 459, 141, 31);
		panel_2.add(btnClear_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(92, 353, 860, 95);
		panel_2.add(scrollPane_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_3.setViewportView(scrollPane_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_2.setViewportView(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Working Days", "Day 1", "Day 2", "Day 3", "Day 4", "Day 5","Day 6","Day 7","Hours","Minutes"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setColumnHeaderView(scrollPane_1);
	}
}
