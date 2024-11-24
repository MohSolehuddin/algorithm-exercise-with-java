package mohsolehuddin.latihan_algoritma_dengan_java;

import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        System.out.println(sorting(List.of(3,2,1,5,7,9,6)));
    }
    public static List<Integer> sorting(List<Integer> numbers){
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        for (int i = 0; i < sortedNumbers.size(); i++) {
            for (int j = i+1; j < sortedNumbers.size(); j++) {
                if (sortedNumbers.get(i) > sortedNumbers.get(j)){
                    int temp = sortedNumbers.get(i);
                    sortedNumbers.set(i, sortedNumbers.get(j));
                    sortedNumbers.set(j, temp);
                }
            }
        }
        return sortedNumbers;
    }
}
