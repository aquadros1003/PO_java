package pl.edu.uwm.lab07.pl.imiajd.jankowski;


public class App {
    public static void main(String[] args){
        Osoba Marek = new Osoba("Kowalski", 1723);
        Student Macius = new Student("Kowalski", 3232, "BHP");
        Nauczyciel Adam = new Nauczyciel("Mech", 4342, 3232);

        System.out.println(Marek.getNazwisko());
        System.out.println(Macius.getKierunek());
        System.out.println(Adam.getPensja());

        System.out.println(Marek);
        System.out.println(Adam);
        System.out.println(Macius);

        BetterRectangle square= new BetterRectangle(1,1,4,3);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
