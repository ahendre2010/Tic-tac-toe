package tictactoe;

import javax.swing.*;
//import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                @SuppressWarnings("unused")
				GameUI gui = new GameUI();
            }
        });

	}

}
