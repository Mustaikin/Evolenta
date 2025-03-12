import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, List<User>> userMap = new HashMap<>();

    
        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите имя пользователя " + i + ": ");
            String name = scanner.nextLine();
            System.out.print("Введите возраст пользователя " + i + ": ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            User user = new User(name, age);

            userMap.computeIfAbsent(age, k -> new ArrayList<>()).add(user);
        }

        System.out.print("Введите требуемый возраст для поиска пользователей: ");
        Integer searchAge = scanner.nextInt();

        if (userMap.containsKey(searchAge)) {
            List<User> usersByAge = userMap.get(searchAge);

            usersByAge.sort(Comparator.comparing(User::getName));

            System.out.println("Пользователи с возрастом " + searchAge + ":");
            for (User user : usersByAge) {
                System.out.println(user);
            }
        } else {
            System.out.println("Пользователи с возрастом " + searchAge + " не найдены.");
        }

        scanner.close();
    }
}
