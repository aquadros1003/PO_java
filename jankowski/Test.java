package ProgramowanieObiektowe.lab08.pl.imiajd.jankowski;

import java.time.LocalDate;

public class Test
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik(3232, "Kowalski", new String[]{"Jan"}, LocalDate.of(3232, 32, 32), false, LocalDate.of(3233,33,32));
        ludzie[1] = new Student("Nowak", "informatyka", new String[]{"Małgorzata"}, LocalDate.of(4245, 2, 6), true, 4.62);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
        Instrument[] orkiestra = new Instrument[5];
        orkiestra[0] = new Flet("Biedronka", LocalDate.of(3233,32,32));
        orkiestra[1] = new Skrzypce("Biedronka", LocalDate.of(3233,32,32));
        orkiestra[2] = new Fortepian("Biedronka", LocalDate.of(3233,32,32));
        orkiestra[3] = new Flet("Biedronka", LocalDate.of(3233,32,32));
        orkiestra[4] = new Fortepian("Biedronka", LocalDate.of(3233,32,32));
        for (Instrument i: orkiestra) {
            System.out.println(i.dzwiek());
            System.out.println(i.getProducent());
            System.out.println(i.getRokProdukcji());
        }

    }
}


