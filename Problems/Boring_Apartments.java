
import java.util.Scanner;

public class Boring_Apartments {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-- > 0){
            int n=in.nextInt();
            int digits=0;
            int rem=0;
            while(n>0){
                rem=n%10;
                digits++;
                n/=10;
            }
            int ans=0;
            int[] arr={1,3,6,10};
            ans=arr[digits-1];
            ans+=((rem-1)*10);
            System.out.println(ans);
        }
    }
}
