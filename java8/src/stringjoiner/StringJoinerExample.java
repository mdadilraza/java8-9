package stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {

        StringJoiner  stringJoiner = new StringJoiner("," ,"[" ,"]");
        stringJoiner.add("Sanketh");
        stringJoiner.add("Adil");
        stringJoiner.add("Akash");
        System.out.println(stringJoiner);
        stringJoiner.merge(new StringJoiner(",").add("Akash").add("Chandu"));
        System.out.println(stringJoiner);
        System.out.println(stringJoiner.length());
        String string = stringJoiner.toString();
        System.out.println(string);

//        int str=20;
//        String binaryString = Integer.toBinaryString(str);
//        System.out.println(binaryString);
        String str="101";
        int i = Integer.parseInt(str, 2);
        System.out.println(i);
        System.out.println(Integer.parseInt(str ,16));
    }
}
