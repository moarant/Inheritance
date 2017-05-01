package arant.molly.inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mollyarant on 5/1/17.
 */
public class Rotation extends App {

    public static <T> ArrayList<T> rotate (List<T> arrayList, int move) {
        ArrayList<T> newArray = new ArrayList<>(arrayList);
        Collections.rotate(newArray, move);
        return newArray;
    }
}



