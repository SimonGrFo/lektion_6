import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("index: " + i);
        }

        int number = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("crash the program");
        scanner.nextLine();

        System.out.println(number/0);

        try {

        } catch () {

        }
}

