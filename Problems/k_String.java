package Problems;

import java.util.Scanner;

public class k_String {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        String s=in.next();
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]%k!=0){
                System.out.println(-1);
                System.exit(0);
            }
        }
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(ans.length()!=s.length()){
            int rem=arr[i%26]/k;
            for(int j=0;j<rem;j++){
                ans.append((char)((i%26)+'a'));
            }
            i++;
        }
        System.out.println(ans);
    }
}
