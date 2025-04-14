package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;



	/**
	 * Create the frame.
	 */
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 444, 302);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese un texto:");
		lblNewLabel_1.setFont(new Font("Unispace", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(21, 47, 169, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("ClipCopy");
		lblNewLabel.setBounds(150, 11, 96, 25);
		lblNewLabel.setFont(new Font("Unispace", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("El texto ingresado es:");
		lblNewLabel_1_1.setFont(new Font("Unispace", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(21, 180, 225, 14);
		panel.add(lblNewLabel_1_1);
		
		JButton btnCopy = new JButton("Copy! :)");
		btnCopy.setBackground(SystemColor.menu);
		btnCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto1 = text1.getText();
				text2.setText(texto1);
			}
		});
		btnCopy.setFont(new Font("Unispace", Font.PLAIN, 14));
		btnCopy.setBounds(271, 123, 117, 40);
		panel.add(btnCopy);
		
		text1 = new JTextField();
		text1.setFont(new Font("Unispace", Font.PLAIN, 14));
		text1.setBounds(21, 72, 346, 32);
		panel.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setFont(new Font("Unispace", Font.PLAIN, 14));
		text2.setColumns(10);
		text2.setBounds(21, 205, 346, 32);
		panel.add(text2);
		
		JButton btnClear = new JButton("Clear :D");
		btnClear.setBackground(SystemColor.menu);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText("");
				text2.setText("");
			}
		});
		btnClear.setFont(new Font("Unispace", Font.PLAIN, 14));
		btnClear.setBounds(271, 251, 117, 40);
		panel.add(btnClear);
	}
}
