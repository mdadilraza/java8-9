package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi3 {
    public static void main(String[] args) {

//        List<String> names = Arrays.asList("Adil" , "Sanketh" , "Akash" , "Chandu");
//        List<Object> list =new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add(names);
//
//        System.out.println(names);
//        System.out.println(list);
//        list.stream() .flatMap(List::stream).

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i")
        );

        System.out.println(listOfLists);

        List<String> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedList);


    }
}
