package mohsolehuddin.latihan_algoritma_dengan_java;

import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration;

import java.util.List;

public class SumOfOddAndEvent {
    public static void main(String[] args) {
        System.out.println(sumOfOddAndEvent(List.of(1,2,3,4,5)));
    }
    public static String sumOfOddAndEvent(List<Integer> numbers){
        int sumOdd = 0;
        int sumEvent = 0;

        for (Integer num: numbers){
            if (num % 2 == 0){
                sumEvent += num;
            }else {
                sumOdd += num;
            }
        }

        return "Jumlah bilangan ganjil: " + sumOdd + "\n" + "Jumlah bilangan genap: " + sumEvent;
    }

}
