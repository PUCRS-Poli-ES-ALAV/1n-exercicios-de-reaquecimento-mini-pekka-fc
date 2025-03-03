public class ex7 {

    public static int sum(int[] vet, int i) {
        if (i == vet.length) return 0;
        return vet[i] + sum(vet, i + 1);
    }

    public static int prod(int[] vet, int i) {
        if (i == vet.length) return 1;
        return vet[i] * prod(vet, i + 1);
    }
    public static void main(String[] args) {
        System.out.println("sum e prod elem vet by rec");

        int[] vet = {1, 2, 3, 4, 5};
        System.out.println("Soma: " + sum(vet, 0));
        System.out.println("Produto: " + prod(vet, 0));
    }
}
