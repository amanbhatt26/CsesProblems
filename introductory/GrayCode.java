import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.StringBuilder;


class GrayCode{
	private static int pow(int a, int n){
		int res = 1;
		while(n>0){
			if((n&1)==1) res = res*a;
			a = a*a;
			n>>=1;
		}

		return res;
	}
	public static void main(String args[]) throws IOException {
		BufferedReader sc = new BufferedReader( new InputStreamReader(System.in));	

		PrintWriter pr = new PrintWriter(System.out);
		int n  = Integer.parseInt(sc.readLine());
		
		StringBuilder[] codes = new StringBuilder[pow(2,n)];	
		for(int i=0;i<codes.length;i++){
			codes[i] = new StringBuilder();
		}
		for(int i=1;i<=n;i++){
			int blockSize = pow(2,i);
			for(int j=0;j<codes.length;j+=2*blockSize){
				for(int k=0;k<blockSize/2;k++){
					codes[k+j].append('0');
				}
				for(int k=blockSize/2;k<blockSize;k++){
					codes[k+j].append('1');
				}
					
			}
			for(int j=blockSize;j<codes.length;j+=2*blockSize){
				for(int k=0;k<blockSize/2;k++){
					codes[k+j].append('1');
				}
				for(int k=blockSize/2;k<blockSize;k++){
					codes[k+j].append('0');
				}
					
			}
				
		}
		
		for(int i=0;i<codes.length;i++){
			pr.println(codes[i].reverse().toString());
		}	
		pr.close();
		
	}
}
