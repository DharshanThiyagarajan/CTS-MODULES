import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Exercise27_LambdaSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Zebra", "Apple", "Mango", "Banana");
        Collections.sort(list, (a, b) -> a.compareToIgnoreCase(b));
        list.forEach(System.out::println);
    }
}
