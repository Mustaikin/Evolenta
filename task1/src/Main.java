import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");
        String str = new Scanner(System.in).nextLine();
        System.out.println("Привет, " + str + "!");
    }
}