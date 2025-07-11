package Problems;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum-=arr[i][0];
            sum+=arr[i][1];
            max=Math.max(sum,max);
        }
        System.out.println(max);
    }
}
