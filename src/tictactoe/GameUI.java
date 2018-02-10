package tictactoe;

import javax.swing.*;
import java.awt.ComponentOrientation;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameUI {
	static int i = 0;
	public GameUI() {
		
		JFrame frmTictactoe = new JFrame("");
		frmTictactoe.setBounds(new Rectangle(100, 100, 470, 385));
		frmTictactoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTictactoe.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frmTictactoe.setAutoRequestFocus(false);
		frmTictactoe.setResizable(false);
		frmTictactoe.setVisible(true);
		frmTictactoe.setTitle("Tic-Tac-Toe");
		frmTictactoe.getContentPane().setLayout(null);
		
		JEditorPane formattedTextField_0 = new JEditorPane();
		formattedTextField_0.setEditable(false);
		formattedTextField_0.setBounds(10, 11, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_0);
		
		JEditorPane formattedTextField_1 = new JEditorPane();
		formattedTextField_1.setEditable(false);
		formattedTextField_1.setBounds(120, 11, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_1);
		
		JEditorPane formattedTextField_2 = new JEditorPane();
		formattedTextField_2.setEditable(false);
		formattedTextField_2.setBounds(230, 11, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_2);
		
		JEditorPane formattedTextField_3 = new JEditorPane();
		formattedTextField_3.setEditable(false);
		formattedTextField_3.setBounds(10, 122, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_3);
		
		JEditorPane formattedTextField_4 = new JEditorPane();
		formattedTextField_4.setEditable(false);
		formattedTextField_4.setBounds(120, 122, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_4);
		
		JEditorPane formattedTextField_5 = new JEditorPane();
		formattedTextField_5.setEditable(false);
		formattedTextField_5.setBounds(230, 122, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_5);
		
		JEditorPane formattedTextField_6 = new JEditorPane();
		formattedTextField_6.setEditable(false);
		formattedTextField_6.setBounds(10, 233, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_6);
		
		JEditorPane formattedTextField_7 = new JEditorPane();
		formattedTextField_7.setEditable(false);
		formattedTextField_7.setBounds(120, 233, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_7);
		
		JEditorPane formattedTextField_8 = new JEditorPane();
		formattedTextField_8.setEditable(false);
		formattedTextField_8.setBounds(230, 233, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_8);
		
		JButton btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.setBounds(345, 310, 100, 23);
		frmTictactoe.getContentPane().add(btnPlayAgain);
		
		
		// Listeners
		
		
		formattedTextField_0.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent arg0) {
				i++;
				if(i%2 != 0) {
					formattedTextField_0.setText("0");
				}else {
					formattedTextField_0.setText("x");
				}
				
			}
		});
		
		
		formattedTextField_1.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent arg0) {
				i++;
				if(i%2 != 0) {
					formattedTextField_1.setText("0");
				}else {
					formattedTextField_1.setText("x");
				}
				
			}
		});
		
		formattedTextField_2.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent arg0) {
				i++;
				if(i%2 != 0) {
					formattedTextField_2.setText("0");
				}else {
					formattedTextField_2.setText("x");
				}
				
			}
		});
		
		formattedTextField_3.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent arg0) {
				i++;
				if(i%2 != 0) {
					formattedTextField_3.setText("0");
				}else {
					formattedTextField_3.setText("x");
				}
				
			}
		});
		
		formattedTextField_4.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent arg0) {
				i++;
				if(i%2 != 0) {
					formattedTextField_4.setText("0");
				}else {
					formattedTextField_4.setText("x");
				}
				
			}
		});
		
		formattedTextField_5.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent arg0) {
				i++;
				if(i%2 != 0) {
					formattedTextField_5.setText("0");
				}else {
					formattedTextField_5.setText("x");
				}
				
			}
		});
		
		formattedTextField_6.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent arg0) {
				i++;
				if(i%2 != 0) {
					formattedTextField_6.setText("0");
				}else {
					formattedTextField_6.setText("x");
				}
				
			}
		});
		
		formattedTextField_7.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent arg0) {
				i++;
				if(i%2 != 0) {
					formattedTextField_7.setText("0");
				}else {
					formattedTextField_7.setText("x");
				}
				
			}
		});
		
		formattedTextField_8.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent arg0) {
				i++;
				if(i%2 != 0) {
					formattedTextField_8.setText("0");
				}else {
					formattedTextField_8.setText("x");
				}
				
			}
		});
		
	}
}
