//กาญจนพ บัวรอด
//6509650229

package Question3;
import java.util.*;

public class BomberGame {
	private int playerLife = 3 , compLife = 3;
	GridCell[][] board;
	
	public BomberGame(int boardSize , int bombNo) {
		Random rand = new Random();
		int row=0 , col=0;
		if (boardSize < 3) {
			board = new GridCell[3][3];
			for(int i = 0 ; i < 3 ; i++) {
				for(int j = 0 ; j < 3 ; j++) {
					board[i][j] = new GridCell();
				}
			}
		}
		else if(boardSize >= 3){
			board = new GridCell[boardSize][boardSize];
			for(int i = 0 ; i < boardSize ; i++) {
				for(int j = 0 ; j < boardSize ; j++) {
					board[i][j] = new GridCell();
				}
			}
		}
		if (bombNo < 5 || bombNo < boardSize*2) {
			for(int i = 0 ; i < 5 ; i++) {
				row = rand.nextInt(board.length);
				col = rand.nextInt(board[0].length);
				while(board[row][col].isHasBomb()) {
					row = rand.nextInt(board.length);
					col = rand.nextInt(board[0].length);
				}
				board[row][col].setHasBomb(true);
			}
		}
		else {
			for(int i = 0 ; i < bombNo ; i++) {
				row = rand.nextInt(board.length);
				col = rand.nextInt(board[0].length);
				while(board[row][col].isHasBomb()) {
					row = rand.nextInt(board.length);
					col = rand.nextInt(board[0].length);
				}
				board[row][col].setHasBomb(true);
			}
		}
	}
	
	public void printAllBomb() {
		for(int i = 0 ; i < board.length ; i++) {
			for(int j = 0 ; j < board[i].length ; j++) {
				if(board[i][j].isHasBomb()) {
					System.out.printf("b ");
				}
				else{
					System.out.printf("- ");
				}
			}
			System.out.println();
		}
	}
	
	public void printBoard() {
		for(int i = 0 ; i < board.length ; i++) {
			for(int j = 0 ; j < board[i].length ; j++) {
				if(board[i][j].isOpen()) {
					if(board[i][j].isHasBomb()) {
						System.out.printf("b ");
					}
					else{
						System.out.printf("- ");
					}
				}
				else {
					System.out.printf("X ");
				}
			}
			System.out.println();
		}
	}
	
	public void play() {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int firstplayer , rand1 , rand2 , round = 1 , row = 1 , col = 1 , count1 = 0 , count2 = 0;
		firstplayer = rand.nextInt(2);
		if(firstplayer == 0) {
			while(playerLife > 0 && compLife > 0) {
				if (round%2 == 0) {
					System.out.println("------- Computer Turn -------");
					rand1 = rand.nextInt(board.length);
					rand2 = rand.nextInt(board[0].length);
					while(board[rand1][rand2].isOpen()) {
						System.out.printf("Grid %d, %d is already opened. Choose again\n",rand1+1 , rand2+1);
						rand1 = rand.nextInt(board.length);
						rand2 = rand.nextInt(board[0].length);
					}
					System.out.printf("Opening Grid %d, %d\n", rand1+1 , rand2+1);
					board[rand1][rand2].setOpen(true);
					printBoard();
					if(board[rand1][rand2].isHasBomb()) {
						compLife--;
					}
					System.out.printf("Player Life: %d\nComputer Life: %d\n",playerLife,compLife);
					round++;
				}
				else {
					count1 = 0;
					System.out.println("------- Player Turn -------");
					while(board[row][col].isOpen() || count1 == 0) {
						if(board[row][col].isOpen() && count1 != 0) {
							System.out.printf("Grid %d, %d is already opened. Choose again\n",row+1 , col+1);
						}
						while(row > board.length-1 || row < 0 || count2 == 0) {
							count2 = 1;
							if(row > board.length-1 || row < 0) {
								System.out.printf("Invalid row. Please enter 1-%d\n",board.length);
							}
							System.out.print("Input row: ");
							row = scan.nextInt()-1;
						}
						count2 = 0;
						while(col > board[0].length-1 || col < 0 || count2 == 0) {
							count2 = 1;
							if(col > board[0].length-1 || col < 0) {
								System.out.printf("Invalid col. Please enter 1-%d\n",board[0].length);
							}
							System.out.print("Input col: ");
							col = scan.nextInt()-1;
						}
						count2 = 0;
						count1 = 1;
					}
					System.out.printf("Opening Grid %d, %d\n", row+1 , col+1);
					board[row][col].setOpen(true);
					printBoard();
					if(board[row][col].isHasBomb()) {
						playerLife--;
					}
					System.out.printf("Player Life: %d\nComputer Life: %d\n",playerLife,compLife);
					round++;
					row = 1;
					col = 1;
				}
			}
			if(compLife == 0) {
				System.out.println("You win!");
				System.out.println();
			}
			else if(playerLife == 0) {
				System.out.println("Computer win!");
				System.out.println();
			}
			System.out.println("------------- Game Ended. All Bombs' Location are -----------");
			printAllBomb();
		}
		else {
			while(playerLife > 0 && compLife > 0) {
				if (round%2 != 0) {
					System.out.println("------- Computer Turn -------");
					rand1 = rand.nextInt(board.length);
					rand2 = rand.nextInt(board[0].length);
					while(board[rand1][rand2].isOpen()) {
						System.out.printf("Grid %d, %d is already opened. Choose again\n",rand1+1 , rand2+1);	
						rand1 = rand.nextInt(board.length);
						rand2 = rand.nextInt(board[0].length);
					}
					System.out.printf("Opening Grid %d, %d\n", rand1+1 , rand2+1);
					board[rand1][rand2].setOpen(true);
					printBoard();
					if(board[rand1][rand2].isHasBomb()) {
						compLife--;
					}
					System.out.printf("Player Life: %d\nComputer Life: %d\n",playerLife,compLife);
					round++;
				}
				else {
					count1 = 0;
					System.out.println("------- Player Turn -------");
					while(board[row][col].isOpen() || count1 == 0) {
						if(board[row][col].isOpen() && count1 != 0) {
							System.out.printf("Grid %d, %d is already opened. Choose again\n",row+1 , col+1);
						}
						while(row > board.length-1 || row < 0 || count2 == 0) {
							count2 = 1;
							if(row > board.length-1 || row < 0) {
								System.out.printf("Invalid row. Please enter 1-%d\n",board.length);
							}
							System.out.print("Input row: ");
							row = scan.nextInt()-1;
						}
						count2 = 0;
						while(col > board[0].length-1 || col < 0 || count2 == 0) {
							count2 = 1;
							if(col > board[0].length-1 || col < 0) {
								System.out.printf("Invalid col. Please enter 1-%d\n",board[0].length);
							}
							System.out.print("Input col: ");
							col = scan.nextInt()-1;
						}
						count2 = 0;
						count1 = 1;
					}
					System.out.printf("Opening Grid %d, %d\n", row+1 , col+1);
					board[row][col].setOpen(true);
					printBoard();
					if(board[row][col].isHasBomb()) {
						playerLife--;
					}
					System.out.printf("Player Life: %d\nComputer Life: %d\n",playerLife,compLife);
					round++;
					row = 1;
					col = 1;
				}
			}
			if(compLife == 0) {
				System.out.println("You win!");
				System.out.println();
			}
			else if(playerLife == 0) {
				System.out.println("Computer win!");
				System.out.println();
			}
			System.out.println("------------- Game Ended. All Bombs' Location are -----------");
			printAllBomb();
		}
	}
}