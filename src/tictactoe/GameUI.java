package tictactoe;

import javax.swing.*;
import java.awt.ComponentOrientation;
import java.awt.Rectangle;

public class GameUI {

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
		
		JEditorPane formattedTextField = new JEditorPane();
		formattedTextField.setBounds(10, 11, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField);
		
		JEditorPane formattedTextField_1 = new JEditorPane();
		formattedTextField_1.setBounds(120, 11, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_1);
		
		JEditorPane formattedTextField_2 = new JEditorPane();
		formattedTextField_2.setBounds(230, 11, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_2);
		
		JEditorPane formattedTextField_3 = new JEditorPane();
		formattedTextField_3.setBounds(10, 122, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_3);
		
		JEditorPane formattedTextField_4 = new JEditorPane();
		formattedTextField_4.setBounds(120, 122, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_4);
		
		JEditorPane formattedTextField_5 = new JEditorPane();
		formattedTextField_5.setBounds(230, 122, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_5);
		
		JEditorPane formattedTextField_6 = new JEditorPane();
		formattedTextField_6.setBounds(10, 233, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_6);
		
		JEditorPane formattedTextField_7 = new JEditorPane();
		formattedTextField_7.setBounds(120, 233, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_7);
		
		JEditorPane formattedTextField_8 = new JEditorPane();
		formattedTextField_8.setBounds(230, 233, 100, 100);
		frmTictactoe.getContentPane().add(formattedTextField_8);
		
		JButton btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.setBounds(345, 310, 100, 23);
		frmTictactoe.getContentPane().add(btnPlayAgain);
		
		
	}
}
