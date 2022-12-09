package basic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class ChildJFrameWB extends JFrame {

	private JPanel contentPane;
	private JButton okBtn;
	private JButton cancleBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChildJFrameWB frame = new ChildJFrameWB();
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
	public ChildJFrameWB() {
		setTitle("나의첫번째윈도우빌더프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		okBtn = new JButton("확인");
		okBtn.setBounds(36, 64, 72, 36);
		contentPane.add(okBtn);
		
		cancleBtn = new JButton("취소");
		cancleBtn.setBounds(174, 64, 72, 36);
		contentPane.add(cancleBtn);
	}
}
