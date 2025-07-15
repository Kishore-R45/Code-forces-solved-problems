package Problems;

import java.util.Scanner;

public class Game_23 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long m=in.nextLong();
        if(m%n!=0){
            System.out.println(-1);
            System.exit(0);
        }
        long q=m/n;
        int ans=0;
        while(q%2==0){
            q/=2;
            ans++;
        }
        while(q%3==0){
            q/=3;
            ans++;
        }
        System.out.println((q!=1)?-1:ans);
    }
}
