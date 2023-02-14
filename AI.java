
import java.util.*;



public class AI
{
	
static char player = 'o', opponent = 'x'; 
boolean isMovesLeft(char board[][][]) 
{ 
    for (int i = 0; i < 4; i++)
    { 
        for (int j = 0; j < 4; j++) 
        {
			for(int k=0;k<4;k++)
			{
				if (board[i][j][k] == '_'){ 
					//dis(board);
					return true; }
			}
		}
	}				
    return false; 
} 
  

int evaluate(char[][][] board)
	{
		if(board[0][0][0]!= '_' && board[0][0][0]==board[1][1][1] && board[1][1][1]==board[2][2][2] && board[2][2][2]==board[3][3][3] )
				{
					if(board[0][0][0] == player)
					{
						return 10;
					}
					else if(board[0][0][0] == opponent)
					{
						return -10;
					}
				}
		else if(board[0][0][3]!= '_' && board[0][0][3]==board[1][1][2] && board[1][1][2]==board[2][2][1] && board[2][2][1]==board[3][3][0] )
				{
					if(board[0][0][0] == player)
					{
						return 10;
					}
					else if(board[0][0][0] == opponent)
					{
						return -10;
					}
				}
				
		else if(board[0][3][0]!= '_' && board[0][3][0]==board[1][2][1] && board[1][2][1]==board[2][1][2] && board[2][1][2]==board[3][0][3] )
				{
					if(board[0][0][0] == player)
					{
						return 10;
					}
					else if(board[0][0][0] == opponent)
					{
						return -10;
					}
				}
		else if(board[0][3][3]!= '_' && board[0][3][3]==board[1][2][2] && board[1][2][2]==board[2][1][1] && board[2][1][1]==board[3][0][0] )
				{
					if(board[0][0][0] == player)
					{
						return 10;
					}
					else if(board[0][0][0] == opponent)
					{
						return -10;
					}
				}
				
					
		
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(board[i][j][0]!= '_' && board[i][j][0]==board[i][j][1] && board[i][j][1]==board[i][j][2] && board[i][j][2]==board[i][j][3] )
				{
					if(board[i][j][0] == player)
					{
						return 10;
					}
					else if(board[i][j][0] == opponent)
					{
						return -10;
					}
				}
				
				
				else if(board[i][0][j]!= '_' && board[i][0][j]==board[i][1][j] && board[i][1][j]==board[i][2][j] && board[i][2][j]==board[i][3][j])
				{
					
					if(board[i][0][j] == player)
					{
						return 10;
					}
					else if(board[i][0][j] == opponent)
					{
						return -10;
					}
				}
				
				else if(board[0][i][j]!= '_' && board[0][i][j]==board[1][i][j] && board[1][i][j]==board[2][i][j] && board[2][i][j]==board[3][i][j])
				{
					
					if(board[0][i][j] == player)
					{
						return 10;
					}
					else if(board[0][i][j] == opponent)
					{
						return -10;
					}
				}
			} 
		}
		
		
		
		for(int i=0;i<4;i++)
		{
			
				if(board[i][0][0]!= '_' && board[i][0][0]==board[i][1][1] && board[i][1][1]==board[i][2][2] && board[i][2][2]==board[i][3][3])
				{
					
					if(board[i][0][0] == player)
					{
						return 10;
					}
					else if(board[i][0][0] == opponent)
					{
						return -10;
					}
				}
				
				else if(board[i][0][3] != '_' && board[i][0][3]==board[i][1][2] && board[i][1][2]==board[i][2][1] && board[i][2][1]==board[i][3][0])
				{
					
					if(board[i][0][3] == player)
					{
						return 10;
					}
					else if(board[i][0][3] == opponent)
					{
						return -10;
					}
				}
				
				
				
				else if(board[0][i][0]!= '_' && board[0][i][0]==board[1][i][1] && board[1][i][1]==board[2][i][2] && board[2][i][2]==board[3][i][3])
				{
					if(board[0][i][0] == player)
					{
						return 10;
					}
					else if(board[0][i][0] == opponent)
					{
						return -10;
					}
				}
				
				else if(board[0][i][3]!= '_' && board[0][i][3]==board[1][i][2] && board[1][i][2]==board[2][i][1] && board[2][i][1]==board[3][i][0])
				{
					
					if(board[0][i][3] == player)
					{
						return 10;
					}
					else if(board[0][i][3] == opponent)
					{
						return -10;
					}
				}
				
				else if(board[0][0][i]!= '_' && board[0][0][i]==board[1][1][i] && board[1][1][i]==board[2][2][i] && board[2][2][i]==board[3][3][i])
				{
					if(board[0][0][i] == player)
					{
						return 10;
					}
					else if(board[0][i][i] == opponent)
					{
						return -10;
					}
				}
				
				else if(board[0][3][i]!= '_' && board[0][3][i]==board[1][2][i] && board[1][2][i]==board[2][1][i] && board[2][1][i]==board[3][0][i])
				{
					if(board[0][3][i] == player)
					{
						return 10;
					}
					else if(board[0][3][i] == opponent)
					{
						return -10;
					}
				}
				
				
				else if(board[3][0][i]!= '_' && board[3][0][i]==board[2][1][i] && board[2][1][i]==board[1][2][i] && board[1][2][i]==board[0][3][i])
				{
					if(board[3][0][i] == player)
					{
						return 10;
					}
					else if(board[3][0][i] == opponent)
					{
						return -10;
					}
				}
				
				else if(board[3][3][i]!= '_' && board[3][3][i]==board[2][2][i] && board[2][2][i]==board[1][1][i] && board[1][1][i]==board[0][0][i])
				{
					if(board[3][3][i] == player)
					{
						return 10;
					}
					else if(board[3][3][i] == opponent)
					{
						return -10;
					}
				}
			
			
			
		}
		
		
		return 0;
	}



