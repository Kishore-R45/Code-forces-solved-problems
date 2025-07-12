package Problems;

import java.util.Scanner;

public class Vanya_and_Cubes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        int needed=1;
        int ans=0;
        while(sum+needed <= n){
            ans++;
            sum+=needed;
            needed+=(ans+1);
        }
        System.out.println(ans);
    }
}
