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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import DB.DbConnection;
import Home.Home;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ConsecutiveSessionRooms;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Student.Manage_studentGroup;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import Timetable.Lecturer;
import WorkingDays.AddWorkingdays;
import WorkingDays.ManageWorkingDays;
import net.proteanit.sql.DbUtils;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;

import java.util.Date;




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
	private Image logo = new ImageIcon(Add_StudentGroup.class.getResource("/images/pp.png")).getImage().getScaledInstance(1000,1000,Image.SCALE_SMOOTH);

	
	public JFrame frame;
	private JTable table;
	private JTextField id;
	private JComboBox selectlec;
	private JComboBox sessionsign;
	private JTextField textField;
	private JSpinner starttime;
	private JSpinner endtime;
	private JTextField start;
	private JTextField end;
	private JSpinner day;
	private JComboBox selectsubgroup ;
	private JComboBox selectroom ;
	private JComboBox selectgroup ;
	
	//refresh all the data
	
public void refreshtable() {
		
		try {
			
			Connection con = DbConnection.connect();
			
			String query="SELECT timeID as TID,selectLec as Lecturer,selectGroup AS Main,selectSubGroup AS SUB,selectRoom as Room,sessionSign as SessionSignature,Date as Days,startTime as Start,start as Time,endTime as End, end as Time FROM notavailableTime";
			//String query="select *  from notavailableTime ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			TableColumnModel columnModel = table.getColumnModel();
			columnModel.getColumn(0).setPreferredWidth(1);
			columnModel.getColumn(1).setPreferredWidth(100);
			columnModel.getColumn(2).setPreferredWidth(50);
			columnModel.getColumn(3).setPreferredWidth(50);
			columnModel.getColumn(4).setPreferredWidth(40);
			columnModel.getColumn(5).setPreferredWidth(350);
			columnModel.getColumn(6).setPreferredWidth(50);
			columnModel.getColumn(7).setPreferredWidth(1);
			columnModel.getColumn(8).setPreferredWidth(1);
			columnModel.getColumn(9).setPreferredWidth(1);
			columnModel.getColumn(10).setPreferredWidth(1);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	//fill select lecture field
	  public void filllecture() {
			
			try {
				
				 Connection con = DbConnection.connect();
				 
				 String query="select * from lecturers";
				 
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery();
				 
				 while(rs.next()) {
					 
					 String name =rs.getString("lectureName");
					 
					 selectlec.addItem(name);
				
					 
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
				 
				 String query="select * from StudentGroup";
				 
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery();
				 
				 while(rs.next()) {
					 
					 String name =rs.getString("SubGroupID");
					 
					 selectsubgroup .addItem(name);
					 
				}
				con.close();
			}
			
			catch(Exception e) {
				
					e.printStackTrace();
				}
			
	     	}
	  
	  //fill session signature field
	  public void fillsign1() {
			
			try {
				
				 Connection con = DbConnection.connect();
				 
				 String query="select * from consecutiveSession";
				 
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery();
				 
				 while(rs.next()) {
					 
					 String name =rs.getString("conSession");
					 
					 sessionsign.addItem(name);
					 
				}
				con.close();
			}
			
			catch(Exception e) {
				
					e.printStackTrace();
				}
			
	     	}
	  
	  
	//fill session signature field
	  public void fillsign2() {
			
			try {
				
				 Connection con = DbConnection.connect();
				 
				 String query="select * from parallel";
				 
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery();
				 
				 while(rs.next()) {
					 
					 String name =rs.getString("ParallelSessions");
					 
					 sessionsign.addItem(name);
					 
				}
				con.close();
			}
			
			catch(Exception e) {
				
					e.printStackTrace();
				}
			
	     	}
	  
	  
	  
	  
	  
	  
	  
	//fill session signature field
	  public void fillsign3() {
			
			try {
				
				 Connection con = DbConnection.connect();
				 
				 String query="select * from nonOverlapping";
				 
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery();
				 
				 while(rs.next()) {
					 
					 String name =rs.getString("nonOverlappingSignature");
					 
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
		frame.setTitle("Time Table Management System");
		frame.setSize(1350, 728);
		frame.setBounds(0, 0, 1350, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(logo);
		frame.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
		frame.setVisible(true);
		
		
		
		
		
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
					
					frame.dispose();
					new Add_Lecturer();
					
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
				
				
				frame.dispose();
				new Add_StudentGroup();
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
				
				
				frame.dispose();
				new ConsecutiveSessionRooms();
				
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
				
				
				frame.dispose();
				new AddWorkingdays();
				
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
				


				frame.dispose();
				new ManageLocations();
				
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
				
				
				frame.dispose();
				new Statistics();
				
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
		btnTimetableGenerate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				new Lecturer();
				
			}
		});
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
	
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new Home();
				
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
		panel_6.setBounds(-11, 0, 1093, 39);
		panel_3.add(panel_6);
		
		//conseccutive sessions button
		JButton btnNewButton_2_1 = new JButton("Conseccutive Sessions");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1.setBounds(12, 0, 268, 37);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new Consecutive_sessions();
				
			}
		});
		panel_6.add(btnNewButton_2_1);
		
		
		//parallel sessions button
		JButton btnNewButton_2_1_1 = new JButton("Parallel Sessions");
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new Parallel_sessions();
				
			}
		});
		btnNewButton_2_1_1.setBounds(278, 0, 275, 37);
		panel_6.add(btnNewButton_2_1_1);
		
		
		
		//not available time button
		JLabel lblNewLabel_1_1 = new JLabel("Not Available Time");
		JButton button = new JButton("Not available time");
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(829, 0, 263, 37);
		panel_6.add(button);	
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				frame.dispose();
				new NotAvailableTime();
				
			}
		});
			
		//non overlapping session button
		JButton btnNewButton_2_1_2 = new JButton("Non Overlapping Sessions");
		btnNewButton_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1_2.setBounds(553, 0, 275, 37);
		btnNewButton_2_1_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		
				frame.dispose();
				new Non_overlappingSessions();
			}
		});
		panel_6.add(btnNewButton_2_1_2);


		
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBounds(24, 91, 1036, 326);
		panel_3.add(panel_4);
	
		//select lecture 
		JLabel lblNewLabel_2 = new JLabel("Select Lecturer");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(28, 83, 149, 23);
		panel_4.add(lblNewLabel_2);
		
		selectlec = new JComboBox();
		selectlec.setFont(new Font("Tahoma", Font.BOLD, 13));
		selectlec.setBounds(214, 83, 218, 22);
		selectlec.setModel(new DefaultComboBoxModel(new String[] {""}));
		panel_4.add(selectlec);
		
		filllecture();
	
		
		JLabel lblSelectSubGroup = new JLabel("Selected sub Group");
		lblSelectSubGroup.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSelectSubGroup.setBounds(28, 182, 149, 23);
		panel_4.add(lblSelectSubGroup);
		
		
		JLabel StartTime = new JLabel("Sart Time");
		StartTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		StartTime.setBounds(725, 155, 91, 23);
		panel_4.add(StartTime);
		
		JLabel EndTime = new JLabel("End Time");
		EndTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		EndTime.setBounds(725, 202, 57, 23);
		panel_4.add(EndTime);
		
		
		//add data
		JButton add = new JButton("ADD");
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
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
						
				
						String query = "INSERT INTO notavailableTime values(null,'"+ selectLec +"','"+ selectGroup + "','"+ selectSubGroup + 
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
		add.setBounds(717, 273, 141, 31);
		panel_4.add(add);
		add.setForeground(Color.WHITE);
		add.setFont(new Font("Tahoma", Font.BOLD, 14));
		add.setEnabled(true);
		add.setBackground(new Color(0, 153, 153));
		
		
		//clear data from fields
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(885, 273, 141, 31);
		panel_4.add(btnClear);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setEnabled(true);
		btnClear.setBackground(new Color(0, 153, 153));
		
		id = new JTextField();
		id.setBackground(SystemColor.menu);
		id.setBounds(0, 0, 43, 23);
		panel_4.add(id);
		
		//start time AM
		starttime = new JSpinner();
		String[] ampmString1 = {"am", "pm"};
		starttime = new JSpinner(
		 new SpinnerListModel(ampmString1));
		starttime.setFont(new Font("Tahoma", Font.BOLD, 13));
		starttime.setBounds(967, 155, 43, 23);
		panel_4.add(starttime);
		
		//End time AM
		endtime = new JSpinner();
		String[] ampmString = {"am", "pm"};
		endtime = new JSpinner(
		 new SpinnerListModel(ampmString1));
		endtime.setFont(new Font("Tahoma", Font.BOLD, 13));
		endtime.setBounds(967, 202, 43, 23);
		panel_4.add(endtime);
		
		start = new JTextField();
		start.setFont(new Font("Tahoma", Font.BOLD, 13));
		start.setBounds(829, 156, 127, 22);
		panel_4.add(start);
		start.setColumns(10);
		
		end = new JTextField();
		end.setFont(new Font("Tahoma", Font.BOLD, 13));
		end.setBounds(828, 203, 128, 20);
		panel_4.add(end);
		
		
		//Add date
		JLabel date = new JLabel("Day");
		date.setFont(new Font("Tahoma", Font.BOLD, 12));
		date.setBounds(727, 123, 74, 14);
		panel_4.add(date);
		
		 day = new JSpinner();
		String[] dayString = {"1.Monday", "2.Tuesday","3.Wednesday","4.Thursday","5.Friday","6.Saturday","7.Sunday"};//edited
		day = new JSpinner(
		new SpinnerListModel(dayString));
		day.setFont(new Font("Tahoma", Font.BOLD, 13));
		day.setBounds(828, 119, 182, 23);
		panel_4.add(day);
		
		
		//Add session sign
		JLabel session = new JLabel("Session Signature");
		session.setFont(new Font("Tahoma", Font.BOLD, 12));
		session.setBounds(28, 35, 113, 14);
		panel_4.add(session);
		sessionsign = new JComboBox();
		sessionsign.setFont(new Font("Tahoma", Font.BOLD, 13));
		sessionsign.setModel(new DefaultComboBoxModel(new String[] {""}));
		sessionsign.setBounds(214, 31, 796, 23);
		panel_4.add(sessionsign);
		fillsign1();
		fillsign2();
		fillsign3();
		
		JLabel lblNewLabel = new JLabel("Select Room");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(28, 236, 113, 14);
		panel_4.add(lblNewLabel);
		selectroom = new JComboBox();
		selectroom.setFont(new Font("Tahoma", Font.BOLD, 13));
		selectroom.setBounds(214, 232, 218, 23);
		panel_4.add(selectroom);
		selectroom.setModel(new DefaultComboBoxModel(new String[] {""}));
		panel_4.add(selectroom);
		fillroom() ;
	

	
		//select group
		JLabel lblSelectGroup = new JLabel("Select Group");
		lblSelectGroup.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSelectGroup.setBounds(28, 136, 137, 14);
		panel_4.add(lblSelectGroup);
		selectgroup = new JComboBox();
		selectgroup.setFont(new Font("Tahoma", Font.BOLD, 13));
		selectgroup.setBounds(214, 134, 218, 23);
		panel_4.add(selectgroup);
		selectgroup.setModel(new DefaultComboBoxModel(new String[] {""}));
		fillgroups();

	
	
		//select sub group
		 selectsubgroup = new JComboBox();
		 selectsubgroup.setFont(new Font("Tahoma", Font.BOLD, 13));
		 selectsubgroup.setBounds(214, 184, 218, 23);
		 panel_4.add( selectsubgroup);
			selectsubgroup.setModel(new DefaultComboBoxModel(new String[] {""}));
		 fillsubgroup();
		
	
		
		
		

	
	
	btnClear.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
				id.setText("");
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
		delete.setBounds(909, 554, 141, 31);
		panel_3.add(delete);
	
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		separator.setBounds(-1, 40, 1082, 21);
		panel_3.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 419, 1036, 124);
		panel_3.add(scrollPane);
		
		
		//display data in the table
		table = new JTable();
		//table header
		JTableHeader h = table.getTableHeader();
		h.setBackground(new Color(153,153,153));
		h.setForeground(Color.WHITE);
		h.setFont(new Font("Times New Roman", Font.BOLD, 17));
				
		table.addMouseListener(new MouseAdapter() {


		@Override
		public void mouseClicked(MouseEvent arg0) {

			int selectedRow=table.getSelectedRow();
		

			
			 	id.setText(table.getValueAt(selectedRow, 0).toString());

			
				String combo2 = table.getValueAt(selectedRow, 1).toString(); 
				for(int j=0
						;j<selectlec.getItemCount();j++) {

					if(selectlec.getItemAt(j).toString().equalsIgnoreCase(combo2)) {
						selectlec.setSelectedIndex(j); } }

				String combo3 = table.getValueAt(selectedRow, 2).toString(); 
				for(int j=0
						;j<selectgroup.getItemCount();j++) {

					if(selectgroup.getItemAt(j).toString().equalsIgnoreCase(combo3)) {
						selectgroup.setSelectedIndex(j); } }
				
				

				String combo4 = table.getValueAt(selectedRow, 3).toString(); 
				for(int j=0
						;j<selectsubgroup.getItemCount();j++) {

					if(selectsubgroup.getItemAt(j).toString().equalsIgnoreCase(combo4)) {
						selectsubgroup.setSelectedIndex(j); } }
				
				String combo5 = table.getValueAt(selectedRow, 4).toString(); 
				for(int j=0
						;j<selectroom.getItemCount();j++) {

					if(selectroom.getItemAt(j).toString().equalsIgnoreCase(combo5)) {
						selectroom.setSelectedIndex(j); } }
				
				String combo6 = table.getValueAt(selectedRow, 5).toString(); 
				for(int j=0
						;j<sessionsign.getItemCount();j++) {

					if(sessionsign.getItemAt(j).toString().equalsIgnoreCase(combo6)) {
						sessionsign.setSelectedIndex(j); } }
				
					day.setValue(table.getValueAt(selectedRow, 6).toString());
					start.setText(table.getValueAt(selectedRow, 7).toString());
					end.setText(table.getValueAt(selectedRow, 9).toString());//edited
					starttime.setValue(table.getValueAt(selectedRow, 8).toString());//edited
					endtime.setValue(table.getValueAt(selectedRow, 10).toString());
				  
				  
			
		}
	});
	
		scrollPane.setViewportView(table);
		
		try {
			
			
			Connection con = DbConnection.connect();
			 
			 
			//String query="SELECT timeID as TID, selectLec as Lecturer, selectGroup as Group, selectSubGroup as SubGroup, selectRoom as Room, sessionSign as Signature, Date as Day, startTime as Start, start as STime,endTime as End, end as ETime FROM notavailableTime ";
			String query="SELECT timeID as TID,selectLec as Lecturer,selectGroup AS Main,selectSubGroup AS SUB,selectRoom as Room,sessionSign as SessionSignature,Date as Days,startTime as Start,start as Time,endTime as End, end as Time FROM notavailableTime";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			TableColumnModel columnModel = table.getColumnModel();
			columnModel.getColumn(0).setPreferredWidth(1);
			columnModel.getColumn(1).setPreferredWidth(100);
			columnModel.getColumn(2).setPreferredWidth(50);
			columnModel.getColumn(3).setPreferredWidth(50);
			columnModel.getColumn(4).setPreferredWidth(40);
			columnModel.getColumn(5).setPreferredWidth(350);
			columnModel.getColumn(6).setPreferredWidth(50);
			columnModel.getColumn(7).setPreferredWidth(1);
			columnModel.getColumn(8).setPreferredWidth(1);
			columnModel.getColumn(9).setPreferredWidth(1);
			columnModel.getColumn(10).setPreferredWidth(1);
			
			
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
					String query="Update notavailableTime set selectLec='"+selectlec.getSelectedItem()+"',selectGroup='"+selectgroup.getSelectedItem()+ "',selectSubGroup='"
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
		btnUpdate.setBounds(740, 554, 141, 31);
		panel_3.add(btnUpdate);
		
		
		
		JLabel label = new JLabel("Not Available Time");
		label.setForeground(new Color(0, 128, 128));
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(452, 60, 270, 31);
		panel_3.add(label);
		
		
		/*refresh table
		JButton btnrefresh = new JButton("REFRESH");
		btnrefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con = DbConnection.connect();
					
					String query="select timeID AS TID,selectLec as Lecturer,selectGroup as Group,selectSubGroup as SubGroup,selectRoom as Room,sessionSign as SessionSignature,Date as Day,startTime as StartTime,start as AMPM,endTime as EndTime,end as AMPM from notavailableTime ";
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
		btnrefresh.setBounds(744, 554, 141, 31);
		panel_3.add(btnrefresh);*/
	}
}
