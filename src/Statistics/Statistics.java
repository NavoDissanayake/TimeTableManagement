package Statistics;

import java.awt.BorderLayout;
import java.awt.Color;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.MatteBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import Advanced.Consecutive_sessions;
import DB.DbConnection;
import Home.Home;
import Lecturer.Add_Lecturer;
import Locations.ManageLocations;
import Rooms.ManageSessionsRooms;
import Session.Add_Session;
import Student.Add_StudentGroup;
import Subject.Add_Subjects;
import Tags.Add_Tags;
import WorkingDays.AddWorkingdays;

import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.BoxLayout;


public class Statistics {
	

	private Image home_logo = new ImageIcon(Home.class.getResource("/images/home.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image lec_logo = new ImageIcon(Home.class.getResource("/images/lecturer.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image stu_logo = new ImageIcon(Home.class.getResource("/images/student.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image sub_logo = new ImageIcon(Home.class.getResource("/images/subject.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image session_logo = new ImageIcon(Home.class.getResource("/images/session.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image tag_logo = new ImageIcon(Home.class.getResource("/images/tags.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image location_logo = new ImageIcon(Home.class.getResource("/images/location.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image st_logo = new ImageIcon(Home.class.getResource("/images/statics.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image days_logo = new ImageIcon(Home.class.getResource("/images/Wdays.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image time_logo = new ImageIcon(Home.class.getResource("/images/time.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image adv_logo = new ImageIcon(Home.class.getResource("/images/adv1.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image room_logo = new ImageIcon(Home.class.getResource("/images/room.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	

	private JFrame staticFrame;
	private JTextField statictextField;
	private JTextField statictextField_1;
	private JTextField statictextField_2;
	private JTextField statictextField_3;
	
	private int gSum1, gSum2, gSum3, gSum4;
	private JTextField statictextField_4;
	private JTextField statictextField_5;
	private JTextField statictextField_6;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statistics window = new Statistics();
					window.staticFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setData() {

		try {
			Connection con = DbConnection.connect();
	
	//registerd	Lec	
			String query1="select count (*) as reglec from lecturers ";
			PreparedStatement pst1=con.prepareStatement(query1);
			ResultSet rs1=pst1.executeQuery();
			
			String sum1 = rs1.getString("reglec");
			gSum1 = Integer.parseInt(sum1);	
			statictextField.setText(sum1);

	//registerd	group	
			String query2="select count (*) as regstu from StudentGroup ";
			PreparedStatement pst2=con.prepareStatement(query2);
			ResultSet rs2=pst2.executeQuery();
			String sum2 = rs2.getString("regstu");
			gSum2 = Integer.parseInt(sum2);			
			statictextField_1.setText(sum2);
			
	//registerd	Subject
			String query3="select count (*) as regsub from subjects ";
			PreparedStatement pst3=con.prepareStatement(query3);
			ResultSet rs3=pst3.executeQuery();
			String sum3 = rs3.getString("regsub");
			gSum3 = Integer.parseInt(sum3);			
			statictextField_2.setText(sum3);
	
	//registerd	rooms
			String query4="select count(*) as regroom from location ";
			PreparedStatement pst4=con.prepareStatement(query4);
			ResultSet rs4=pst4.executeQuery();
			String sum4 = rs4.getString("regroom");
			gSum4 = Integer.parseInt(sum4);			
			statictextField_3.setText(sum4);
	
			System.out.println(gSum4);
		}
		catch(Exception load) {
			load.printStackTrace();
		}	
	}
	public void setLatestData() {
		try {
			Connection con = DbConnection.connect();
	
			//Lecturer
			String lastLec ="SELECT lectureName FROM lecturers WHERE lid = (SELECT MAX(lid) FROM lecturers)";
			PreparedStatement pst1 =con.prepareStatement(lastLec);
			ResultSet rs1 =pst1.executeQuery();
			String txtLastLec = rs1.getString("lectureName");
			statictextField_4.setText(txtLastLec);
			
			//Subject
			String lastLec2 ="SELECT subName FROM subjects WHERE subID = (SELECT MAX(subID) FROM subjects)";
			PreparedStatement pst12 =con.prepareStatement(lastLec2);
			ResultSet rs12 =pst12.executeQuery();
			String txtLastLec2 = rs12.getString("subName");
			statictextField_5.setText(txtLastLec2);
			
			//Group
			String lastLec3 ="SELECT GroupID FROM StudentGroup WHERE StudenttGroupID = (SELECT MAX(StudenttGroupID) FROM StudentGroup)";
			PreparedStatement pst13 =con.prepareStatement(lastLec3);
			ResultSet rs13 =pst13.executeQuery();
			String txtLastLec3 = rs13.getString("GroupID");
			statictextField_6.setText(txtLastLec3);
			
						
		}catch (Exception a) {
			a.printStackTrace();
		}
	}


	
	/**
	 * Create the application.
	 */
	public Statistics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		staticFrame = new JFrame();
		staticFrame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		staticFrame.setBackground(Color.YELLOW);
		staticFrame.setResizable(false);
		staticFrame.setTitle("Sessions");
		staticFrame.setSize(1400, 860);
		staticFrame.setBounds(0, 0, 1350, 700);
		staticFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		staticFrame.getContentPane().setLayout(null);
		
		staticFrame.setLocationRelativeTo(null);
		staticFrame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(0,0, 1344, 65);
		panel.setBackground(new Color(0, 139, 139));
		staticFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Time Table Management System");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setBounds(580, 13, 422, 29);
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
		staticFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		
		
		
		JButton btnLecturers = new JButton("Lecturers");
		btnLecturers.setHorizontalAlignment(SwingConstants.LEFT);
		btnLecturers.setIcon(new ImageIcon(lec_logo));
		btnLecturers.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					Add_Lecturer add_lecture = new Add_Lecturer();
					add_lecture.main(null);
					staticFrame.dispose();
					
				}
			});
		
		btnLecturers.setForeground(Color.WHITE);
		btnLecturers.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLecturers.setBackground(new Color(0, 139, 139));
		btnLecturers.setBounds(0, 59, 264, 38);
		panel_1.add(btnLecturers);
		
		JButton btnStudents = new JButton("Students");
		btnStudents.setHorizontalAlignment(SwingConstants.LEFT);
		btnStudents.setIcon(new ImageIcon(stu_logo));
		btnStudents.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Add_StudentGroup add_st= new Add_StudentGroup();
				add_st.main(null);
				staticFrame.dispose();
				
			}
		});
	
		btnLecturers.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Home add_st = new Home();
				add_st.main(null);
				staticFrame.dispose();
				
			}
		});
		btnStudents.setForeground(Color.WHITE);
		btnStudents.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStudents.setBackground(new Color(0, 139, 139));
		btnStudents.setBounds(0, 108, 264, 38);
		panel_1.add(btnStudents);
		
		JButton btnSubjects = new JButton("Subjects");
		btnSubjects.setHorizontalAlignment(SwingConstants.LEFT);
		btnSubjects.setIcon(new ImageIcon(sub_logo));
		btnSubjects.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Add_Subjects add_sub= new Add_Subjects();
				add_sub.main(null);
				staticFrame.dispose();
				
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
			
			public void actionPerformed(ActionEvent e) {
				
				Add_Session add_session= new Add_Session();
				add_session.main(null);
				staticFrame.dispose();
				
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
				
				Add_Tags add_tag= new Add_Tags();
				add_tag.main(null);
				staticFrame.dispose();
				
			}
		});
		btnTags.setForeground(Color.WHITE);
		btnTags.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTags.setBackground(new Color(0, 139, 139));
		btnTags.setBounds(0, 255, 264, 38);
		panel_1.add(btnTags);
		
		JButton btnRooms = new JButton("Rooms");
		btnRooms.setHorizontalAlignment(SwingConstants.LEFT);
		btnRooms.setIcon(new ImageIcon(room_logo));
		btnRooms.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ManageSessionsRooms m_rooms= new ManageSessionsRooms ();
				m_rooms.main(null);
				staticFrame.dispose();
				
			}
		});
		btnRooms.setForeground(Color.WHITE);
		btnRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnRooms.setBackground(new Color(0, 139, 139));
		btnRooms.setBounds(0, 304, 264, 38);
		panel_1.add(btnRooms);
		
		JButton btnWorkingDays = new JButton("Working days & Hours");
		btnWorkingDays.setHorizontalAlignment(SwingConstants.LEFT);
		btnWorkingDays.setIcon(new ImageIcon(days_logo));
		btnWorkingDays.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				AddWorkingdays w_days= new 	AddWorkingdays();
				w_days.main(null);
				staticFrame.dispose();
				
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
				staticFrame.dispose();
				
			}
		});
		btnLocations.setForeground(Color.WHITE);
		btnLocations.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLocations.setBackground(new Color(0, 139, 139));
		btnLocations.setBounds(0, 402, 264, 38);
		panel_1.add(btnLocations);
		
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.setHorizontalAlignment(SwingConstants.LEFT);
		btnStatistics.setIcon(new ImageIcon(st_logo));
		btnStatistics.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Statistics stat= new Statistics ();
				stat.main(null);
				staticFrame.dispose();
				
			}
		});
		btnStatistics.setForeground(Color.WHITE);
		btnStatistics.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnStatistics.setBackground(new Color(0, 139, 139));
		btnStatistics.setBounds(0, 451, 264, 38);
		panel_1.add(btnStatistics);
		
		JButton btnAdvanced = new JButton("Advanced");
		btnAdvanced.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdvanced.setIcon(new ImageIcon(adv_logo));
		btnAdvanced.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Consecutive_sessions a_session= new Consecutive_sessions ();
				a_session.main(null);
				staticFrame.dispose();
				
				
				
			}
		});
		btnAdvanced.setForeground(Color.WHITE);
		btnAdvanced.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdvanced.setBackground(new Color(0, 139, 139));
		btnAdvanced.setBounds(0, 500, 264, 38);
		panel_1.add(btnAdvanced);
		
		JButton btnTimetableGenerate = new JButton("Timetable Generate");
		btnTimetableGenerate.setHorizontalAlignment(SwingConstants.LEFT);
		btnTimetableGenerate.setIcon(new ImageIcon(time_logo));
		btnTimetableGenerate.setForeground(Color.WHITE);
		btnTimetableGenerate.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTimetableGenerate.setBackground(new Color(0, 139, 139));
		btnTimetableGenerate.setBounds(0, 549, 264, 38);
		panel_1.add(btnTimetableGenerate);
		
		
		JButton btnHome = new JButton("Home");
		btnHome.setHorizontalAlignment(SwingConstants.LEFT);
		btnHome.setIcon(new ImageIcon(home_logo));
		btnHome.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Home home = new Home();
				home.main(null);
				staticFrame.dispose();
				
			}
		});
		btnHome.setBounds(0, 13, 262, 33);
		panel_1.add(btnHome);
		btnHome.setForeground(new Color(255, 255, 255));
		btnHome.setBackground(new Color(0, 139, 139));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		
		/*
		 * JLabel lbli = new JLabel("New label"); lbli.setBounds(0, 13, 264, 256);
		 * ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png/"));
		 * lbli.setIcon(image); panel_1.add(lbli);
		 */
		
		JLabel lblNewLabel_1 = new JLabel(" Statistics");
		lblNewLabel_1.setForeground(new Color(32, 178, 170));
		lblNewLabel_1.setBackground(new Color(32, 178, 170));
		lblNewLabel_1.setBounds(262, 69, 1082, 36);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		staticFrame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 108, 1082, 14);
		separator.setForeground(new Color(32, 178, 170));
		separator.setBackground(new Color(0, 139, 139));
		staticFrame.getContentPane().add(separator);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(272, 115, 1072, 556);
		staticFrame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel staticpanel_3 = new JPanel();
		staticpanel_3.setForeground(Color.WHITE);
		staticpanel_3.setBounds(80, 26, 913, 509);
		panel_2.add(staticpanel_3);
		staticpanel_3.setLayout(null);
		
		JLabel staticlblNewLabel = new JLabel("Registered Lecturers");
		staticlblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		staticlblNewLabel.setBounds(79, 37, 141, 44);
		staticpanel_3.add(staticlblNewLabel);
		
		JLabel staticlblNewLabel_2 = new JLabel("Registered "
				+ "Students");
		staticlblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		staticlblNewLabel_2.setBounds(79, 91, 141, 37);
		staticpanel_3.add(staticlblNewLabel_2);
		
		JLabel staticlblNewLabel_3 = new JLabel("Registered Subjects");
		staticlblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		staticlblNewLabel_3.setBounds(548, 53, 134, 13);
		staticpanel_3.add(staticlblNewLabel_3);
		
		JLabel staticlblNewLabel_4 = new JLabel("Registered Rooms");
		staticlblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		staticlblNewLabel_4.setBounds(548, 103, 134, 13);
		staticpanel_3.add(staticlblNewLabel_4);
		
		statictextField = new JTextField();
		statictextField.setFont(new Font("Tahoma", Font.BOLD, 18));
		statictextField.setForeground(new Color(255, 255, 255));
		statictextField.setBackground(new Color(0, 206, 209));
		statictextField.setBounds(333, 46, 61, 29);
		statictextField.setEditable(false);
		staticpanel_3.add(statictextField);
		statictextField.setColumns(10);
		
		statictextField_1 = new JTextField();
		statictextField_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		statictextField_1.setBackground(new Color(0, 206, 209));
		statictextField_1.setForeground(new Color(255, 255, 255));
		statictextField_1.setColumns(10);
		statictextField_1.setBounds(333, 96, 61, 29);
		statictextField_1.setEditable(false);
		staticpanel_3.add(statictextField_1);
		
		statictextField_2 = new JTextField();
		statictextField_2.setForeground(new Color(255, 255, 255));
		statictextField_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		statictextField_2.setBackground(new Color(0, 206, 209));
		statictextField_2.setColumns(10);
		statictextField_2.setBounds(746, 44, 61, 29);
		statictextField_2.setEditable(false);
		staticpanel_3.add(statictextField_2);
		
		statictextField_3 = new JTextField();
		statictextField_3.setBackground(new Color(0, 206, 209));
		statictextField_3.setForeground(new Color(255, 255, 255));
		statictextField_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		statictextField_3.setColumns(10);
		statictextField_3.setBounds(746, 94, 61, 29);
		statictextField_3.setEditable(false);
		staticpanel_3.add(statictextField_3);
		
		JPanel staticpanel_4 = new JPanel();
		staticpanel_4.setBackground(new Color(128, 128, 128));
		staticpanel_4.setBounds(79, 224, 380, 259);
		staticpanel_3.add(staticpanel_4);
		staticpanel_4.setLayout(new BoxLayout(staticpanel_4, BoxLayout.X_AXIS));
		
		JButton btnGraphButton = new JButton("Graph");
		btnGraphButton.setForeground(new Color(255, 255, 255));
		btnGraphButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGraphButton.setBackground(new Color(0, 139, 139));
		btnGraphButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultCategoryDataset dataset = new DefaultCategoryDataset();

				 dataset.setValue(gSum1 , "Lecturer", "Lecturer");
				 dataset.setValue(gSum2 , "No.Of Students", "Student");
				 dataset.setValue(gSum3 , "Subjects", "Subjects");
				 dataset.setValue(gSum4 , "Rooms", "Rooms");
				
				 
				 JFreeChart chart = ChartFactory.createBarChart3D("Statistics of the System", " ", "Total", dataset,
						 PlotOrientation.VERTICAL,false,true,false);
				 
				 chart.setBackgroundPaint(Color.GRAY);
				 chart.getTitle().setPaint(Color.WHITE);
				 
				 
				 CategoryPlot p = chart.getCategoryPlot();
				 p.setRangeGridlinePaint(Color.white);
				 
				 ChartPanel chartPanel = new ChartPanel(chart);
				 staticpanel_4.removeAll();
				 staticpanel_4.add(chartPanel, BorderLayout.CENTER);
				 staticpanel_4.validate();
				 
				/* ChartFrame frame1 = new ChartFrame("Statistics", chart);
	
				frame1.setVisible(true);
				frame1.setSize(500, 700);*/
			
			}
		});
		btnGraphButton.setBounds(79, 161, 105, 31);
		staticpanel_3.add(btnGraphButton);
		
		JPanel staticpanel_5 = new JPanel();
		staticpanel_5.setBackground(new Color(128, 128, 128));
		staticpanel_5.setBounds(539, 224, 340, 259);
		staticpanel_3.add(staticpanel_5);
		staticpanel_5.setLayout(null);
		
		JLabel staticlblNewLabel_5 = new JLabel("What is New?");
		staticlblNewLabel_5.setForeground(new Color(255, 255, 255));
		staticlblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		staticlblNewLabel_5.setBounds(10, 21, 99, 13);
		staticpanel_5.add(staticlblNewLabel_5);
		
		JLabel staticlblNewLabel_6 = new JLabel("Lecturer");
		staticlblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		staticlblNewLabel_6.setBounds(35, 73, 65, 13);
		staticpanel_5.add(staticlblNewLabel_6);
		
		JLabel staticlblNewLabel_7 = new JLabel("Subject");
		staticlblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		staticlblNewLabel_7.setBounds(35, 124, 65, 13);
		staticpanel_5.add(staticlblNewLabel_7);
		
		JLabel staticlblNewLabel_8 = new JLabel("Group");
		staticlblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		staticlblNewLabel_8.setBounds(35, 179, 45, 13);
		staticpanel_5.add(staticlblNewLabel_8);
		
		statictextField_4 = new JTextField();
		statictextField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		statictextField_4.setBounds(110, 70, 220, 19);
		statictextField_4.setEditable(false);
		staticpanel_5.add(statictextField_4);
		statictextField_4.setColumns(10);
		
		statictextField_5 = new JTextField();
		statictextField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		statictextField_5.setBounds(110, 121, 220, 19);
		statictextField_5.setEditable(false);
		staticpanel_5.add(statictextField_5);
		statictextField_5.setColumns(10);
		
		statictextField_6 = new JTextField();
		statictextField_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		statictextField_6.setBounds(110, 176, 220, 19);
		statictextField_6.setEditable(false);
		staticpanel_5.add(statictextField_6);
		statictextField_6.setColumns(10);
		
		
		
		setData();
		setLatestData();
	}
}
