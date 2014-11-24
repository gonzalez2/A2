import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window2 extends JFrame {

	private JPanel contentPane;
	private JTextField tfFollow;
	private JTextField textField_1;
	private JTextField tfPost;
	private JTextField textField_3;
	private TwitterAccount Cesar = new TwitterAccount();
	
	public Window2() {
		setBounds(100, 100, 399, 464);
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfFollow = new JTextField();
		tfFollow.setBounds(10, 24, 160, 39);
		contentPane.add(tfFollow);
		tfFollow.setColumns(10);
		
		//This button was to use the GroupComponent class
		//To keep groups and users associated with that group together
		JButton btnFollow = new JButton("<<");
		btnFollow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnFollow.setBounds(186, 24, 81, 39);
		contentPane.add(btnFollow);
		
		JLabel lblNewLabel = new JLabel("Follow User");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(277, 24, 102, 39);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 74, 358, 131);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		tfPost = new JTextField();
		tfPost.setBounds(10, 216, 160, 39);
		contentPane.add(tfPost);
		tfPost.setColumns(10);
		
		//Was trying to use the Observer Pattern here.
		//Could not make it work
		JButton btnPostTweet = new JButton("<<");
		btnPostTweet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cesar.notifyFollowers(tfPost.getText());
			}
		});
		btnPostTweet.setBounds(186, 216, 74, 39);
		contentPane.add(btnPostTweet);
		
		JLabel lblNewLabel_1 = new JLabel("Post Tweet");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(274, 215, 83, 39);
		contentPane.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 279, 358, 131);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		
	}
}
