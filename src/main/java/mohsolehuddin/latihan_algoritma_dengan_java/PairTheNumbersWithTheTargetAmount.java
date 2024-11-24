package mohsolehuddin.latihan_algoritma_dengan_java;

import java.util.ArrayList;
import java.util.List;

public class PairTheNumbersWithTheTargetAmount {
    public static void main(String[] args) {
        System.out.println(pirTheNumbersWithTheTargetAmount(List.of(1,2,3,4,5,6,7,8,9), 8));
    }
    public static List<List<Integer>> pirTheNumbersWithTheTargetAmount(List<Integer> numbers, Integer target){
        List<List<Integer>> listPairNumber = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size() ; j++) {
                int currentI = numbers.get(i);
                int currentJ = numbers.get(j);
                if ( currentI+ currentJ == target) listPairNumber.add(List.of(currentI, currentJ));
            }
        }
        return listPairNumber;
    }
}
