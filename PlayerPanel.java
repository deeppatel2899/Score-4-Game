/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;

/**
 *makes a panel of buttons
 * @author blybr
 */
public class PlayerPanel extends JPanel{
	private JButton[][] button = new JButton[4][4];
	private ActionListener[][] clicks = new ClickListener[4][4];
	private BoardComponent board;
	Board B;
	AI ai = new AI();
	Move M;
	int win;
	char[][][] c;
 
	/**
	 * makes buttons in appropriate order to match grid
	 * @param b 
	 */
	public PlayerPanel(BoardComponent b, Board x)
	{
		this.setLayout(new GridLayout(4,4));

		for (int i = 1; i < 5 ; i++)
		{
			for(int j = 1; j < 5; j++)
			{
				String name= Integer.toString(i) + "-" + Integer.toString(j);
				button[j - 1][i - 1] = new JButton(name);
				add(button[j - 1][i - 1]);
			}
		}

 		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{ 
				clicks[i][j] = new ClickListener(i,j);
				button[i][j].addActionListener(clicks[i][j]);
			}
		}
		
		board = b;
		B = x;
		c = B.getBoard();
		B.dis();
		System.out.println(c);
		M = ai.findMove(c);
		System.out.printf("The value of the best Move " + "is : %d-%d-%d",M.row,M.col,M.bead); 
		board.getPeg(M.col, M.row).addBead(M.col, M.row,'o',Color.black);
		board.paintAgain();
			
	}

	/**
	 * Listeners to cause circles to appear on frame
	 */
	public class ClickListener implements ActionListener {
		private int n=1;
		private final int xCoord;
		private final int yCoord;
		private boolean colour;

		public ClickListener(int x, int y)
		{
			xCoord=x;
			yCoord=y;
			
			
	 	}
	 
		@Override
		// makes beads with coordinates
		public void actionPerformed(ActionEvent e)
		{ 
			
			 // repaints beads that have been added
			board.getPeg(xCoord, yCoord).addBead(xCoord,yCoord,'x',Color.white);
			c = B.getBoard();
			win = ai.evaluate(c);
			if(win == 10)
			{
				System.out.println("You loss the game .");
				board.state = "You loss the game .";	
			}
			else if(win == -10)
			{
				System.out.println("You win the game .");
				board.state = "You win the game .";
			}
			System.out.println("opponent");
			board.paintAgain();
			B.dis();
			
			
			M = ai.findMove(c);
			System.out.printf("The value of the best Move " +  "is : %d-%d-%d",M.row,M.col,M.bead); 
			board.getPeg(M.col, M.row).addBead(M.col, M.row,'o',Color.black);	
			B.dis();		 
			c = B.getBoard();
			win = ai.evaluate(c);
			System.out.println(win);
			if(win == -10)
			{
				System.out.println("You win the game .");
				board.state = "You win the game .";
			}
			else if(win == 10)
			{
				System.out.println("You loss the game .");
				board.state = "You loss the game .";	
			}
			System.out.println("AI .");
			
			board.paintAgain();
			
		}
	}
}
