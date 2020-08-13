import java.util.*;
import java.io.*;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String y = sc.nextLine();
        int x = Integer.parseInt(y);
        String testing = "";
        char m;
        char a;
        String yeet;
        int zeeb;
        String [] arrStr = new String[x];
        for(int i=0;i<x;i++){
            arrStr[i]= sc.nextLine();
        }
        for(int i=0;i<x;i++){
            testing = arrStr[i];
            if(testing.length()>10){
                m = testing.charAt(0);
                a = testing.charAt(testing.length()-1);
                zeeb = testing.length()-2;
                yeet = String.valueOf(zeeb);
                System.out.println(m+yeet+a);
            }
            else{
                System.out.println(testing);
            }
        }
    }
}
