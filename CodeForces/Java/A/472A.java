public class learnFromMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.printf("8 %d\n", n - 8);
        } else
            System.out.printf("9 %d\n", n - 9);
        }
    }
