package Session;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.ScrollPane;
import javax.swing.UIManager;

public class Add_Session {

	private JFrame frame;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Session window = new Add_Session();
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
	public Add_Session() {
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
		frame.setTitle("Sessions");
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
		
		JLabel lblNewLabel_1 = new JLabel(" Sessions");
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
		tabbedPane.addTab("          Manage Sessions          ", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 1055, 140);
		panel_2.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(245, 245, 245));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Lecturer(s)", "Subject Code", "Subject Name", "Tag", "Group/Sub Group ID", "No Of Students", "Duration(hrs)"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(45);
		table.getColumnModel().getColumn(1).setPreferredWidth(131);
		table.getColumnModel().getColumn(3).setPreferredWidth(125);
		table.getColumnModel().getColumn(4).setPreferredWidth(85);
		table.getColumnModel().getColumn(5).setPreferredWidth(109);
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
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(310, 56, 179, 60);
		panel_6.add(panel_8);
		panel_8.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 0, 179, 60);
		panel_8.add(scrollPane_4);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setLineWrap(true);
		scrollPane_4.setViewportView(textArea_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(310, 12, 179, 23);
		panel_6.add(comboBox);
		
		JLabel label = new JLabel("Lecturer(s)");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(126, 11, 96, 23);
		panel_6.add(label);
		
		JLabel label_1 = new JLabel("Selected Lecturer(s) List");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(126, 56, 149, 23);
		panel_6.add(label_1);
		
		JButton button = new JButton("Clear List");
		button.setForeground(Color.RED);
		button.setBackground(new Color(230, 230, 250));
		button.setBounds(393, 115, 96, 23);
		panel_6.add(button);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(310, 166, 179, 23);
		panel_6.add(comboBox_5);
		
		JLabel label_2 = new JLabel("Subject Name");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(126, 165, 149, 23);
		panel_6.add(label_2);
		
		JLabel label_3 = new JLabel("Selected Subject Code");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(126, 212, 149, 23);
		panel_6.add(label_3);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setLineWrap(true);
		textArea_2.setBackground(new Color(220, 220, 220));
		textArea_2.setBounds(310, 214, 179, 23);
		panel_6.add(textArea_2);
		
		JLabel label_4 = new JLabel("Tag");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(626, 11, 132, 23);
		panel_6.add(label_4);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(786, 12, 161, 23);
		panel_6.add(comboBox_6);
		
		JLabel label_5 = new JLabel("Group/Sub Group ID");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(626, 56, 150, 23);
		panel_6.add(label_5);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(786, 57, 161, 23);
		panel_6.add(comboBox_7);
		
		JLabel label_6 = new JLabel("No Of Students");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(626, 166, 108, 23);
		panel_6.add(label_6);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner_2.setBounds(786, 166, 161, 22);
		panel_6.add(spinner_2);
		
		JLabel label_7 = new JLabel("Duration(hrs)");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(626, 212, 108, 23);
		panel_6.add(label_7);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner_3.setBounds(786, 212, 161, 22);
		panel_6.add(spinner_3);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("          Add New Session          ", null, panel_3, null);
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
		panel_5.setBounds(10, 11, 1055, 450);
		panel_3.add(panel_5);
		
		JLabel lblEmployeeName = new JLabel("Lecturer(s)");
		lblEmployeeName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmployeeName.setBounds(110, 38, 96, 23);
		panel_5.add(lblEmployeeName);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(294, 39, 161, 23);
		panel_5.add(comboBox_1);
		
		JLabel lblBuilding = new JLabel("Tag");
		lblBuilding.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBuilding.setBounds(610, 38, 132, 23);
		panel_5.add(lblBuilding);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(294, 228, 161, 23);
		panel_5.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(770, 39, 161, 23);
		panel_5.add(comboBox_3);
		
		JLabel lblCampuscenter = new JLabel("Group/Sub Group ID");
		lblCampuscenter.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCampuscenter.setBounds(610, 95, 150, 23);
		panel_5.add(lblCampuscenter);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(770, 96, 161, 23);
		panel_5.add(comboBox_4);
		
		JLabel lblSelectedLecturersList = new JLabel("Selected Lecturer(s) List");
		lblSelectedLecturersList.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSelectedLecturersList.setBounds(110, 95, 149, 23);
		panel_5.add(lblSelectedLecturersList);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(294, 95, 179, 70);
		panel_5.add(scrollPane_2);
		
		JPanel panel_4 = new JPanel();
		scrollPane_2.setViewportView(panel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setColumns(14);
		panel_4.add(textArea);
		textArea.setLineWrap(true);
		
		JButton btnNewButton_1 = new JButton("Clear List");
		btnNewButton_1.setBackground(new Color(230, 230, 250));
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(377, 166, 96, 23);
		panel_5.add(btnNewButton_1);
		
		JLabel lblSubjectName = new JLabel("Subject Name");
		lblSubjectName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubjectName.setBounds(110, 227, 149, 23);
		panel_5.add(lblSubjectName);
		
		JLabel lblSelectedSubjectList = new JLabel("Selected Subject Code");
		lblSelectedSubjectList.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSelectedSubjectList.setBounds(110, 302, 149, 23);
		panel_5.add(lblSelectedSubjectList);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(new Color(220, 220, 220));
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(294, 304, 161, 23);
		panel_5.add(textArea_1);
		
		JLabel lblNoOfStudents = new JLabel("No Of Students");
		lblNoOfStudents.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNoOfStudents.setBounds(610, 228, 108, 23);
		panel_5.add(lblNoOfStudents);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner.setBounds(770, 228, 161, 22);
		panel_5.add(spinner);
		
		JLabel lblDuration = new JLabel("Duration(hrs)");
		lblDuration.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDuration.setBounds(610, 302, 108, 23);
		panel_5.add(lblDuration);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner_1.setBounds(770, 302, 161, 22);
		panel_5.add(spinner_1);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("          Search Sessions          ", null, panel_7, null);
		panel_7.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(38, 223, 1027, 253);
		panel_7.add(scrollPane_5);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_5.setViewportView(scrollPane_3);
		
		table_1 = new JTable();
		table_1.setBorder(UIManager.getBorder("Button.border"));
		table_1.setBackground(Color.WHITE);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Lecturer(s)", "Subject Code", "Subject Name", "Tag", "Group/Sub Group ID", "No Of Students", "Duration(hrs)"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(67);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(128);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(135);
		table_1.getColumnModel().getColumn(5).setPreferredWidth(112);
		table_1.getColumnModel().getColumn(6).setPreferredWidth(88);
		scrollPane_3.setViewportView(table_1);
		
		JLabel lblNewLabel = new JLabel("Search by Lecturer :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(89, 61, 169, 15);
		panel_7.add(lblNewLabel);
		
		JLabel lblSearchByGroupsub = new JLabel("Search by Group/Sub Group :");
		lblSearchByGroupsub.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSearchByGroupsub.setBounds(455, 61, 204, 15);
		panel_7.add(lblSearchByGroupsub);
		
		JLabel lblSearchBySubject = new JLabel("Search by Subject :");
		lblSearchBySubject.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSearchBySubject.setBounds(861, 61, 204, 15);
		panel_7.add(lblSearchBySubject);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(50, 87, 206, 27);
		panel_7.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(438, 88, 206, 26);
		panel_7.add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setBounds(812, 87, 206, 27);
		panel_7.add(comboBox_10);
		
		
		

	}
}
