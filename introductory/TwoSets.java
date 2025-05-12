import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
class TwoSets{
	
	public static void main(String args[])throws IOException{
		BufferedReader sc = new BufferedReader( new InputStreamReader(System.in));	

		PrintWriter pr = new PrintWriter(System.out);
		long n  = Long.parseLong(sc.readLine());
		
		long sum = n*(n+1)/2;
		if(sum%2==0) {
			List<Long>set1 = new ArrayList();
			List<Long>set2 = new ArrayList();
			if(n%2==0){
				long l = 1; long r = n;
				boolean swtch = false;
				while(l<r){
					if(swtch){

						set1.add(l);
						set1.add(r);		
					}else{
						set2.add(l);
						set2.add(r);
					}
					
					swtch= !swtch;
					l++;
					r--;
				}
			}else{
				long l = 4;long r = n;
				set1.add((long)1);set1.add((long)2); set2.add((long)3);
				boolean swtch = false;
				while(l<r){
					if(swtch){

						set1.add(l);
						set1.add(r);		
					}else{
						set2.add(l);
						set2.add(r);
					}
					
					swtch= !swtch;
					l++;
					r--;
				}
			
			}


			pr.println("YES");
			pr.println(set1.size());
			Iterator<Long> iter = set1.iterator();
			while(iter.hasNext()){
				pr.print(iter.next() + " ");
			}
			pr.println("");
			pr.println(set2.size());
			iter = set2.iterator();
			while(iter.hasNext()){
				pr.print(iter.next() + " ");	
			}
		}else{
			pr.println("NO");	
		}	
		pr.close();
	
	}
}
