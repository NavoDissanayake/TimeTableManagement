/**
 * IT19209944
 * W.B.W.M.R.U.P.U.Aluvihare
 * 
 */

package Advanced;

import java.awt.EventQueue;



import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import java.awt.List;
import java.awt.ScrollPane;
import java.awt.Button;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import DB.DbConnection;
import Home.Home;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Statistics.Statistics;
import Student.Add_StudentGroup;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import Timetable.Lecturer;
import WorkingDays.AddWorkingdays;
import net.proteanit.sql.DbUtils;

import javax.swing.border.LineBorder;
import java.awt.Panel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ScrollPaneConstants;

public class Consecutive_sessions {

	
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
	
	
	private JFrame frmAddStudentGroup;
	private JTable table;
	private JComboBox comboBox_s1;
	private JComboBox comboBox_s2;
	private JComboBox comboBox_s3;
	private JTextField gensession;
	
	
	//fill  session 1
	  public void fillsesions1() {
			
			try {
				
				 Connection con = DbConnection.connect();
				 
				 String query="select * from session";
				 
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery();
				 
				 while(rs.next()) {
					 
					 String name =rs.getString("sessionSignature");
					 comboBox_s1.addItem(name);
					 //comboBox_4_1.addItem(rs.getString("SubGroupID"));
					 
				}
				con.close();
			}
			
			catch(Exception e) {
				
					e.printStackTrace();
				}
			
	     	}
	     
	
	  //fill session 2 
	  public void fillsesions2() {
			
			try {
				
				 Connection con = DbConnection.connect();
				 
				 String query="select * from session";
				 
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery();
				 
				 while(rs.next()) {
					 
					 String name =rs.getString("sessionSignature");
					 comboBox_s2.addItem(name);
					 //comboBox_4_1.addItem(rs.getString("SubGroupID"));
					 
				}
				con.close();
			}
			
			catch(Exception e) {
				
					e.printStackTrace();
				}
			
	     	}
	  
	  
	 //fill session 3
	  public void fillsesions3() {
			
			try {
				
				 Connection con = DbConnection.connect();
				 
				 String query="select * from session";
				 
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery();
				 
				 while(rs.next()) {
					 
					 String name =rs.getString("sessionSignature");
					 comboBox_s3.addItem(name);
					 //comboBox_4_1.addItem(rs.getString("SubGroupID"));
					 
				}
				con.close();
			}
			
			catch(Exception e) {
				
					e.printStackTrace();
				}
			
	     	}
	  
	  

	  
	  //refresh method
	  public void refreshTable() {
			
			try {
				Connection con = DbConnection.connect();
				
				String query="select conSessionID AS SID,conSession AS ConsecutiveSession from consecutiveSession ";
				PreparedStatement pst=con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
				
				TableColumnModel columnModel = table.getColumnModel();
				columnModel.getColumn(0).setPreferredWidth(6);
				columnModel.getColumn(1).setPreferredWidth(900);
				
				
				
				
				
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
					Consecutive_sessions window = new Consecutive_sessions();
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
	public Consecutive_sessions() {
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
		frmAddStudentGroup.setTitle(" Time Table Management System ");
		frmAddStudentGroup.setSize(1350, 728);
		frmAddStudentGroup.setBounds(0, 0, 1350, 700);
		frmAddStudentGroup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentGroup.getContentPane().setLayout(null);
		frmAddStudentGroup.setExtendedState(frmAddStudentGroup.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		frmAddStudentGroup.setIconImage(logo);
		
		frmAddStudentGroup.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
		frmAddStudentGroup.setVisible(true);
		
			      
			      
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		frmAddStudentGroup.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Advanced");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setBounds(753, 13, 179, 29);
		panel.add(lblNewLabel_10);
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
		
		
		//home button
		JButton btnHome = new JButton("Home");
		btnHome.setHorizontalAlignment(SwingConstants.LEFT);
		btnHome.setIcon(new ImageIcon(home_logo));
		btnHome.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			
				frmAddStudentGroup.dispose();
				new Home();
				
			}
		});
		btnHome.setBounds(0, 13, 262, 33);
		panel_1.add(btnHome);
		btnHome.setForeground(new Color(255, 255, 255));
		btnHome.setBackground(new Color(0, 139, 139));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		
		//lecture button
		JButton btnLecturers = new JButton("Lecturers");
		btnLecturers.setHorizontalAlignment(SwingConstants.LEFT);
		btnLecturers.setIcon(new ImageIcon(lec_logo));
		btnLecturers.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					
					frmAddStudentGroup.dispose();
					new  Add_Lecturer();
					
				}
			});
		
		btnLecturers.setForeground(Color.WHITE);
		btnLecturers.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLecturers.setBackground(new Color(0, 139, 139));
		btnLecturers.setBounds(0, 59, 264, 38);
		panel_1.add(btnLecturers);
		
		
		//student button
		JButton btnStudents = new JButton("Students");
		btnStudents.setHorizontalAlignment(SwingConstants.LEFT);
		btnStudents.setIcon(new ImageIcon(stu_logo));
        btnStudents.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frmAddStudentGroup.dispose();
				new Add_StudentGroup();
				
			}
		});
	
		
		btnStudents.setForeground(Color.WHITE);
		btnStudents.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStudents.setBackground(new Color(0, 139, 139));
		btnStudents.setBounds(0, 108, 264, 38);
		panel_1.add(btnStudents);
		
		
		//subject button
		JButton btnSubjects = new JButton("Subjects");
		btnSubjects.setHorizontalAlignment(SwingConstants.LEFT);
		btnSubjects.setIcon(new ImageIcon(sub_logo));
		btnSubjects.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Add_Subjects add_sub= new Add_Subjects();
				//add_sub.main(null);
				frmAddStudentGroup.dispose();
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
				
				//Add_Session add_session= new Add_Session();
				//add_session.main(null);
				frmAddStudentGroup.dispose();
				new Add_Session();
				
			}
		});
		btnSessions.setForeground(Color.WHITE);
		btnSessions.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSessions.setBackground(new Color(0, 139, 139));
		btnSessions.setBounds(0, 206, 264, 38);
		panel_1.add(btnSessions);
		
		
		//Tags button
		JButton btnTags = new JButton("Tags");
		btnTags.setHorizontalAlignment(SwingConstants.LEFT);
		btnTags.setIcon(new ImageIcon(tag_logo));
		btnTags.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Add_Tags add_tag= new Add_Tags();
				//add_tag.main(null);
				frmAddStudentGroup.dispose();
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
				
				//ManageSessionsRooms m_rooms= new ManageSessionsRooms ();
				//m_rooms.main(null);
				frmAddStudentGroup.dispose();
				new  ManageSessionsRooms();
				
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
				
				//AddWorkingdays w_days= new 	AddWorkingdays();
				//w_days.main(null);
				frmAddStudentGroup.dispose();
				new AddWorkingdays();
				
			}
		});
		btnWorkingDays.setForeground(Color.WHITE);
		btnWorkingDays.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnWorkingDays.setBackground(new Color(0, 139, 139));
		btnWorkingDays.setBounds(0, 353, 264, 38);
		panel_1.add(btnWorkingDays);
		
		//location button
		JButton btnLocations = new JButton("Locations");
		btnLocations.setHorizontalAlignment(SwingConstants.LEFT);
		btnLocations.setIcon(new ImageIcon(location_logo));
		btnLocations.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//ManageLocations m_locations= new ManageLocations();
				//m_locations.main(null);
				frmAddStudentGroup.dispose();
				new ManageLocations();
				
			}
		});
		btnLocations.setForeground(Color.WHITE);
		btnLocations.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLocations.setBackground(new Color(0, 139, 139));
		btnLocations.setBounds(0, 402, 264, 38);
		panel_1.add(btnLocations);
		
		//statics button
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.setHorizontalAlignment(SwingConstants.LEFT);
		btnStatistics.setIcon(new ImageIcon(st_logo));
		btnStatistics.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Statistics stat= new Statistics ();
				//stat.main(null);
				frmAddStudentGroup.dispose();
				new   Statistics();
				
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
				frmAddStudentGroup.dispose();
				new Consecutive_sessions();
				
			}
		});
		btnAdvanced.setForeground(Color.WHITE);
		btnAdvanced.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdvanced.setBackground(new Color(0, 139, 139));
		btnAdvanced.setBounds(0, 500, 264, 38);
		panel_1.add(btnAdvanced);
		
		//generate button
		JButton btnTimetableGenerate = new JButton("Timetable Generate");
		btnTimetableGenerate.setHorizontalAlignment(SwingConstants.LEFT);
		btnTimetableGenerate.setIcon(new ImageIcon(time_logo));
		btnTimetableGenerate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//Consecutive_sessions a_session= new Consecutive_sessions ();
				//a_session.main(null);
				frmAddStudentGroup.dispose();
				new Lecturer();
				
			}
		});
		btnTimetableGenerate.setForeground(Color.WHITE);
		btnTimetableGenerate.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTimetableGenerate.setBackground(new Color(0, 139, 139));
		btnTimetableGenerate.setBounds(0, 549, 264, 38);
		panel_1.add(btnTimetableGenerate);
		
		
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(230, 230, 250));
		panel_6.setBounds(263, 62, 1081, 603);
		frmAddStudentGroup.getContentPane().add(panel_6);
		
		
		

		JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBounds(0, 40, 1081, 38);
		panel_6.add(panel_6_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Consecuttive Sessions");
		lblNewLabel_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(494, 0, 278, 31);
		panel_6_1_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Conseccutive Sessions");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frmAddStudentGroup.dispose();
				new  Consecutive_sessions();
				
			}
		});
		
		btnNewButton_2_1.setBounds(0, 0, 268, 37);
		panel_6.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Parallel Sessions");
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				frmAddStudentGroup.dispose();
				new  Parallel_sessions();
				
			}
		});
		btnNewButton_2_1_1.setBounds(269, 0, 275, 37);
		panel_6.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_2 = new JButton("Non Overlapping Sessions");
		btnNewButton_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				frmAddStudentGroup.dispose();
				new  Non_overlappingSessions();
				
			}
		});
		btnNewButton_2_1_2.setBounds(540, 0, 275, 37);
		panel_6.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_2_1_3 = new JButton("Not Available Times");
		btnNewButton_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				//NotAvailableTime not= new NotAvailableTime();
				//not.main(null);
				frmAddStudentGroup.dispose();
				new  NotAvailableTime();
				
			}
		});
		btnNewButton_2_1_3.setBounds(813, 0, 268, 37);
		panel_6.add(btnNewButton_2_1_3);
		
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(32, 178, 170));
		separator_1.setBackground(new Color(0, 139, 139));
		separator_1.setBounds(0, 37, 1094, 19);
		panel_6.add(separator_1);
		
		
		
		
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(26, 91, 1030, 476);
		panel_6.add(panel_7);
		
		
		
		
		//session 1
		JLabel lblNewLabel_4_1 = new JLabel("Session 1");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(24, 24, 80, 21);
		panel_7.add(lblNewLabel_4_1);
		
		comboBox_s1 = new JComboBox();
		comboBox_s1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBox_s1.setModel(new DefaultComboBoxModel(new String[] {"-"}));
		comboBox_s1.setBounds(189, 13, 764, 32);
		panel_7.add(comboBox_s1);
		
		fillsesions1();

	
		
		//session 2
		JLabel lblNewLabel_4 = new JLabel("Session 2");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_4.setBounds(24, 87, 80, 21);
		panel_7.add(lblNewLabel_4);
		
		

	    comboBox_s2 = new JComboBox();
	    comboBox_s2.setFont(new Font("Times New Roman", Font.BOLD, 14));
	    comboBox_s2.setModel(new DefaultComboBoxModel(new String[] {"-"}));
		comboBox_s2.setBounds(189, 76, 764, 32);
		panel_7.add(comboBox_s2);
		
		
		fillsesions2();
		
		
		//session 3
		JLabel lblNewLabel_5 = new JLabel("Session 3");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_5.setBounds(24, 150, 96, 16);
		panel_7.add(lblNewLabel_5);
		
		comboBox_s3 = new JComboBox();
		comboBox_s3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBox_s3.setModel(new DefaultComboBoxModel(new String[] {"-"}));
		comboBox_s3.setBounds(189, 142, 764, 32);
		panel_7.add(comboBox_s3);
		
		
		fillsesions3();
		
		
		
		
		gensession = new JTextField();
		gensession.setBackground(UIManager.getColor("Button.light"));
		gensession.setEnabled(false);
		gensession.setBounds(24, 300, 890, 3);
		panel_7.add(gensession);
		gensession.setColumns(10);
		
		
		//add consecutive sessions
		JButton btnNewButton_2 = new JButton("ADD");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				gensession.setText(comboBox_s1.getSelectedItem().toString()+"+"+comboBox_s2.getSelectedItem().toString()+"+"+comboBox_s3.getSelectedItem().toString());
				
				String session1=comboBox_s1.getSelectedItem().toString();
				String session2=comboBox_s2.getSelectedItem().toString();
				String session3=comboBox_s3.getSelectedItem().toString();
				String session = gensession.getText();
				
			
				
				 try {
					 
					 Connection con = DbConnection.connect();
					 
					  

	                    String query = "INSERT INTO consecutiveSession values(null, '" + session1 + "', '" + session2+ "', '" + session3 + "', '" + session + "')";

	                    Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                    	JOptionPane.showMessageDialog(null, "       This is alredy exist","Alert",JOptionPane.WARNING_MESSAGE);
		                      
	                    } else {
	                    	
	                    	
	                    	JLabel label = new JLabel("Consective Sessions added Sucessfully");
	    					label.setHorizontalAlignment(SwingConstants.CENTER);
	    					JOptionPane.showMessageDialog(null, label);
	    					
	    					refreshTable();
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                	
	                	System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
	                	
	                }
				
				
				
			}
		});
		
		
		
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBackground(new Color(0, 139, 139));
		btnNewButton_2.setBounds(607, 203, 164, 40);
		panel_7.add(btnNewButton_2);
		
		
		
		//clear input feilds
		JButton btnNewButton_3 = new JButton("CLEAR");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comboBox_s1.setSelectedIndex(0);
				comboBox_s2.setSelectedIndex(0);
				comboBox_s3.setSelectedIndex(0);
				
				
			
			}
		});
		
		
		
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBackground(new Color(0, 139, 139));
		btnNewButton_3.setBounds(798, 203, 155, 40);
		panel_7.add(btnNewButton_3);
		
		
		
	
		
		//table view
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 303, 1006, 142);
		panel_7.add(scrollPane);
		
		
		table = new JTable();
		table.setRowHeight(30);
		
		
		//table header
		JTableHeader h = table.getTableHeader();
		h.setBackground(new Color(153, 153, 153));
		h.setForeground(Color.WHITE);
		h.setFont(new Font("Times New Roman", Font.BOLD, 17));
		
		
		table.setFont(new Font("Times New Roman", Font.BOLD, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane.setViewportView(table);
		try {
			
			
			Connection con = DbConnection.connect();
			 
			 
			String query="select conSessionID AS SID,conSession AS ConsecutiveSession from consecutiveSession ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			TableColumnModel columnModel = table.getColumnModel();
			columnModel.getColumn(0).setPreferredWidth(6);
			columnModel.getColumn(1).setPreferredWidth(900);
			
			
			
			
			
			//refreshTable();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		

		
	}
}
