import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Datum[] arr = {
                new Datum(19,9,2050),
                new Datum(25, 11,2022),
                new Datum(15 , 8, 1990),
                new Datum(17, 9, 2050),
                new Datum(19, 9, 2050)
        };

        Arrays.sort(arr);
        for (Datum d:arr) {
            System.out.println(d);
        }
    }
}