package mohsolehuddin.latihan_algoritma_dengan_java;

import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println("Missing Number "+ missingNumber(List.of(1,2,4,5)));
    }
    public static Integer missingNumber(List<Integer> numbers){
        int max = numbers.get(0);
        int missingNum = 0;
        for (Integer num: numbers){
            if (num > max) max = num;
        }
        for (int i = 1; i < max ; i++) {
            if (!numbers.contains(i)) missingNum = i;
        }
        return missingNum;
    }
}
