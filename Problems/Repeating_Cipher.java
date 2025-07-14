
import java.util.Scanner;

public class Repeating_Cipher {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s=in.next();
        int i=0;
        int cnt=1;
        StringBuilder ans=new StringBuilder();
        while(i<n){
            ans.append(s.charAt(i));
            i+=cnt;
            cnt++;
        }
        System.out.println(ans);
    }
}
