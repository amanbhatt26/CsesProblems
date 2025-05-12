import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

class TrailingZeros{
	public static void main(String args[]) throws IOException {
		BufferedReader sc = new BufferedReader( new InputStreamReader(System.in));	

		PrintWriter pr = new PrintWriter(System.out);
		long n  = Long.parseLong(sc.readLine());
		
		if(n < 5) {
			pr.println(0);
			pr.close();
			System.exit(0);
		}		

		long ans = 0;
		long a=5;
		while(a<=n){
			ans += n/a;
			a = a*5;
		}

		pr.println(ans);
		pr.close();
		
	}
}
