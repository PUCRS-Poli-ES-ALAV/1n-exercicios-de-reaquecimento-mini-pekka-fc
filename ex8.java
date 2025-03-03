public class ex8 {

    public static boolean palindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return palindrome(str, start + 1, end - 1);
    }
    public static void main(String[] args) {
        System.out.println("palindrome check rec");

        String str = "roma é amor";
        System.out.println("String: " + str);
        
        System.out.println("Resultado: " + palindrome(str, 0, str.length() - 1));
    }
}
