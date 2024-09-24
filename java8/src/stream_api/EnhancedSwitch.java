package stream_api;

import java.util.Scanner;

public class EnhancedSwitch {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
    String str  =switch (num) {
            case 2,4,6 -> {
                yield "even no";
            }

            case 1,3,5 -> {
                yield "odd number";
            }

            default -> throw  new IllegalArgumentException("Invalid case ");
        };

        System.out.println(str);
    }
}
