package stream_api.java9;

import java.util.Comparator;
import java.util.stream.Stream;

public class TakeWhileExample {

    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,3,2)
                .sorted(Comparator.comparingInt( i -> i))
                .takeWhile(i -> i<5)
                .forEach(System.out ::println);
    }
}
