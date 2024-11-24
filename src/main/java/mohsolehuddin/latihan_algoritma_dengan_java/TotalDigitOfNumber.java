package mohsolehuddin.latihan_algoritma_dengan_java;

import java.util.Arrays;
import java.util.List;

public class TotalDigitOfNumber {
    public static void main(String[] args) {
        System.out.println(totalDigitOfNumber(12345));
    }
    public static Integer totalDigitOfNumber(Integer number){
        List<String> listDigitOfNumber = Arrays.stream(number.toString().split("")).toList();
        Integer result = 0;
        for (String digit : listDigitOfNumber){
            result += Integer.parseInt(digit);
        }
        return result;
    }
}
