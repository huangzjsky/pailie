import java.util.Scanner;
public class pailie{
    public static void main( String[] args ){
        int n,m,p,i,high,low ;
        while (true){
            System.out.println("Input n:");
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            System.out.println("Input m:");
            m = s.nextInt();
            if (m > n || m < 1 || n < 1) System.out.println("Input Error Please Input Again!");
            else break;
        }
        
        high = 1 ;
        low  = 1;
        for (i=1 ; i<=n ;i++) high*=i;
        for (i=1 ; i<=(n-m) ; i++) low *=i;
        p= high / low;
        System.out.println("P(n,m) = " + p);
     }
 }