package Problems;

import java.util.Scanner;

public class Bit_pp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            String s=in.next();
            if(s.equals("X++") || s.equals("++X")){
                ans++;
            }else{
                ans--;
            }
        }
        System.out.println(ans);
    }
}
