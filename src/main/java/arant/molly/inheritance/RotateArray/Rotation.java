package arant.molly.inheritance.RotateArray;

import arant.molly.inheritance.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Rotation extends Main {

    public static <T> ArrayList<T> rotate (List<T> arrayList, int move) {
        ArrayList<T> newArray = new ArrayList<>(arrayList);
        Collections.rotate(newArray, move);
        return newArray;
    }
}



