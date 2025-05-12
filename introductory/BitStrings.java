import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

class BitStrings{
	public static void main(String args[]) throws IOException {
		BufferedReader sc = new BufferedReader( new InputStreamReader(System.in));	

		PrintWriter pr = new PrintWriter(System.out);
		long n  = Long.parseLong(sc.readLine());
				
		long mod = (long)1e9 + 7;
		long res = 1;
		long a = 2;
		while(n>0){
			if((n&1) == 1) res = (res*a)%mod;
			a = (a*a)%mod;
			n = n>>1;
		}
		
		pr.println(res);
		pr.close();
		
	}
}
