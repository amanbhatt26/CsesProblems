import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Math;
import java.util.Scanner;
import java.util.StringTokenizer;

class AppleDivision{
	private static long recurse(long[]weights, long b1, long b2, int n){
		if(n==0) return Math.abs(b1-b2);
		
		long left = recurse(weights, b1+weights[n-1],b2,n-1);
		long right = recurse(weights, b1, b2+weights[n-1], n-1);
		
		return Math.min(left,right);
	}
	public static void main(String args[]) throws IOException{
		
		BufferedReader sc = new BufferedReader( new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		int t = Integer.parseInt(s.nextLine());
		StringTokenizer in = new StringTokenizer(s.nextLine());

		long[] weights = new long[t];
		for(int i=0;i<t;i++){
			weights[i] = Long.parseLong(in.nextToken());
		}
		
		pr.println(recurse(weights, 0,0,t));
		pr.close();
	}
}


