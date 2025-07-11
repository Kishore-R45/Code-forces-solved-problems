package Problems;

import java.util.Scanner;

public class Maximum_Increase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int max=1;
        int cnt=1;
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                cnt++;
            }else{
                max=Math.max(max,cnt);
                cnt=1;
            }
        }
        System.out.println(Math.max(max,cnt));
    }
}
