package Session;

import java.awt.Color;


import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;


import Home.Home;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import Timetable.Lecturer;
import WorkingDays.AddWorkingdays;
import net.proteanit.sql.DbUtils;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Advanced.Consecutive_sessions;
import DB.DbConnection;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

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
	
	private JComboBox lecr1;
	private JComboBox lecr2;
	private JComboBox sbj;
	private JComboBox tg;
	private JComboBox grpId;
	private JTextField cod;
	private JTextField txtSid;
	
	
	
	public void refreshtable() {

		try {

			Connection con = DbConnection.connect();

			String query="select sessionID As SID, lec1 As Lecturer1,lec2 As Lecturer2,subCode As Code,subName As Name,tag As Tag,studentGroup As GroupID,NoOfStudents As Students,duration As Duration,sessionSignature As SessionSignature from session ";
			
			
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));



		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}

	//load data to dropdown lec1
	  public  void  loadLecturer1(){ 
		  try {

				Connection con = DbConnection.connect();

				String query="select * from lecturers ";
				PreparedStatement pst=con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
				
				while(rs.next())
				{
					String name =rs.getString("lectureName");
					lecr1.addItem(name);
					 
				}

				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	
}
		//load data to dropdown lec2
	  public  void  loadLecturer2(){ 
		  try {

				Connection con = DbConnection.connect();

				String query="select * from lecturers ";
				PreparedStatement pst=con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
				
				while(rs.next())
				{
					String name =rs.getString("lectureName");
					lecr2.addItem(name);
					 
				}

				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}

}
		//load data to dropdown subject name
	  public  void  loadSubjectName(){ 
		  try {

				Connection con = DbConnection.connect();

				String query="select * from subjects ";
				PreparedStatement pst=con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
				
				while(rs.next())
				{
					String name =rs.getString("subName");
					sbj.addItem(name);
					 
				}

				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}

}
	//load data to dropdown tag
	  public  void  loadTag(){ 
		  try {

				Connection con = DbConnection.connect();

				String query="select * from Tags ";
				PreparedStatement pst=con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
				
				while(rs.next())
				{
					String name =rs.getString("RelatedTag");
					tg.addItem(name);
					 
				}

				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}

}
	//load data to dropdown group id
	  public  void  loadGroup(){ 
		  try {

				Connection con = DbConnection.connect();

				String query="select * from StudentGroup ";
				PreparedStatement pst=con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
				
				while(rs.next())
				{
					String name =rs.getString("GroupID");
					grpId.addItem(name);
					 
				}

				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}

}
	//load data to dropdown Subgroup id
	  public  void  loadSubGroup(){ 
		  try {

				Connection con = DbConnection.connect();

				String query="select * from StudentGroup ";
				PreparedStatement pst=con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
				
				while(rs.next())
				{
					String name =rs.getString("SubGroupID");
					grpId.addItem(name);
					 
				}

				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}

}
	
	
	
	
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
		ManageSesFrm.setBounds(0, 0, 1350, 700);
		ManageSesFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ManageSesFrm.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		ManageSesFrm.setBackground(Color.YELLOW);
		ManageSesFrm.setTitle("Sessions");
		ManageSesFrm.setSize(1350, 715);
		
		//ManageSesFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ManageSesFrm.getContentPane().setLayout(null);
		ManageSesFrm.setLocationRelativeTo(null);
		ManageSesFrm.setVisible(true);
		
		JPanel panel = new JPanel();
	
		panel.setBackground(new Color(51, 153, 153));
		panel.setBounds(0, 0, 1344, 65);
		ManageSesFrm.getContentPane().add(panel);
		panel.setLayout(null);
		

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

				
				ManageSesFrm.dispose();
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

			
				ManageSesFrm.dispose();
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

				
				ManageSesFrm.dispose();
				new Add_Subjects();
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

				
				ManageSesFrm.dispose();
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
				ManageSesFrm.dispose();
				new Consecutive_sessions();
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
		btnTimetableGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageSesFrm.dispose();
				new Lecturer();
			}
		});
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


				ManageSesFrm.dispose();
				new Add_Session();
			}
		});
		btnAddNewSession.setBounds(264, 66, 258, 37);
		ManageSesFrm.getContentPane().add(btnAddNewSession);

		JButton btnManageSessions = new JButton("Manage Sessions");
		btnManageSessions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ManageSesFrm.dispose();
				new Manage_Session();
			}
		});
		btnManageSessions.setBounds(519, 66, 258, 37);
		ManageSesFrm.getContentPane().add(btnManageSessions);

		JButton btnSearchSessions = new JButton("Search Sessions");
		btnSearchSessions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ManageSesFrm.dispose();
				new Search_Sessions();
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
		table.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
		table.setBackground(SystemColor.window);
		
		table.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		table.setModel(new DefaultTableModel( new Object[][] { }, new String[] { }
				));
		
		//display details in a table
		scrollPane.setViewportView(table);
		try {
			Connection con = DbConnection.connect();

			//String query="select * from session ";
			String query="select sessionID As SID, lec1 As Lecturer1,lec2 As Lecturer2,subCode As Code,subName As Name,tag As Tag,studentGroup As GroupID,NoOfStudents As Students,duration As Duration,sessionSignature As SessionSignature from session ";
			
	
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));



		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//new
		JSpinner noStud = new JSpinner();
		JSpinner duration = new JSpinner();
		JTextArea sign = new JTextArea();
		sign.setEditable(false);
		sign.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
		
		//display selected row
		table.addMouseListener(new MouseAdapter() {

			@Override public void mouseClicked(MouseEvent arg0) {

				int i = table.getSelectedRow(); TableModel model = table.getModel();

				txtSid.setText(model.getValueAt(i, 0).toString());
				
				String combolevel1 = table.getValueAt(i, 1).toString();
				for(int j=0;j<lecr1.getItemCount();j++) {

					if(lecr1.getItemAt(j).toString().equalsIgnoreCase(combolevel1)) {
						lecr1.setSelectedIndex(j); } }

				String combolevel2 = table.getValueAt(i, 2).toString(); for(int j=0
						;j<lecr2.getItemCount();j++) {

					if(lecr2.getItemAt(j).toString().equalsIgnoreCase(combolevel2)) {
						lecr2.setSelectedIndex(j); } }
				
				cod.setText(model.getValueAt(i, 3).toString());
				String combolevel3 = table.getValueAt(i, 4).toString(); for(int j=0
						;j<sbj.getItemCount();j++) {

					if(sbj.getItemAt(j).toString().equalsIgnoreCase(combolevel3)) {
						sbj.setSelectedIndex(j); } } 
			
				String combolevel4 = table.getValueAt(i, 5).toString(); for(int j=0
						;j<tg.getItemCount();j++) {

					if(tg.getItemAt(j).toString().equalsIgnoreCase(combolevel4)) {
						tg.setSelectedIndex(j); } } 
				
				
				String combolevel5 = table.getValueAt(i, 6).toString(); for(int j=0
						;j<grpId.getItemCount();j++) {

					if(grpId.getItemAt(j).toString().equalsIgnoreCase(combolevel5)) {
						grpId.setSelectedIndex(j); } } 
				

				noStud.setValue((Integer)table.getValueAt(i,7));
				duration.setValue((Integer)table.getValueAt(i,8));
				
                sign.setText(model.getValueAt(i, 9).toString());

			} });
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_3.setBackground(new Color(245, 245, 245));
		panel_3.setBounds(10, 213, 1055, 335);
		panel_2.add(panel_3);

		JButton btnClear = new JButton("CLEAR");
		btnClear.setToolTipText("Click button to clear");
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setEnabled(true);
		btnClear.setBackground(new Color(0, 128, 128));
		btnClear.setBounds(632, 304, 141, 31);
		panel_3.add(btnClear);

		JButton btnDel = new JButton("DELETE");
		btnDel.setToolTipText("Click button to delete session");
		btnDel.setForeground(Color.WHITE);
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDel.setEnabled(true);
		btnDel.setBackground(new Color(0, 128, 128));
		btnDel.setBounds(453, 304, 141, 31);
		panel_3.add(btnDel);

		JButton btnEdit = new JButton("EDIT");
		btnEdit.setToolTipText("Click button to edit session");
		
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEdit.setEnabled(true);
		btnEdit.setBackground(new Color(0, 128, 128));
		btnEdit.setBounds(271, 304, 141, 31);
		panel_3.add(btnEdit);

		 lecr1 = new JComboBox();
		 lecr1.setModel(new DefaultComboBoxModel(new String[] {"----------Select Lecturer 1 ----------"}));
		lecr1.setBounds(244, 12, 245, 27);
		panel_3.add(lecr1);

		JLabel lblLecturer = new JLabel("Lecturer 1");
		lblLecturer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLecturer.setBounds(73, 11, 96, 23);
		panel_3.add(lblLecturer);

		 sbj = new JComboBox();
		 sbj.setModel(new DefaultComboBoxModel(new String[] {"---------- Select Subject  ----------"}));
		 sbj.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		try {
					String subject = sbj.getSelectedItem().toString();
					Connection con = DbConnection.connect();
					String query = "select subCode from subjects where subName = '" + subject + "'";
					PreparedStatement pst = con.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					
					while (rs.next()) {

						String name = rs.getString("subCode");
						cod.setText(name);
						
					}
					con.close();
				} catch (Exception e1) {
					
				}
		 		
		 	}
		 });
		sbj.setBounds(244, 114, 245, 27);
		panel_3.add(sbj);

		JLabel label_3 = new JLabel("Subject Name");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(73, 113, 149, 23);
		panel_3.add(label_3);

		JLabel label_4 = new JLabel("Selected Subject Code");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(73, 170, 149, 23);
		panel_3.add(label_4);

		JLabel label_5 = new JLabel("Tag");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(73, 220, 132, 23);
		panel_3.add(label_5);

		 tg = new JComboBox();
		 tg.setModel(new DefaultComboBoxModel(new String[] {"------------Select Tag ------------"}));
		tg.setBounds(244, 221, 245, 27);
		panel_3.add(tg);

		JLabel label_6 = new JLabel("Group/Sub Group ID");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(632, 12, 150, 23);
		panel_3.add(label_6);

		 grpId = new JComboBox();
		 grpId.setModel(new DefaultComboBoxModel(new String[] {"--------Select Group/Sub Group ID--------"}));
		grpId.setBounds(792, 13, 245, 27);
		panel_3.add(grpId);

		JLabel label_7 = new JLabel("No Of Students");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(632, 61, 108, 23);
		panel_3.add(label_7);

		
		noStud.setFont(new Font("Tahoma", Font.BOLD, 12));
		noStud.setBounds(792, 61, 245, 27);
		panel_3.add(noStud);

		JLabel label_8 = new JLabel("Duration(hrs)");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBounds(632, 113, 108, 23);
		panel_3.add(label_8);

		
		duration.setFont(new Font("Tahoma", Font.BOLD, 12));
		duration.setBounds(792, 113, 245, 27);
		panel_3.add(duration);
		
		JLabel lblLecturer_1 = new JLabel("Lecturer 2");
		lblLecturer_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLecturer_1.setBounds(73, 61, 96, 23);
		panel_3.add(lblLecturer_1);
		
		 lecr2 = new JComboBox();
		 lecr2.setModel(new DefaultComboBoxModel(new String[] {"-"}));
		lecr2.setBounds(244, 61, 245, 27);
		panel_3.add(lecr2);
		
		JLabel label_1 = new JLabel("Session Signature");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(632, 159, 126, 23);
		panel_3.add(label_1);
		
		JButton btnGenerateSessionSign = new JButton("GENERATE SESSION SIGNATURE");
		btnGenerateSessionSign.setToolTipText("Click button to generate session signature");
		
		btnGenerateSessionSign.setForeground(Color.WHITE);
		btnGenerateSessionSign.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnGenerateSessionSign.setBackground(new Color(119, 136, 153));
		btnGenerateSessionSign.setBounds(632, 227, 405, 33);
		panel_3.add(btnGenerateSessionSign);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(792, 161, 245, 55);
		panel_3.add(scrollPane_1);
		
		
		scrollPane_1.setViewportView(sign);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane_1.setRowHeaderView(scrollBar);
		
		cod = new JTextField();
		cod.setBackground(Color.WHITE);
		cod.setEditable(false);
		cod.setFont(new Font("Tahoma", Font.BOLD, 11));
		cod.setBounds(244, 172, 245, 27);
		panel_3.add(cod);
		cod.setColumns(10);
		
		txtSid = new JTextField();
		txtSid.setBounds(55, 318, -4, 6);
		panel_3.add(txtSid);
		txtSid.setColumns(10);

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
		
		
		//generate session signature
		btnGenerateSessionSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String lecregx = "-";
				String lecrs = "----------Select Lecturer 1 ----------";
				String namer = "----------Select Subject----------";
				String tagr = "------------Select Tag ------------";
				String grpidr = "--------Select Group/Sub Group ID--------";
				
				if(lecr1.getSelectedItem().toString().equals(lecrs)||sbj.getSelectedItem().toString().equals(namer)|| tg.getSelectedItem().toString().equals(tagr)|| grpId.getSelectedItem().toString().equals(grpidr)|| noStud.getValue().equals(0)|| duration.getValue().equals(0))
				{
					JOptionPane.showMessageDialog(null, "       Please Enter Values","Alert",JOptionPane.WARNING_MESSAGE);
	
					
				}else {
				if(lecr1.getSelectedItem().toString().matches(lecregx ));
				{
					sign.setText(lecr1.getSelectedItem().toString()+ " - "+ cod.getText()+" - "+ sbj.getSelectedItem().toString()
							+" - "+tg.getSelectedItem().toString()+" - "+grpId.getSelectedItem().toString()+" - "+noStud.getValue().toString()+" - "+
							duration.getValue().toString());
					
				}
				
				if(!(lecr2.getSelectedItem().toString().matches(lecregx)))
				{
					
					sign.setText(lecr1.getSelectedItem().toString()+ " - "+ lecr2.getSelectedItem().toString()+ " - "+cod.getText()+" - "+ sbj.getSelectedItem().toString()
							+" - "+tg.getSelectedItem().toString()+" - "+grpId.getSelectedItem().toString()+" - "+noStud.getValue().toString()+" - "+
							duration.getValue().toString());
				
				}
				
				JLabel label8 = new JLabel("Session Signature Updated Successfully");
				label8.setHorizontalAlignment(SwingConstants.CENTER);
				JOptionPane.showMessageDialog(null, label8);
			}
			}
		});
		
		
		//Update Session details
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 


					Connection con = DbConnection.connect(); 

					String query="Update session set lec1 = '"+lecr1.getSelectedItem().toString()+"' , lec2 = '"+lecr2.getSelectedItem().toString()+"' ,subCode = '"+cod.getText()+"',"
							+ "subName = '"+sbj.getSelectedItem().toString()+"', tag = '"+tg.getSelectedItem().toString()+"',studentGroup = '"+grpId.getSelectedItem().toString()+"',NoOfStudents = '"+noStud.getValue()+"',duration='"+duration.getValue()+"',"
									+ "sessionSignature = '"+sign.getText()+"' where sessionID = '"+txtSid.getText()+"' ";

					PreparedStatement pst=con.prepareStatement(query);

					pst.executeUpdate();
					JLabel label = new JLabel("Session Updated Successfully");
					label.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label);
					refreshtable();

					
					//JOptionPane.showMessageDialog(null, "Data Updated"); pst.close();

				} catch(Exception ea) {
					ea.printStackTrace(); 
				}
				
			}
		});
		
		
		//delete session
		btnDel.addActionListener(new ActionListener() {

			@Override public void actionPerformed(ActionEvent arg0) { 
				// TOD Auto-generated method stub


				try { 
					Connection con = DbConnection.connect();
					String  query="Delete from session where sessionID='"+txtSid.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query); 
					pst.execute();

					JOptionPane.showMessageDialog(null, "       Session Deleted Successfully","Message",JOptionPane.INFORMATION_MESSAGE);
					pst.close();
					cod.setText("");
					lecr1.setSelectedIndex(0);
					lecr2.setSelectedIndex(0);
					sbj.setSelectedIndex(0);
					tg.setSelectedIndex(0);
					grpId.setSelectedIndex(0);
					sign.setText("");
					noStud.setValue(0);
					duration.setValue(0);
					refreshtable();
					//table.revalidate();

				} catch(Exception en) { en.printStackTrace();

				}

			} });
		
		//clear button
				btnClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						cod.setText("");
						lecr1.setSelectedIndex(0);
						lecr2.setSelectedIndex(0);
						sbj.setSelectedIndex(0);
						tg.setSelectedIndex(0);
						grpId.setSelectedIndex(0);
						sign.setText("");
						noStud.setValue(0);
						duration.setValue(0);
						
					}
				});
		
		
		//load data to dropdown lec1
		loadLecturer1();
		//load data to dropdown lec2
		loadLecturer2();
		//load data to dropdown subject name
		loadSubjectName();
		//load data to dropdown tag
		loadTag();
		//load data to dropdown group id
		loadGroup();
		//load data to dropdown Subgroup id
		loadSubGroup();
	}
}
