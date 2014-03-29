import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class represents a GUI Tic Tac Toe game.
 * @author Lily Peng
 */
public class TicTacToeMain extends JPanel{

	private JLabel turnLabel, empty, statusLabel;
	private JButton[][] buttArray = new JButton[3][3];
	private int counter; //turn counter keeping track of total number of moves
	
	private static final int X = 1; //X is represented by the int 1
	private static final int O = 2; //O is represented by the int 2
	private int turn; //X is X's turn, O is O's turn, defaults to X
	private String status; //“Still Playing”, “X Wins”, “O Wins”, or “Tie"
	private int[][] valueArray; //contains 0 for no value, X for X, and O for O
	
	/**
	 * This method changes whose turn it is. If the previous move was X's turn, then the next move with be O's turn, and vice versa.
	 */
	public void changeTurn()
	{
		if (turn == X)
		{
			turn = O;
			turnLabel.setText("O's turn");
		}
		else if (turn == O)
		{
			turn = X;
			turnLabel.setText("X's turn");
		}
	}
	
	/**
	 * This method checks all the possible ways a game can be won, and the tie condition.
	 * It also changes turns and continues the game if nobody has won yet.
	 */
	public void checkWinner()
	{
		int winner = -1; // -1 means no winner, X means X won, O means O won
		JFrame frame = new JFrame("Select an Option");
		
		//winning the first column
		if (valueArray[0][0] == valueArray[1][0] && valueArray[1][0] == valueArray[2][0] && valueArray[0][0] != 0)
		{
			winner = valueArray[0][0];
			if (winner == X)
			{
				status = "X wins!";
			}
			else if (winner == O)
			{
				status = "O wins!";
			}
			statusLabel.setText(status);
			
			int n = JOptionPane.showConfirmDialog(frame, "Play again?", "Select an Option", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION)
			{
				reset();
			}
			else if (n == JOptionPane.NO_OPTION)
			{
				System.exit(0);
			}
		}
		
		//winning the second column
		else if (valueArray[0][1] == valueArray[1][1] && valueArray[1][1] == valueArray[2][1] && valueArray[0][1] != 0)
		{
			winner = valueArray[0][1];
			if (winner == X)
			{
				status = "X wins!";
			}
			else if (winner == O)
			{
				status = "O wins!";
			}
			statusLabel.setText(status);
			
			int n = JOptionPane.showConfirmDialog(frame, "Play again?", "Select an Option", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION)
			{
				reset();
			}
			else if (n == JOptionPane.NO_OPTION)
			{
				System.exit(0);
			}
		}
		
		//winning the third column
		else if (valueArray[0][2] == valueArray[1][2] && valueArray[1][2] == valueArray[2][2] && valueArray[0][2] != 0)
		{
			winner = valueArray[0][2];
			if (winner == X)
			{
				status = "X wins!";
			}
			else if (winner == O)
			{
				status = "O wins!";
			}
			statusLabel.setText(status);
			
			int n = JOptionPane.showConfirmDialog(frame, "Play again?", "Select an Option", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION)
			{
				reset();
			}
			else if (n == JOptionPane.NO_OPTION)
			{
				System.exit(0);
			}
		}
		
		//winning the first row
		else if (valueArray[0][0] == valueArray[0][1] && valueArray[0][1] == valueArray[0][2] && valueArray[0][0] != 0)
		{
			winner = valueArray[0][0];
			if (winner == X)
			{
				status = "X wins!";
			}
			else if (winner == O)
			{
				status = "O wins!";
			}
			statusLabel.setText(status);
			
			int n = JOptionPane.showConfirmDialog(frame, "Play again?", "Select an Option", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION)
			{
				reset();
			}
			else if (n == JOptionPane.NO_OPTION)
			{
				System.exit(0);
			}
		}
		
		//winning the second row
		else if (valueArray[1][0] == valueArray[1][1] && valueArray[1][1] == valueArray[1][2] && valueArray[1][0] != 0)
		{
			winner = valueArray[1][0];
			if (winner == X)
			{
				status = "X wins!";
			}
			else if (winner == O)
			{
				status = "O wins!";
			}
			statusLabel.setText(status);
			
			int n = JOptionPane.showConfirmDialog(frame, "Play again?", "Select an Option", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION)
			{
				reset();
			}
			else if (n == JOptionPane.NO_OPTION)
			{
				System.exit(0);
			}
		}
		
		//winning the third row
		else if (valueArray[2][0] == valueArray[2][1] && valueArray[2][1] == valueArray[2][2] && valueArray[2][0] != 0)
		{
			winner = valueArray[2][0];
			if (winner == X)
			{
				status = "X wins!";
			}
			else if (winner == O)
			{
				status = "O wins!";
			}
			statusLabel.setText(status);
			
			int n = JOptionPane.showConfirmDialog(frame, "Play again?", "Select an Option", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION)
			{
				reset();
			}
			else if (n == JOptionPane.NO_OPTION)
			{
				System.exit(0);
			}
		}
		
		//winning the first diagonal
		else if (valueArray[0][0] == valueArray[1][1] && valueArray[1][1] == valueArray[2][2] && valueArray[0][0] != 0)
		{
			winner = valueArray[0][0];
			if (winner == X)
			{
				status = "X wins!";
			}
			else if (winner == O)
			{
				status = "O wins!";
			}
			statusLabel.setText(status);
			
			int n = JOptionPane.showConfirmDialog(frame, "Play again?", "Select an Option", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION)
			{
				reset();
			}
			else if (n == JOptionPane.NO_OPTION)
			{
				System.exit(0);
			}
		}
		
		//winning the second diagonal
		else if (valueArray[0][2] == valueArray[1][1] && valueArray[1][1] == valueArray[2][0] && valueArray[0][2] != 0)
		{
			winner = valueArray[0][2];
			if (winner == X)
			{
				status = "X wins!";
			}
			else if (winner == O)
			{
				status = "O wins!";
			}
			statusLabel.setText(status);
			
			int n = JOptionPane.showConfirmDialog(frame, "Play again?", "Select an Option", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION)
			{
				reset();
			}
			else if (n == JOptionPane.NO_OPTION)
			{
				System.exit(0);
			}
		}
		
		//when the game is tied
		if (winner == -1 && counter == 9)
		{
			status = "It's a Tie.";
			statusLabel.setText(status);
			int n = JOptionPane.showConfirmDialog(frame, "Play again?", "Select an Option", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION)
			{
				reset();
			}
			else if (n == JOptionPane.NO_OPTION)
			{
				System.exit(0);
			}
		}
		//if there's no winner and the game isn't tied (there are blank areas)
		else if (winner == -1 && counter != 9)
		{
			changeTurn();
		}
		
	}
	
