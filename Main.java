import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JFrame;

public class Main
{
	public static void main(String[] args)
	{
		Debug.enable(); 
		System.out.println("Welcome to Score 4!");

		Debug.log("Initalizing game and creating elements.");
		Board board = new Board();
		
		GameGuiView view = new GameGuiView(board);
		
}
}
