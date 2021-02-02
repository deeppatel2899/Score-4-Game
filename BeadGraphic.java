/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Graphics2D;

import java.awt.geom.Ellipse2D;



/**
 *makes a bead with a stored ellipse
 * @author blybr
 */
public class BeadGraphic {
	private int xCoord;
	private int yCoord;
	public Color colour;
	private Ellipse2D.Double bead;

	/**
	 * Constructor makes beads 
	 * can be modified to put player
	 * specific color on peg
	 * @param x
	 * @param y 
	 */
	public BeadGraphic(int x, int y)
	{
		xCoord = x;
		yCoord = y;
		bead = new Ellipse2D.Double(x, y, 20, 20);
	}

   /**
	* draws bead of appropriate color
	* @param g2 
	*/
	public void draw(Graphics2D g2)
	{
		g2.setColor(colour);// draws bead of appropriate colour
		g2.draw(bead);
		g2.fill(bead);
	}
	
	/**
	 * currently not used but functionally works
	 * @return 
	 */
	public Ellipse2D.Double getBead()
	{
		return bead;
	}
   
}
