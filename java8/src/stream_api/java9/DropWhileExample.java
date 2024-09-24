package stream_api.java9;

import java.util.stream.Stream;

public class DropWhileExample {
    public static void main(String[] args) {

        Stream.of(1,2,3,5,6,8)
                .dropWhile(i -> i<5)
                .forEach(System.out ::println);
    }
}
