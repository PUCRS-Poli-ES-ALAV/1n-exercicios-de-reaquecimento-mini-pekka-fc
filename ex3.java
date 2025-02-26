import java.util.Scanner;

public class ex3 {

    public static float calc(float n) {
        if (n == 1) return 1;
        return 1/n + calc(n - 1);
    }
    public static void main(String[] args) {
        
        System.out.println("Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.");
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor de N: ");
        float n = in.nextFloat();

        System.out.println("Resultado: " + calc(n));

    }
    
}
