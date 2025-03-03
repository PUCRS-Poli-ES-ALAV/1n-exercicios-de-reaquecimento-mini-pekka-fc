public class ex9 {

    public static void generateCombinations(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
        } else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                generateCombinations(str, start + 1, end);
                str = swap(str, start, i);
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    
    public static void main(String[] args) {
        /* Dado um número n, gere todas as possíveis combinações com as n primeiras letras do alfabeto. Ex.: n = 3. Resposta: ABC, ACB, BAC, BCA, CAB, CBA.  */
    
        int n = 3;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str = alphabet.substring(0, n);
        System.out.println("String: " + str);
        System.out.println("Resultado: ");
        generateCombinations(str, 0, str.length() - 1);

    }
}
