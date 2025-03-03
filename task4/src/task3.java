import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String inputDate = scanner.nextLine();


        if (inputDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            String[] parts = inputDate.split("\\.");
            String formattedDate = parts[2] + "-" + parts[1] + "-" + parts[0];
            System.out.println(formattedDate);
        } else {
            System.out.println("Неверный формат даты. Пожалуйста, используйте формат ДД.ММ.ГГГГ.");
        }

        scanner.close();
    }
}
