package com.itwill.member.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.member.Member;
import com.itwill.member.MemberService;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class MemberMainFrame extends JFrame {
	/***************1.MemberService멤버필드선언*****************/
	private MemberService memberService;
	
	/***************로그인한회원*****************/
	private Member loginMember = null;
	
	private int selected_index = 0;
	
	private JPanel contentPane;
	private JTextField idTF;
	private JPasswordField passTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JComboBox ageCB;
	private JCheckBox marriedCK;
	private JLabel idMsgLB;
	private JTextField loginidTF;
	private JPasswordField loginpassTF;
	private JTextField infoidTF;
	private JPasswordField infopassTF;
	private JTextField infonameTF;
	private JTextField infoaddressTF;
	private JTabbedPane MembertabbedPane;
	private JComboBox infoageCB;
	private JCheckBox infomarriedCK;
	private JMenuItem loginMenuItem;
	private JMenuItem joinMenuItem;
	private JMenuItem logoutMenuItem;
	private JButton updateFormBTN;
	private JButton updateBTN;
	private JTable memberListTB;
	private JButton memberDeleteBTN;
	private JList memberListLt;
	private JComboBox memberListCB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMainFrame frame = new MemberMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MemberMainFrame() {
		setTitle("회원관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 507);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu memberMenu = new JMenu("회원");
		menuBar.add(memberMenu);
		
		loginMenuItem = new JMenuItem("로그인");
		loginMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MembertabbedPane.setSelectedIndex(1);
			}
		});
		memberMenu.add(loginMenuItem);
		
		joinMenuItem = new JMenuItem("가입");
		joinMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MembertabbedPane.setSelectedIndex(2);
			}
		});
		memberMenu.add(joinMenuItem);
		
		logoutMenuItem = new JMenuItem("로그아웃");
		logoutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logoutProcess();
			}
		});
		memberMenu.add(logoutMenuItem);
		
		JSeparator separator = new JSeparator();
		memberMenu.add(separator);
		
		JMenuItem exitMenuItem = new JMenuItem("종료");
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		memberMenu.add(exitMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		MembertabbedPane = new JTabbedPane(JTabbedPane.TOP);
		MembertabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int seletedTabIndex = MembertabbedPane.getSelectedIndex();
				if(seletedTabIndex==4) {
					displayMemberList();
				}
			}
		});
		contentPane.add(MembertabbedPane, BorderLayout.CENTER);
		
		JPanel MembermainPanel = new JPanel();
		MembertabbedPane.addTab("회원메인", null, MembermainPanel, null);
		MembermainPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel membermainLB = new JLabel("");
		membermainLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(loginMember==null) {
					MembertabbedPane.setSelectedIndex(1);
				}else {
					MembertabbedPane.setSelectedIndex(3);
				}
			}
		});
		membermainLB.setHorizontalAlignment(SwingConstants.CENTER);
		membermainLB.setIcon(new ImageIcon(MemberMainFrame.class.getResource("/images/album.jpg")));
		MembermainPanel.add(membermainLB, BorderLayout.CENTER);
		
		JPanel MemberloginPanel = new JPanel();
		MemberloginPanel.setBackground(Color.PINK);
		MemberloginPanel.setForeground(Color.BLACK);
		MembertabbedPane.addTab("회원로그인", null, MemberloginPanel, null);
		MemberloginPanel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("아이디");
		lblNewLabel_6.setBounds(31, 111, 57, 15);
		MemberloginPanel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("패스워드");
		lblNewLabel_7.setBounds(31, 184, 57, 15);
		MemberloginPanel.add(lblNewLabel_7);
		
		loginidTF = new JTextField();
		loginidTF.setBounds(141, 108, 116, 21);
		MemberloginPanel.add(loginidTF);
		loginidTF.setColumns(10);
		
		loginpassTF = new JPasswordField();
		loginpassTF.setBounds(141, 181, 116, 21);
		MemberloginPanel.add(loginpassTF);
		
		JButton loginBTN = new JButton("로그인");
		loginBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/************회원로그인***************/
				try {
					String id = loginidTF.getText();
					String pass = new String(loginpassTF.getPassword());
					
					int result = memberService.login(id, pass);
					if(result==0) {
						//로그인성공
						loginProcess(id);
						loginidTF.setText("");
						loginpassTF.setText("");
						
					}else {
						JOptionPane.showConfirmDialog(null, "아이디 또는 비밀번호를 확인하세요");
						loginidTF.setSelectionStart(0);
						loginidTF.setSelectionEnd(id.length());
						loginidTF.requestFocus();
					}
					
				}catch (Exception e1) {
					
				}
			}
		});
		loginBTN.setBounds(45, 262, 97, 23);
		MemberloginPanel.add(loginBTN);
		
		JButton joinBTN = new JButton("회원가입");
		joinBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MembertabbedPane.setSelectedIndex(1);
			}
		});
		joinBTN.setBounds(154, 262, 97, 23);
		MemberloginPanel.add(joinBTN);
		
		JPanel MemberJoinPanel = new JPanel();
		MemberJoinPanel.setBackground(new Color(240, 255, 238));
		MembertabbedPane.addTab("회원가입", null, MemberJoinPanel, null);
		MemberJoinPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(40, 55, 57, 15);
		MemberJoinPanel.add(lblNewLabel);
		
		idTF = new JTextField();
		idTF.setBounds(143, 52, 116, 21);
		MemberJoinPanel.add(idTF);
		idTF.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(40, 111, 57, 15);
		MemberJoinPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(40, 168, 57, 15);
		MemberJoinPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(40, 220, 57, 15);
		MemberJoinPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("나이");
		lblNewLabel_4.setBounds(40, 271, 57, 15);
		MemberJoinPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("결혼여부");
		lblNewLabel_5.setBounds(40, 323, 57, 15);
		MemberJoinPanel.add(lblNewLabel_5);
		
		passTF = new JPasswordField();
		passTF.setBounds(143, 108, 116, 21);
		MemberJoinPanel.add(passTF);
		
		nameTF = new JTextField();
		nameTF.setBounds(143, 162, 116, 21);
		MemberJoinPanel.add(nameTF);
		nameTF.setColumns(10);
		
		addressTF = new JTextField();
		addressTF.setBounds(143, 214, 116, 21);
		MemberJoinPanel.add(addressTF);
		addressTF.setColumns(10);
		
		ageCB = new JComboBox();
		ageCB.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34"}));
		ageCB.setBounds(143, 267, 116, 23);
		MemberJoinPanel.add(ageCB);
		
		marriedCK = new JCheckBox("");
		marriedCK.setBounds(143, 315, 27, 23);
		MemberJoinPanel.add(marriedCK);
		
		JButton memberjoinBTN = new JButton("가입");
		memberjoinBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***************회원가입**************/
				try {
					/******TextField로 부터 데이타얻기*****/
					String id = idTF.getText();
					String password = new String(passTF.getPassword());
					String name = nameTF.getText();
					String address = addressTF.getText();
					/*********유효성체크**********/
					if(id.equals("")) {
						idMsgLB.setText("아이디를 입력하세요.");
						idTF.requestFocus();
						return;
					}
					String ageStr = (String)ageCB.getSelectedItem();
					int age = Integer.parseInt(ageStr);
					String married = "";
					if(marriedCK.isSelected()) {
						married="T";
					}else {
						married="F";
					}
					
					
					Member newMember = new Member(id,password,name,address,age,married,null);
					boolean isAdd = memberService.addMember(newMember);
					if(isAdd) {
						//로그인화면전환
						
					}else {
						JOptionPane.showMessageDialog(null, "이미사용하고있는 아이디입니다.");
						idTF.requestFocus();
						idTF.setSelectionStart(0);
						idTF.setSelectionEnd(id.length());
					}
					
				}catch(Exception e1) {
					System.out.println("회원가입-->"+e1.getMessage());
				}
			}
		});
		memberjoinBTN.setBounds(36, 373, 97, 23);
		MemberJoinPanel.add(memberjoinBTN);
		
		JButton membercancleBTN = new JButton("취소");
		membercancleBTN.setBounds(162, 373, 97, 23);
		MemberJoinPanel.add(membercancleBTN);
		
		idMsgLB = new JLabel("");
		idMsgLB.setForeground(Color.RED);
		idMsgLB.setBounds(143, 83, 147, 15);
		MemberJoinPanel.add(idMsgLB);
		
		JPanel MemberinfoPanel = new JPanel();
		MemberinfoPanel.setBackground(Color.LIGHT_GRAY);
		MembertabbedPane.addTab("회원정보", null, MemberinfoPanel, null);
		MemberinfoPanel.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("아이디");
		lblNewLabel_8.setBounds(41, 32, 57, 15);
		MemberinfoPanel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_1_1 = new JLabel("패스워드");
		lblNewLabel_1_1.setBounds(41, 84, 57, 15);
		MemberinfoPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(41, 141, 57, 15);
		MemberinfoPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("주소");
		lblNewLabel_3_1.setBounds(41, 190, 57, 15);
		MemberinfoPanel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("나이");
		lblNewLabel_4_1.setBounds(41, 242, 57, 15);
		MemberinfoPanel.add(lblNewLabel_4_1);
		
		infoidTF = new JTextField();
		infoidTF.setEnabled(false);
		infoidTF.setColumns(10);
		infoidTF.setBounds(144, 29, 116, 21);
		MemberinfoPanel.add(infoidTF);
		
		infopassTF = new JPasswordField();
		infopassTF.setEditable(false);
		infopassTF.setBounds(144, 81, 116, 21);
		MemberinfoPanel.add(infopassTF);
		
		infonameTF = new JTextField();
		infonameTF.setEditable(false);
		infonameTF.setColumns(10);
		infonameTF.setBounds(144, 135, 116, 21);
		MemberinfoPanel.add(infonameTF);
		
		infoaddressTF = new JTextField();
		infoaddressTF.setEditable(false);
		infoaddressTF.setColumns(10);
		infoaddressTF.setBounds(144, 187, 116, 21);
		MemberinfoPanel.add(infoaddressTF);
		
		infoageCB = new JComboBox();
		infoageCB.setEnabled(false);
		infoageCB.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34"}));
		infoageCB.setBounds(144, 238, 116, 23);
		MemberinfoPanel.add(infoageCB);
		
		JLabel lblNewLabel_5_1 = new JLabel("결혼여부");
		lblNewLabel_5_1.setBounds(41, 294, 57, 15);
		MemberinfoPanel.add(lblNewLabel_5_1);
		
		infomarriedCK = new JCheckBox("");
		infomarriedCK.setEnabled(false);
		infomarriedCK.setBounds(144, 286, 27, 23);
		MemberinfoPanel.add(infomarriedCK);
		
		updateFormBTN = new JButton("수정폼");
		updateFormBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnText = updateFormBTN.getText();
				if(btnText.equals("수정폼")) {
				updateFormEnable(true);
			}else if(btnText.equals("수정취소")) {
				displayMemberInfo(loginMember);
				updateFormEnable(false);
			}
				
			}
		});
		updateFormBTN.setBounds(45, 339, 97, 23);
		MemberinfoPanel.add(updateFormBTN);
		
		updateBTN = new JButton("수정");
		updateBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/******** 회원수정 *********/
				try {
				/******TextField로 부터 데이타얻기*****/
				String id = infoidTF.getText();
				String password = new String(infopassTF.getPassword());
				String name = infonameTF.getText();
				String address = infoaddressTF.getText();
				
				String ageStr = (String)infoageCB.getSelectedItem();
				int age = Integer.parseInt(ageStr);
				String married = "";
				if(infomarriedCK.isSelected()) {
					married="T";
				}else {
					married="F";
				}								
				Member newMember = new Member(id,password,name,address,age,married,null);
				memberService.memberUpdate(newMember);
				loginMember = memberService.memberDetail(id);
				updateFormEnable(false);
			
			}catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
			}
		});
		updateBTN.setBounds(163, 339, 97, 23);
		MemberinfoPanel.add(updateBTN);
		
		JPanel MemberadminPanel = new JPanel();
		MembertabbedPane.addTab("회원관리", null, MemberadminPanel, null);
		MemberadminPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 337, 130);
		MemberadminPanel.add(scrollPane);
		
		memberListTB = new JTable();
		memberListTB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selected_index = memberListTB.getSelectedRow();			
				memberDeleteBTN.setEnabled(true);
				
			}
		});
		memberListTB.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"\uC544\uC774\uB514", "\uD328\uC2A4\uC6CC\uB4DC", "\uC774\uB984", "\uC8FC\uC18C", "\uB098\uC774", "\uACB0\uD63C\uC5EC\uBD80", "\uB4F1\uB85D\uC77C"
			}
		) {
			Class[] columnTypes = new Class[] {
				Long.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(memberListTB);
		
		memberListCB = new JComboBox();
		memberListCB.setModel(new DefaultComboBoxModel(new String[] {"김김김", "강강강", "박박박", "이이이", "최최최"}));
		memberListCB.setBounds(174, 202, 175, 23);
		MemberadminPanel.add(memberListCB);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(22, 202, 107, 172);
		MemberadminPanel.add(scrollPane_1);
		
		memberListLt = new JList();
		memberListLt.setModel(new AbstractListModel() {
			String[] values = new String[] {"김김김", "강강강", "박박박", "이이이", "최최최", "김김김", "강강강", "박박박", "이이이", "최최최", "김김김", "강강강", "박박박"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(memberListLt);
		
		JButton memberListBTN = new JButton("회원리스트보기");
		memberListBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		memberListBTN.setBounds(39, 150, 137, 23);
		MemberadminPanel.add(memberListBTN);
		
		memberDeleteBTN = new JButton("회원삭제");
		memberDeleteBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int selectedRow = memberListTB.getSelectedRow();
					if(selected_index >=0 ) {
						String selectedId = (String)memberListTB.getValueAt(selectedRow, 0);
						memberService.memberDelete(selectedId);
						displayMemberList();
					}else {
						memberDeleteBTN.setEnabled(false);
					}
				}catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		memberDeleteBTN.setEnabled(false);
		memberDeleteBTN.setBounds(209, 150, 123, 23);
		MemberadminPanel.add(memberDeleteBTN);
		
		
		/*******************2.MemberService멤버필드 객체생성********************/
		memberService = new MemberService();
		logoutProcess();
		
	}//생성자끝
	
	/********************************************/
	private void displayMemberList() {
	
	try {
		List<Member> memberList = memberService.memberList();
		/*************회원리스트보기*************/
		Vector columVector = new Vector();
		columVector.add("아이디");
		columVector.add("패스워드");
		columVector.add("이름");
		columVector.add("주소");
		columVector.add("나이");
		columVector.add("결혼여부");
		columVector.add("가입일");
		
		Vector tableVector = new Vector();
		
		for(Member member:memberList) {
			Vector rowVector = new Vector();						
			rowVector.add(member.getM_id());
			rowVector.add(member.getM_password());
			rowVector.add(member.getM_name());
			rowVector.add(member.getM_address());
			rowVector.add(member.getM_age());
			rowVector.add(member.getM_married());
			rowVector.add(member.getM_regdate());
			
			tableVector.add(rowVector);
		}
		DefaultTableModel tableModel = 
				new DefaultTableModel(tableVector, columVector);
		
		memberListTB.setModel(tableModel);
		memberDeleteBTN.setEnabled(false);
		
		/***************회원리스트보기[JList]****************/
		DefaultListModel listModel = new DefaultListModel();
		for(Member member:memberList) {
			listModel.addElement(member.getM_id());
		}
		
		memberListLt.setModel(listModel);
		/***************회원리스트보기[JCombobox]************/
		DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
		for(Member member:memberList) {
			comboBoxModel.addElement(member.getM_name()+"["+member.getM_id()+"]");
		}
		
		
	}catch(Exception e1) {
		System.out.println(e1.getMessage());
	}
}	
	
	/************회원수정폼활성화 불활성화***************/
	private void updateFormEnable(boolean b) {
		if(b) {
			//활성화
			//infoidTF.setEnabled(true);
			//infopassTF.setEnabled(true);
			infonameTF.setEditable(true);
			infoaddressTF.setEditable(true);
			infoageCB.setEnabled(true);
			infomarriedCK.setEnabled(true);
			
			updateFormBTN.setText("수정취소");
			updateBTN.setEnabled(true);
		}else {
			//불활성화
			infoidTF.setEnabled(false);
			infopassTF.setEnabled(false);
			infonameTF.setEditable(false);
			infoaddressTF.setEditable(false);
			infoageCB.setEnabled(false);
			infomarriedCK.setEnabled(false);
			
			updateFormBTN.setText("수정폼");
			updateBTN.setEnabled(false);
		}
	}
	
	
	/************로그아웃시 호출할메쏘드***************/
	private void logoutProcess() {
		/************로그아웃시 해야할일*************
		  1.로그인성공한 멤버객체 멤버필드에서제거
		  2.MemberMainFrame타이틀변경
		  3.로그인탭,회원가입탭 활성화, 회원정보탭 불활성화, 
		    로그아웃메뉴아이템 불활성화, 로그인,회원가입 메뉴아이템 활성화
		  4.메인 화면전환
		***********************************************/
		this.loginMember=null;
		setTitle("회원관리");
		
		MembertabbedPane.setEnabledAt(1, true);
		MembertabbedPane.setEnabledAt(2, true);
		MembertabbedPane.setEnabledAt(3, false);
		loginMenuItem.setEnabled(true);
		joinMenuItem.setEnabled(true);
		logoutMenuItem.setEnabled(false);
		
		MembertabbedPane.setSelectedIndex(0);
		
		
	}
	/************로그인성공시 호출할메쏘드*************/
	private void loginProcess(String id) throws Exception{
		/************로그인성공시 해야할일*************
		  1.로그인성공한 멤버객체 멤버필드에저장
		  2.MemberMainFrame타이틀변경
		  3.로그인,회원가입탭 불활성화
		    로그인,회원가입 메뉴아이템 불활성화
		    로그아웃 메뉴아이템 활성화
		  4.회원정보보기 화면전환
		***********************************************/
		// 1.로그인성공한 멤버객체 멤버필드에저장
		this.loginMember = memberService.memberDetail(id);	
		// 2.MemberMainFrame타이틀변경
		setTitle(id+" 님 로그인");						
		// 3.로그인화면, 회원가입탭 불활성화
		MembertabbedPane.setEnabledAt(1, false);
		MembertabbedPane.setEnabledAt(2, false);
		MembertabbedPane.setEnabledAt(3, true);
		loginMenuItem.setEnabled(false);
		joinMenuItem.setEnabled(false);
		logoutMenuItem.setEnabled(true);
		
		
		// 4.회원정보보기화면전환
		MembertabbedPane.setSelectedIndex(3);
		displayMemberInfo(this.loginMember);
		updateFormEnable(false);
	}	
		
	private void displayMemberInfo(Member member) {    
		/*****회원상세데이타보여주기*****/		
		infoidTF.setText(loginMember.getM_id());
		infopassTF.setText(loginMember.getM_password());
		infonameTF.setText(loginMember.getM_name());
		infoaddressTF.setText(loginMember.getM_address());
		infoageCB.setSelectedItem(loginMember.getM_age()+"");
		if(loginMember.getM_married().equals("T")) {
			infomarriedCK.setSelected(true);			
		}else {
			infomarriedCK.setSelected(false);						
		}
	}	
}
