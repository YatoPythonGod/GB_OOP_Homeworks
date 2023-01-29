package Task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        HurmaList<Integer> hurma = new HurmaList<Integer>();
        hurma.add(6);
        hurma.add(5);
        hurma.add(3);
        hurma.add(2);
        hurma.add(1);

        System.out.println(hurma);
        hurma.sortSelection();
        System.out.println(hurma);
    }
}
