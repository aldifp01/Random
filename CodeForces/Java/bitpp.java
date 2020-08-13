import java.util.*;
import java.io.*;

public class bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x1 = sc.nextLine();
        int x = Integer.parseInt(x1);
        int xx = 0;
        for(int i=0;i<x;i++){
            String yeehaww = sc.nextLine();
            if(yeehaww.equals("X++")||yeehaww.equals("++X")) {
                xx++;
            }
            else{
                   --xx;
            }
        }
        System.out.println(xx);
    }
}
