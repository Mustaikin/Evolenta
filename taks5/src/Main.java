import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        System.out.print("Введите дату в формате dd.MM.yyyy: ");
        String inputDate1 = scanner.nextLine();

        Date date1 = null;
        try {
            date1 = dateFormat.parse(inputDate1);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты.");
            return;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date1);
        calendar.add(Calendar.DAY_OF_MONTH, 45);
        Date dateAfter45Days = calendar.getTime();
        System.out.println("Дата после увеличения на 45 дней: " + dateFormat.format(dateAfter45Days));

        calendar.setTime(date1);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date startOfYear = calendar.getTime();
        System.out.println("Дата после сдвига на начало года: " + dateFormat.format(startOfYear));

        int workingDaysToAdd = 10;
        int addedDays = 0;

        while (addedDays < workingDaysToAdd) {
            calendar.setTime(date1);
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                addedDays++;
            }
            date1 = calendar.getTime();
        }

        System.out.println("Дата после увеличения на 10 рабочих дней: " + dateFormat.format(date1));

        System.out.print("Введите вторую дату в формате dd.MM.yyyy: ");
        String inputDate2 = scanner.nextLine();

        Date date2 = null;
        try {
            date2 = dateFormat.parse(inputDate2);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты.");
            return;
        }

        int workingDaysBetween = 0;
        Calendar startCalendar = Calendar.getInstance();
        startCalendar.setTime(date1);

        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(date2);
        if (startCalendar.after(endCalendar)) {
            Calendar temp = startCalendar;
            startCalendar = endCalendar;
            endCalendar = temp;
        }

        while (startCalendar.before(endCalendar)) {
            if (startCalendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCalendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                workingDaysBetween++;
            }
            startCalendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        System.out.println("Количество рабочих дней между введенными датами: " + workingDaysBetween);

        scanner.close();
    }
}