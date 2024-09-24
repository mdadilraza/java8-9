package stream_api;

import java.util.stream.Stream;

public class StreamApi1 {
    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                        .forEach(System.out::println);

    }
}
