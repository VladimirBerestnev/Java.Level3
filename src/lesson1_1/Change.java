package lesson1_1;

import java.util.Arrays;

public class Change {

    public static void main(String[] args) {

        String [] arr = {"123", "234", "345", "456", "567", "678", "789", "000"};
        changePlace(arr, 3,7);
        System.out.println(Arrays.toString(arr));
    }

    public static <T> T[] changePlace(T[] arr, int i, int j){

        if (i > arr.length || j > arr.length){
            throw new ArrayIndexOutOfBoundsException("Неправильный номер элемента массива");
        } else {
        T place1 = arr[i];
        T place2 = arr[j];

        arr[i] = place2;
        arr[j] = place1;

        return arr;}
    }
}
