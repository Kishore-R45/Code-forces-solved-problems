package Problems;

import java.util.Scanner;

public class Chew_and_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s=Integer.toString(n);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int d=s.charAt(i)-'0';
            int op=9-d;
            if(op==0 && i==0){
                sb.append(d);
            }else{
                sb.append(Math.min(d,op));
            }
        }
        System.out.println(sb.toString());
    }
}
