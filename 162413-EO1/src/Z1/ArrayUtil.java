package Z1;

import java.time.LocalTime;

public class ArrayUtil {
    public static <T extends Comparable<T>> boolean jestPalindromem(T[] args){
        int not = 0;
        for(int i = 0; i<args.length;i++){
            if (! args[i].equals(args[args.length - 1 - i])) {
                not = 1;
                break;
            }
        }
        return not != 1;
    }
    public static void main(String[] args) {
        Integer[] tab1 = new Integer[5];
        Integer[] tab2 = new Integer[5];
        tab1[0] = 3;
        tab1[1] = 1;
        tab1[2] = 2;
        tab1[3] = 1;
        tab1[4] = 3;
        System.out.println(ArrayUtil.jestPalindromem(tab1));
        tab2[0] = 3;
        tab2[1] = 2;
        tab2[2] = 2;
        tab2[3] = 1;
        tab2[4] = 3;
        System.out.println(ArrayUtil.jestPalindromem(tab2));
        LocalTime[] tab3 = new LocalTime[5];
        LocalTime[] tab4 = new LocalTime[5];
        tab3[0] = LocalTime.of(20,32);
        tab3[1] = LocalTime.of(10, 32);
        tab3[2] = LocalTime.of(10, 32);
        tab3[3] = LocalTime.of(10, 32);
        tab3[4] = LocalTime.of(10, 32);
        System.out.println(ArrayUtil.jestPalindromem(tab3));
        tab4[0] = LocalTime.of(10, 32);
        tab4[1] = LocalTime.of(10, 32);
        tab4[2] = LocalTime.of(10, 32);
        tab4[3] = LocalTime.of(10, 32);
        tab4[4] = LocalTime.of(10, 32);
        System.out.println(ArrayUtil.jestPalindromem(tab4));
    }

}
