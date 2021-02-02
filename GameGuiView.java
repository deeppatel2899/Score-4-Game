/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.swing.JFrame;

/**
 * A tester class to test GUI
 * @author blybr
 */
public class GameGuiView {
	public GameGuiView(Board b)
	{
		int width = 1000;
		int height = 1000;

		JFrame frame = new GameGuiFrame(b);
		frame.setSize(width, height);//setting frame size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ensuring program will stop when closed
		frame.setVisible(true);// making frame viewable                
	}

	public void updateAll()
	{
		// code
	}
}
