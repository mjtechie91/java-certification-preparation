package streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamTest1 {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);
        int sum = list.stream()
                .filter(n -> n%2 == 0)
                .reduce(0, (a, b) -> a+b);

        Optional<Integer> optionalSum = list.stream()
                .filter(n -> n%2 == 0)
                .reduce((a, b) -> a+b);

        optionalSum.ifPresent(System.out::println);
    }
}
