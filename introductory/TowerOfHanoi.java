import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;

class TowerOfHanoi{
	private static int toh(int a, int b, int c, int n, List<String> pr){
		if(n==1){
			pr.add(a + " " + b);
			return 1;
		}	

		int left = toh(a,c,b,n-1,pr);
		pr.add(a + " " + b);		
		int right = toh(c,b,a,n-1,pr);
		return left + right + 1;
	}	
	public static void main(String args[]) throws IOException {
		BufferedReader sc = new BufferedReader( new InputStreamReader(System.in));	

		PrintWriter pr = new PrintWriter(System.out);
		int n  = Integer.parseInt(sc.readLine());
		List<String> moves = new ArrayList();
		int val = toh(1,3,2,n,moves);	
		
		pr.println(val);
		for(int i=0;i<val;i++){
			pr.println(moves.get(i));
		}

		pr.close();
		
	}
}
