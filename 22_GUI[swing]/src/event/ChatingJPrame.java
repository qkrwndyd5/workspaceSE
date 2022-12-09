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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		panel_1.add(chatTf);
		chatTf.setColumns(23);
		
		sendBtn = new JButton("전송");
		sendBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(sendBtn);
		
		chatTa = new JTextArea();
		
		chatTa.setText("이따만나\r\n알겠어!");
		contentPane.add(chatTa, BorderLayout.CENTER);
		
		/*
		 * 이벤트쏘스에 이벤트핸들러객체등록
		 */
		ChatSendButtonActionEventHandler handler=
				new ChatSendButtonActionEventHandler();
		sendBtn.addActionListener(handler);
		
	}

}
