package Problems;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            ans[arr[i]-1]=i+1;
        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
