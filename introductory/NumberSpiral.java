import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Math;
import java.util.Scanner;
import java.util.StringTokenizer;

class NumberSpiral{
	public static void main(String args[]) throws IOException{
		
		BufferedReader sc = new BufferedReader( new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		int t = Integer.parseInt(s.nextLine());
		long ans = 0;
		
		while(t-- > 0){
			long row, col;
			StringTokenizer in = new StringTokenizer(s.nextLine());
			row = Long.parseLong(in.nextToken());
			col = Long.parseLong(in.nextToken());

			long corner = Math.max(row,col);
			long direction = corner%2;

			long val = 1 + 2*(corner *(corner-1)/2);
			ans = val;			
			if(direction==1){
				
				if(row < corner) ans = val + (corner-row);
				if(col < corner) ans = val - (corner-col);
			}

			if(direction == 0){
				if(row < corner) ans = val - (corner-row);
				if(col < corner) ans = val + (corner-col);
			}

			pr.println(ans);

			
		}

		pr.close();
	}
}

// this is a comment just for the sake of it
