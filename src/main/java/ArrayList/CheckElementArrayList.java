package ArrayList;


import java.util.ArrayList;
import java.util.List;

// write a program to check if element(value) exists in ArrayList?
public class CheckElementArrayList {
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        int value = 3;
        if (number.contains(value)) {
            System.out.println(value + " exists in the ArrayList.");
        } else {
            System.out.println(value + " does not exist in the ArrayList.");
        }

    }
}
