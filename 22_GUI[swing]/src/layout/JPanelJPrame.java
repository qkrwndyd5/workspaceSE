package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class JPanelJPrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPanelJPrame frame = new JPanelJPrame();
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
	public JPanelJPrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"박주용", "김지훈", "최원석", "박형건", "이재민", "이종선", "안성원", "이승우", "최윤선", "김가영"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		contentPane.add(list, BorderLayout.WEST);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 64));
		contentPane.add(panel, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setColumns(30);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("검색");
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 255));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("회원로그인");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("회원리스트");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("회원상세보기");
		panel_1.add(btnNewButton_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(224, 209, 199));
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(51, 95, 57, 15);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(51, 178, 57, 15);
		panel_2.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(152, 92, 116, 21);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("로그인");
		btnNewButton_5.setBounds(27, 266, 97, 23);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("취소");
		btnNewButton_6.setBounds(171, 266, 97, 23);
		panel_2.add(btnNewButton_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(152, 175, 116, 21);
		panel_2.add(passwordField);
	}
}
