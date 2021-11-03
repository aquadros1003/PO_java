package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("#a:");
        System.out.println(countChar("jdjdjdjdjddjdj", 'j'));

        System.out.println("#b:");
        System.out.println(countSubStr("jdjdjdjdjdjd", "jd"));

        System.out.println("#c:");
        System.out.println(middle("jdjdjdjdjd"));

        System.out.println("#d:");
        System.out.println(repeat("ho", 3));

        System.out.println("#e:");
        System.out.println(where("jdjdjdjdjd", "jd"));

        System.out.println("#f: ");
        System.out.println(change("dsdsdDsd"));

        System.out.println("#g:");
        System.out.println(nice("DfgsadsDs"));

    }

    public static int countChar(String str, char c) {
        int wynik = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                wynik++;
        }
        return wynik;
    }

    public static int countSubStr(String str, String subStr) {
        int wynik = 0;
        wynik = str.split(subStr, -1).length - 1;
        return wynik;
    }

    public static String middle(String str) {
        int position;
        int length;
        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        } else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }


    public static String repeat(String str, int n) {
        String napis = "";
        for (int i = 0; i < n; i++)
            napis = napis.concat(str);
        return napis;
    }

    static int[] where(String str, String subStr) {
        int[] indexArray = new int[countSubStr(str, subStr)];
        int position = 0;
        int count = 0;
        int i = 0;
        while (true) {
            position = str.indexOf(subStr, position);
            if (position != -1) {
                count = count + 1;
                indexArray[i] = position;
                position += subStr.length();
                i++;
            }
            return indexArray;
        }
    }

    static String change(String str) {
        StringBuffer buffer = new StringBuffer(str);
        int count = 0;
        for (Character element : str.toCharArray()) {
            if (Character.isLetter(element) && Character.isLowerCase(element)) {
                buffer.replace(count, (count + 1), String.valueOf(Character.toUpperCase(element)));
            } else if (Character.isLetter(element) && Character.isUpperCase(element)) {
                buffer.replace(count, (count + 1), String.valueOf(Character.toLowerCase(element)));
            }
            count++;
        }
        return buffer.toString();
    }

    static String nice(String str) {
        StringBuffer zmienione = new StringBuffer(str);
        StringBuffer wynik = new StringBuffer();

        int counter = 0;
        for (Character element : zmienione.reverse().toString().toCharArray()) {
            if (counter == 3) {
                wynik.append("\'").append(element);
                counter = 0;
            } else {
                wynik.append(element);
            }
            counter++;
        }
        return wynik.reverse().toString();
    }

    static String nice(String str, Character seperator, int incidence) {
        StringBuffer zmienione = new StringBuffer(str);
        StringBuffer wynik = new StringBuffer();
        int counter = 0;
        for (Character element : zmienione.reverse().toString().toCharArray()) {
            if (counter == incidence) {
                wynik.append(seperator).append(element);
                counter = 0;
            } else {
                wynik.append(element);
            }
            counter++;
        }
        return wynik.reverse().toString();
    }
    static int CountCharInFile(char char1) throws FileNotFoundException {
        int count = 0;
        File file1 = new File("C:\\Users\\aquad\\IdeaProjects\\Po4\\src");
        Scanner scan_file = new Scanner(file1);
        while (scan_file.hasNext()) {
            String char2 = scan_file.next();
            int index = 0;
            while (index < char2.length()) {
                if (char2.charAt(index) == char1) {
                    count = count + 1;
                }
                index++;
            }
        }
        return count;
    }

        static BigInteger CountSeeds(int n){
            BigInteger returned_value = BigInteger.TWO;
            return returned_value.pow((n*n)-1);
        }
}


