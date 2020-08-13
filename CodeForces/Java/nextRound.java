import java.util.Scanner;

public class nextRound {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] contestant = new int[n];
        int lolos = 0;
        for (int i = 0; i < n; i++) {
            contestant[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(i==k){
                if((contestant[i]>=contestant[k-1])&&(contestant[i]>0)){
                    lolos++;
                }
            }else{
                if((contestant[i]>=contestant[k-1])&&(contestant[i]>0)){
                    lolos++;
                }
            }
        }
        System.out.println(lolos);
    }
}
