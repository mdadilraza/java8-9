package stream_api;

import java.util.stream.Stream;

public class StreamApi2 {

    public static void main(String[] args) {

        Student adil = new Student(1, "Adil" , 7561959536L) ;

        Student sanketh = new Student(2, "Sanketh" , 7561954536L) ;

        Student akash = new Student(3, "Akash" , 7561859536L) ;

       Stream.of(adil, sanketh, akash)
               .forEach(System .out ::println);

    }
}
