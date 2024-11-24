package mohsolehuddin.latihan_algoritma_dengan_java;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static Integer factorial(Integer n){
        if (n == 1) return 1;
        return n * factorial(n-1);
    }
}
