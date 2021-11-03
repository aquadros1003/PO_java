package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList lista1 = new ArrayList();
        ArrayList lista2 = new ArrayList();
        lista1.add(1);
        lista1.add(4);
        lista1.add(9);
        lista1.add(16);
        lista2.add(9);
        lista2.add(7);
        lista2.add(4);
        lista2.add(9);
        lista2.add(11);
        System.out.println(append(lista1, lista2));
        System.out.println(mergeSorted(lista1, lista2));
        System.out.println(reversed(lista1));
        reverse(lista1);
        System.out.println(lista1);

    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList lista = new ArrayList();
        lista.addAll(a);
        lista.addAll(b);
        return lista;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList merged = new ArrayList();
            if (a.size() > b.size()) {
                for (int i = 0; i < a.size(); i++) {
                    merged.add(a.get(i));
                    merged.add(b.get(i));
                    for (i = b.size(); i < a.size(); i++) {
                        merged.add(a.get(i));
                    }
                }
            }
            else
                    for (int i = 0; i < b.size(); i++){
                        merged.add(a.get(i));
                        merged.add(b.get(i));
                        for (i = a.size(); i < b.size(); i++){
                            merged.add(a.get(i));
            }
        }
        return merged;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList sorted = new ArrayList();
        sorted = append(a, b);
        Collections.sort(sorted);
        return sorted;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList reversedList = new ArrayList();
        for (int i = a.size() - 1; i >= 0; i--) {
            reversedList.add(a.get(i));
        }

        return reversedList;
    }

    public static void reverse(ArrayList<Integer> a){
        for (int i = 0, j = a.size() - 1; i < j; i++) {
            a.add(i, a.remove(j));
        }
    }
}
