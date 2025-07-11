package Problems;

import java.util.Scanner;

public class C_program1_operation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int[][] arr=new int[t][3];
        for(int i=0;i<t;i++){
            arr[i][0]=in.nextInt();
            arr[i][1]=in.nextInt();
            arr[i][2]=in.nextInt();
        }
        for(int i=0;i<t;i++){
            int cnt=0;
            int a=arr[i][0];
            int b=arr[i][1];
            int n=arr[i][2];
            while(Math.max(a,b)<=n){
                if(a<b){
                    a+=b;
                }else{
                    b+=a;
                }
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
