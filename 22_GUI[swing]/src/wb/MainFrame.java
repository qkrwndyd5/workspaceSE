package wb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.Font;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel label = new JLabel("아이디");
	private final JLabel label_1 = new JLabel("패스워드");
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ITWILL\\Desktop\\pin.png"));
		setTitle("나의첫번째프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 328);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(140, 147, 181));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		label.setBounds(64, 68, 58, 15);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBounds(83, 238, 85, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setToolTipText("아이디를입력하세요");
		textField.setBounds(168, 65, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		label_1.setBounds(64, 147, 58, 15);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 144, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(283, 238, 85, 23);
		contentPane.add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("아이디저장");
		chckbxNewCheckBox.setFont(new Font("D2Coding", Font.BOLD, 13));
		chckbxNewCheckBox.setBounds(67, 194, 116, 15);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("자동로그인");
		chckbxNewCheckBox_1.setFont(new Font("D2Coding", Font.BOLD, 13));
		chckbxNewCheckBox_1.setBounds(261, 194, 116, 15);
		contentPane.add(chckbxNewCheckBox_1);
	}
}
