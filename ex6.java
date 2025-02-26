import java.util.Scanner;

public class ex6 {

    public static int ackerman(int m, int n) {
        if(m == 0) return n + 1;
        if(m != 0 && n == 0) return ackerman(m - 1, 1);
        return ackerman(m - 1, ackerman(m, n - 1));
    }
    public static void main(String[] args) {
        System.out.println("seq de ackerman");
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor de M: ");
        int m = in.nextInt();
        System.out.println("Digite o valor de N: ");
        int n = in.nextInt();

        System.out.println("Resultado: " + ackerman(m, n));
    }
}
