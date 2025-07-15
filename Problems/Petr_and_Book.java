
import java.util.Scanner;

public class Petr_and_Book {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        int[] arr=new int[7];
        for(int i=0;i<7;i++){
            arr[i]=in.nextInt();
        }
        int i=0;
        while(p>0){
            p-=arr[i];
            if(p<=0){
                System.out.println(i+1);
                break;
            }
            i=(i+1)%7;
        }

    }
}
