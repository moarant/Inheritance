package arant.molly.inheritance.rotateArray;

import java.util.ArrayList;


public class Rotation extends ArrayList {

//    public static <T> ArrayList<T> rotate (List<T> arrayList, int move) {
//        ArrayList<T> newArray = new ArrayList<>(arrayList);
//        Collections.rotate(newArray, move);
//        return newArray;
//    }

    public void rotate (Rotation chosenArrayList, int rotateValue){
        for(int i=0; i<rotateValue; i++){
            chosenArrayList.add(chosenArrayList.get(0));
            chosenArrayList.remove(chosenArrayList.get(0));

        }
        System.out.println("After rotating: " + chosenArrayList);


    }
}



