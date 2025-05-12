import java.util.Scanner;
import java.lang.Math;

class Repetition{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String seq = sc.nextLine();

		int i = 0;
		int ans = 0;
		while(i < seq.length()){
			
			int j = i;
			while( j < seq.length() && seq.charAt(i)==seq.charAt(j)) j++;

			ans = Math.max(ans, j-i);
			i=j;
		}

		System.out.println(ans);
		
	}
}
