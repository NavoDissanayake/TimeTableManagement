package Tags;

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

public class Add_Tags {

	private JFrame frmAddStudentGroup;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Tags window = new Add_Tags();
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
	public Add_Tags() {
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
		frmAddStudentGroup.setTitle("Add Tags");
		frmAddStudentGroup.setSize(1400, 860);
		frmAddStudentGroup.setBounds(0, 0, 1350, 700);
		frmAddStudentGroup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentGroup.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(51, 153, 153));
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
		
		JLabel lblNewLabel_1 = new JLabel("Add Tags");
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
		tabbedPane.setBounds(262, 108, 1082, 540);
		frmAddStudentGroup.getContentPane().add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("          Add Tags         ", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(87, 14, 853, 400);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(428, 190, 204, 23);
		panel_4.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(428, 120, 204, 23);
		panel_4.add(textField_1);
		textField_1.setForeground(new Color(105, 105, 105));
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tag Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(156, 57, 108, 23);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tag Code");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(156, 120, 108, 23);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Related Tag");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(156, 190, 108, 23);
		panel_4.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setForeground(SystemColor.controlDkShadow);
		textField.setColumns(10);
		textField.setBounds(428, 57, 204, 23);
		panel_4.add(textField);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setEnabled(true);
		btnNewButton.setBackground(new Color(0, 153, 153));
		btnNewButton.setBounds(389, 461, 141, 31);
		panel_3.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setEnabled(true);
		btnClear.setBackground(new Color(0, 153, 153));
		btnClear.setBounds(610, 461, 141, 31);
		panel_3.add(btnClear);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("          Manage Tags         ", null, panel_2, null);
		
		
	}
}
