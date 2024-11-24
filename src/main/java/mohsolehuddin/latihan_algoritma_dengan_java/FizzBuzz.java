package mohsolehuddin.latihan_algoritma_dengan_java;

public class FizzBuzz {
    public static void main(String[] args) {
        loopFizzBuzz(30);
    }
    public static void loopFizzBuzz(Integer n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(fizzBuzz(i));
        }
    }
    public static String fizzBuzz(Integer n){
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
        if (n % 3 == 0) return "Fizz";
        if (n % 5 == 0) return "Buzz";
        return n.toString();
    }
}