	/**
	 * This method resets the Tic Tac Toe board.
	 */
	public void reset()
	{
		turn = X; // X is always given the first move
		turnLabel.setText("X's turn");
		status = "Still Playing";
		statusLabel.setText(status);
		
		for (int i = 0; i < 3; i++) //resets the values of all the tic-tac-toe spaces to 0 (empty)
		{
			for (int j = 0; j < 3; j++)
			{
				valueArray[i][j] = 0;
			}
		}
		
		for (int i = 0; i < 3; i++) //resets all the button names to blank spaces
		{
			for (int j = 0; j < 3; j++)
			{
				buttArray[i][j].setText(" ");
			}
		}
		counter = 0; //counter is reset to 0
	}
	
	/**
	 * This method initializes the buttArray and valueArray, sets up GridLayout, 
	 * adds objects to the GUI, and adds ActionListeners to the buttons
	 */
	public TicTacToeMain()
	{
		turn = X; //defaults to X's turn
		status = "Still Playing";
		
		valueArray = new int[3][3];
		for (int i = 0; i < 3; i++) //sets all values in valueArray to 0 (empty, neither X or O)
		{
			for (int j = 0; j < 3; j++)
			{
				valueArray[i][j] = 0;
			}
		}
		
		setLayout(new GridLayout(4,3));
		
		buttArray[0][0] = new JButton(" ");
		buttArray[0][1] = new JButton(" ");
		buttArray[0][2] = new JButton(" ");
		
		buttArray[1][0] = new JButton(" ");
		buttArray[1][1] = new JButton(" ");
		buttArray[1][2] = new JButton(" ");
		
		buttArray[2][0] = new JButton(" ");
		buttArray[2][1] = new JButton(" ");
		buttArray[2][2] = new JButton(" ");
	
		turnLabel = new JLabel("X's turn"); //defaults to X's turn
		empty = new JLabel(" ");
		statusLabel = new JLabel(status); //changes if X or O wins
		
		add(buttArray[0][0]);
		add(buttArray[0][1]);
		add(buttArray[0][2]);
		
		add(buttArray[1][0]);
		add(buttArray[1][1]);
		add(buttArray[1][2]);
		
		add(buttArray[2][0]);
		add(buttArray[2][1]);
		add(buttArray[2][2]);
		
		add(turnLabel);
		add(empty);
		add(statusLabel);
		
		TTTListener a0 = new TTTListener(0,0);
		TTTListener a1 = new TTTListener(0,1);
		TTTListener a2 = new TTTListener(0,2);
		
		TTTListener b0 = new TTTListener(1,0);
		TTTListener b1 = new TTTListener(1,1);
		TTTListener b2 = new TTTListener(1,2);
		
		TTTListener c0 = new TTTListener(2,0);
		TTTListener c1 = new TTTListener(2,1);
		TTTListener c2 = new TTTListener(2,2);
		
		buttArray[0][0].addActionListener(a0);
		buttArray[0][1].addActionListener(a1);
		buttArray[0][2].addActionListener(a2);

		buttArray[1][0].addActionListener(b0);
		buttArray[1][1].addActionListener(b1);
		buttArray[1][2].addActionListener(b2);
		
		buttArray[2][0].addActionListener(c0);
		buttArray[2][1].addActionListener(c1);
		buttArray[2][2].addActionListener(c2);
	}
	
