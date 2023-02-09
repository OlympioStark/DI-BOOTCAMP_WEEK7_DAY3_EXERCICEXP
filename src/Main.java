import Exercice1.App;
import Exercice2.SelectionSort;
import Exercice3.Hippopotamus;
import Exercice4.ValueOfPI;

public class Main {

	public static void main(String[] args) {

		//Exercice 1
        String[] dataString = {"Koffi", "Kouadio", "Zokou"};
        Integer[] dataInt = {1, 2, 3, 4, 5};
        App.printArray(dataString);
        App.printArray(dataInt);

        //Exercice 2
        Integer[] dataInt2 = {5, 1, 8, 26, 35, 87, 45, 50, 0};
        SelectionSort.selectionSort(dataInt2);

        //Exercice 3
        String word = "HIPPOPOTAMUS";
        Hippopotamus.reverse(word);

        //Exercice 4
        ValueOfPI pi = () -> Math.PI;
        System.out.println("Valeur de PI " + pi.findPi());

	}

}
