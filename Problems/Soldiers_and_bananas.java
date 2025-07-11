package Problems;

import java.util.Scanner;

public class Soldiers_and_bananas {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int k=in.nextInt();
        int n=in.nextInt();
        int w=in.nextInt();
        long sum=0;
        for(int i=1;i<=w;i++){
            sum+=((long) i *k);
        }
        System.out.println(sum<=n?0:sum-n);

    }
}
