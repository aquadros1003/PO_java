package pl.edu.uwm.lab07.pl.imiajd.jankowski;


public class Student extends Osoba {
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "kierunek='" + kierunek + '\'' +
                '}';
    }
}
