package Problems;

import java.util.Scanner;

public class Fox_and_Snake {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        boolean isEnd=true;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i%2==0){
                    System.out.print("#");
                }else{
                    if(!isEnd && j==0){
                        System.out.print("#");
                    }else if(isEnd && j==c-1){
                        System.out.print("#");
                        isEnd=false;
                    }else{
                        System.out.print(".");
                        if(!isEnd && j==c-1){
                            isEnd=true;
                        }
                    }

                }
            }
            System.out.println();
        }
    }
}