public Move findMove(char board[][][])
{
	int temp;
	Move bestMove = new Move(); 
    bestMove.row = 0; 
    bestMove.col = 0; 
    bestMove.bead = 0; 
	for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					if(board[i][j][k] == '_')
					{
						board[i][j][k] = 'o';
						temp = evaluate(board);
						board[i][j][k] = '_';
						if(temp == 10)
						{
							bestMove.row = i; 
							bestMove.col = j; 
							bestMove.bead = k; 
							System.out.printf("The value of the best Move " +  
								 "is : %d-%d-%d",bestMove.row,bestMove.col,bestMove.bead); 
							return bestMove;
							
						}
						
					}
						
				}
			}
		}
		
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					
					if(board[i][j][k] == '_')
					{
						board[i][j][k] = 'x';
						temp = evaluate(board);
						board[i][j][k] = '_';
						if(temp == -10)
						{
							bestMove.row = i; 
							bestMove.col = j; 
							bestMove.bead = k; 
							System.out.printf("The value of the best Move " +  
								 "is : %d-%d-%d",bestMove.row,bestMove.col,bestMove.bead); 
							return bestMove;
							
						}
						
					}
						
				}
			}
		}
		
		
		
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					
					if(board[i][j][k] == 'o' )
					{
						if(k == 0 && j<3 && i<3)
						{
							if(board[i][j][k+1] == '_')
							{
								bestMove.row = i; 
								bestMove.col = j; 
								bestMove.bead = k+1;
								return bestMove;
							}
							else if(board[i][j+1][k] == '_')
							{
								bestMove.row = i; 
								bestMove.col = j+1; 
								bestMove.bead = k;
								return bestMove;
							}
							else if(board[i+1][j][k] == '_')
							{
								bestMove.row = i+1; 
								bestMove.col = j; 
								bestMove.bead = k;
								return bestMove;
							}
							else if(board[i+1][j+1][k] == '_')
							{
								bestMove.row = i+1; 
								bestMove.col = j+1; 
								bestMove.bead = k;
								return bestMove;
							}
							
							
							else if(board[i][j+1][k+1] == '_' && board[i][j+1][k] != '_' )
							{
								bestMove.row = i; 
								bestMove.col = j+1; 
								bestMove.bead = k+1;
								return bestMove;
							}
							else if(board[i+1][j][k+1] == '_' && board[i+1][j][k] != '_' )
							{
								bestMove.row = i+1; 
								bestMove.col = j; 
								bestMove.bead = k+1;
								return bestMove;
							}
							else if(board[i+1][j+1][k+1] == '_' && board[i+1][j+1][k] != '_' )
							{
								bestMove.row = i+1; 
								bestMove.col = j+1; 
								bestMove.bead = k+1;
								return bestMove;
							}
							
							//return bestMove;
						}
						else if(k<3 && i<3 && j<3)
						{
							if(board[i+1][j][k] == '_')
							{
								bestMove.row = i+1; 
								bestMove.col = j; 
								bestMove.bead = k;
								return bestMove;
							}
							else if(board[i][j+1][k] == '_')
							{
								bestMove.row = i; 
								bestMove.col = j+1; 
								bestMove.bead = k;
								return bestMove;
							}
							else if(board[i+1][j+1][k] == '_')
							{
								bestMove.row = i+1; 
								bestMove.col = j+1; 
								bestMove.bead = k;
								return bestMove;
							}
							else if(board[i][j][k-1] == 'o')
							{
								bestMove.row = i; 
								bestMove.col = j; 
								bestMove.bead = k+1;
								return bestMove;
							}
							
							
							
							//return bestMove;
							
						}

						
						
						
					}
					
						
				}
				//System.out.print(" ");
			}
			//System.out.println();
		}
		//System.out.printf("The value of the best Move " +  
			//					 "is : %d-%d-%d",bestMove.row,bestMove.col,bestMove.bead); 
		return bestMove;
		
		
		
		
		
		
}
  

	

	
}






