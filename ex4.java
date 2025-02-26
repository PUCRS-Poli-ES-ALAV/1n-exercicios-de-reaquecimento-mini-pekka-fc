import java.util.Scanner;

public class ex4 {

    public static String reverse(String str) {
        if (str.length() == 0) return "";
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
    public static void main(String[] args) {
        System.out.println("inversao rec de string");
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a string: ");
        String str = in.nextLine();
        System.out.println("Resultado: " + reverse(str));
    }
}
