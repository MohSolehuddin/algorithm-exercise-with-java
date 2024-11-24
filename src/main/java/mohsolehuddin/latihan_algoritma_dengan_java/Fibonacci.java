package mohsolehuddin.latihan_algoritma_dengan_java;

import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
    public static List<Integer> fibonacci(Integer n){
        List<Integer> listFibonacci = new ArrayList<>();
        listFibonacci.add(1);
        listFibonacci.add(1);
        while (true){
            int lengthFibonacci = listFibonacci.size();
            listFibonacci.add(listFibonacci.get(lengthFibonacci -1 ) + listFibonacci.get(lengthFibonacci-2));
            if (listFibonacci.size() == n) return listFibonacci;
        }
    }
}
