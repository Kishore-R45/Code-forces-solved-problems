package Problems;

import java.util.Scanner;

public class Erasing_Zeroes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-- > 0){
            String s=in.next();
            int cnt=0;
            int first=s.indexOf('1');
            int last=s.lastIndexOf('1');
            if(first==-1 || first==last){
                System.out.println(0);
                continue;
            }
            for(int i=first;i<=last;i++){
                if(s.charAt(i)=='0'){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
