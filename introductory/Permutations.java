import java.util.Scanner;
import java.io.PrintWriter;

class Permutations{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrintWriter pr = new PrintWriter(System.out);
		if(n==1) {
			pr.println(1);
			pr.close();
			System.exit(0);
		}
		if(n<=3) {
			pr.println("NO SOLUTION");
			pr.close();
			System.exit(0);
		}
		
		for(int i=2;i<=n;i+=2){
			pr.print(i+" ");
		}

		for(int i=1;i<=n;i+=2){
			pr.print(i+" "); 
		}
		
		pr.close();
	}
}
