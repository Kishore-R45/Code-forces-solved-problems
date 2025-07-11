package Problems;

import java.util.Scanner;

public class Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String[] arr=new String[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=in.next();
            if(arr[i].equals("Tetrahedron")){
                sum+=4;
            }else if(arr[i].equals("Cube")){
                sum+=6;
            }else if(arr[i].equals("Octahedron")){
                sum+=8;
            }else if(arr[i].equals("Dodecahedron")){
                sum+=12;
            }else{
                sum+=20;
            }
        }
        System.out.println(sum);
    }
}
