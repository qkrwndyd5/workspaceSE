package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class FlowLayoutMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowLayoutMain frame = new FlowLayoutMain();
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
	public FlowLayoutMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("first");
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("second");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("third");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("fours");
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("fifth");
		contentPane.add(btnNewButton_4);
	}

}
