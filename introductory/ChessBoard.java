import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Math;
import java.util.Scanner;
import java.util.StringTokenizer;

class ChessBoard{
	
	private static boolean underAttack(StringBuilder[] board, int row, int col){
		
		for(int i=row+1;i<board.length;i++) if(board[i].charAt(col)=='Q') return true;
		for(int i=row+1,j=col+1; i<8 && j<8;i++,j++) if(board[i].charAt(j)=='Q') return true;
		for(int i=row+1,j=col-1; i<8 && j>=0; i++,j--) if(board[i].charAt(j)=='Q') return true;
		
		return false;
	}
	private static int backtrack(StringBuilder[] board, int n){
		if(n==0) return 1;
		
		int ans = 0;
		for(int i=0;i<8;i++){
			// check if n-1,i position can be used or not
			if(board[n-1].charAt(i)=='*' || underAttack(board,n-1,i)) continue;
			
			board[n-1].setCharAt(i, 'Q');
			ans+=backtrack(board,n-1);
			board[n-1].setCharAt(i,'.');
			
		}

		return ans;
					
	}	
	public static void main(String args[]) throws IOException{
		
		BufferedReader sc = new BufferedReader( new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);
		
		StringBuilder[] board = new StringBuilder[8];
		for(int i=0;i<8;i++) board[i] = new StringBuilder(sc.readLine());
		
		pr.println(backtrack(board,8));	
		pr.close();
	}
}


