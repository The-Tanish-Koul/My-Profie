import java.util.*;

/**
 * temp
 */
public class temp {

    public static int fibo(int n) {
        if (n==0) {
            return 0;
            
        }
        else if(n==1){
            return 1;
        }
        int fbnm2 = fibo(n-2);
        int fbnm1 = fibo(n-1);
        int sumfibo = fbnm1+fbnm2;
        return sumfibo;
        
    }

    public static void main(String[] args) {
        int ans = fibo(25);
        System.out.println(ans);
    }
}