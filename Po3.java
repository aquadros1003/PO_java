import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Po3 {


    public static void generuj(int[] tab, int n, int minWartosc, int maxWartosc) {
        Random r = new Random();
        for (int j = 0; j < n; ++j) {
            tab[j] = r.nextInt(minWartosc, maxWartosc);
        }
    }

    public static void wypisz(long[] tab) {
        for (long el : tab) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    //a
    public static int ileNieparzystych(int[] tab) {
        int nieparzyste = 0;
        for (int j : tab) {
            if (j % 2 == 1)
                nieparzyste++;
        }
        return nieparzyste;
    }

    public static int ileParzystych(int[] tab) {
        int parzyste = 0;
        for (int j : tab)
            if (j % 2 == 0)
                parzyste++;
        return parzyste;
    }

    //b
    public static int ileDodatnich(int[] tab) {
        int dodatnie = 0;
        for (int j : tab)
            if (j > 0)
                dodatnie++;
        return dodatnie;
    }

    public static int ileZerowych(int[] tab) {
        int zerowe = 0;
        for (int j : tab)
            if (j == 0)
                zerowe++;
        return zerowe;
    }

    public static int ileUjemnych(int[] tab) {
        int ujemne = 0;
        for (int j : tab)
            if (j < 0)
                ujemne++;
        return ujemne;

    }


    //c
    public static int ileMaksymalnych(int[] tab) {
        int maksymalne = 0;
        int max = -999;
        for (int k : tab)
            if (k > max)
                max = k;
        for (int j : tab)
            if (j == max)
                maksymalne++;
        return maksymalne;
    }


    //d
    public static int sumaDodatnich(int[] tab) {
        int suma1 = 0;
        for (int j : tab)
            if (j > 0)
                suma1 += j;
        return suma1;

    }

    public static int sumaUjemnych(int[] tab) {
        int suma2 = 0;
        for (int j : tab)
            if (j < 0)
                suma2 += j;
        return suma2;

    }


    //f
    public static void signum(int[] tab) {
        int[] sig = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < -1)
                sig[i] = -1;
            if (tab[i] == 0)
                sig[i] = 0;
            if (tab[i] > 0)
                sig[i] = 1;
        }
        System.out.println(Arrays.toString(sig));
    }


    //g
    public static void odwrocFragment(int[] tab, int lewy, int prawy) {
        int[] tab1 = new int[prawy - lewy + 1];
        if (prawy + 1 - lewy >= 0)
            System.arraycopy(tab, lewy, tab1, 0, prawy - lewy + 1);
        for (int x = lewy; x < prawy + 1; x++) {
            tab[x] = tab1[prawy - x];
        }
    }

    //3
    public static void trzecie(int m, int n, int k) {
        int[][] a = new int[m][n];
        int[][] b = new int[n][k];
        int[][] c = new int[m][k];
        Random r = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = r.nextInt(30);
                b[i][j] = r.nextInt(30);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(a[i][j]);
                System.out.println(b[i][j]);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.println(c[i][j]);

            }

        }
    }

}
