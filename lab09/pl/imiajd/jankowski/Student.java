package ProgramowanieObiektowe.lab09.pl.imiajd.jankowski;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen=sredniaOcen;
    }

    private double sredniaOcen;

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"["+this.getNazwisko()+", "+this.getDataUrodzenia().toString()+", "+this.sredniaOcen+"]";
    }

    @Override
    public int compareTo(Osoba o) {
        int last=super.compareTo((o));
        if((o instanceof Student)&&(last==0)){
            return -(int)Math.ceil(this.sredniaOcen-((Student) o).sredniaOcen);
        }
        return last;
    }
}
