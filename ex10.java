public class ex10 {

    public static int fibg(int f0, int f1, int n) {
        if (n == 0) {
            return f0;
        } else if (n == 1) {
            return f1;
        } else {
            return fibg(f0, f1, n - 1) + fibg(f0, f1, n - 2);
        }
    }

    public static void main(String[] args) {
        
        /* recursivamente Defina uma sequência de Fibonacci generalizada, de f0 a f1 como sequência fibg(f0, f1, 0), fibg(f0, f1, 1), fibg(f0, f1, 2), ..., onde:
fibg(f0, f1, 0) = f0
fibg(f0, f1, 1) = f1
fibg(f0, f1, n) = fibg(f0, f1, n − 1) + fibg(f0, f1, n − 2), se n > 1. */

        int f0 = 0;
        int f1 = 1;
        int n = 4;
        System.out.println("Resultado: " + fibg(f0, f1, n));

    }
}
