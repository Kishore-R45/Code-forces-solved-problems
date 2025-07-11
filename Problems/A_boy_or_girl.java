package Problems;

import java.util.Scanner;

public class A_boy_or_girl {
    public static void main(String[] args) {
        int[] arr=new int[26];
        Scanner in =new Scanner(System.in);
        String str=in.next();
        int cnt=0;
        for(char c:str.toCharArray()){
            if(arr[c-'a']++ == 0){
                cnt++;
            }
        }
        if(cnt%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
