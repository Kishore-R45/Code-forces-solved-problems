package Problems;

import java.util.Scanner;

public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minIdx=0;
        int maxIdx=0;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            if(min>=arr[i]){
                min=arr[i];
                minIdx=i;
            }
            if(max<arr[i]){
                max=arr[i];
                maxIdx=i;
            }
        }
        System.out.println((maxIdx)+(n-1-minIdx)-((minIdx<maxIdx)?1:0));
    }
}
