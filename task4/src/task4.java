import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        String inputDate = scanner.nextLine();
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = inputFormat.parse(inputDate);
            String formattedDate = outputFormat.format(date);
            System.out.println(formattedDate);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты. Пожалуйста, используйте формат ДД.ММ.ГГГГ.");
        }

        scanner.close();
    }
}
