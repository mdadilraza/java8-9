package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamSlice {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7); //1 ,6

        System.out.println(slice(list ,1,5));

    }
    public static List<Integer> slice(List<Integer> list, int startIndex , int endIndex) {

      return   list.stream()
                .skip(1)
                .limit(endIndex -startIndex)
                .toList();
    }
}
