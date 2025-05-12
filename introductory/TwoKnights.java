import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Math;
import java.util.Scanner;
import java.util.StringTokenizer;

class TwoKnights{
	
	public static void main(String args[])throws IOException{
		BufferedReader sc = new BufferedReader( new InputStreamReader(System.in));	

		PrintWriter pr = new PrintWriter(System.out);
		long n  = Long.parseLong(sc.readLine());
		for(long i=1;i<=n;i++){
			pr.println((i*i)*(i*i - 1)/2 - 4*(i-1)*(i-2));	
		}
		pr.close();
	
	}
}