	/**
	 * This class is an ActionListener for the Tic-Tac-Toe game.
	 * @author Lily Peng
	 */
	private class TTTListener implements ActionListener
	{
		private int a;
		private int b;
		
		/**
		 * The TTTListener constructor takes in the location of a button
		 * @param xCoord the x-coordinate of the JButton
		 * @param yCoord the y-coordinate of the JButton
		 */
		public TTTListener(int xCoord, int yCoord)
		{
			a = xCoord;
			b = yCoord;
		}
		
		/**
		 * If a button is clicked and did not already have an X or O, it will be assigned either one
		 * depending on whose turn it is. This method also adds to the counter and sets the
		 * text of a button to X or O depending on whose turn it is.
		 * It will also check for a winner.
		 */
		public void actionPerformed(ActionEvent event)
		{
			if (valueArray[a][b] == 0)
	        {
	            valueArray[a][b] = turn;
	            counter = counter + 1;
				
				if (turn == X)
				{
					buttArray[a][b].setText("X");
				}
				else if (turn == O)
				{
					buttArray[a][b].setText("O");
				}

				checkWinner();
	        }
		}
	}
	
	/**
	 * This is the main method. It sets up a JFrame, sets the default close operation, 
	 * adds the TicTacToeMain panel to it, packs the frame, and sets it visible.
	 * Also sets dimensions to a reasonable size
	 * @param args
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Tic Tac Toe!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TicTacToeMain panel = new TicTacToeMain();
		frame.add(panel);
		
		frame.setPreferredSize(new Dimension(225, 300));
		frame.pack();
		frame.setVisible(true);
	}
}
