import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rand = new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(15) + 1;
        }
        System.out.println(Arrays.toString(arr));

       Map<Integer, Integer> map = new HashMap<>();
       for(int i = 0; i < arr.length; i++){
           map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
       }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Число '" + entry.getKey() + "' встречается " + entry.getValue() + " раз(а)");
            }
        }
    }
}