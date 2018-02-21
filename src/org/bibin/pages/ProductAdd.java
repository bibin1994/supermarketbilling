package org.bibin.pages;

import org.bibin.bean.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.bcel.internal.generic.LLOAD;

import or.bibin.db.DbImplementation;

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
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

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
	
/**
 * 
 * User declartion
 * 
 * 	
 */
	
	 LinkedList<ProductDetails> list = new LinkedList<>();
	static LinkedList<FinalList> print=new LinkedList<>();
	DbImplementation db = null;
	static int no;
	
	static double final_amount;
	static double total_cost;
	static double discount_price;
	static int total_quantity;
	
	
/**
 * 
 * 
 * 
 * 	
 */
	
	
	
	private JPanel contentPane;
	private JTextField tempid;
	private JTextField tempname;
	private JTextField tempprice;
	private JTextField discount;
	private JTextField totalamount;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable finalpurchase;
	private JTextField totalquantity;
	private JTextField discountprice;
	private JTextField totalcost;

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
		setBounds(100, 100, 949, 423);
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
		// add.addMouseListener(new MouseAdapter() {
		// @Override
		// public void mouseClicked(MouseEvent e) {
		// String s=proid.getText();
		// prono.getText();
		// ll.setText(s);
		// }
		// });
	
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

		tempid = new JTextField();
		tempid.setBounds(3, 60, 103, 20);
		resultpanel.add(tempid);
		tempid.setColumns(10);
		tempid.setEditable(false);

		tempname = new JTextField();
		tempname.setColumns(10);
		tempname.setBounds(126, 60, 127, 20);
		resultpanel.add(tempname);
		tempname.setEditable(false);

		tempprice = new JTextField();
		tempprice.setColumns(10);
		tempprice.setBounds(278, 60, 96, 20);
		resultpanel.add(tempprice);
		tempprice.setEditable(false);

		JLabel resdiscount = new JLabel("Discount");
		resdiscount.setBounds(13, 101, 46, 14);
		resultpanel.add(resdiscount);

		JLabel restotal = new JLabel("Total Amount");
		restotal.setBounds(122, 101, 76, 14);
		resultpanel.add(restotal);

		discount = new JTextField();
		discount.setBounds(3, 126, 76, 20);
		resultpanel.add(discount);
		discount.setColumns(10);
		discount.setEditable(false);

		totalamount = new JTextField();
		totalamount.setBounds(115, 126, 83, 20);
		resultpanel.add(totalamount);
		totalamount.setColumns(10);
		totalamount.setEditable(false);

		JButton finalsubmit = new JButton("Submit");
		
		finalsubmit.setBounds(218, 125, 89, 23);
		resultpanel.add(finalsubmit);

		JButton finalcancel = new JButton("Cancel");
		
		finalcancel.setBounds(317, 125, 78, 23);
		resultpanel.add(finalcancel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(420, 11, 513, 363);
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
		scrollPane.setBounds(21, 52, 394, 242);
		panel_1.add(scrollPane);
		finalpurchase.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		finalpurchase.setForeground(SystemColor.inactiveCaptionText);
		finalpurchase.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Name", "Price", "Quantity", "Discount", "Cost"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = -962768587301740657L;
			Class[] columnTypes = new Class[] {
				String.class, String.class, Double.class, Integer.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		finalpurchase.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		finalpurchase.setAlignmentX(Component.LEFT_ALIGNMENT);
		finalpurchase.setBounds(446, 52, -421, 235);

		JButton finaldelete = new JButton("Delete");
		finaldelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (finalpurchase.getSelectedRow() != -1) {
					finalpurchase.remove(finalpurchase.getSelectedRow());
				}
			}
		});
		finaldelete.setBounds(425, 109, 84, 23);
		panel_1.add(finaldelete);

		JButton finalprint = new JButton("Print");
		finalprint.setBounds(164, 340, 89, 23);
		panel_1.add(finalprint);
		
		totalquantity = new JTextField();
		totalquantity.setEditable(false);
		totalquantity.setColumns(10);
		totalquantity.setBounds(240, 305, 40, 20);
		panel_1.add(totalquantity);
		
		discountprice = new JTextField();
		discountprice.setEditable(false);
		discountprice.setColumns(10);
		discountprice.setBounds(300, 305, 40, 20);
		panel_1.add(discountprice);
		
		totalcost = new JTextField();
		totalcost.setEditable(false);
		totalcost.setColumns(10);
		totalcost.setBounds(350, 305, 65, 20);
		panel_1.add(totalcost);
		
//		Button Action ***********
		
		//Add button to check the product from db*********
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = proid.getText();
				 no = Integer.parseInt(prono.getText());
				db = new DbImplementation();
				list = DbImplementation.check(id, no);
				
				ProductDetails prod=list.getLast();
				tempid.setText(prod.getId());
				tempname.setText(prod.getName());
				tempprice.setText(Double.toString(prod.getPrice()));
				discount.setText(Integer.toString(prod.getDiscount()));
				double temptotal=no*prod.getPrice();
				totalamount.setText(Double.toString(temptotal));	
				
				proid.setText("");
				prono.setText("");

			}
		});
		
/**
 * Cancel in Temp product list
 * 
 * 
 */
		finalcancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tempid.setText("");
				tempname.setText("");
				tempprice.setText("");
				discount.setText("");
				totalamount.setText("");
			}
		});
		
	/**
	 * 
	 * temp submite button to add product final display table
	 * 
	 * 	
	 */
		
		finalsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			NumberFormat formate=new DecimalFormat("#0.00");
			 FinalList fin=new FinalList();
		fin.setFid(tempid.getText());
		fin.setFname(tempname.getText());
		fin.setFdiscount(Integer.parseInt(discount.getText()));
		fin.setFquantity(no);
		fin.setFprice(Double.parseDouble(tempprice.getText()));
		double tempdis=Integer.parseInt(discount.getText())/100;
		fin.setFinaldiscount(Double.parseDouble(formate.format(tempdis)));
		fin.setFinalamount(Double.parseDouble(totalamount.getText()));
		print.add(fin);
		
		
		tempid.setText("");
		tempname.setText("");
		discount.setText("");
		tempprice.setText("");
		discount.setText("");
		totalamount.setText("");
		
		FinalList fi=print.getLast();
		DefaultTableModel model1=(DefaultTableModel) finalpurchase.getModel();
		
			model1.addRow(new Object[] {fi.getFid(),fi.getFname(),fi.getFprice(),fi.getFquantity(),fi.getFdiscount(),fi.getFinalamount() });	
			total_cost+=fin.getFinalamount();
			discount_price+=fin.getFinaldiscount();
			total_quantity+=fin.getFquantity();
			
		totalcost.setText(Double.toString(total_cost));
		discountprice.setText(Double.toString(discount_price));
		totalquantity.setText(Integer.toString(total_quantity));
		
		
				
			}
		});

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
