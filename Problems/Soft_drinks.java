package Problems;

import java.util.Scanner;

public class Soft_drinks {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int l=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        int p=in.nextInt();
        int nl=in.nextInt();
        int np=in.nextInt();

        int total_ml=k*l;
        int total_slices=c*d;
        int a1=total_ml/nl;
        int b1=total_slices;
        int c1=p/np;
        int ans= Math.min(a1/n,Math.min(b1/n,c1/n));
        System.out.println(ans);

    }
}
