import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class CoinPiles{
	public static void main(String args[]) throws IOException {
		BufferedReader sc = new BufferedReader( new InputStreamReader(System.in));	

		PrintWriter pr = new PrintWriter(System.out);
		long t  = Long.parseLong(sc.readLine());
		
		while(t-->0){
			StringTokenizer st = new StringTokenizer(sc.readLine());
			long x= Long.parseLong(st.nextToken());
			long y = Long.parseLong(st.nextToken());
			
			long a = 2*x-y;
			long b = 2*y-x;
			
			if(a>=0 && a%3==0 && b>=0 && b%3==0) {
				pr.println("YES");
			}else{
			
				pr.println("NO");
			}
		}	

		pr.close();
		
	}
}
