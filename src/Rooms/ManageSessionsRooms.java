package Rooms;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class ManageSessionsRooms {

	private JFrame rframe;
	private JTable rtable;
	private JTable rtable_1;
	private JTable rtable_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageSessionsRooms window = new ManageSessionsRooms();
					window.rframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManageSessionsRooms() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		rframe = new JFrame();
		rframe.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		rframe.setBackground(Color.YELLOW);
		rframe.setResizable(false);
		rframe.setTitle("Sessions");
		rframe.setSize(1400, 860);
		rframe.setBounds(0, 0, 1350, 700);
		rframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rframe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(51, 153, 153));
		rframe.getContentPane().add(panel);
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
		rframe.getContentPane().add(panel_1);
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
		
		JLabel rlblNewLabel_1 = new JLabel(" Manage Sessions Rooms");
		rlblNewLabel_1.setForeground(new Color(32, 178, 170));
		rlblNewLabel_1.setBackground(new Color(32, 178, 170));
		rlblNewLabel_1.setBounds(262, 69, 1082, 36);
		rlblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		rlblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		rframe.getContentPane().add(rlblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 108, 1082, 14);
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		rframe.getContentPane().add(separator);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(47, 79, 79));
		tabbedPane.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		tabbedPane.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(32, 178, 170)));
		tabbedPane.setBounds(262, 108, 1082, 540);
		rframe.getContentPane().add(tabbedPane);
		
		JPanel rpanel_2 = new JPanel();
		rpanel_2.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("         Sessions Rooms          ", null, rpanel_2, null);
		rpanel_2.setLayout(null);
		
		JPanel rpanel_3 = new JPanel();
		rpanel_3.setBounds(157, 31, 780, 408);
		rpanel_2.add(rpanel_3);
		rpanel_3.setLayout(null);
		
		JLabel rlblNewLabel = new JLabel("Sessions Rooms ");
		rlblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		rlblNewLabel.setBounds(310, 39, 129, 13);
		rpanel_3.add(rlblNewLabel);
		
		JLabel rlblNewLabel_2 = new JLabel("Select Sessions");
		rlblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rlblNewLabel_2.setBounds(69, 119, 117, 13);
		rpanel_3.add(rlblNewLabel_2);
		
		JLabel rlblNewLabel_3 = new JLabel("Select Rooms");
		rlblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rlblNewLabel_3.setBounds(435, 119, 117, 13);
		rpanel_3.add(rlblNewLabel_3);
		
		JComboBox rcomboBox = new JComboBox();
		rcomboBox.setBounds(217, 115, 161, 23);
		rpanel_3.add(rcomboBox);
		
		JComboBox rcomboBox_1 = new JComboBox();
		rcomboBox_1.setBounds(543, 115, 161, 23);
		rpanel_3.add(rcomboBox_1);
		
		JTextArea rtextArea = new JTextArea();
		rtextArea.setBounds(217, 196, 275, 88);
		rpanel_3.add(rtextArea);
		
		JButton rbtnSubButton = new JButton("SUBMIT");
		rbtnSubButton.setForeground(new Color(255, 255, 255));
		rbtnSubButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbtnSubButton.setBackground(new Color(0, 139, 139));
		rbtnSubButton.setBounds(217, 314, 105, 31);
		rpanel_3.add(rbtnSubButton);
		
		JButton rbtnClrButton_1 = new JButton("CLEAR");
		rbtnClrButton_1.setForeground(new Color(255, 255, 255));
		rbtnClrButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbtnClrButton_1.setBackground(new Color(0, 139, 139));
		rbtnClrButton_1.setBounds(384, 314, 105, 31);
		rpanel_3.add(rbtnClrButton_1);
		
		JLabel rlblNewLabel_4 = new JLabel("Selected Session Rooms");
		rlblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rlblNewLabel_4.setBounds(69, 222, 145, 13);
		rpanel_3.add(rlblNewLabel_4);
		
		
		JPanel rpanel_4 = new JPanel();
		rpanel_4.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("View Sessions Rooms", null, rpanel_4, null);
		rpanel_4.setLayout(null);
		

		JLabel rlblNewLabe5 = new JLabel("View Sessions Rooms ");
		rlblNewLabe5.setFont(new Font("Tahoma", Font.BOLD, 15));
		rlblNewLabe5.setBounds(450, 60, 200, 30);
		rpanel_4.add(rlblNewLabe5);
		

		JPanel rpanel_5 = new JPanel();
		rpanel_5.setLayout(null);
		rpanel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		rpanel_5.setBackground(SystemColor.menu);
		rpanel_5.setBounds(157, 31, 780, 408);
		rpanel_4.add(rpanel_5);
		
		JPanel rpanel_6 = new JPanel();
		rpanel_6.setBounds(379, 115, 460, 298);
		rpanel_4.add(rpanel_6);
		rpanel_6.setLayout(null);
		
		JScrollPane rscrollPane_1 = new JScrollPane();
		rscrollPane_1.setBounds(25, 80, 720, 200);
		rpanel_5.add(rscrollPane_1);
		
		JScrollPane rscrollPane = new JScrollPane();
		rscrollPane_1.setViewportView(rscrollPane);
		
		rtable_1 = new JTable();
		rtable_1.setBackground(new Color(245, 245, 245));
		rtable_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"RoomSessions ID", "Session Code", "Room", "Session Room Code"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		rscrollPane.setViewportView(rtable_1);
		
		JButton rbtnSesViewButton = new JButton("ADD ROOM");
		rbtnSesViewButton.setForeground(new Color(255, 255, 255));
		rbtnSesViewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbtnSesViewButton.setBackground(new Color(0, 139, 139));
		rbtnSesViewButton.setBounds(217, 314, 120, 31);
		rpanel_5.add(rbtnSesViewButton);
		
		JButton rbtnRefresh_1 = new JButton("REFRESH");
		rbtnRefresh_1.setForeground(new Color(255, 255, 255));
		rbtnRefresh_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbtnRefresh_1.setBackground(new Color(0, 139, 139));
		rbtnRefresh_1.setBounds(500, 314, 120, 31);
		rpanel_5.add(rbtnRefresh_1);
		
		
		JPanel  rpanel_7 = new JPanel();
		rpanel_7.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("         Consecutive Sessions Rooms          ", null, rpanel_7, null);
		rpanel_7.setLayout(null);
		
		JPanel rpanel_8 = new JPanel();
		rpanel_8.setBounds(157, 31, 780, 408);
		rpanel_7.add(rpanel_8);
		rpanel_8.setLayout(null);
		
		JLabel clblNewLabel = new JLabel("Consecutive Sessions Rooms ");
		clblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		clblNewLabel.setBounds(290, 39, 280, 13);
		rpanel_8.add(clblNewLabel);
		
		JLabel clblNewLabel_2 = new JLabel("Select Consecutive Sessions");
		clblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		clblNewLabel_2.setBounds(69, 119, 145, 13);
		rpanel_8.add(clblNewLabel_2);
		
		JLabel clblNewLabel_3 = new JLabel("Select Rooms");
		clblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		clblNewLabel_3.setBounds(435, 119, 117, 13);
		rpanel_8.add(clblNewLabel_3);
		
		JComboBox conComboBox_2 = new JComboBox();
		conComboBox_2.setBounds(240, 115, 161, 23);
		rpanel_8.add(conComboBox_2);
		
		JComboBox conComboBox_3 = new JComboBox();
		conComboBox_3.setBounds(543, 115, 161, 23);
		rpanel_8.add(conComboBox_3);
		
		JTextArea ctextArea_1 = new JTextArea();
		ctextArea_1.setBounds(280, 196, 300, 88);
		rpanel_8.add(ctextArea_1);
		
		JButton cbtnSubButton = new JButton("SUBMIT");
		cbtnSubButton.setForeground(new Color(255, 255, 255));
		cbtnSubButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		cbtnSubButton.setBackground(new Color(0, 139, 139));
		cbtnSubButton.setBounds(280, 314, 105, 31);
		rpanel_8.add(cbtnSubButton);
		
		JButton cbtnClrButton_1 = new JButton("CLEAR");
		cbtnClrButton_1.setForeground(new Color(255, 255, 255));
		cbtnClrButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		cbtnClrButton_1.setBackground(new Color(0, 139, 139));
		cbtnClrButton_1.setBounds(470, 314, 105, 31);
		rpanel_8.add(cbtnClrButton_1);
		
		JLabel clblNewLabel_5 = new JLabel("Selected Consecutive Session Rooms");
		clblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		clblNewLabel_5.setBounds(69, 222, 200, 13);
		rpanel_8.add(clblNewLabel_5);
		
		
		

		JPanel rpanel_9 = new JPanel();
		rpanel_9.setBackground(new Color(230, 230, 250));
		tabbedPane.addTab("View Consecutive Sessions Rooms", null, rpanel_9, null);
		rpanel_9.setLayout(null);
		

		JLabel clblNewLabe5 = new JLabel("View Consecutive Sessions Rooms ");
		clblNewLabe5.setFont(new Font("Tahoma", Font.BOLD, 15));
		clblNewLabe5.setBounds(450, 60, 280, 30);
		rpanel_9.add(clblNewLabe5);
		

		JPanel rpanel_10 = new JPanel();
		rpanel_10.setLayout(null);
		rpanel_10.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		rpanel_10.setBackground(SystemColor.menu);
		rpanel_10.setBounds(157, 31, 850, 408);
		rpanel_9.add(rpanel_10);
		
		JPanel rpanel_11 = new JPanel();
		rpanel_11.setBounds(379, 115, 480, 298);
		rpanel_9.add(rpanel_11);
		rpanel_11.setLayout(null);
		
		JScrollPane cscrollPane_1 = new JScrollPane();
		cscrollPane_1.setBounds(25, 80, 790, 200);
		rpanel_10.add(cscrollPane_1);
		
		JScrollPane cscrollPane = new JScrollPane();
		cscrollPane_1.setViewportView(cscrollPane);
		
		rtable_2 = new JTable();
		rtable_2.setBackground(new Color(245, 245, 245));
		rtable_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"RoomConSessions ID", "ConsecutiveSession Code", "Room", "ConsecutiveSession Room Code"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		cscrollPane.setViewportView(rtable_2);
		
		JButton cbtnSesViewButton = new JButton("ADD ROOM");
		cbtnSesViewButton.setForeground(new Color(255, 255, 255));
		cbtnSesViewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		cbtnSesViewButton.setBackground(new Color(0, 139, 139));
		cbtnSesViewButton.setBounds(217, 314, 120, 31);
		rpanel_10.add(cbtnSesViewButton);
		
		JButton cbtnRefresh_2 = new JButton("REFRESH");
		cbtnRefresh_2.setForeground(new Color(255, 255, 255));
		cbtnRefresh_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		cbtnRefresh_2.setBackground(new Color(0, 139, 139));
		cbtnRefresh_2.setBounds(500, 314, 120, 31);
		rpanel_10.add(cbtnRefresh_2);
		
		
		
		
		
		
	}
}
