import java.util.Scanner;
import java.lang.Math;

class IncreasingArray{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[] arr = new long[n];
		long ans = 0;
		for(int i=0;i<n;i++){
			arr[i] = sc.nextLong();
		        if(i==0) continue;
			else{
				ans += Math.max(0, arr[i-1] - arr[i]);
				arr[i] = Math.max(arr[i], arr[i-1]);
			}

		}
		
		System.out.println(ans);

	}
}
