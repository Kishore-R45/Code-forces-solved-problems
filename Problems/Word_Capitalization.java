package Problems;

import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        char[] arr=s.toCharArray();
        if(arr[0]>'Z'){
            arr[0]=(char)(arr[0]-32);
        }
        String ans= new String(arr);
        System.out.println(ans);
    }
}
