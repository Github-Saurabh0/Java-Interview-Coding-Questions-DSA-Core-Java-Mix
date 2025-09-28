import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)      // step 1: filter even numbers
                .map(n -> n * n)              // step 2: square them
                .collect(Collectors.toList()); // step 3: collect into list

        System.out.println(result); // [4, 16, 36]
    }
}
