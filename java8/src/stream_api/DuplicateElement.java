package stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicateElement  {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(3, 4, 5, 2, 3, 2);

        System.out.println(findDuplicate(integerStream));

        System.out.println(countOfoccurence("Adil"));

        duplicates();
    }

    public static Set<Integer> findDuplicate(Stream<Integer> stream) {

        Set<Integer> integerSet = new HashSet<>();
       return stream .filter(num -> ! integerSet.add(num))
                .collect(Collectors.toSet());
    }

    public static int countOfoccurence(String str) {

        long count = str.chars()
                .count();
        return (int) count;
    }

    public static void duplicates(){
        List<Integer>  list = Arrays.asList(3,4,5,6,3,2,1,2);

        Set<Integer> set = new HashSet<>();

        Set<Integer> duplicates = new HashSet<>();
        for(Integer i : list) {
            if (!set.add(i)){
                duplicates.add(i);

            }
        }
        duplicates.forEach(System.out::println);


        Abcd<String> abcd = new Abcd<String>() {


            String show(String a, String b) {
                return a+b;
            }


        };
        System.out.println(abcd.show("java" ,"9"));

    }


}

abstract class Abcd<T>{
    abstract T show (T a , T b);
}
