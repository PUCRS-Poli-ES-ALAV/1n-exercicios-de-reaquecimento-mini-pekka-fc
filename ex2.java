import java.util.Scanner;

public class ex2 {

    public static int sum(int n1, int n2) {
        if (n1 >= 0) return 1 + sum(n1 - 1, n2);
        if (n1 == 0 && n2 >= 0) return 1 + sum(n1, n2 - 1);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("sum rec nmr naturais por incremento (Ex.: 3 + 2 = + + (+ + + 1)).");

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = in.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = in.nextInt();

        System.out.println("Resultado: " + sum(n1, n2));
    }
}
