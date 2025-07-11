package Problems;

import java.util.Scanner;

public class Beautiful_matrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[5][5];
        int row=0;
        int col=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=in.nextInt();
                if(arr[i][j]==1){
                    row=i+1;
                    col=j+1;
                }
            }
        }
        System.out.println(Math.abs(row-3)+Math.abs(col-3));
    }
}
