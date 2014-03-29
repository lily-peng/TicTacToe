import javax.swing.JButton;


public class TicTacToe {

	//set winner method
/*	Instance variables for whose turn it is, and status of the game
	• A method that switches the turn between “X’s turn” and “O’s turn”
	• A method that sets the winner of the game
	• A method that resets turn and status back to their original values
	• A turn counter keeping track of the number of moves
	• A method that checks to see if anyone has won the game, or if a tie has occurred. If not,
	goes to the next turn.
	• A method that ends the game, either resetting everything or exiting the program*/
	
	private int turn; //0 is O's turn, 1 is X's turn
	private String status; //“Still Playing”, “X Wins”, “O Wins”, or “Tie"
	private int[][] myArray;
	
	public TicTacToe()
	{
		turn = 0; //defaults to O's turn
		status = "Still playing"; //defaults to playing
		myArray = new int[3][3];
	}
	
	public void makeMove(int row, int column)
	{
		if (myArray[row][column] == 0)
        {
            myArray[row][column] = turn;
            //return true;
        }
	}
	
	public String getTurn()
	{
		if (turn == 0)
		{
			return "O";
		}
		else
		{
			return "X";
		}
	}
	
	public void changeTurn()
	{
		if (turn == 0)
		{
			turn = 1;
		}
		else if (turn == 1)
		{
			turn = 0;
		}
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public void setWinner()
	{
		
	}
	
	public void reset()
	{
		turn = 0;
		status = "Still playing";
	}
	
}
