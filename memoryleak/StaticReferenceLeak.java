package memoryleak;

import java.util.ArrayList;
import java.util.List;

public class StaticReferenceLeak {
    public static List<Integer> NUMBERS = new ArrayList<>();
    public void addBatch() {
        for (int i = 0; i < 100000; i++) {
            NUMBERS.add(i);
        }
    }
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1000000; i++) {
            (new StaticReferenceLeak()).addBatch();
            System.gc();
            Thread.sleep(10000);
        }
    }
}
