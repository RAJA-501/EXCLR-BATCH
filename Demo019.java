import java.util.ArrayList;
import java.util.List;

public class Demo020 {

    public static List<Integer> fibonacciSequence(int n) {
        List<Integer> fibSequence = new ArrayList<>();

        if (n <= 0) {
            return fibSequence;
        } else if (n == 1) {
            fibSequence.add(0); 
            return fibSequence;
        } else if (n == 2) {
            fibSequence.add(0); 
            fibSequence.add(1); 
            return fibSequence;
        }

        
        fibSequence.add(0);
        fibSequence.add(1);

        
        for (int i = 2; i < n; i++) {
            int nextTerm = fibSequence.get(i - 1) + fibSequence.get(i - 2);
            fibSequence.add(nextTerm);
        }

        return fibSequence;
    }

    public static void main(String[] args) {
        int numTerms = 10; 
        List<Integer> fibonacciNumbers = fibonacciSequence(numTerms);
        System.out.println(fibonacciNumbers);
    }
}