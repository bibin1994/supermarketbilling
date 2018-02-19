package org.bibin.pages;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.bcel.internal.generic.LLOAD;

import javax.swing.BoxLayout;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class ProductAdd extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable finalpurchase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductAdd frame = new ProductAdd();
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
	public ProductAdd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 423);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.textHighlight);
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 405, 191);
		panel.setBorder(null);
		panel.setBackground(SystemColor.textInactiveText);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel productid = new JLabel("Product Id");
		productid.setFont(new Font("Tahoma", Font.PLAIN, 13));
		productid.setForeground(new Color(0, 255, 255));
		productid.setBackground(new Color(0, 255, 255));
		productid.setBounds(24, 26, 66, 14);
		panel.add(productid);
		
		JLabel quantity = new JLabel("No Product");
		quantity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		quantity.setForeground(new Color(0, 255, 255));
		quantity.setBounds(24, 68, 77, 14);
		panel.add(quantity);
		
		JTextPane proid = new JTextPane();
		proid.setBounds(183, 20, 153, 20);
		panel.add(proid);
		
		JTextPane prono = new JTextPane();
		prono.setBounds(183, 68, 153, 20);
		panel.add(prono);
		
		JButton add = new JButton("ADD ");
//		add.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				String s=proid.getText();
//				prono.getText();
//			ll.setText(s);
//			}
//		});
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String s=proid.getText();
				prono.getText();
			
			}
		});
		add.setBounds(37, 121, 95, 23);
		panel.add(add);
		
		JButton cancel = new JButton("CANCEL");
		
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				proid.setText("");
				prono.setText("");
				
			}
		});
		cancel.setBounds(212, 121, 89, 23);
		panel.add(cancel);
		
		JPanel resultpanel = new JPanel();
		resultpanel.setBackground(SystemColor.activeCaption);
		resultpanel.setBounds(5, 201, 405, 173);
		contentPane.add(resultpanel);
		resultpanel.setLayout(null);
		
		JLabel resid = new JLabel("ID");
		resid.setHorizontalAlignment(SwingConstants.CENTER);
		resid.setBounds(22, 23, 67, 26);
		resultpanel.add(resid);
		
		
		
		JLabel resname = new JLabel("Name");
		resname.setBounds(169, 29, 46, 14);
		resultpanel.add(resname);
		
		JLabel resrate = new JLabel("Price");
		resrate.setHorizontalAlignment(SwingConstants.CENTER);
		resrate.setBounds(298, 29, 46, 14);
		resultpanel.add(resrate);
		
		textField = new JTextField();
		textField.setBounds(3, 60, 103, 20);
		resultpanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(126, 60, 127, 20);
		resultpanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(298, 60, 76, 20);
		resultpanel.add(textField_2);
		
		JLabel resdiscount = new JLabel("Discount");
		resdiscount.setBounds(26, 101, 46, 14);
		resultpanel.add(resdiscount);
		
		JLabel restotal = new JLabel("Total Amount");
		restotal.setBounds(126, 101, 83, 14);
		resultpanel.add(restotal);
		
		textField_3 = new JTextField();
		textField_3.setBounds(3, 126, 76, 20);
		resultpanel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(115, 126, 83, 20);
		resultpanel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton finalsubmit = new JButton("Submit");
		finalsubmit.setBounds(218, 125, 89, 23);
		resultpanel.add(finalsubmit);
		
		JButton finalcancel = new JButton("Cancel");
		finalcancel.setBounds(317, 125, 78, 23);
		resultpanel.add(finalcancel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(420, 11, 484, 363);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel custname = new JLabel("Cust Name");
		custname.setBounds(10, 11, 63, 14);
		panel_1.add(custname);
		
		textField_5 = new JTextField();
		textField_5.setBounds(83, 8, 149, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel phone = new JLabel("Mobileno");
		phone.setBounds(284, 11, 46, 14);
		panel_1.add(phone);
		
		textField_6 = new JTextField();
		textField_6.setBounds(340, 8, 134, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		finalpurchase = new JTable();
		JScrollPane scrollPane = new JScrollPane(finalpurchase);
		scrollPane.setBounds(21, 52, 384, 223);
		panel_1.add(scrollPane);
		finalpurchase.setForeground(SystemColor.inactiveCaptionText);
		finalpurchase.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Id", "Name", "Price Each", "Discount", "Cost"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				String.class, String.class, Double.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		finalpurchase.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		finalpurchase.setAlignmentX(Component.LEFT_ALIGNMENT);
		finalpurchase.setBounds(446, 52, -421, 235);

		

		
	
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
