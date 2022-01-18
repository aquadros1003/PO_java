package ProgramowanieObiektowe.lab010;

public class PairUtil<T>{
    public static <T> Pair<T> swap(Pair<T> para){
        Pair<T> previous = new Pair<>(para.getFirst(), para.getSecond());
        para.swap();
        return previous;
    }
}