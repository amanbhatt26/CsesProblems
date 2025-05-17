import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

class RaabGame{
    private static PrintWriter pr = new PrintWriter(System.out);
    private static BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
    
    private static void rightshift(int m, int n, int a){
        
        for(int i=m-a+1;i<=m;i++){
            pr.print(i + " ");
        }

        for(int i=1;i<=m-a;i++){
            pr.print(i+ " ");
        }

        for(int i=m+1;i<=n;i++){
            pr.print(i + " ");
        }
        pr.println();
    }
    public static void main(String args[]) throws IOException {
        
        int t = Integer.parseInt(re.readLine());

        while(t-- > 0){
           
            StringTokenizer st = new StringTokenizer(re.readLine());
            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if(a == 0 && b == 0 ){
                pr.println("YES");
                for(int i=1;i<=n;i++){
                    pr.print(i + " ");
                }
                pr.println();
                for(int i=1;i<=n;i++){
                    pr.print(i + " ");
                }
                pr.println();
                continue;
            }else if(a >0 && b > 0 &&  a + b <= n){
                
                if(a < b){
                    pr.println("YES");
                    // right shift left array by a 
                    rightshift(a+b,n,a);
                    for(int i=1;i<=n;i++){
                        pr.print(i + " ");
                    }
                    pr.println();
    
                }else{
                    pr.println("YES");
                    // right shift second array by b
                    for(int i=1;i<=n;i++){
                        pr.print(i + " ");
                    }
                    pr.println();
                    rightshift(a+b,n,b);
                    continue;
                }
            }else{
                pr.println("NO");
            }
        }

        pr.close();
    }
}
