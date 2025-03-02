import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        boolean flag = false;
        System.out.println("Введите 3 числа");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a % 5 == 0) {
            System.out.println("a=" + a);
            flag = true;
        }
        if (b % 5 == 0) {
            System.out.println("b=" + b);
            flag = true;
        }
        if (c % 5 == 0) {
            System.out.println("c=" + c);
            flag = true;
        }
        if (!flag) {
            System.out.println("нет значений, кратных 5");
        }

        if (b != 0) {
            System.out.println("Результат целочисленного деления a на b: " + a / b);
            System.out.println("Результат деления a на b: " + (double) a / b);
            System.out.println("Результат деления a на b с округлением в большую сторону: " + Math.ceil((double) a / b));
            System.out.println("Результат деления а на b с окрулением в меньшую сторону: " + Math.floor((double) a / b));
            System.out.println("Результат деления a на b с математическим округлением: " + Math.round((double) a / b));
        } else {
            System.out.println("a на b поделить невозможно, т.к. b=0");
        }
        if (c != 0) {
            System.out.println("Остаток от деления b на c: " + (b % c));
        } else {
            System.out.println("Невозможно расчитать остаток от деления, т.к. c=0");
        }
        System.out.println("Наименьшее значение из a и b: " + Math.min(a, b));
        System.out.println("Наибольшее значение из b и c: " + Math.max(b, c));
    }
}