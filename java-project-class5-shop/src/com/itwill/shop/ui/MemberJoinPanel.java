
package com.itwill.shop.ui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MemberJoinPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public MemberJoinPanel() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("가입");
		textField.setBounds(42, 312, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("취소");
		textField_1.setBounds(170, 312, 116, 21);
		add(textField_1);
		textField_1.setColumns(10);

	}
}

