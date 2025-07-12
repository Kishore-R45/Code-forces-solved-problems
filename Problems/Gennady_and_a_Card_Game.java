package Problems;

import java.util.Scanner;

public class Gennady_and_a_Card_Game {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        String[] arr=new String[5];
        for(int i=0;i<5;i++){
            arr[i]=in.next();
        }
        for(int i=0;i<5;i++){
            if(str.charAt(0)==arr[i].charAt(0) || str.charAt(1)==arr[i].charAt(1)){
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}
