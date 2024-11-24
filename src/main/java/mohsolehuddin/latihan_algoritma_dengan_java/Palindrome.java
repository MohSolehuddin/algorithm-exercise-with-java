package mohsolehuddin.latihan_algoritma_dengan_java;

public class Palindrome {
    public static void main(String[] args) {
        String message = "kasurrusak";
        System.out.println(message + " Is palindrome " + isPalindrome(message));
    }
    private static Boolean isPalindrome(String message){
        int fromStart = 0;
        int fromEnd = message.length() - 1;
        for (int i = 0; i < message.length()/2 ; i++) {
            System.out.println("From start " + fromStart + " char " + message.charAt(fromStart));
            System.out.println("From end " + fromEnd + " char " + message.charAt(fromEnd));
            if (message.charAt(fromEnd) != message.charAt(fromStart)) return false;
            fromStart++;
            fromEnd--;
        }
        return true;
    }
}
