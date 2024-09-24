package stream_api;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethod {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        list.forEach(System .out :: println);

        Set.of(9, 8,7,6, 4,3,2,1)
                .forEach(System. out ::println);

        Map<Integer, String> integerStringMap = Map.of(101, "Adil", 102, "Raza");
        integerStringMap.entrySet()
                .forEach(System.out::println);

        Map.Entry<Integer , String> entry1=  Map.entry(1 ,"Akash");
        Map.Entry<Integer, String> entry2 = Map.entry(2, "Sanketh");

        Map<Integer, String> integerStringMap1 = Map.ofEntries(entry1, entry2);

        System.out.println(integerStringMap1);

    }
}
