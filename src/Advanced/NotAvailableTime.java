/** 
 * IT19207346
 * N.H.N.N.Dissanayake
 */


package Advanced;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableModel;

import DB.DbConnection;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Statistics.Statistics;
import Student.Manage_studentGroup;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import WorkingDays.AddWorkingdays;
import WorkingDays.ManageWorkingDays;
import net.proteanit.sql.DbUtils;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;

import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;


public class NotAvailableTime {

	private Image home_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/home.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image lec_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/lecturer.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image stu_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/student.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image sub_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/subject.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image session_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/session.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image tag_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/tags.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image location_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/location.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image st_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/statics.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image days_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/Wdays.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image time_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/time.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image adv_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/adv1.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image room_logo = new ImageIcon(Manage_studentGroup.class.getResource("/images/room.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	
	
	public JFrame frame;
	private JTable table;
	private JTextField id;
	private JComboBox selectlec;
	private JComboBox selectgroup;
	private JComboBox selectsession;
	private JComboBox selectsubgroup;
	private JComboBox sessionsign;
	private JComboBox selectroom ;
	private JTextField textField;
	private JSpinner starttime;
	private JSpinner endtime;
	private JTextField start;
	private JTextField end;
	private JSpinner day;
	
	
	//refresh all the data
	
public void refreshtable() {
		
		try {
			
			Connection con = DbConnection.connect();
			
			String query="select *  from notavailableTime ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	//fill select lecture field
	  public void filllecture() {
			
			try {
				
				 Connection con = DbConnection.connect();
				 
				 String query="select * from session";
				 
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery();
				 
				 while(rs.next()) {
					 
					 String name =rs.getString("lec1");
					 
					 selectlec.addItem(name);
				
					 
				}
				con.close();
			}
			
			catch(Exception e) {
				
					e.printStackTrace();
				}
			
	     	}
	  
	  //fill session ID field
	  public void fillsession() {
			
			try {
				
				 Connection con = DbConnection.connect();
				 
				 String query="select * from session";
				 
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery();
				 
				 while(rs.next()) {
					 
					 String name =rs.getString("sessionID");
					 
					 selectsession.addItem(name);
					 
				}
				con.close();
			}
			
			catch(Exception e) {
				
					e.printStackTrace();
				}
			
	     	}
	  
	  
	  //fill Group ID field
	  public void fillgroups() {
			
			try {
				
				 Connection con = DbConnection.connect();
				 
				 String query="select * from StudentGroup";
				 
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery();
				 
				 while(rs.next()) {
					 
					 String name =rs.getString("GroupID");
					 
					 selectgroup.addItem(name);
					 
				}
				con.close();
			}
			
			catch(Exception e) {
				
					e.printStackTrace();
				}
			
	     	}
	  
	  
	  
	  
	  
	  //select student Group
	  public void fillsubgroup() {
			
			try {
				
				 Connection con = DbConnection.connect();
				 
				 String query="select * from session";
				 
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery();
				 
				 while(rs.next()) {
					 
					 String name =rs.getString("studentGroup");
					 
					 selectsubgroup .addItem(name);
					 
				}
				con.close();
			}
			
			catch(Exception e) {
				
					e.printStackTrace();
				}
			
	     	}
	  
	  //fill session signature field
	  public void fillsign() {
			
			try {
				
				 Connection con = DbConnection.connect();
				 
				 String query="select * from roomSession";
				 
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery();
				 
				 while(rs.next()) {
					 
					 String name =rs.getString("sessionRoomCode");
					 
					 sessionsign.addItem(name);
					 
				}
				con.close();
			}
			
			catch(Exception e) {
				
					e.printStackTrace();
				}
			
	     	}
	  //fill select room
	  public void fillroom() {
			
			try {
				
				 Connection con = DbConnection.connect();
				 
				 String query="select * from location";
				 
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery();
				 
				 while(rs.next()) {
					 
					 String name =rs.getString("roomName");
					 
					 selectroom.addItem(name);
					 
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
					NotAvailableTime window = new NotAvailableTime();
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
	public NotAvailableTime() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBackground(Color.YELLOW);
		frame.setResizable(false);
		frame.setTitle("Advanced");
		frame.setSize(1350, 728);
		frame.setBounds(0, 0, 1350, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Advanced");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setBounds(723, 13, 419, 29);
		panel.add(lblNewLabel_10);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 62, 262, 609);
		panel_1.setBackground(new Color(230, 230, 250));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
	//lecture button
		JButton btnLecturers = new JButton("Lecturers");
		btnLecturers.setHorizontalAlignment(SwingConstants.LEFT);
		btnLecturers.setIcon(new ImageIcon(lec_logo));
		btnLecturers.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					Add_Lecturer add_lecture = new Add_Lecturer();
					add_lecture.main(null);
					frame.dispose();
					
				}
			});
		btnLecturers.setForeground(Color.WHITE);
		btnLecturers.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLecturers.setBackground(new Color(0, 139, 139));
		btnLecturers.setBounds(0, 59, 264, 38);
		panel_1.add(btnLecturers);
		
		//lecture student
		JButton btnStudents = new JButton("Students");
		btnStudents.setHorizontalAlignment(SwingConstants.LEFT);
		btnStudents.setIcon(new ImageIcon(stu_logo));
		btnLecturers.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Manage_studentGroup add_st = new Manage_studentGroup();
				add_st.main(null);
				frame.dispose();
				
			}
		});
		btnStudents.setForeground(Color.WHITE);
		btnStudents.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStudents.setBackground(new Color(0, 139, 139));
		btnStudents.setBounds(0, 108, 264, 38);
		panel_1.add(btnStudents);
		
		//student button
		JButton btnSubjects = new JButton("Subjects");
		btnSubjects.setHorizontalAlignment(SwingConstants.LEFT);
		btnSubjects.setIcon(new ImageIcon(sub_logo));
	btnSubjects.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				new Add_Subjects();
				
			}
		});
		btnSubjects.setForeground(Color.WHITE);
		btnSubjects.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSubjects.setBackground(new Color(0, 139, 139));
		btnSubjects.setBounds(0, 157, 264, 38);
		panel_1.add(btnSubjects);
		
		
		//session button
		JButton btnSessions = new JButton("Sessions");
		btnSessions.setHorizontalAlignment(SwingConstants.LEFT);
		btnSessions.setIcon(new ImageIcon(session_logo));
