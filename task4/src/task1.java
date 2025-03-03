import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку");
        String mainString = scanner.nextLine();

        System.out.print("Введите подстроку");
        String substring = scanner.nextLine();

        int countOccurrences = 0;
        int currentIndex = 0;

        while (true) {
            currentIndex = mainString.indexOf(substring, currentIndex);
            if (currentIndex == -1) {
                break;
            }
            countOccurrences++;
            currentIndex += substring.length();
        }

        // Вывод результата
        System.out.printf("Подстрока '%s' встречается %d раз(а).\n", substring, countOccurrences);
        scanner.close();
    }
}
