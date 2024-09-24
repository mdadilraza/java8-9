import java.util.Arrays;
import java.util.Base64;

public class Base64EncoderDecoderExample {

    public static void main(String[] args) {

        Base64.Encoder encoder = Base64.getEncoder();

        byte [] byteArr ={1,2} ;
        System.out.println("Original Byte Stream "+ Arrays.toString(byteArr));

        byte[] byteArr1 = encoder.encode(byteArr);
        System.out.println("Encoded Byte Array :" + Arrays.toString(byteArr1));
        byte[] decodedByteArr1 = Base64.getDecoder()
                .decode(byteArr1);
        System.out.println("Decoded Byte Array :" + Arrays.toString(decodedByteArr1));

        String s = encoder.encodeToString("javatpoint".getBytes());

        System.out.println("Encoded String :"+ s);

        byte[] decode = Base64.getDecoder()
                .decode(s);

        System.out.println("Decoded String : " + new String(decode));

        String s1 = Base64.getUrlEncoder()
                .encodeToString("www.javatpoint.com".getBytes());

        System.out.println("Encoded Url :" + s1);


    }
}
