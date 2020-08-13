import java.util.*;
import java.io.*;
import java.lang.*;

public class deadline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String[] yett = new String[x];
        for (int i = 0; i < x; i++) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            long y = (n - 1) / 2, b = n - d;
            long a = y * y + y * (1 - n);
            if (a <= b){
                yett[i]="YES";
            }
            else{
                yett[i]="NO";
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.println(yett[i]);
        }
    }
}
