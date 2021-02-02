public class Board
{
	//private Grid grid;
	public char[][][] board = new char[4][4][4];
	public Board()
	{
		Debug.log("Creating Board");
		//grid = new Grid();
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					board[i][j][k] ='_';
					
				}
			}
		}
		dis();
		
	}
	
	public void addBead(int x, int y,int z,char c)
	{
		board[x][y][z] = c;
		
	}
	
	public void dis()
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					System.out.print(board[i][j][k]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public char[][][] getBoard()
	{
		return board;
	}
}
