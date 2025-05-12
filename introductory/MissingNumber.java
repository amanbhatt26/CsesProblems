import java.util.Scanner;

class MissingNumber{
	

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		long n = (long)sc.nextInt();

		long xorval = 0;
		for(long i=0;i<n-1;i++){
			xorval = xorval ^ (long)sc.nextInt();
		}

		for(long i=1;i<=n;i++){
			xorval = xorval ^ i;
		}

		System.out.println(xorval);
	}
}
