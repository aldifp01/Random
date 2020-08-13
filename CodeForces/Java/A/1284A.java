import java.util.*;
import java.io.*;

public class nearyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String[] a = new String[x];
        String[] b = new String[y];
        sc.nextLine();
       // System.out.println("Masukan string");
        for (int i = 0; i < x; i++) {
            a[i]=sc.next();
        }

        for(int i = 0; i < 1; i++){
            int j;
            String last;
            //Stores the last element of array
            last = a[x-1];

            for(j = x-1; j > 0; j--){
                //Shift element of array by one
                a[j] = a[j-1];
            }
            //Last element of array will be added to the start of array.
            a[0] = last;
        }

        // System.out.println("Masukan string lagi");
        for (int i = 0; i < y; i++) {
            b[i]=sc.next();
        }

        for(int i = 0; i < 1; i++){
            int j;
            String last;
            //Stores the last element of array
            last = b[y-1];

            for(j = y-1; j > 0; j--){
                //Shift element of array by one
                b[j] = b[j-1];
            }
            //Last element of array will be added to the start of array.
            b[0] = last;
        }
       // System.out.println("Masukan banyaknya");
        int xx = sc.nextInt();
        String[] c = new String[xx];
        for (int i = 0; i < xx; i++) {
           // System.out.println("Masukan angka");
            String a1;
            String b1;
            int yeet = sc.nextInt();
            int zzz = yeet % x;
            a1=a[zzz];
            int zzzz = yeet % y;
            b1=b[zzzz];
            c[i]=a1+b1;

        }
        for (int i = 0; i <xx ; i++) {
            System.out.println(c[i]);
        }
    }
}
