package ProgramowanieObiektowe.lab09.pl.imiajd.jankowski;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements  Cloneable, Comparable<Osoba>{

    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    @Override
    public boolean equals(Object obj) {
        Osoba Osoba = (Osoba) obj;
        return (Osoba.nazwisko.equals(this.nazwisko) && Osoba.dataUrodzenia.equals(this.dataUrodzenia));
    }

    @Override
    public String toString() {
        return "["+this.nazwisko+", "+this.dataUrodzenia.toString()+"]";
    }

    @Override
    public int compareTo(Osoba o) {
        int compare_nazwisko= this.nazwisko.compareTo(o.nazwisko);
        if(compare_nazwisko==0){
            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        return compare_nazwisko;
    }
    @Override
    public int hashCode() {
        return Objects.hash(nazwisko, dataUrodzenia);
    }
}

