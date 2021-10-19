public class Po2 {
////////////////////////////#1.1/////////////////////////////////


//#a
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int sum = 0;
//        for(int i=0;i<n;i++)
//        {
//           int a = scan.nextInt();
//           sum = sum + a;
//        }
//        System.out.println(sum);
//}


//#b
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int iloczyn = 1;
//        for (int i = 0; i < n; i++) {
//            int a = scan.nextInt();
//            iloczyn = iloczyn * a;
//        }
//        System.out.println(iloczyn);
//    }
//}


//#c
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int suma = 0;
//        for(int i=0;i<n;i++)
//        {
//            int a = scan.nextInt();
//            suma = suma + abs(a);
//        }
//        System.out.println(suma);
//    }
//}


//#d
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        double suma = 0;
//        for(int i=0;i<n;i++)
//        {
//            double a = scan.nextDouble();
//            suma = suma + sqrt(abs(a));
//        }
//        System.out.println(suma);
//    }
//}


//#e
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        double iloczyn = 1;
//        for(int i=0;i<n;i++)
//        {
//            double a = scan.nextDouble();
//            iloczyn = iloczyn * abs(a);
//        }
//        System.out.println(iloczyn);
//    }
//}


//#f
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        double suma = 0;
//        for(int i=0;i<n;i++)
//        {
//            double a = scan.nextDouble();
//            suma = suma + pow(a,2);
//        }
//        System.out.println(suma);
//    }
//}


//#g
//        public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        double iloczyn = 1;
//        double suma = 0;
//        for(int i=0;i<n;i++)
//        {
//            double a = scan.nextDouble();
//            iloczyn = iloczyn * a;
//            suma = suma + a;
//        }
//        System.out.println(iloczyn);
//        System.out.println(suma);
//    }
//}


//#h
//            public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        double suma = 0;
//        for(int i=0;i<n;i++)
//        {
//            double a = scan.nextDouble();
//            if (n%2==0)
//            {
//                suma = suma - a;
//            }
//            if (n%2==1)
//            {
//                suma = suma + a;
//            }
//            else if (i==n-1)
//            {
//                suma = suma + pow(-1, n + 1) * a;
//            }
//        }
//        System.out.println(suma);
//    }
//}


//#i
//                public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        double suma = 0;
//        int silnia = 1;
//        for(int i=1;i<=n;i++)
//        {
//            double a = scan.nextDouble();
//            for (int i2 = 1; i2 <= n; i2++)
//            {
//                silnia = silnia * i2;
//            }
//            if (n==i)
//            {
//                suma = suma + a/silnia;
//            }
//            else if (n%2==0)
//            {
//                suma = suma - a/silnia;
//            }
//            else if (n%2==1)
//            {
//                suma = suma + a/silnia;
//            }
//        }
//        System.out.println(suma);
//    }
//}


////////////////////////////#1.2/////////////////////////////////


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        double[] tablica = new double[n];
//        for (int i = 0; i < n; i++) {
//            double a = scan.nextDouble();
//            if (i == 0)
//                tablica[n-1] = a;
//            else
//                tablica[i-1] = a;
//        }
//        for (int i = 0; i < n; i++)
//            System.out.println(tablica[i]);
//    }
//}


////////////////////////////#2.2/////////////////////////////////


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int suma = 0;
//        for (int i = 0; i < n; i++) {
//            double a = scan.nextDouble();
//            if (a>0)
//                suma+=a;
//        }
//        System.out.println(2*suma);
//    }
//}


////////////////////////////#2.3/////////////////////////////////


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int dodatnie = 0;
//        int ujemne = 0;
//        int zera = 0;
//        for (int i = 0; i < n; i++) {
//            double a = scan.nextDouble();
//            if (a>0)
//                dodatnie++;
//            if (a==0)
//                zera++;
//            if (a<0)
//                ujemne++;
//        }
//        System.out.println("Ilosc dodatnich to: " + dodatnie);
//        System.out.println("Ilosc zer to: " + zera);
//        System.out.println("Ilosc ujemnych to: " + ujemne);
//    }
//}

////////////////////////////#2.4/////////////////////////////////


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        double max = 0;
//        double min = 0;
//        for (int i = 0; i < n; i++) {
//            double a = scan.nextDouble();
//            if (i == 0)
//                max = a;
//                min = a;
//            if (a > max)
//                max = a;
//            if(a < min)
//                min = a;
//        }
//        System.out.println("Max: " + max);
//        System.out.println("Min: " + min);
//    }
//}


////////////////////////////#2.5/////////////////////////////////


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int pary = 0;
//        double poprzednik = 0;
//        for(int i = 0; i < n; i++){
//            double a = scan.nextDouble();
//            if(i==0)
//                poprzednik = a;
//            if (poprzednik > 0 && a > 0)
//                pary++;
//            poprzednik = a;
//        }
//        System.out.println(pary);
//    }
}

