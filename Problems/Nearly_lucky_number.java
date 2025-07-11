package Problems;

import java.util.Scanner;

public class Nearly_lucky_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        int cnt=0;
        while(n>0){
            long rem=n%10;
            if(rem==7 || rem==4){
                cnt++;
            }
            n/=10;
        }
        System.out.print((cnt==4 || cnt==7)?"YES":"NO");
    }
}
