package Problems;

import java.util.Scanner;

public class Wrong_subtraction {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        while(k-- > 0){
            int rem=n%10;
            if(rem==0){
                n/=10;
            }else{
                n-=1;
            }
        }
        System.out.println(n);
    }
}
