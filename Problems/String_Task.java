package Problems;

import java.util.Scanner;

public class String_Task {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        s=s.toLowerCase();
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray()){
            if(isVowel(c)){
                ans.append('.');
                ans.append(c);
            }
        }
        System.out.println(ans);
    }
    private static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y'){
            return false;
        }
        return true;
    }
}
