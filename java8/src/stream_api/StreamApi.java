package stream_api;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {



         Stream.generate( () -> "Hello World" )
                .forEach((str) -> System.out.println("printing the String " + str));

    }
}