btnSessions.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				new Add_Session();
				
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
btnTags.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				new Add_Tags();
				
			}
		});
		btnTags.setForeground(Color.WHITE);
		btnTags.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTags.setBackground(new Color(0, 139, 139));
		btnTags.setBounds(0, 255, 264, 38);
		panel_1.add(btnTags);
		
		//room button
		JButton btnRooms = new JButton("Rooms");
		btnRooms.setHorizontalAlignment(SwingConstants.LEFT);
		btnRooms.setIcon(new ImageIcon(room_logo));
btnRooms.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ManageSessionsRooms m_rooms= new ManageSessionsRooms ();
				m_rooms.main(null);
				frame.dispose();
				
			}
		});
		btnRooms.setForeground(Color.WHITE);
		btnRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnRooms.setBackground(new Color(0, 139, 139));
		btnRooms.setBounds(0, 304, 264, 38);
		panel_1.add(btnRooms);
		
		
		//working days and hours button
		JButton btnWorkingDays = new JButton("Working days & Hours");
		btnWorkingDays.setHorizontalAlignment(SwingConstants.LEFT);
		btnWorkingDays.setIcon(new ImageIcon(days_logo));
	btnWorkingDays.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				AddWorkingdays w_days= new 	AddWorkingdays();
				w_days.main(null);
				frame.dispose();
				
			}
		});
		btnWorkingDays.setForeground(Color.WHITE);
		btnWorkingDays.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnWorkingDays.setBackground(new Color(0, 139, 139));
		btnWorkingDays.setBounds(0, 353, 264, 38);
		panel_1.add(btnWorkingDays);
		
		JButton btnLocations = new JButton("Locations");
		btnLocations.setHorizontalAlignment(SwingConstants.LEFT);
		btnLocations.setIcon(new ImageIcon(location_logo));
	btnLocations.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ManageLocations m_locations= new ManageLocations();
				m_locations.main(null);
				frame.dispose();
				
			}
		});
		btnLocations.setForeground(Color.WHITE);
		btnLocations.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLocations.setBackground(new Color(0, 139, 139));
		btnLocations.setBounds(0, 402, 264, 38);
		panel_1.add(btnLocations);
		
		
		//statistics button
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.setHorizontalAlignment(SwingConstants.LEFT);
		btnStatistics.setIcon(new ImageIcon(st_logo));
	btnStatistics.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Statistics stat= new Statistics ();
				stat.main(null);
				frame.dispose();
				
			}
		});
		btnStatistics.setForeground(Color.WHITE);
		btnStatistics.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStatistics.setBackground(new Color(0, 139, 139));
		btnStatistics.setBounds(0, 451, 264, 38);
		panel_1.add(btnStatistics);
		
		
		//advanced button
		JButton btnAdvanced = new JButton("Advanced");
		btnAdvanced.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdvanced.setIcon(new ImageIcon(adv_logo));
	btnAdvanced.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Consecutive_sessions a_session= new Consecutive_sessions ();
				//a_session.main(null);
				frame.dispose();
				new Consecutive_sessions();
				
				
			}
		});
		btnAdvanced.setForeground(Color.WHITE);
		btnAdvanced.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdvanced.setBackground(new Color(0, 139, 139));
		btnAdvanced.setBounds(0, 500, 264, 38);
		panel_1.add(btnAdvanced);
		
		
		//time table generate button
		JButton btnTimetableGenerate = new JButton("Timetable Generate");
		btnTimetableGenerate.setHorizontalAlignment(SwingConstants.LEFT);
		btnTimetableGenerate.setIcon(new ImageIcon(time_logo));
		btnTimetableGenerate.setForeground(Color.WHITE);
		btnTimetableGenerate.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTimetableGenerate.setBackground(new Color(0, 139, 139));
		btnTimetableGenerate.setBounds(0, 549, 264, 38);
		panel_1.add(btnTimetableGenerate);
		
		//home button
		JButton btnManageGroups = new JButton("Home");
		btnManageGroups.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageGroups.setIcon(new ImageIcon(home_logo));
		btnManageGroups.setBounds(0, 13, 262, 33);
		panel_1.add(btnManageGroups);
		btnManageGroups.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnManageGroups.setForeground(new Color(255, 255, 255));
		btnManageGroups.setBackground(new Color(0, 139, 139));
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(230, 230, 250));
		panel_3.setBounds(263, 62, 1081, 628);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(-11, 0, 1082, 49);
		panel_3.add(panel_6);
		
		//conseccutive sessions button
		JButton btnNewButton_2_1 = new JButton("Conseccutive Sessions");
		btnNewButton_2_1.setBounds(0, 11, 268, 37);
		panel_6.add(btnNewButton_2_1);
		
		
		//parallel sessions button
		JButton btnNewButton_2_1_1 = new JButton("Parallel Sessions");
		btnNewButton_2_1_1.setBounds(267, 11, 275, 37);
		panel_6.add(btnNewButton_2_1_1);
		
		
		
		//not available time button
		JLabel lblNewLabel_1_1 = new JLabel("Not Available Time");
		JButton button = new JButton("Not available time");
		button.setBounds(819, 11, 263, 37);
		panel_6.add(button);	
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				NotAvailableTime m_stgroup = new NotAvailableTime ();
				m_stgroup.main(null);
				frame.dispose();
				
			}
		});
			
		//non overlapping session button
		JButton btnNewButton_2_1_2 = new JButton("Non Overlapping Sessions");
		btnNewButton_2_1_2.setBounds(543, 11, 275, 37);
		panel_6.add(btnNewButton_2_1_2);


		
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBounds(81, 102, 853, 315);
		panel_3.add(panel_4);
		
		JLabel lblSelectSessionId = new JLabel("Select Session ID");
		lblSelectSessionId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSelectSessionId.setBounds(106, 26, 113, 23);
		panel_4.add(lblSelectSessionId);
		
		selectsession = new JComboBox();
		selectsession.setBounds(279, 27, 149, 22);
		selectsession.setModel(new DefaultComboBoxModel(new String[] {""}));
		panel_4.add(selectsession);
		fillsession() ;
		
		//select lecture 
		JLabel lblNewLabel_2 = new JLabel("Select Lecturer");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(106, 82, 91, 23);
		panel_4.add(lblNewLabel_2);
		
		selectlec = new JComboBox();
		selectlec.setBounds(279, 83, 149, 22);
		selectlec.setModel(new DefaultComboBoxModel(new String[] {""}));
		panel_4.add(selectlec);
		
		filllecture();
		
		//select student group
		JLabel lblSelectGroup = new JLabel("Select Group");
		lblSelectGroup.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSelectGroup.setBounds(106, 135, 91, 23);
		panel_4.add(lblSelectGroup);
			
		selectgroup = new JComboBox();
		selectgroup.setBounds(279, 136, 149, 22);
		selectgroup.setModel(new DefaultComboBoxModel(new String[] {""}));
		panel_4.add(selectgroup);
		
		fillgroups();
		
		JLabel lblSelectSubGroup = new JLabel("Select Sub Group");
		lblSelectSubGroup.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSelectSubGroup.setBounds(106, 181, 113, 23);
		panel_4.add(lblSelectSubGroup);
		
		selectsubgroup = new JComboBox();
		selectsubgroup.setBounds(279, 182, 149, 22);
		selectsubgroup.setModel(new DefaultComboBoxModel(new String[] {""}));
		panel_4.add(selectsubgroup);
		fillsubgroup();
		
		JLabel StartTime = new JLabel("Start Time");
		StartTime.setFont(new Font("Tahoma", Font.PLAIN, 12));
		StartTime.setBounds(512, 135, 91, 23);
		panel_4.add(StartTime);
		
		JLabel EndTime = new JLabel("End Time");
		EndTime.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EndTime.setBounds(512, 181, 57, 23);
		panel_4.add(EndTime);
		
		
		//add data
		JButton add = new JButton("ADD");
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String sessionId = selectsession.getSelectedItem().toString();
				String selectLec = selectlec.getSelectedItem().toString();
				String selectGroup = selectgroup.getSelectedItem().toString();
				String selectSubGroup = selectsubgroup.getSelectedItem().toString();
				String selectRoom = selectroom.getSelectedItem().toString();
				String sessionSign = sessionsign.getSelectedItem().toString();
				String Date = day.getValue().toString();
				String startTime = start.getText();
				String endTime = end.getText();
				String startAMPM = starttime.getValue().toString();
				String endAMPM = endtime.getValue().toString();
                
				if(starttime.getValue().equals(0)) {
					JOptionPane.showMessageDialog(null, "Please Select start Time!!!");
				}
				else if(endtime.getValue().equals(0)) {
					JOptionPane.showMessageDialog(null, "Please Select start Time!!!");
				}
				
				
				else {

					try {
							
						Connection con = DbConnection.connect();
						
				
						String query = "INSERT INTO notavailableTime values(null,'"+ sessionId +"','"+ selectLec +"','"+ selectGroup + "','"+ selectSubGroup + 
								"','"+ selectRoom +"','"+ sessionSign +"','"+ Date +"','"+ startTime +"','"+ startAMPM +"','"+ endTime +"','"+ endAMPM +"')";

	                    Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) 
	                    {
	                    	JLabel label = new JLabel("This is alredy exist");
	    					label.setHorizontalAlignment(SwingConstants.CENTER);
	    					JOptionPane.showMessageDialog(null, label);
	                    } 
	                    else
	                    {
							JLabel label = new JLabel("Not Availabale Time Data Entered Successfully");
							label.setHorizontalAlignment(SwingConstants.CENTER);
							JOptionPane.showMessageDialog(null, label);


						

						}
	                    refreshtable();
						con.close();
						
					} catch (Exception exception) {
						System.out.println("Failed!!");

					}

				
				}
				
			}
		});
		add.setBounds(494, 273, 141, 31);
		panel_4.add(add);
		add.setForeground(Color.WHITE);
		add.setFont(new Font("Tahoma", Font.BOLD, 14));
		add.setEnabled(true);
		add.setBackground(new Color(0, 153, 153));
		
		
		//clear data from fields
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(671, 273, 141, 31);
		panel_4.add(btnClear);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setEnabled(true);
		btnClear.setBackground(new Color(0, 153, 153));
		
		id = new JTextField();
		id.setBounds(279, 0, 86, 20);
		panel_4.add(id);
		
		//start time AM
		starttime = new JSpinner();
		String[] ampmString1 = {"am", "pm"};
		starttime = new JSpinner(
		 new SpinnerListModel(ampmString1));
		starttime.setBounds(728, 136, 43, 23);
		panel_4.add(starttime);
		
		//End time AM
		endtime = new JSpinner();
		String[] ampmString = {"am", "pm"};
		endtime = new JSpinner(
		 new SpinnerListModel(ampmString1));
		endtime.setBounds(728, 182, 43, 23);
		panel_4.add(endtime);
		
		start = new JTextField();
		start.setBounds(613, 136, 107, 22);
		panel_4.add(start);
		start.setColumns(10);
		
		end = new JTextField();
		end.setBounds(611, 183, 107, 20);
		panel_4.add(end);
		
		
		//Add date
		JLabel date = new JLabel("Day");
		date.setFont(new Font("Tahoma", Font.PLAIN, 12));
		date.setBounds(512, 87, 57, 14);
		panel_4.add(date);
		
		 day = new JSpinner();
		String[] dayString = {"1.Monday", "2.Tuesday","3.Wednesday","4.Thursday","5.Friday","6.Saturday","7.Sunday"};//edited
		day = new JSpinner(
		 new SpinnerListModel(dayString));
		day.setBounds(627, 84, 107, 20);
		panel_4.add(day);
		
		
		//Add session sign
		JLabel session = new JLabel("Session Signature");
		session.setFont(new Font("Tahoma", Font.PLAIN, 12));
		session.setBounds(499, 30, 113, 14);
		panel_4.add(session);
		
		sessionsign = new JComboBox();
		sessionsign.setModel(new DefaultComboBoxModel(new String[] {""}));
		sessionsign.setBounds(622, 28, 149, 20);
		panel_4.add(sessionsign);
		fillsign();
		
		JLabel lblNewLabel = new JLabel("Select Room");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(106, 241, 113, 14);
		panel_4.add(lblNewLabel);
		
		
		//select room
		selectroom = new JComboBox();
		selectroom.setBounds(279, 238, 149, 20);
		selectroom.setModel(new DefaultComboBoxModel(new String[] {""}));
		panel_4.add(selectroom);
		fillroom() ;
		

		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				selectsession.setSelectedIndex(0);
				selectlec.setSelectedIndex(0);
				selectgroup.setSelectedIndex(0);
				selectsubgroup.setSelectedIndex(0);
				selectroom.setSelectedIndex(0);
				sessionsign.setSelectedIndex(0);
				day.setValue(null);
				start.setText("");
				end.setText("");
				starttime.setValue(null);
				endtime.setValue(null);
				
				
			}
		});
		
		

		//delete data
		JButton delete = new JButton("DELETE");
		
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					
					Connection con = DbConnection.connect();
					String query="Delete from notavailableTime where timeID='"+id.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();
					
				
					  JOptionPane.showMessageDialog(null, "Data Deleted","Alert",JOptionPane.WARNING_MESSAGE);
				
					
					refreshtable();
					pst.close();
					
					}
					catch(Exception en) {
						en.printStackTrace();
						
					}
				
				
				
			}
		});
		delete.setForeground(Color.WHITE);
		delete.setFont(new Font("Tahoma", Font.BOLD, 14));
		delete.setEnabled(true);
		delete.setBackground(new Color(0, 153, 153));
		delete.setBounds(766, 567, 141, 31);
		panel_3.add(delete);
	
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(0, 40, 1082, 31);
		panel_3.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(92, 450, 852, 111);
		panel_3.add(scrollPane);
		
		
		//display data in the table
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {


		@Override
		public void mouseClicked(MouseEvent arg0) {

			int selectedRow=table.getSelectedRow();
		

			
			 	id.setText(table.getValueAt(selectedRow, 0).toString());

				String combo1 = table.getValueAt(selectedRow, 1).toString(); 
				for(int j=0
						;j<selectsession.getItemCount();j++) {

					if(selectsession.getItemAt(j).toString().equalsIgnoreCase(combo1)) {
						selectsession.setSelectedIndex(j); } }

				String combo2 = table.getValueAt(selectedRow, 2).toString(); 
				for(int j=0
						;j<selectlec.getItemCount();j++) {

					if(selectlec.getItemAt(j).toString().equalsIgnoreCase(combo2)) {
						selectlec.setSelectedIndex(j); } }

				String combo3 = table.getValueAt(selectedRow, 3).toString(); 
				for(int j=0
						;j<selectgroup.getItemCount();j++) {

					if(selectgroup.getItemAt(j).toString().equalsIgnoreCase(combo3)) {
						selectgroup.setSelectedIndex(j); } }
				
				

				String combo4 = table.getValueAt(selectedRow, 4).toString(); 
				for(int j=0
						;j<selectsubgroup.getItemCount();j++) {

					if(selectsubgroup.getItemAt(j).toString().equalsIgnoreCase(combo4)) {
						selectsubgroup.setSelectedIndex(j); } }
				
				String combo5 = table.getValueAt(selectedRow, 5).toString(); 
				for(int j=0
						;j<selectroom.getItemCount();j++) {

					if(selectroom.getItemAt(j).toString().equalsIgnoreCase(combo5)) {
						selectroom.setSelectedIndex(j); } }
				
				String combo6 = table.getValueAt(selectedRow, 6).toString(); 
				for(int j=0
						;j<sessionsign.getItemCount();j++) {

					if(sessionsign.getItemAt(j).toString().equalsIgnoreCase(combo6)) {
						sessionsign.setSelectedIndex(j); } }
				
					day.setValue(table.getValueAt(selectedRow, 7).toString());
					start.setText(table.getValueAt(selectedRow, 8).toString());
					end.setText(table.getValueAt(selectedRow, 10).toString());//edited
					starttime.setValue(table.getValueAt(selectedRow, 9).toString());//edited
					endtime.setValue(table.getValueAt(selectedRow, 11).toString());
				  
				  
			
		}
	});
	
		scrollPane.setViewportView(table);
		try {
			
			
			Connection con = DbConnection.connect();
			 
			 
			String query="select * from notavailableTime ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			
			refreshtable();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		scrollPane.setViewportView(table);
		

		
		
		//update button
		JButton btnUpdate = new JButton("UPDATE");
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				try {
					Connection con = DbConnection.connect();					
					String query="Update notavailableTime set SessionID='"+selectsession.getSelectedItem()+ "',selectLec='"+selectlec.getSelectedItem()+"',selectGroup='"+selectgroup.getSelectedItem()+ "',selectSubGroup='"
					+selectsubgroup.getSelectedItem()+"',selectRoom='"+selectroom.getSelectedItem()+"',sessionSign='"+sessionsign.getSelectedItem()+"',Date='"+day.getValue()+"',startTime='"+start.getText()+"',start='"+starttime.getValue()+"',endTime='"+end.getText()+"',end='"+endtime.getValue()+"'"
							+ " where timeID='"+id.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					
					JLabel label = new JLabel("Your Data Has been Updated");
					label.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(null, label);

					refreshtable();
					pst.close();
					
				}
				catch(Exception ea) {
					ea.printStackTrace();
				}
				
				
			}
		});
		
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setEnabled(true);
		btnUpdate.setBackground(new Color(0, 153, 153));
		btnUpdate.setBounds(102, 567, 141, 31);
		panel_3.add(btnUpdate);
		
		
		
		JLabel label = new JLabel("Not Available Time");
		label.setForeground(new Color(0, 128, 128));
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(452, 60, 270, 31);
		panel_3.add(label);
		
		
		//refresh table
		JButton btnrefresh = new JButton("REFRESH");
		btnrefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con = DbConnection.connect();
					
					String query="select * from notavailableTime ";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		btnrefresh.setForeground(Color.WHITE);
		btnrefresh.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnrefresh.setEnabled(true);
		btnrefresh.setBackground(new Color(0, 153, 153));
		btnrefresh.setBounds(581, 567, 141, 31);
		panel_3.add(btnrefresh);
	}
}
