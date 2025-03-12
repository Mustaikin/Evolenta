import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите имя пользователя " + i + ": ");
            String name = scanner.nextLine();
            System.out.print("Введите возраст пользователя " + i + ": ");
            Integer age = scanner.nextInt();
            scanner.nextLine();
            users.add(new User(name, age));
        }

        users.sort(new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getAge().compareTo(u2.getAge());
            }
        });

        for (User user : users) {
            System.out.println(user);
        }

        scanner.close();
    }
}
