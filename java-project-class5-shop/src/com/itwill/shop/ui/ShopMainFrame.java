package com.itwill.shop.ui;

import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Cursor;
import javax.swing.JTabbedPane;

public class ShopMainFrame extends javax.swing.JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMainFrame frame = new ShopMainFrame();
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
	public ShopMainFrame() {
		setDefaultCloseOperation(ShopMainFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		

		
		JPanel globalSouthMenuPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) globalSouthMenuPanel.getLayout();
		flowLayout.setHgap(20);
		globalSouthMenuPanel.setBackground(new Color(255, 255, 255));
		contentPane.add(globalSouthMenuPanel, BorderLayout.SOUTH);
		
		JButton globalSerchMenuButton = new JButton("");
		globalSerchMenuButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalSerchMenuButton.setBorderPainted(false);
		globalSerchMenuButton.setOpaque(false);
		globalSerchMenuButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/search_dog50.png")));
		globalSouthMenuPanel.add(globalSerchMenuButton);
		
		JButton globalHomeButton = new JButton("");
		globalHomeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalHomeButton.setOpaque(false);
		globalHomeButton.setBorderPainted(false);
		globalHomeButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/user.png")));
		globalSouthMenuPanel.add(globalHomeButton);
		
		JButton globalMemberButton = new JButton("");
		globalMemberButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalMemberButton.setBorderPainted(false);
		globalMemberButton.setOpaque(false);
		globalMemberButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/cart50.png")));
		globalSouthMenuPanel.add(globalMemberButton);
		
		JTabbedPane shoptabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(shoptabbedPane, BorderLayout.CENTER);
		
		JTabbedPane producttabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shoptabbedPane.addTab("제품", null, producttabbedPane, null);
		
		PopularProductPanel popularProductPanel = new PopularProductPanel();
		producttabbedPane.addTab("인기제품", null, popularProductPanel, null);
		
		JTabbedPane membertabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shoptabbedPane.addTab("회원", null, membertabbedPane, null);
		
		MemberJoinPanel memberJoinPanel = new MemberJoinPanel();
		membertabbedPane.addTab("가입", null, memberJoinPanel, null);
	}

}
