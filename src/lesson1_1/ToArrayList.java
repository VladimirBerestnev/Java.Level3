package lesson1_1;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayList {

    public static void main(String[] args) {

        ClassForArrayList<String>[] classForArrayLists = new ClassForArrayList[10];

        for (int i = 0; i < 10; i++) {
            classForArrayLists[i] = new ClassForArrayList("type" + i);
        }

        ArrayList retList = toArrayList(classForArrayLists);

        System.out.println(Arrays.toString(classForArrayLists));
        System.out.println(retList);
    }

    public static ArrayList<ClassForArrayList> toArrayList(ClassForArrayList[] classForArrayLists){

        ArrayList<ClassForArrayList> retList = new ArrayList<>();
        for (int i = 0; i < classForArrayLists.length; i++) {
            retList.add(classForArrayLists[i]);
        }
        return retList;
    }
}


class ClassForArrayList<T> {

    private T type;

    public ClassForArrayList(T type) {
        this.type = type;
    }
}
