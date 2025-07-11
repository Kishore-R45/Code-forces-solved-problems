package Problems;

import java.util.*;

public class Helpful_Math {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<s.length();i+=2){
            int a=s.charAt(i)-'0';
            arr.add(a);
        }
        Collections.sort(arr);
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<arr.size();i++){
            ans.append(arr.get(i));
            if(i!=arr.size()-1){
                ans.append('+');
            }
        }
        System.out.println(ans.toString());
    }
}
