import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTree;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.Font;

public class AdminGUI {

	JFrame frame;
	private JTextField tfUser;
	private JTextField tfGroup;
	private static AdminGUI instance = null;

	private AdminGUI(){};
	public static AdminGUI getInstance(){
		if(instance == null){
			instance = new AdminGUI();
		}

		return instance;
	}
	void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.BLUE);
		frame.getContentPane().setForeground(Color.CYAN);
		frame.setBounds(100, 100, 564, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Add Group");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(429, 34, 109, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(" Add User");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(429, 66, 109, 17);
		frame.getContentPane().add(lblNewLabel_1);

		tfUser = new JTextField();
		tfUser.setBounds(288, 34, 125, 20);
		frame.getContentPane().add(tfUser);
		tfUser.setColumns(10);

		tfGroup = new JTextField();
		tfGroup.setBounds(288, 66, 126, 20);
		frame.getContentPane().add(tfGroup);
		tfGroup.setColumns(10);

		JTree treeWorld = new JTree();
		treeWorld.setModel(new DefaultTreeModel(
				new DefaultMutableTreeNode("Tree View") {
					{
						DefaultMutableTreeNode node_1;
						node_1 = new DefaultMutableTreeNode("Root");
						node_1.add(new DefaultMutableTreeNode("stu1 "));
						add(node_1);
						node_1 = new DefaultMutableTreeNode("CS356");
						node_1.add(new DefaultMutableTreeNode("stu1"));
						add(node_1);
						node_1 = new DefaultMutableTreeNode("CS356Seassion");
						node_1.add(new DefaultMutableTreeNode("stui"));
						add(node_1);
					}
				}
				));
		JLabel imessage = new JLabel("");
		imessage.setForeground(new Color(255, 51, 0));
		imessage.setBounds(191, 306, 304, 53);
		frame.getContentPane().add(imessage);	
		treeWorld.setBounds(10, 13, 169, 346);
		frame.getContentPane().add(treeWorld);

		//This Button adds a user name ----------------------------------------------------------------
		JButton addUserB = new JButton("<<");
		addUserB.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				imessage.setText("");
				DefaultTreeModel model = (DefaultTreeModel) treeWorld.getModel();
				DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
				if(!tfUser.getText().trim().equals("")){
					root.add(new DefaultMutableTreeNode(tfUser.getText()));
					model.reload();
				}
				else{imessage.setText("You must enter a User");}
			}
		});
		addUserB.setBounds(189, 31, 89, 23);
		frame.getContentPane().add(addUserB);

		//This Button adds a group Folder---------------------------------------------------------------
		JButton addGroupB = new JButton("<<");
		addGroupB.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				imessage.setText("");
				DefaultTreeModel model = (DefaultTreeModel) treeWorld.getModel();
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) treeWorld.getLastSelectedPathComponent();
				DefaultMutableTreeNode newGroup = new DefaultMutableTreeNode(tfGroup.getText());
				if(selectedNode!=null){
					if(!tfGroup.getText().trim().equals("")){
						model.insertNodeInto(newGroup, selectedNode, selectedNode.getChildCount());
					}
					else{imessage.setText("You must enter a User");}
				}
				else{imessage.setText("You must select a folder");}
			}
		});

		//This Button deletes a user or Group Folder-----------------------------------------------------
		JButton DeleteButton = new JButton("Delete");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				imessage.setText("");
				DefaultTreeModel model = (DefaultTreeModel) treeWorld.getModel();
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) treeWorld.getLastSelectedPathComponent();

				if(selectedNode == null){imessage.setText("You must select a folder to delete");}
				if(selectedNode.isRoot()){
					imessage.setText("You Cannot delete Root");
				}
				else{
					if(selectedNode != null){
						model.removeNodeFromParent(selectedNode);
					}
				}
			}
		});

		DeleteButton.setBounds(189, 99, 89, 23);
		frame.getContentPane().add(DeleteButton);

		addGroupB.setBounds(189, 65, 89, 23);
		frame.getContentPane().add(addGroupB);

		JButton btnNewButton = new JButton("Open User View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Window2 window2 = new Window2();
				window2.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton.setBounds(186, 133, 337, 30);
		frame.getContentPane().add(btnNewButton);

		JButton UserTotal = new JButton("User Total");
		UserTotal.setBounds(186, 197, 138, 36);
		frame.getContentPane().add(UserTotal);

		JButton GroupTotal = new JButton("Group Total");
		GroupTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GroupTotal.setBounds(346, 197, 138, 36);
		frame.getContentPane().add(GroupTotal);

		JButton MessagesTotal = new JButton("MessageTotal");
		MessagesTotal.setBounds(189, 244, 132, 44);
		frame.getContentPane().add(MessagesTotal);

		JButton PosPercent = new JButton("Positive Percent");
		PosPercent.setBounds(346, 244, 138, 44);
		frame.getContentPane().add(PosPercent);
	}
}
