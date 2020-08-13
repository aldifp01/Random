import java.util.Scanner;

public class watermelon{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int berat = sc.nextInt();
		if ((berat%2==0)&&(berat!=2)){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
