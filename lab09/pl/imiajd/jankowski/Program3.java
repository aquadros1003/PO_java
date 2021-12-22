package ProgramowanieObiektowe.lab09.pl.imiajd.jankowski;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
            ArrayList<String> zad3 = new ArrayList<>();
            try {
                File Plik = new File(args[0]);
                Scanner zadanie3 = new Scanner(Plik);
                while (zadanie3.hasNextLine()) {
                    zad3.add(zadanie3.nextLine());
                }
                zadanie3.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            System.out.println(zad3);
            Collections.sort(zad3);
            System.out.println(zad3);
        }
    }
