package home_works.HW20201213.generics.last_entry;

import java.util.Arrays;
import java.util.List;

public class EntriesMain {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "B", "C", "d");
        List<Integer> integers = Arrays.asList(2, 999, 12, -22);

        Entry<String> stringEntry = new Entry<>(strings);
        Entry<Integer> integerEntry = new Entry<>(integers);

        System.out.println(stringEntry.lastEntry());
        System.out.println(integerEntry.lastEntry());
    }
}
