package newSession;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerFunctionInterface {

    public static void main(String[] args) {

        Consumer<String> printThreeTimes = s -> System.out.println(s+s+s);
        printThreeTimes.accept("Cybertek");

        System.out.println("-------------------------------------------");

        Consumer<List<String>> printEach = list -> {
            for (String s : list){
                System.out.print(s + " ");
            }
            System.out.println();
        };

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("John", "Shay", "Breanna", "Erick" ) );
        printEach.accept(names);

        System.out.println("-------------------------------------------");

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10) );
        //Consumer<List<Integer>> multiplyBy2 = list -> { }
        numbers.forEach(n -> System.out.println(n*2) );

        System.out.println("-------------------------------------------");

        List<String> elements = new ArrayList<>();
        elements.addAll(Arrays.asList("Java", "Java", "Cybertek", "Python", "Python") );
        List<String> duplicatedElement = new ArrayList<>();
        Predicate<String> isDuplicated = p -> Collections.frequency(elements, p) > 1;
        elements.forEach(s -> {
            if (isDuplicated.test(s))
                if (!duplicatedElement.contains(s) )
                duplicatedElement.add(s);
        });

        System.out.println(duplicatedElement);

        System.out.println("-------------------------------------------");

        Consumer<String[]> printDescendingOrder = arr -> {
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        };

        //int[] array = {10, 5,8,9,3,11,14,17,98};
        String[] array = {"B", "A", "D", "E"};
        printDescendingOrder.accept(array);

    }
}
