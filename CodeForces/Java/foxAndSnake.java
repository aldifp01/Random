import java.util.*;
import java.io.*;

public class snake {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String le = sc.nextLine();
        int x = Integer.parseInt(le.split(" ")[0]);
        int y = Integer.parseInt(le.split(" ")[1]);
        int z = 0;
        for(int i=0;i<x;i++){
            if(i%2==0){
                for(int j=0;j<y;j++){
                    System.out.print("#");
                }
            }
            else{
                if(z%2==0){
                    for(int j=0;j<y-1;j++){
                        System.out.print(".");
                    }
                    System.out.print("#");
                }
                else{
                    System.out.print("#");
                    for(int j=0;j<y-1;j++){
                        System.out.print(".");
                    }
                }
                z++;
            }
            System.out.println();
        }
    }
}
