package ArrayList;

import java.util.HashSet;

public class CheckHasList {
    public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Check if the HashSet contains a specific value
        int value = 3;
        if (numbers.contains(value)) {
            System.out.println(value + " exists in the HashSet.");
        } else {
            System.out.println(value + " does not exist in the HashSet.");
        }
    }
}

