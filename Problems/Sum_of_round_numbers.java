package Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum_of_round_numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int[] arr=new int[t];
        for(int i=0;i<t;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<t;i++){
            List<Integer> ans=new ArrayList<>();
            int n=arr[i];
            int d=0;
            while(n>0){
                int rem=n%10;
                if(rem!=0){
                    int sum=rem* (int)Math.pow(10,d);
                    ans.add(sum);
                }
                d++;
                n/=10;
            }
            System.out.println(ans.size());
            for(int j=0;j<ans.size();j++){
                System.out.print(ans.get(j)+" ");
            }
            System.out.println();
        }
    }
}
