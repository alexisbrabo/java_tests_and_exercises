package br.com.alexis.list1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exercise9 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Library");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);

		JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);

		JMenu fileMenu = new JMenu("File");
		JMenuItem itemExit = new JMenuItem("Exit");
		itemExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		fileMenu.add(itemExit);
		menubar.add(fileMenu);

		frame.setVisible(true);
	}

}
