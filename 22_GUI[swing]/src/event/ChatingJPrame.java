package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatingJPrame extends JFrame {

	private JPanel contentPane;
	private JButton sendBtn;
	private JTextArea chatTa;
	private JTextField chatTf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatingJPrame frame = new ChatingJPrame();
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
	public ChatingJPrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				/*
				exit = Terminates the currently running Java Virtual Machine.
				 */
				System.exit(0);
				
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 393, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("핀셋");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ITWILL\\Desktop\\pin.png"));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(206, 255, 206));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		chatTf = new JTextField();
		chatTf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					/*
					 * frame의 TextField와 TextArea에 접근해야함
					 */
					String chatStr=chatTf.getText();
					chatTf.setText("");
					chatTa.append(chatStr+"\n");
					chatTf.requestFocus();
				
			}
		});
		panel_1.add(chatTf);
		chatTf.setColumns(23);
		
		sendBtn = new JButton("전송");
		sendBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(sendBtn);
		
		chatTa = new JTextArea();
		chatTa.setEditable(false);
		
		chatTa.setText("이따만나\r\n알겠어!\n");
		contentPane.add(chatTa, BorderLayout.CENTER);
		
		/*
		 * 이벤트쏘스에 이벤트핸들러객체등록
		 */
		ChatSendButtonActionEventHandler handler=
				new ChatSendButtonActionEventHandler();
		sendBtn.addActionListener(handler);
		
	}//생성자
	
	/*************Inner class***************/
	public class ChatSendButtonActionEventHandler 
	implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("send button click~~");
		/*
		 * frame의 TextField와 TextArea에 접근해야함
		 */
		String chatStr=chatTf.getText();
		chatTf.setText("");
		chatTa.append(chatStr+"\n");
		chatTf.requestFocus();
	}

}

}
