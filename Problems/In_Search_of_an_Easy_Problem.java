package Problems;

import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        boolean isHard=false;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            if(arr[i]==1){
                isHard=true;
            }
        }
        System.out.println(isHard?"HARD":"EASY");

    }
}
