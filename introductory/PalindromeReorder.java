import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.lang.StringBuilder;

class PalindromeReorder{
	public static void main(String args[]) throws IOException {
		BufferedReader sc = new BufferedReader( new InputStreamReader(System.in));	

		PrintWriter pr = new PrintWriter(System.out);
		String word = sc.readLine();
		
		int[] freq = new int[26];
		
		Arrays.fill(freq,0);
		for(int i=0;i<word.length();i++){
			char c = word.charAt(i);			
			freq[c-'A']++;
		}	
		
		int oddFreq = 0;
		for(var f:freq){
			if(f%2!=0) oddFreq++;
		}	
		
		if(oddFreq > 1) {
			pr.println("NO SOLUTION");
			pr.close();
			System.exit(0);
		}

		StringBuilder sb = new StringBuilder();
		StringBuilder oddb = new StringBuilder();
		for(int c=0;c<26;c++){
			int f = freq[c];
			if(f%2==0){
				for(int i=0;i<f/2;i++){
					sb.append((char)(c+'A'));
				}
			}else{
				for(int i=0;i<f;i++) oddb.append((char)(c+'A'));
			}
		} 

		pr.println(sb.toString() + oddb.toString() + sb.reverse().toString());
		pr.close();
		
	}
}
