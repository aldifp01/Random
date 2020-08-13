import java.util.*;
import java.io.*;

public class teamA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int[] solusi = new int[3];
        int bisaBener =0;
        for(int i=0;i<x;i++){
            int bisaFinal=0;
            for(int j=0;j<=2;j++) {
                solusi[j] = sc.nextInt();
                bisaFinal = solusi[0] + solusi[1] + solusi[2];
            }
            if(bisaFinal>=2){
                bisaBener++;
            }
        }
        System.out.println(bisaBener);
    }
}
