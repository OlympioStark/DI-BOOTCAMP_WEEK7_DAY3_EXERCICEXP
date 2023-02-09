package Exercice2;

import java.util.Arrays;

public class SelectionSort {
	
	public static <E> void selectionSort(E[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
