import java.util.Scanner;

public class ex1 {

    public static int mult(int n1, int n2) {
        if (n1 == 1) return n2;
        return n2 + mult(n1 - 1, n2);
    }

    public static void main(String[] args) {
        System.out.println("mult rec nmr naturais");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        System.out.println("Resultado: " + mult(n1, n2));
    }

}