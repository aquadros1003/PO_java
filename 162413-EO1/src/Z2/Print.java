package Z2;

import java.util.*;

public class Print {
    public static <E, T extends Iterable<E>>void PrintMarginal(T args){
        ArrayList<E> temp = new ArrayList<>();
        for (E arg : args) {
            temp.add(arg);
        }
        int len = temp.size() - 1;
        System.out.println(temp.get(0));
        System.out.println(temp.get(len));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(7);
        PrintMarginal(list1);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(8);
        PrintMarginal(list2);
        Stack<Integer> list3 = new Stack<>();
        list3.add(2);
        list3.add(4);
        list3.add(5);
        list3.add(8);
        PrintMarginal(list3);
        LinkedHashSet<Integer> list4 = new LinkedHashSet<>();
        list4.add(3);
        list4.add(4);
        list4.add(5);
        list4.add(9);
        PrintMarginal(list4);
    }
}
