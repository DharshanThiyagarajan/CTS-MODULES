import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Exercise28_StreamEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 8, 15, 6, 12, 9);
        List<Integer> evens = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());
        evens.forEach(System.out::println);
    }
}
