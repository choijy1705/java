package practice;
import java.util.*;
import java.io.*;

public class Boardcover {
	public static StringBuilder sb = new StringBuilder();
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static Scanner sc = new Scanner(System.in);
	public static int C;
	public static int H;
	public static int W;
	public static int count = 0;
	
	public static String[][] board;
	public static void main(String[] args) throws Exception {
		C = Integer.parseInt(br.readLine().trim());
		
		for(int i=0;i<C;i++) {
			solve();
		}
		System.out.println(sb.toString());

	}
	private static void solve() throws Exception {
		String lines = br.readLine();
		String[] spl = lines.split(" ");
		H = Integer.parseInt(spl[0]);
		W = Integer.parseInt(spl[1]);
		
		initBoard();
		
		for(int i=0;i<H;i++) {
			String input = br.readLine();
			int j=1;
			for(char c : input.toCharArray()) {
				board[i+1][j] = String.valueOf(C);
				j++;
			}
		}
		
		boardcover();
		sb.append(count).append("\n");
		
		
		
	}
	private static void boardcover() {
		int x=1;
		int y=1;
		for(x=1;x<H+1;x++) {
			for(y=1;y<W+1;y++) {
				if(board[x][y].equals(".")) {
					break;
				}
			}
			if(y<W+1 && board[x][y].equals(".")) {
				break;
			}
		}
		
		if(x == H+1 && y == W+1) {
			count++;
			return;
		}
		
		if(board[x+1][y].equals(".") && board[x+1][y+1].equals(".")) {
			board[x][y] = board[x+1][y] = board[x+1][y+1] = "*";
			boardcover();
			board[x][y] = board[x+1][y] = board[x+1][y+1] = ".";
		}
		
		if(board[x+1][y-1].equals(".") && board[x+1][y].equals(".")) {
			board[x][y] = board[x+1][y-1] = board[x+1][y] = "*";
			boardcover();
			board[x][y] = board[x+1][y-1] = board[x+1][y] = ".";
		}
		
		if(board[x][y+1].equals(".") && board[x+1][y+1].equals(".")) {
			board[x][y] = board[x][y+1] = board[x+1][y+1] = "*";
			boardcover();
			board[x][y] = board[x][y+1] = board[x+1][y+1] = ".";
		}
		
		if(board[x+1][y].equals(".") && board[x][y+1].equals(".")) {
			board[x][y] = board[x+1][y] = board[x][y+1] = "*";
			boardcover();
			board[x][y] = board[x+1][y] = board[x][y+1] = ".";
		}
		
	}
	private static void initBoard() {
		board = new String[H+2][W+2];
		for(int i=0;i<=H;i++) {
			board[i][0] = board[i][W+1] = "#";
		}
		for(int i=0;i<W+2;i++) {
			board[0][i] = board[H+1][i] = "#";
		}
		count = 0;
		
	}

}
