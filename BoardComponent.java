/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.*; 
import javax.swing.*; 
/**
 *
 * @author blybr
 */
public class BoardComponent extends JComponent
{
	private PegGraphic[][] pegArray;
	public String state = null;

	/**
	 * makes a visual for the game board
	 */
	public BoardComponent(Board b)
	{
		
		pegArray= new PegGraphic[4][4]; 
		for (int i = 1; i < 5; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				pegArray[i - 1][j] = new PegGraphic(i * 100,  100+(j * 100),b);
			}
		}
	}


	 
/**
 * paints current state of peg array
 * @param g 
 */
	@Override
	public void paintComponent(Graphics g)
	{  
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.blue);
		g2.fill3DRect(50, 20, 400, 400,true); 
		
		
		//Rectangle Rect = new Rectangle(50, 20, 400, 400);
		//g2.draw(Rect); 
		//g2.fill(Rect);
		for(int i = 1; i < 5; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				g2.setColor(Color.BLACK);
				pegArray[i - 1][j].draw(g2);
			}
		}
		if(state != null)
		{
		g2.setColor(Color.green);
		g2.setFont(new Font("Serif", Font.BOLD, 30));
		g2.drawString(state, 100, 230) ;
		}
	}
  
  /**
   * gets the correct peg for each actionListener
   * @param x
   * @param y
   * @return 
   */
	public PegGraphic getPeg(int x, int y)
	{
		return pegArray[x][y];
		

	}

   /**
	* made to refresh only the BoardComponent
	*/
	public void paintAgain()
	{
		repaint();
	}
}


