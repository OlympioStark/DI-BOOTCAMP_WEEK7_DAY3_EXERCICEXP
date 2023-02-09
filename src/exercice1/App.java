package Exercice1;

public class App {
	
	public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

}
