package Z3;

import java.io.File;
import java.util.Arrays;

public class Zadanie3 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\aquad\\IdeaProjects\\PO_java");
        File[] list = file.listFiles((dir) -> true);
        assert list != null;
        Arrays.sort(list,(a, b) -> {
            if (a.isDirectory() && b.isDirectory())
                return 1;
            else if (! a.isDirectory() && b.isDirectory())
                return -1;
            else
                return a.getName().compareTo(b.getName());
        });
        for (File f : list)
            System.out.println(f);
    }
}
