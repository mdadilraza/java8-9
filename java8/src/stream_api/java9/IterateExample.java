package stream_api.java9;

import java.util.stream.Stream;
class Person{
    private int id;

    private String name ;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class IterateExample {


    public static void main(String[] args) {



        // Stream<Integer> integerStream = Stream.of(1, 3, 4, 5, 7, 9);
//        Stream.iterate( 1 , i -> i<=10 ,i ->i*3)
//                .forEach(System .out ::println);
        Stream.iterate(new Person(1 ,"Person1"),
                        p ->p.getId() <5
                        ,p -> new Person(p.getId() +1 ,"Person"+ (p.getId() +1)))

                .forEach(System .out ::println);



    }
}
