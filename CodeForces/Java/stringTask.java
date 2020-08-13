import java.util.*;
import java.io.*;

public class stringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yeet = sc.nextLine();
        int x = yeet.length();
        char [] coeg = new char[x];
        for(int i = 0 ;i<x;i++){
            coeg[i]=yeet.charAt(i);
        }
        for(int i=0;i<x;i++){
            {
                if(coeg[i]!='a' && coeg[i]!='A' && coeg[i]!='e' && coeg[i]!='E' && coeg[i]!='i' && coeg[i]!='I' && coeg[i]!='o' && coeg[i]!='O' && coeg[i]!='u' && coeg[i]!='U' && coeg[i]!='y' && coeg[i]!='Y')
                {
                    if(coeg[i]<='Z') coeg[i]+=32;
                    System.out.printf("%c",'.');
                    System.out.printf("%c",coeg[i]);
                }
            }
        }
    }
}
