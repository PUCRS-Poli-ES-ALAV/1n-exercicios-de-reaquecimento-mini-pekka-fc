import java.util.Scanner;

public class ex5 {

    public static int func(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return 2 * func(n-1) + 3 * func(n-2);
    }
    public static void main(String[] args) {
        System.out.println("Gerador da sequência dada por:\r\n" + //
                        "F(1) = 1\r\n" + //
                        "F(2) = 2\r\n" + //
                        "F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2).");

        System.out.println("Digite o valor de N: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Resultado: " + func(n));
    }
}
