import java.util.ArrayList;
import java.util.List;

public class PrimeInRange {
    public static void main(String[] args) {
        List<Integer> primeList = primeInRange(1, 19);
        System.out.println(primeList);
    }
    private static List<Integer> primeInRange(Integer startRange, Integer endRRange){
        List<Integer> primeList = new ArrayList<>();
        for (int i = startRange; i <= endRRange ; i++) {
            if (isPrime(i)){
                primeList.add(i);
            }
        }
        return primeList;
    }

    private static Boolean isPrime(Integer number){
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i*i < number ; i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
