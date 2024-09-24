package stream_api.java9;

import java.util.Optional;
import java.util.stream.Stream;

public class OfNullableExample {

    public static void main(String[] args) {

        Stream.of(1,2,null ,3 ,null)
                .map(Optional::ofNullable)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out :: println);

    }
}
