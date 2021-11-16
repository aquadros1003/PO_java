package ProgramowanieObiektowe.lab06;

import java.util.ArrayList;

public class lab06 {
    static class RachunekBankowy {
        static double rocznaStopaProcentowa;
        private double saldo;

        public RachunekBankowy(double saldo) {
            this.saldo = saldo;
        }

        public double saldo() {
            return saldo;
        }

        public void obliczMiesieczneOdsetki() {
            double odsetki = (saldo * rocznaStopaProcentowa) / 12;
            saldo += odsetki;
        }

        public void setRocznaStopaProcentowa(double nowaStopaProcentowa) {
            rocznaStopaProcentowa = nowaStopaProcentowa;
        }
    }

    class IntegerSet {
        private ArrayList<Integer> list;

        public IntegerSet(ArrayList<Integer> list) {
            this.list = list;
        }

        public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
            ArrayList<Integer> list_unioned = new ArrayList<>();
            list_unioned.addAll(list1);
            list_unioned.addAll(list2);
            return list_unioned;
        }

        public static ArrayList<Integer> intersection(ArrayList<Integer> list1, ArrayList<Integer> list2) {
            ArrayList<Integer> list = new ArrayList<>();
            for (Integer e : list1) {
                if (list2.contains(e))
                    list.add(e);
            }
            return list;
        }

        public void insertElement(Integer to_insert) {
            list.add(to_insert);
        }

        public void deleteElement(Integer to_delete) {
            for (int i = 0; i < list.size(); i++)
                if (list.equals(to_delete))
                    list.remove(to_delete);
        }

        public String toString() {
            String stringed_list = "";
            for (int i = 0; i < list.size(); i++)
                stringed_list += list.get(i) + " ";
            return stringed_list;
        }

        public boolean equals(ArrayList<Integer> list_equals) {
            return list.equals(list_equals);
        }
    }

        public static void main(String args[]) {
            RachunekBankowy saver1 = new RachunekBankowy(2000);
            RachunekBankowy saver2 = new RachunekBankowy(3000);
            saver1.setRocznaStopaProcentowa(0.04);
            saver1.obliczMiesieczneOdsetki();
            saver2.obliczMiesieczneOdsetki();
            System.out.println("Odsetki po 1. miesiącu: " + saver1.saldo());
            System.out.println("Odsetki po 1. miesiącu: " + saver2.saldo());
            saver1.setRocznaStopaProcentowa(0.05);
            saver1.obliczMiesieczneOdsetki();
            saver2.obliczMiesieczneOdsetki();
            System.out.println("Odsetki po 2. miesiącach: " + saver1.saldo());
            System.out.println("Odsetki po 2. miesiącach: " + saver2.saldo());

        }
    }





